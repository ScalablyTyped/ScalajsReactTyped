package typingsJapgolly.devtools.anon

import typingsJapgolly.devtools.devtoolsStrings.tab
import typingsJapgolly.devtools.devtoolsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: window | tab
}
object Type {
  
  inline def apply(`type`: window | tab): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: window | tab): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
