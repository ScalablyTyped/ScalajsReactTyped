package typingsJapgolly.carbonComponents.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.componentsUiShellHeaderNavMod.HeaderNavOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "HeaderNav")
@js.native
open class HeaderNav protected ()
  extends typingsJapgolly.carbonComponents.globalsJsComponentsMod.HeaderNav {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: HeaderNavOptions) = this()
}
object HeaderNav {
  
  @JSImport("carbon-components", "HeaderNav")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  object NAVIGATE {
    
    @JSImport("carbon-components", "HeaderNav.NAVIGATE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "HeaderNav.NAVIGATE.BACKWARD")
    @js.native
    def BACKWARD: Double = js.native
    inline def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "HeaderNav.NAVIGATE.FORWARD")
    @js.native
    def FORWARD: Double = js.native
    inline def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("carbon-components", "HeaderNav.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
