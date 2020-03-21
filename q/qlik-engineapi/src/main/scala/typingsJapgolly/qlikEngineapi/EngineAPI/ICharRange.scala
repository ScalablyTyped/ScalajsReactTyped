package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CharRange...
  */
trait ICharRange extends js.Object {
  /*
    * Number of occurrences found
    */
  var qCharCount: Double
  /**
    * Position of the first search occurrence
    */
  var qCharPos: Double
}

object ICharRange {
  @scala.inline
  def apply(qCharCount: Double, qCharPos: Double): ICharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICharRange]
  }
}

