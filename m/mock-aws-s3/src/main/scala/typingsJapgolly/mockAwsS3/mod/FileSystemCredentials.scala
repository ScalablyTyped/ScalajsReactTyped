package typingsJapgolly.mockAwsS3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "FileSystemCredentials")
@js.native
class FileSystemCredentials protected ()
  extends typingsJapgolly.awsSdk.mod.FileSystemCredentials {
  /**
    * Creates a new FileSystemCredentials object from a filename.
    * @param {string} filename - The path on disk to the JSON file to load.
    */
  def this(filename: String) = this()
}

