package typingsJapgolly.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Src extends StObject {
  
  var src: String
  
  var tag: String
}
object Src {
  
  inline def apply(src: String, tag: String): Src = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
  
  extension [Self <: Src](x: Self) {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
