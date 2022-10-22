package typingsJapgolly.winrt.Windows.UI.ViewManagement

import typingsJapgolly.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputPane
  extends StObject
     with IInputPane
object InputPane {
  
  inline def apply(occludedRect: Rect, onhiding: Any, onshowing: Any): InputPane = {
    val __obj = js.Dynamic.literal(occludedRect = occludedRect.asInstanceOf[js.Any], onhiding = onhiding.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputPane]
  }
}
