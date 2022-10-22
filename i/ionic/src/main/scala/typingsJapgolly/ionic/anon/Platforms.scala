package typingsJapgolly.ionic.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platforms extends StObject {
  
  var platforms: js.Array[String]
  
  var plugins: StringDictionary[Any]
}
object Platforms {
  
  inline def apply(platforms: js.Array[String], plugins: StringDictionary[Any]): Platforms = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platforms]
  }
  
  extension [Self <: Platforms](x: Self) {
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setPlugins(value: StringDictionary[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
