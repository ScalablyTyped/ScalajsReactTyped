package typingsJapgolly.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataRepositoryTaskRequest extends js.Object {
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.ClientRequestToken] = js.native
  var FileSystemId: typingsJapgolly.awsSdk.fsxMod.FileSystemId = js.native
  /**
    * (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is processed. The default path is the file system root directory.
    */
  var Paths: js.UndefOr[DataRepositoryTaskPaths] = js.native
  /**
    * Defines whether or not Amazon FSx provides a CompletionReport once the task has completed. A CompletionReport provides a detailed report on the files that Amazon FSx processed that meet the criteria specified by the Scope parameter. 
    */
  var Report: CompletionReport = js.native
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.Tags] = js.native
  /**
    * Specifies the type of data repository task to create.
    */
  var Type: DataRepositoryTaskType = js.native
}

object CreateDataRepositoryTaskRequest {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    Report: CompletionReport,
    Type: DataRepositoryTaskType,
    ClientRequestToken: ClientRequestToken = null,
    Paths: DataRepositoryTaskPaths = null,
    Tags: Tags = null
  ): CreateDataRepositoryTaskRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Paths != null) __obj.updateDynamic("Paths")(Paths.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataRepositoryTaskRequest]
  }
}

