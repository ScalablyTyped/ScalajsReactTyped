package typingsJapgolly.tsJest.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jestTypes.mod.TransformerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@jest/types.@jest/types.InitialOptions, 'extensionsToTreatAsEsm' | 'moduleFileExtensions' | 'transform' | 'testMatch'> */
trait TsJestPresets extends StObject {
  
  var extensionsToTreatAsEsm: js.UndefOr[js.Array[String]] = js.undefined
  
  var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var testMatch: js.UndefOr[js.Array[String]] = js.undefined
  
  var transform: js.UndefOr[StringDictionary[String | TransformerConfig]] = js.undefined
}
object TsJestPresets {
  
  inline def apply(): TsJestPresets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TsJestPresets]
  }
  
  extension [Self <: TsJestPresets](x: Self) {
    
    inline def setExtensionsToTreatAsEsm(value: js.Array[String]): Self = StObject.set(x, "extensionsToTreatAsEsm", value.asInstanceOf[js.Any])
    
    inline def setExtensionsToTreatAsEsmUndefined: Self = StObject.set(x, "extensionsToTreatAsEsm", js.undefined)
    
    inline def setExtensionsToTreatAsEsmVarargs(value: String*): Self = StObject.set(x, "extensionsToTreatAsEsm", js.Array(value*))
    
    inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setModuleFileExtensionsUndefined: Self = StObject.set(x, "moduleFileExtensions", js.undefined)
    
    inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value*))
    
    inline def setTestMatch(value: js.Array[String]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
    
    inline def setTestMatchUndefined: Self = StObject.set(x, "testMatch", js.undefined)
    
    inline def setTestMatchVarargs(value: String*): Self = StObject.set(x, "testMatch", js.Array(value*))
    
    inline def setTransform(value: StringDictionary[String | TransformerConfig]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
