package typingsJapgolly.hellosignSdk.mod

import typingsJapgolly.hellosignSdk.anon.Numpages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInfo extends StObject {
  
  var list_info: Numpages
}
object ListInfo {
  
  inline def apply(list_info: Numpages): ListInfo = {
    val __obj = js.Dynamic.literal(list_info = list_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInfo]
  }
  
  extension [Self <: ListInfo](x: Self) {
    
    inline def setList_info(value: Numpages): Self = StObject.set(x, "list_info", value.asInstanceOf[js.Any])
  }
}
