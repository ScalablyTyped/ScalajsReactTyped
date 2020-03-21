package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Function...
  */
trait IFunction extends js.Object {
  /**
    * Group of the script function.
    */
  var qGroup: FunctionGroupType
  /**
    * Name of the script function.
    */
  var qName: String
  /**
    * Signature of the script function.
    * Gives general information about the function.
    */
  var qSignature: String
}

object IFunction {
  @scala.inline
  def apply(qGroup: FunctionGroupType, qName: String, qSignature: String): IFunction = {
    val __obj = js.Dynamic.literal(qGroup = qGroup.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qSignature = qSignature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFunction]
  }
}

