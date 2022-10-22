package typingsJapgolly.wixStyleReact.anon

import typingsJapgolly.wixStyleReact.wixStyleReactStrings.ALL
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginType extends StObject {
  
  var origin: String
  
  var `type`: ALL | NONE
}
object OriginType {
  
  inline def apply(origin: String, `type`: ALL | NONE): OriginType = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginType]
  }
  
  extension [Self <: OriginType](x: Self) {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setType(value: ALL | NONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
