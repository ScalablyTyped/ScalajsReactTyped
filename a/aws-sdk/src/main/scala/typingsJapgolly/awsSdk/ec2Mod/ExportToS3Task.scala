package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportToS3Task extends js.Object {
  /**
    * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is exported.
    */
  var ContainerFormat: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.ContainerFormat] = js.native
  /**
    * The format for the exported image.
    */
  var DiskImageFormat: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.DiskImageFormat] = js.native
  /**
    * The S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP permissions to the AWS account vm-import-export@amazon.com.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  /**
    * The encryption key for your S3 bucket.
    */
  var S3Key: js.UndefOr[String] = js.native
}

object ExportToS3Task {
  @scala.inline
  def apply(
    ContainerFormat: ContainerFormat = null,
    DiskImageFormat: DiskImageFormat = null,
    S3Bucket: String = null,
    S3Key: String = null
  ): ExportToS3Task = {
    val __obj = js.Dynamic.literal()
    if (ContainerFormat != null) __obj.updateDynamic("ContainerFormat")(ContainerFormat.asInstanceOf[js.Any])
    if (DiskImageFormat != null) __obj.updateDynamic("DiskImageFormat")(DiskImageFormat.asInstanceOf[js.Any])
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportToS3Task]
  }
}

