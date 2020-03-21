package typingsJapgolly.npmPackageArg.mod

import typingsJapgolly.npmPackageArg.npmPackageArgStrings.git
import typingsJapgolly.npmPackageArg.npmPackageArgStrings.remote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLResult extends Result {
  @JSName("fetchSpec")
  var fetchSpec_URLResult: String = js.native
  @JSName("gitCommittish")
  var gitCommittish_URLResult: js.UndefOr[String] = js.native
  @JSName("gitRange")
  var gitRange_URLResult: js.UndefOr[String] = js.native
  @JSName("saveSpec")
  var saveSpec_URLResult: String = js.native
  @JSName("type")
  var type_URLResult: git | remote = js.native
}

