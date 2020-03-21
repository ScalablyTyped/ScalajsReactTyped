package typingsJapgolly.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SnapshotAsset extends js.Object {
  /**
    * The size of the S3 object that is the object.
    */
  var Size: doubleMin0 = js.native
}

object S3SnapshotAsset {
  @scala.inline
  def apply(Size: doubleMin0): S3SnapshotAsset = {
    val __obj = js.Dynamic.literal(Size = Size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3SnapshotAsset]
  }
}

