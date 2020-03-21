package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  /**
    * The entity tag is an MD5 hash of the object. ETag reflects only changes to the contents of an object, not its metadata.
    */
  var ETag: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.ETag] = js.native
  /**
    * The name that you assign to an object. You use the object key to retrieve the object.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * The date the Object was Last Modified
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * The owner of the object
    */
  var Owner: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.Owner] = js.native
  /**
    * Size in bytes of the object
    */
  var Size: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.Size] = js.native
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[ObjectStorageClass] = js.native
}

object Object {
  @scala.inline
  def apply(
    ETag: ETag = null,
    Key: ObjectKey = null,
    LastModified: js.Date = null,
    Owner: Owner = null,
    Size: Int | Double = null,
    StorageClass: ObjectStorageClass = null
  ): Object = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
}

