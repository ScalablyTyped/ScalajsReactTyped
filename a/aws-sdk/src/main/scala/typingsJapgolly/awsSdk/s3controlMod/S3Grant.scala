package typingsJapgolly.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Grant extends js.Object {
  /**
    * 
    */
  var Grantee: js.UndefOr[S3Grantee] = js.native
  /**
    * 
    */
  var Permission: js.UndefOr[S3Permission] = js.native
}

object S3Grant {
  @scala.inline
  def apply(Grantee: S3Grantee = null, Permission: S3Permission = null): S3Grant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Grant]
  }
}

