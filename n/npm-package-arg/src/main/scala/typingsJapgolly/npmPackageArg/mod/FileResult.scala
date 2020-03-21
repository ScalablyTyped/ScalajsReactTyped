package typingsJapgolly.npmPackageArg.mod

import typingsJapgolly.npmPackageArg.npmPackageArgStrings.directory
import typingsJapgolly.npmPackageArg.npmPackageArgStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileResult extends Result {
  @JSName("fetchSpec")
  var fetchSpec_FileResult: Null | String = js.native
  @JSName("saveSpec")
  var saveSpec_FileResult: String = js.native
  @JSName("type")
  var type_FileResult: file | directory = js.native
  var where: String = js.native
}

