package typingsJapgolly.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdStartedParam extends StObject {
  
  var creativetype: String
  
  var tag: String
}
object AdStartedParam {
  
  inline def apply(creativetype: String, tag: String): AdStartedParam = {
    val __obj = js.Dynamic.literal(creativetype = creativetype.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStartedParam]
  }
  
  extension [Self <: AdStartedParam](x: Self) {
    
    inline def setCreativetype(value: String): Self = StObject.set(x, "creativetype", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
