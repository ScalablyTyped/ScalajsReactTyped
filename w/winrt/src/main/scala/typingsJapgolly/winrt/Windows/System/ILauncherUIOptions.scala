package typingsJapgolly.winrt.Windows.System

import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.UI.Popups.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILauncherUIOptions extends StObject {
  
  var invocationPoint: Point
  
  var preferredPlacement: Placement
  
  var selectionRect: Rect
}
object ILauncherUIOptions {
  
  inline def apply(invocationPoint: Point, preferredPlacement: Placement, selectionRect: Rect): ILauncherUIOptions = {
    val __obj = js.Dynamic.literal(invocationPoint = invocationPoint.asInstanceOf[js.Any], preferredPlacement = preferredPlacement.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILauncherUIOptions]
  }
  
  extension [Self <: ILauncherUIOptions](x: Self) {
    
    inline def setInvocationPoint(value: Point): Self = StObject.set(x, "invocationPoint", value.asInstanceOf[js.Any])
    
    inline def setPreferredPlacement(value: Placement): Self = StObject.set(x, "preferredPlacement", value.asInstanceOf[js.Any])
    
    inline def setSelectionRect(value: Rect): Self = StObject.set(x, "selectionRect", value.asInstanceOf[js.Any])
  }
}
