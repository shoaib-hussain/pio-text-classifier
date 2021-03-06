package org.example.textclassification

import org.apache.predictionio.controller.LServing

class Serving
  extends LServing[Query, PredictedResults] {

  override
  def serve(query: Query,
            predictedResults: Seq[PredictedResults]): PredictedResults = {
    predictedResults.head
  }
}