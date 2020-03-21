package typingsJapgolly.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTerminologyRequest extends js.Object {
  /**
    * The name of the custom terminology being retrieved.
    */
  var Name: ResourceName = js.native
  /**
    * The data format of the custom terminology being retrieved, either CSV or TMX.
    */
  var TerminologyDataFormat: typingsJapgolly.awsSdk.translateMod.TerminologyDataFormat = js.native
}

object GetTerminologyRequest {
  @scala.inline
  def apply(Name: ResourceName, TerminologyDataFormat: TerminologyDataFormat): GetTerminologyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TerminologyDataFormat = TerminologyDataFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTerminologyRequest]
  }
}

