package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathColumnidNumber extends StObject {
  
  var path: ColumnidNumber
}
object PathColumnidNumber {
  
  inline def apply(path: ColumnidNumber): PathColumnidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathColumnidNumber]
  }
  
  extension [Self <: PathColumnidNumber](x: Self) {
    
    inline def setPath(value: ColumnidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
