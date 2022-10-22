package typingsJapgolly.carbonComponents.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialFloatingMenuOption
import typingsJapgolly.carbonComponents.componentsFloatingMenuFloatingMenuMod.FloatingMenuOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "FloatingMenu")
@js.native
open class FloatingMenu protected ()
  extends typingsJapgolly.carbonComponents.globalsJsComponentsMod.FloatingMenu {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialFloatingMenuOption) = this()
}
object FloatingMenu {
  
  @JSImport("carbon-components", "FloatingMenu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "FloatingMenu.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("carbon-components", "FloatingMenu.options")
  @js.native
  def options: FloatingMenuOptions = js.native
  inline def options_=(x: FloatingMenuOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
