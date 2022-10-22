package typingsJapgolly.winrtUwp.Windows.UI.ViewManagement

import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the input pane Hiding and Showing events. */
trait InputPaneVisibilityEventArgs extends StObject {
  
  /** Identifies whether the application has taken steps to ensure that the input pane doesn't cover the UI element that has focus. */
  var ensuredFocusedElementInView: Boolean
  
  /** Gets the region of the application's window that the input pane is covering. */
  var occludedRect: Rect
}
object InputPaneVisibilityEventArgs {
  
  inline def apply(ensuredFocusedElementInView: Boolean, occludedRect: Rect): InputPaneVisibilityEventArgs = {
    val __obj = js.Dynamic.literal(ensuredFocusedElementInView = ensuredFocusedElementInView.asInstanceOf[js.Any], occludedRect = occludedRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputPaneVisibilityEventArgs]
  }
  
  extension [Self <: InputPaneVisibilityEventArgs](x: Self) {
    
    inline def setEnsuredFocusedElementInView(value: Boolean): Self = StObject.set(x, "ensuredFocusedElementInView", value.asInstanceOf[js.Any])
    
    inline def setOccludedRect(value: Rect): Self = StObject.set(x, "occludedRect", value.asInstanceOf[js.Any])
  }
}
