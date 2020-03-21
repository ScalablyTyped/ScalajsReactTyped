package typingsJapgolly.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRepositoryConfiguration extends js.Object {
  /**
    * The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre file system files in S3.
    */
  var ExportPath: js.UndefOr[ArchivePath] = js.native
  /**
    * The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for your FSx for Lustre file system, for example s3://import-bucket/optional-prefix. If a prefix is specified after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
    */
  var ImportPath: js.UndefOr[ArchivePath] = js.native
  /**
    * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
    */
  var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.native
}

object DataRepositoryConfiguration {
  @scala.inline
  def apply(
    ExportPath: ArchivePath = null,
    ImportPath: ArchivePath = null,
    ImportedFileChunkSize: Int | Double = null
  ): DataRepositoryConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ExportPath != null) __obj.updateDynamic("ExportPath")(ExportPath.asInstanceOf[js.Any])
    if (ImportPath != null) __obj.updateDynamic("ImportPath")(ImportPath.asInstanceOf[js.Any])
    if (ImportedFileChunkSize != null) __obj.updateDynamic("ImportedFileChunkSize")(ImportedFileChunkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRepositoryConfiguration]
  }
}

