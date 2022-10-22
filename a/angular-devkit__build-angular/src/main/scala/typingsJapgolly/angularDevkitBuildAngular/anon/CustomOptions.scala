package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomOptions[T] extends StObject {
  
  var customOptions: T
  
  var map: js.UndefOr[Any] = js.undefined
  
  var source: String
}
object CustomOptions {
  
  inline def apply[T](customOptions: T, source: String): CustomOptions[T] = {
    val __obj = js.Dynamic.literal(customOptions = customOptions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOptions[T]]
  }
  
  extension [Self <: CustomOptions[?], T](x: Self & CustomOptions[T]) {
    
    inline def setCustomOptions(value: T): Self = StObject.set(x, "customOptions", value.asInstanceOf[js.Any])
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
