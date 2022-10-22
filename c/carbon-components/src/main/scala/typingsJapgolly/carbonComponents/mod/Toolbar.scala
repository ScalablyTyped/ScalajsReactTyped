package typingsJapgolly.carbonComponents.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialToolbarOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "Toolbar")
@js.native
open class Toolbar protected ()
  extends typingsJapgolly.carbonComponents.globalsJsComponentsMod.Toolbar {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialToolbarOptions) = this()
}
object Toolbar {
  
  @JSImport("carbon-components", "Toolbar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "Toolbar.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
