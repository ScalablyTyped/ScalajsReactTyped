package typingsJapgolly.materialTabIndicator

import typingsJapgolly.materialTabIndicator.anon.PartialMDCTabIndicatorAda
import typingsJapgolly.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slidingFoundationMod {
  
  @JSImport("@material/tab-indicator/sliding-foundation", JSImport.Default)
  @js.native
  open class default () extends MDCSlidingTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("@material/tab-indicator/sliding-foundation", "MDCSlidingTabIndicatorFoundation")
  @js.native
  open class MDCSlidingTabIndicatorFoundation () extends MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
}
