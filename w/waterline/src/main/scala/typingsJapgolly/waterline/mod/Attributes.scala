package typingsJapgolly.waterline.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes
  extends StObject
     with /* index */ StringDictionary[Attribute] {
  
  var toJSON: js.UndefOr[js.Function0[String]] = js.undefined
  
  var toObject: js.UndefOr[js.Function0[Any]] = js.undefined
}
object Attributes {
  
  inline def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setToObject(value: CallbackTo[Any]): Self = StObject.set(x, "toObject", value.toJsFn)
    
    inline def setToObjectUndefined: Self = StObject.set(x, "toObject", js.undefined)
  }
}
