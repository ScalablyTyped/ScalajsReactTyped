package typingsJapgolly.jupyterlabMainmenu.labmenuMod

import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorWidgets.menuMod.Menu.IItemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJupyterLabMenu extends IDisposable {
  /**
    * Add a group of menu items specific to a particular
    * plugin.
    */
  def addGroup(items: js.Array[IItemOptions]): IDisposable = js.native
  def addGroup(items: js.Array[IItemOptions], rank: Double): IDisposable = js.native
}

