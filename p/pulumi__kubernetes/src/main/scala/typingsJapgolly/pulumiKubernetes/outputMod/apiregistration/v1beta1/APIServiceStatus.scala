package typingsJapgolly.pulumiKubernetes.outputMod.apiregistration.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceStatus contains derived information about an API server
  */
trait APIServiceStatus extends js.Object {
  /**
    * Current service state of apiService.
    */
  val conditions: js.Array[APIServiceCondition]
}

object APIServiceStatus {
  @scala.inline
  def apply(conditions: js.Array[APIServiceCondition]): APIServiceStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[APIServiceStatus]
  }
}

