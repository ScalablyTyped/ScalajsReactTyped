package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<webpack.webpack.WebpackOptionsNormalized['resolve'], 'mainFields' | 'conditionNames'> */
trait PickWebpackOptionsNormali extends StObject {
  
  var conditionNames: js.UndefOr[Any] = js.undefined
  
  var mainFields: js.UndefOr[Any] = js.undefined
}
object PickWebpackOptionsNormali {
  
  inline def apply(): PickWebpackOptionsNormali = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickWebpackOptionsNormali]
  }
  
  extension [Self <: PickWebpackOptionsNormali](x: Self) {
    
    inline def setConditionNames(value: Any): Self = StObject.set(x, "conditionNames", value.asInstanceOf[js.Any])
    
    inline def setConditionNamesUndefined: Self = StObject.set(x, "conditionNames", js.undefined)
    
    inline def setMainFields(value: Any): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
  }
}
