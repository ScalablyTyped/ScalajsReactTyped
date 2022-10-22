package typingsJapgolly.materialTabIndicator

import org.scalajs.dom.DOMRect
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialTabIndicator.adapterMod.MDCTabIndicatorAdapter
import typingsJapgolly.materialTabIndicator.anon.PartialMDCTabIndicatorAda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  /* note: abstract class */ @JSImport("@material/tab-indicator/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  /* note: abstract class */ @JSImport("@material/tab-indicator/foundation", "MDCTabIndicatorFoundation")
  @js.native
  open class MDCTabIndicatorFoundation () extends MDCFoundation[MDCTabIndicatorAdapter] {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
    
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: DOMRect): Unit = js.native
    
    def computeContentClientRect(): DOMRect = js.native
    
    def deactivate(): Unit = js.native
  }
}
