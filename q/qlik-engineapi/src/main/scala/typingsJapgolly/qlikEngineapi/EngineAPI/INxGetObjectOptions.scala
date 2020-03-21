package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxGetObjectOptions.
  */
trait INxGetObjectOptions extends js.Object {
  /**
    * Set of data.
    */
  var qData: js.Any
  /**
    * Set to true to include session objects.
    *
    * Default: false
    */
  var qIncludeSessionObjects: Boolean
  /**
    * List of object types..
    */
  var qTypes: js.Array[String]
}

object INxGetObjectOptions {
  @scala.inline
  def apply(qData: js.Any, qIncludeSessionObjects: Boolean, qTypes: js.Array[String]): INxGetObjectOptions = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qIncludeSessionObjects = qIncludeSessionObjects.asInstanceOf[js.Any], qTypes = qTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxGetObjectOptions]
  }
}

