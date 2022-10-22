package typingsJapgolly.materialLineRipple

import org.scalajs.dom.TransitionEvent
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialLineRipple.adapterMod.MDCLineRippleAdapter
import typingsJapgolly.materialLineRipple.anon.PartialMDCLineRippleAdapt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/line-ripple/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCLineRippleFoundation {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
  }
  
  @JSImport("@material/line-ripple/foundation", "MDCLineRippleFoundation")
  @js.native
  open class MDCLineRippleFoundation () extends MDCFoundation[MDCLineRippleAdapter] {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
    
    def activate(): Unit = js.native
    
    def deactivate(): Unit = js.native
    
    def handleTransitionEnd(evt: TransitionEvent): Unit = js.native
    
    def setRippleCenter(xCoordinate: Double): Unit = js.native
    
    /* private */ val transitionEndHandler: Any = js.native
  }
}
