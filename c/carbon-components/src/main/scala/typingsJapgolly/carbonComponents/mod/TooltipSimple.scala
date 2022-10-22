package typingsJapgolly.carbonComponents.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialTooltipSimpleOptio
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "TooltipSimple")
@js.native
open class TooltipSimple protected ()
  extends typingsJapgolly.carbonComponents.globalsJsComponentsMod.TooltipSimple {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialTooltipSimpleOptio) = this()
}
/* static members */
object TooltipSimple {
  
  @JSImport("carbon-components", "TooltipSimple")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components", "TooltipSimple.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
