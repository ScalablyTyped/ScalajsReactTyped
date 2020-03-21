package typingsJapgolly.phosphorWidgets.mod

import typingsJapgolly.phosphorWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "Menu")
@js.native
class Menu protected ()
  extends typingsJapgolly.phosphorWidgets.menuMod.Menu {
  /**
    * Construct a new menu.
    *
    * @param options - The options for initializing the menu.
    */
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "Menu")
@js.native
object Menu extends js.Object {
  /**
    * The default implementation of `IRenderer`.
    *
    * #### Notes
    * Subclasses are free to reimplement rendering methods as needed.
    */
  @js.native
  /**
    * Construct a new renderer.
    */
  class Renderer ()
    extends typingsJapgolly.phosphorWidgets.menuMod.Menu.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typingsJapgolly.phosphorWidgets.menuMod.Menu.Renderer = js.native
}

