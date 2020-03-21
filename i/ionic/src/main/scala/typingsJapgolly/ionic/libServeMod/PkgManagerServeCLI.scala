package typingsJapgolly.ionic.libServeMod

import typingsJapgolly.ionic.definitionsMod.NpmClient
import typingsJapgolly.ionic.definitionsMod.ServeOptions
import typingsJapgolly.ionic.ionicBooleans.`true`
import typingsJapgolly.ionic.ionicStrings.ionicColonserve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkgManagerServeCLI extends ServeCLI[ServeOptions] {
  @JSName("global")
  val global_PkgManagerServeCLI: `true` = js.native
  @JSName("program")
  val program_PkgManagerServeCLI: NpmClient = js.native
  @JSName("script")
  val script_PkgManagerServeCLI: ionicColonserve = js.native
}

