package typingsJapgolly.awsSdkClientCodecommitNode.typesSubModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubModule extends js.Object {
  /**
    * <p>The fully qualified path to the folder that contains the reference to the submodule.</p>
    */
  var absolutePath: js.UndefOr[String] = js.undefined
  /**
    * <p>The commit ID that contains the reference to the submodule.</p>
    */
  var commitId: js.UndefOr[String] = js.undefined
  /**
    * <p>The relative path of the submodule from the folder where the query originated.</p>
    */
  var relativePath: js.UndefOr[String] = js.undefined
}

object SubModule {
  @scala.inline
  def apply(absolutePath: String = null, commitId: String = null, relativePath: String = null): SubModule = {
    val __obj = js.Dynamic.literal()
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath.asInstanceOf[js.Any])
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubModule]
  }
}

