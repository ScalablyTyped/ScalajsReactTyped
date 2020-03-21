package typingsJapgolly.typedoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "NavigationItem")
@js.native
class NavigationItem ()
  extends typingsJapgolly.typedoc.navigationItemMod.NavigationItem {
  def this(title: String) = this()
  def this(title: String, url: String) = this()
  def this(title: String, url: String, parent: typingsJapgolly.typedoc.navigationItemMod.NavigationItem) = this()
  def this(
    title: String,
    url: String,
    parent: typingsJapgolly.typedoc.navigationItemMod.NavigationItem,
    cssClasses: String
  ) = this()
  def this(
    title: String,
    url: String,
    parent: typingsJapgolly.typedoc.navigationItemMod.NavigationItem,
    cssClasses: String,
    reflection: typingsJapgolly.typedoc.abstractMod.Reflection
  ) = this()
}

/* static members */
@JSImport("typedoc", "NavigationItem")
@js.native
object NavigationItem extends js.Object {
  def create(reflection: typingsJapgolly.typedoc.abstractMod.Reflection): typingsJapgolly.typedoc.navigationItemMod.NavigationItem = js.native
  def create(
    reflection: typingsJapgolly.typedoc.abstractMod.Reflection,
    parent: typingsJapgolly.typedoc.navigationItemMod.NavigationItem
  ): typingsJapgolly.typedoc.navigationItemMod.NavigationItem = js.native
  def create(
    reflection: typingsJapgolly.typedoc.abstractMod.Reflection,
    parent: typingsJapgolly.typedoc.navigationItemMod.NavigationItem,
    useShortNames: Boolean
  ): typingsJapgolly.typedoc.navigationItemMod.NavigationItem = js.native
}

