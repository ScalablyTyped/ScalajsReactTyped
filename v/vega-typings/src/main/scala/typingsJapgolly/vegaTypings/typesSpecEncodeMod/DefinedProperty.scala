package typingsJapgolly.vegaTypings.typesSpecEncodeMod

import typingsJapgolly.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinedProperty extends StObject {
  
  var defined: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
}
object DefinedProperty {
  
  inline def apply(): DefinedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinedProperty]
  }
  
  extension [Self <: DefinedProperty](x: Self) {
    
    inline def setDefined(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
    
    inline def setDefinedUndefined: Self = StObject.set(x, "defined", js.undefined)
    
    inline def setDefinedVarargs(value: (Test & BooleanValueRef)*): Self = StObject.set(x, "defined", js.Array(value*))
  }
}
