package typingsJapgolly.metroBabelTransformer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait CustomTransformOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var __proto__ : Null
  }
  object CustomTransformOptions {
    
    inline def apply(__proto__ : Null): CustomTransformOptions = {
      val __obj = js.Dynamic.literal(__proto__ = __proto__.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTransformOptions]
    }
    
    extension [Self <: CustomTransformOptions](x: Self) {
      
      inline def set__proto__(value: Null): Self = StObject.set(x, "__proto__", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.metroBabelTransformer.metroBabelTransformerStrings.default
    - typingsJapgolly.metroBabelTransformer.metroBabelTransformerStrings.`hermes-stable`
    - typingsJapgolly.metroBabelTransformer.metroBabelTransformerStrings.`hermes-canary`
  */
  trait TransformProfile extends StObject
  object TransformProfile {
    
    inline def default: typingsJapgolly.metroBabelTransformer.metroBabelTransformerStrings.default = "default".asInstanceOf[typingsJapgolly.metroBabelTransformer.metroBabelTransformerStrings.default]
    
    inline def `hermes-canary`: typingsJapgolly.metroBabelTransformer.metroBabelTransformerStrings.`hermes-canary` = "hermes-canary".asInstanceOf[typingsJapgolly.metroBabelTransformer.metroBabelTransformerStrings.`hermes-canary`]
    
    inline def `hermes-stable`: typingsJapgolly.metroBabelTransformer.metroBabelTransformerStrings.`hermes-stable` = "hermes-stable".asInstanceOf[typingsJapgolly.metroBabelTransformer.metroBabelTransformerStrings.`hermes-stable`]
  }
}
