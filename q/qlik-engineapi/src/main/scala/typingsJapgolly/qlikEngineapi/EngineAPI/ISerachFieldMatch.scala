package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SerachFieldMatch...
  */
trait ISerachFieldMatch extends js.Object {
  /**
    * Position of the field in the list of fields, starting from 0.
    * The list of fields is defined in qResults/qFieldNames and contains the search associations.
    */
  var qField: Double
  /**
    * Number of search hits in the field.
    * The number of values in qValues and the value of qNoOfMatches are equal if qMaxNbrFieldMatches is -1.
    */
  var qNoOfMatches: Double
  /**
    * Positions of the search terms, starting from 0.
    */
  var qTerms: js.Array[Double]
  /**
    * Positions of the matching values in the search results.
    * The maximum number of values in this list is defined by qMaxNbrFieldMatches.
    */
  var qValues: js.Array[Double]
}

object ISerachFieldMatch {
  @scala.inline
  def apply(qField: Double, qNoOfMatches: Double, qTerms: js.Array[Double], qValues: js.Array[Double]): ISerachFieldMatch = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qNoOfMatches = qNoOfMatches.asInstanceOf[js.Any], qTerms = qTerms.asInstanceOf[js.Any], qValues = qValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISerachFieldMatch]
  }
}

