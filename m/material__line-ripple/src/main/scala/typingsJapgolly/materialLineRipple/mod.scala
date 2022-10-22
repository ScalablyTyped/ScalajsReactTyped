package typingsJapgolly.materialLineRipple

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialLineRipple.anon.PartialMDCLineRippleAdapt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/line-ripple", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialLineRipple.foundationMod.default {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
  }
  
  @JSImport("@material/line-ripple", "MDCLineRipple")
  @js.native
  open class MDCLineRipple protected ()
    extends typingsJapgolly.materialLineRipple.componentMod.MDCLineRipple {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialLineRipple.foundationMod.MDCLineRippleFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCLineRipple {
    
    @JSImport("@material/line-ripple", "MDCLineRipple")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialLineRipple.componentMod.MDCLineRipple = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialLineRipple.componentMod.MDCLineRipple]
  }
  
  @JSImport("@material/line-ripple", "MDCLineRippleFoundation")
  @js.native
  open class MDCLineRippleFoundation ()
    extends typingsJapgolly.materialLineRipple.foundationMod.MDCLineRippleFoundation {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/line-ripple", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/line-ripple", "cssClasses.LINE_RIPPLE_ACTIVE")
    @js.native
    def LINE_RIPPLE_ACTIVE: String = js.native
    inline def LINE_RIPPLE_ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/line-ripple", "cssClasses.LINE_RIPPLE_DEACTIVATING")
    @js.native
    def LINE_RIPPLE_DEACTIVATING: String = js.native
    inline def LINE_RIPPLE_DEACTIVATING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_DEACTIVATING")(x.asInstanceOf[js.Any])
  }
}
