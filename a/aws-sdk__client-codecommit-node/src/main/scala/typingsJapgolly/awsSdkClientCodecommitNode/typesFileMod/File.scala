package typingsJapgolly.awsSdkClientCodecommitNode.typesFileMod

import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
    * <p>The fully-qualified path to the file in the repository.</p>
    */
  var absolutePath: js.UndefOr[String] = js.undefined
  /**
    * <p>The blob ID that contains the file information.</p>
    */
  var blobId: js.UndefOr[String] = js.undefined
  /**
    * <p>The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.</p>
    */
  var fileMode: js.UndefOr[EXECUTABLE | NORMAL | SYMLINK | String] = js.undefined
  /**
    * <p>The relative path of the file from the folder where the query originated.</p>
    */
  var relativePath: js.UndefOr[String] = js.undefined
}

object File {
  @scala.inline
  def apply(
    absolutePath: String = null,
    blobId: String = null,
    fileMode: EXECUTABLE | NORMAL | SYMLINK | String = null,
    relativePath: String = null
  ): File = {
    val __obj = js.Dynamic.literal()
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath.asInstanceOf[js.Any])
    if (blobId != null) __obj.updateDynamic("blobId")(blobId.asInstanceOf[js.Any])
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

