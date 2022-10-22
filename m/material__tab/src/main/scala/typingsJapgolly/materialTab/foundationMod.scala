package typingsJapgolly.materialTab

import org.scalajs.dom.DOMRect
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialTab.adapterMod.MDCTabAdapter
import typingsJapgolly.materialTab.anon.PartialMDCTabAdapter
import typingsJapgolly.materialTab.typesMod.MDCTabDimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/tab/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  
  @JSImport("@material/tab/foundation", "MDCTabFoundation")
  @js.native
  open class MDCTabFoundation () extends MDCFoundation[MDCTabAdapter] {
    def this(adapter: PartialMDCTabAdapter) = this()
    
    /**
      * Activates the Tab
      */
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: DOMRect): Unit = js.native
    
    /**
      * Returns the dimensions of the Tab
      */
    def computeDimensions(): MDCTabDimensions = js.native
    
    /**
      * Deactivates the Tab
      */
    def deactivate(): Unit = js.native
    
    /* private */ var focusOnActivate: Any = js.native
    
    def handleClick(): Unit = js.native
    
    def isActive(): Boolean = js.native
    
    /**
      * Sets whether the tab should focus itself when activated
      */
    def setFocusOnActivate(focusOnActivate: Boolean): Unit = js.native
  }
}
