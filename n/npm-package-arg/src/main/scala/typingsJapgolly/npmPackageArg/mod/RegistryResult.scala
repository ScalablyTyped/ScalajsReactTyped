package typingsJapgolly.npmPackageArg.mod

import typingsJapgolly.npmPackageArg.npmPackageArgBooleans.`true`
import typingsJapgolly.npmPackageArg.npmPackageArgStrings.range
import typingsJapgolly.npmPackageArg.npmPackageArgStrings.tag
import typingsJapgolly.npmPackageArg.npmPackageArgStrings.version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistryResult extends Result {
  @JSName("fetchSpec")
  var fetchSpec_RegistryResult: String = js.native
  @JSName("registry")
  var registry_RegistryResult: `true` = js.native
  @JSName("saveSpec")
  var saveSpec_RegistryResult: Null = js.native
  @JSName("type")
  var type_RegistryResult: version | range | tag = js.native
}

