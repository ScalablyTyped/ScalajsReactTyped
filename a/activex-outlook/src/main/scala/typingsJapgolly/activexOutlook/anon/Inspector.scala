package typingsJapgolly.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inspector extends StObject {
  
  val Inspector: typingsJapgolly.activexOutlook.Outlook.Inspector
}
object Inspector {
  
  inline def apply(Inspector: typingsJapgolly.activexOutlook.Outlook.Inspector): Inspector = {
    val __obj = js.Dynamic.literal(Inspector = Inspector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inspector]
  }
  
  extension [Self <: Inspector](x: Self) {
    
    inline def setInspector(value: typingsJapgolly.activexOutlook.Outlook.Inspector): Self = StObject.set(x, "Inspector", value.asInstanceOf[js.Any])
  }
}
