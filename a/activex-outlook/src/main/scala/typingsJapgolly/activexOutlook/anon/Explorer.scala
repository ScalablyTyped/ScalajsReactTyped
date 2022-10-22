package typingsJapgolly.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explorer extends StObject {
  
  val Explorer: typingsJapgolly.activexOutlook.Outlook.Explorer
}
object Explorer {
  
  inline def apply(Explorer: typingsJapgolly.activexOutlook.Outlook.Explorer): Explorer = {
    val __obj = js.Dynamic.literal(Explorer = Explorer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorer]
  }
  
  extension [Self <: Explorer](x: Self) {
    
    inline def setExplorer(value: typingsJapgolly.activexOutlook.Outlook.Explorer): Self = StObject.set(x, "Explorer", value.asInstanceOf[js.Any])
  }
}
