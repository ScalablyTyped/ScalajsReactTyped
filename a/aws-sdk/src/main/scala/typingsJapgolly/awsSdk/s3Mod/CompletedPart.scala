package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletedPart extends js.Object {
  /**
    * Entity tag returned when the part was uploaded.
    */
  var ETag: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.ETag] = js.native
  /**
    * Part number that identifies the part. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.PartNumber] = js.native
}

object CompletedPart {
  @scala.inline
  def apply(ETag: ETag = null, PartNumber: Int | Double = null): CompletedPart = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (PartNumber != null) __obj.updateDynamic("PartNumber")(PartNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedPart]
  }
}

