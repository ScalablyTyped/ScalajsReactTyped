package typingsJapgolly.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewView extends StObject {
  
  val View: typingsJapgolly.activexOutlook.Outlook.View
}
object ViewView {
  
  inline def apply(View: typingsJapgolly.activexOutlook.Outlook.View): ViewView = {
    val __obj = js.Dynamic.literal(View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewView]
  }
  
  extension [Self <: ViewView](x: Self) {
    
    inline def setView(value: typingsJapgolly.activexOutlook.Outlook.View): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
