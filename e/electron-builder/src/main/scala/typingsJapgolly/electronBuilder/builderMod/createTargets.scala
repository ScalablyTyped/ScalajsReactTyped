package typingsJapgolly.electronBuilder.builderMod

import typingsJapgolly.appBuilderLib.mod.Platform
import typingsJapgolly.builderUtil.archMod.Arch
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder/out/builder", "createTargets")
@js.native
object createTargets extends js.Object {
  def apply(platforms: js.Array[Platform]): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def apply(platforms: js.Array[Platform], `type`: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def apply(platforms: js.Array[Platform], `type`: String, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def apply(platforms: js.Array[Platform], `type`: Null, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
}

