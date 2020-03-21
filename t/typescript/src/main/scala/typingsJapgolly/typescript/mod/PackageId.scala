package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageId extends js.Object {
  /**
    * Name of the package.
    * Should not include `@types`.
    * If accessing a non-index file, this should include its name e.g. "foo/bar".
    */
  var name: java.lang.String
  /**
    * Name of a submodule within this package.
    * May be "".
    */
  var subModuleName: java.lang.String
  /** Version of the package, e.g. "1.2.3" */
  var version: java.lang.String
}

object PackageId {
  @scala.inline
  def apply(name: java.lang.String, subModuleName: java.lang.String, version: java.lang.String): PackageId = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subModuleName = subModuleName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackageId]
  }
}

