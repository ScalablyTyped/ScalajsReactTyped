package typingsJapgolly.carbonComponents.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialProductSwitcherOpt
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "ProductSwitcher")
@js.native
open class ProductSwitcher protected ()
  extends typingsJapgolly.carbonComponents.globalsJsComponentsMod.ProductSwitcher {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialProductSwitcherOpt) = this()
}
object ProductSwitcher {
  
  @JSImport("carbon-components", "ProductSwitcher")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "ProductSwitcher.SELECT_NONE")
  @js.native
  def SELECT_NONE: String = js.native
  inline def SELECT_NONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT_NONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("carbon-components", "ProductSwitcher.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
