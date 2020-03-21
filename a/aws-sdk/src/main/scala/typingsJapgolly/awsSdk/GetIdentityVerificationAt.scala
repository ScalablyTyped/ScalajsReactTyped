package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.serviceMod.WaiterConfiguration
import typingsJapgolly.awsSdk.sesMod.IdentityList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ses.GetIdentityVerificationAttributesRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetIdentityVerificationAt extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * A list of identities.
    */
  var Identities: IdentityList = js.native
}

