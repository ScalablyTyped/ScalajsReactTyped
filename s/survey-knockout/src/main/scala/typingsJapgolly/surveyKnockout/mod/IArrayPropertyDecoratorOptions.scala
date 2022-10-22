package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IArrayPropertyDecoratorOptions extends StObject {
  
  var onPush: js.UndefOr[Any] = js.undefined
  
  var onRemove: js.UndefOr[Any] = js.undefined
  
  var onSet: js.UndefOr[js.Function2[/* val */ Any, /* target */ Any, Unit]] = js.undefined
}
object IArrayPropertyDecoratorOptions {
  
  inline def apply(): IArrayPropertyDecoratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArrayPropertyDecoratorOptions]
  }
  
  extension [Self <: IArrayPropertyDecoratorOptions](x: Self) {
    
    inline def setOnPush(value: Any): Self = StObject.set(x, "onPush", value.asInstanceOf[js.Any])
    
    inline def setOnPushUndefined: Self = StObject.set(x, "onPush", js.undefined)
    
    inline def setOnRemove(value: Any): Self = StObject.set(x, "onRemove", value.asInstanceOf[js.Any])
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setOnSet(value: (/* val */ Any, /* target */ Any) => Callback): Self = StObject.set(x, "onSet", js.Any.fromFunction2((t0: /* val */ Any, t1: /* target */ Any) => (value(t0, t1)).runNow()))
    
    inline def setOnSetUndefined: Self = StObject.set(x, "onSet", js.undefined)
  }
}
