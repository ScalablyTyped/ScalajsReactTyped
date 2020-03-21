package typingsJapgolly.awsSdkClientS3Node.typesObjectMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GLACIER
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typingsJapgolly.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledObject extends Object {
  /**
    * _LastModified shape
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledObject: js.UndefOr[js.Date] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledObject: js.UndefOr[UnmarshalledOwner] = js.undefined
}

object UnmarshalledObject {
  @scala.inline
  def apply(
    ETag: String = null,
    Key: String = null,
    LastModified: js.Date = null,
    Owner: UnmarshalledOwner = null,
    Size: Int | Double = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String = null
  ): UnmarshalledObject = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledObject]
  }
}

