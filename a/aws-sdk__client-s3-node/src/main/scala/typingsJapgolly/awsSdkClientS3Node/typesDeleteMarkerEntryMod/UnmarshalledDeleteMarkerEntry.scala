package typingsJapgolly.awsSdkClientS3Node.typesDeleteMarkerEntryMod

import typingsJapgolly.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledDeleteMarkerEntry extends DeleteMarkerEntry {
  /**
    * <p>Date and time the object was last modified.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledDeleteMarkerEntry: js.UndefOr[js.Date] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledDeleteMarkerEntry: js.UndefOr[UnmarshalledOwner] = js.undefined
}

object UnmarshalledDeleteMarkerEntry {
  @scala.inline
  def apply(
    IsLatest: js.UndefOr[Boolean] = js.undefined,
    Key: String = null,
    LastModified: js.Date = null,
    Owner: UnmarshalledOwner = null,
    VersionId: String = null
  ): UnmarshalledDeleteMarkerEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsLatest)) __obj.updateDynamic("IsLatest")(IsLatest.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledDeleteMarkerEntry]
  }
}

