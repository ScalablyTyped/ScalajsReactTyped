package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyPartResult extends js.Object {
  /**
    * Entity tag of the object.
    */
  var ETag: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.ETag] = js.native
  /**
    * Date and time at which the object was uploaded.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
}

object CopyPartResult {
  @scala.inline
  def apply(ETag: ETag = null, LastModified: js.Date = null): CopyPartResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyPartResult]
  }
}

