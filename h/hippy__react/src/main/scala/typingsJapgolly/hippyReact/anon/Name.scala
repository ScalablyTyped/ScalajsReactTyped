package typingsJapgolly.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var skipAddToDom: js.UndefOr[Boolean] = js.undefined
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSkipAddToDom(value: Boolean): Self = StObject.set(x, "skipAddToDom", value.asInstanceOf[js.Any])
    
    inline def setSkipAddToDomUndefined: Self = StObject.set(x, "skipAddToDom", js.undefined)
  }
}
