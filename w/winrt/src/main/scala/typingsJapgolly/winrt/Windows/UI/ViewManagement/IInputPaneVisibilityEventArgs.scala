package typingsJapgolly.winrt.Windows.UI.ViewManagement

import typingsJapgolly.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputPaneVisibilityEventArgs extends StObject {
  
  var ensuredFocusedElementInView: Boolean
  
  var occludedRect: Rect
}
object IInputPaneVisibilityEventArgs {
  
  inline def apply(ensuredFocusedElementInView: Boolean, occludedRect: Rect): IInputPaneVisibilityEventArgs = {
    val __obj = js.Dynamic.literal(ensuredFocusedElementInView = ensuredFocusedElementInView.asInstanceOf[js.Any], occludedRect = occludedRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputPaneVisibilityEventArgs]
  }
  
  extension [Self <: IInputPaneVisibilityEventArgs](x: Self) {
    
    inline def setEnsuredFocusedElementInView(value: Boolean): Self = StObject.set(x, "ensuredFocusedElementInView", value.asInstanceOf[js.Any])
    
    inline def setOccludedRect(value: Rect): Self = StObject.set(x, "occludedRect", value.asInstanceOf[js.Any])
  }
}
