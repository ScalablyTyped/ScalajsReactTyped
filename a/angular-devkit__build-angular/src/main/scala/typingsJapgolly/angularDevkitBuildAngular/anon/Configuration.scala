package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration[T] extends StObject {
  
  var configuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.PartialConfig */ Any
  
  var customOptions: T
  
  var map: js.UndefOr[Any] = js.undefined
  
  var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.TransformOptions */ Any
  
  var source: String
}
object Configuration {
  
  inline def apply[T](
    configuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.PartialConfig */ Any,
    customOptions: T,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.TransformOptions */ Any,
    source: String
  ): Configuration[T] = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], customOptions = customOptions.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration[T]]
  }
  
  extension [Self <: Configuration[?], T](x: Self & Configuration[T]) {
    
    inline def setConfiguration(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.PartialConfig */ Any
    ): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setCustomOptions(value: T): Self = StObject.set(x, "customOptions", value.asInstanceOf[js.Any])
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.TransformOptions */ Any
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
