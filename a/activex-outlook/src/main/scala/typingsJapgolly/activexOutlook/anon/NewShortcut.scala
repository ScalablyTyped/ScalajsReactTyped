package typingsJapgolly.activexOutlook.anon

import typingsJapgolly.activexOutlook.Outlook.OutlookBarShortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewShortcut extends StObject {
  
  val NewShortcut: OutlookBarShortcut
}
object NewShortcut {
  
  inline def apply(NewShortcut: OutlookBarShortcut): NewShortcut = {
    val __obj = js.Dynamic.literal(NewShortcut = NewShortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewShortcut]
  }
  
  extension [Self <: NewShortcut](x: Self) {
    
    inline def setNewShortcut(value: OutlookBarShortcut): Self = StObject.set(x, "NewShortcut", value.asInstanceOf[js.Any])
  }
}
