package typingsJapgolly.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLocationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the location to delete.
    */
  var LocationArn: typingsJapgolly.awsSdk.datasyncMod.LocationArn = js.native
}

object DeleteLocationRequest {
  @scala.inline
  def apply(LocationArn: LocationArn): DeleteLocationRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLocationRequest]
  }
}

