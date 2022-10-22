package typingsJapgolly.carbonComponents.globalsJsComponentsMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialProgressIndicatorO
import typingsJapgolly.carbonComponents.componentsProgressIndicatorProgressIndicatorMod.default
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "ProgressIndicator")
@js.native
open class ProgressIndicator protected () extends default {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialProgressIndicatorO) = this()
}
object ProgressIndicator {
  
  @JSImport("carbon-components/globals/js/components", "ProgressIndicator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "ProgressIndicator.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
