package typingsJapgolly.typedoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TocPlugin")
@js.native
class TocPlugin ()
  extends typingsJapgolly.typedoc.outputPluginsMod.TocPlugin

/* static members */
@JSImport("typedoc", "TocPlugin")
@js.native
object TocPlugin extends js.Object {
  def buildToc(
    model: typingsJapgolly.typedoc.reflectionsMod.Reflection,
    trail: js.Array[typingsJapgolly.typedoc.reflectionsMod.Reflection],
    parent: typingsJapgolly.typedoc.navigationItemMod.NavigationItem
  ): Unit = js.native
  def buildToc(
    model: typingsJapgolly.typedoc.reflectionsMod.Reflection,
    trail: js.Array[typingsJapgolly.typedoc.reflectionsMod.Reflection],
    parent: typingsJapgolly.typedoc.navigationItemMod.NavigationItem,
    restriction: js.Array[String]
  ): Unit = js.native
}

