package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportToS3TaskSpecification extends js.Object {
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
    * The image is written to a single object in the S3 bucket at the S3 key s3prefix + exportTaskId + '.' + diskImageFormat.
    */
  var S3Prefix: js.UndefOr[String] = js.native
}

object ExportToS3TaskSpecification {
  @scala.inline
  def apply(
    ContainerFormat: ContainerFormat = null,
    DiskImageFormat: DiskImageFormat = null,
    S3Bucket: String = null,
    S3Prefix: String = null
  ): ExportToS3TaskSpecification = {
    val __obj = js.Dynamic.literal()
    if (ContainerFormat != null) __obj.updateDynamic("ContainerFormat")(ContainerFormat.asInstanceOf[js.Any])
    if (DiskImageFormat != null) __obj.updateDynamic("DiskImageFormat")(DiskImageFormat.asInstanceOf[js.Any])
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3Prefix != null) __obj.updateDynamic("S3Prefix")(S3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportToS3TaskSpecification]
  }
}

