package typingsJapgolly.pulumiAws.inputMod.elb

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslNegotiationPolicyAttribute extends js.Object {
  /**
    * The name of the attribute
    */
  var name: Input[String] = js.native
  /**
    * The value of the attribute
    */
  var value: Input[String] = js.native
}

object SslNegotiationPolicyAttribute {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): SslNegotiationPolicyAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SslNegotiationPolicyAttribute]
  }
}

