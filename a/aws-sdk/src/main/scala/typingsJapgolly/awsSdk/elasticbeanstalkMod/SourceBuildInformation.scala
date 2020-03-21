package typingsJapgolly.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceBuildInformation extends js.Object {
  /**
    * The location of the source code, as a formatted string, depending on the value of SourceRepository    For CodeCommit, the format is the repository name and commit ID, separated by a forward slash. For example, my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a.   For S3, the format is the S3 bucket name and object key, separated by a forward slash. For example, my-s3-bucket/Folders/my-source-file.  
    */
  var SourceLocation: typingsJapgolly.awsSdk.elasticbeanstalkMod.SourceLocation = js.native
  /**
    * Location where the repository is stored.    CodeCommit     S3   
    */
  var SourceRepository: typingsJapgolly.awsSdk.elasticbeanstalkMod.SourceRepository = js.native
  /**
    * The type of repository.    Git     Zip   
    */
  var SourceType: typingsJapgolly.awsSdk.elasticbeanstalkMod.SourceType = js.native
}

object SourceBuildInformation {
  @scala.inline
  def apply(SourceLocation: SourceLocation, SourceRepository: SourceRepository, SourceType: SourceType): SourceBuildInformation = {
    val __obj = js.Dynamic.literal(SourceLocation = SourceLocation.asInstanceOf[js.Any], SourceRepository = SourceRepository.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceBuildInformation]
  }
}

