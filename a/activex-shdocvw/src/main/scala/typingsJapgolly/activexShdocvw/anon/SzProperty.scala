package typingsJapgolly.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SzProperty extends StObject {
  
  val szProperty: String
}
object SzProperty {
  
  inline def apply(szProperty: String): SzProperty = {
    val __obj = js.Dynamic.literal(szProperty = szProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[SzProperty]
  }
  
  extension [Self <: SzProperty](x: Self) {
    
    inline def setSzProperty(value: String): Self = StObject.set(x, "szProperty", value.asInstanceOf[js.Any])
  }
}
