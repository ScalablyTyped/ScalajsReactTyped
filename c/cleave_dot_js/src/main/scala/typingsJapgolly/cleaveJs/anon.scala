package typingsJapgolly.cleaveJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.cleaveJs.mod.Properties
import typingsJapgolly.cleaveJs.optionsMod.CleaveOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<cleave.js.cleave.js.^, 'destroy'> */
  trait Omitdestroy extends StObject {
    
    var constructor: js.Function2[/* selector */ String | HTMLElement, /* options */ CleaveOptions, Any]
    
    var getFormattedValue: js.Function0[String]
    
    var getISOFormatDate: js.Function0[String]
    
    var getRawValue: js.Function0[String]
    
    var properties: Properties
    
    var setPhoneRegionCode: js.Function1[/* regionCode */ String, Unit]
    
    var setRawValue: js.Function1[/* value */ String, Unit]
  }
  object Omitdestroy {
    
    inline def apply(
      constructor: (/* selector */ String | HTMLElement, /* options */ CleaveOptions) => Any,
      getFormattedValue: CallbackTo[String],
      getISOFormatDate: CallbackTo[String],
      getRawValue: CallbackTo[String],
      properties: Properties,
      setPhoneRegionCode: /* regionCode */ String => Callback,
      setRawValue: /* value */ String => Callback
    ): Omitdestroy = {
      val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction2(constructor), getFormattedValue = getFormattedValue.toJsFn, getISOFormatDate = getISOFormatDate.toJsFn, getRawValue = getRawValue.toJsFn, properties = properties.asInstanceOf[js.Any], setPhoneRegionCode = js.Any.fromFunction1((t0: /* regionCode */ String) => setPhoneRegionCode(t0).runNow()), setRawValue = js.Any.fromFunction1((t0: /* value */ String) => setRawValue(t0).runNow()))
      __obj.asInstanceOf[Omitdestroy]
    }
    
    extension [Self <: Omitdestroy](x: Self) {
      
      inline def setConstructor(value: (/* selector */ String | HTMLElement, /* options */ CleaveOptions) => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
      
      inline def setGetFormattedValue(value: CallbackTo[String]): Self = StObject.set(x, "getFormattedValue", value.toJsFn)
      
      inline def setGetISOFormatDate(value: CallbackTo[String]): Self = StObject.set(x, "getISOFormatDate", value.toJsFn)
      
      inline def setGetRawValue(value: CallbackTo[String]): Self = StObject.set(x, "getRawValue", value.toJsFn)
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSetPhoneRegionCode(value: /* regionCode */ String => Callback): Self = StObject.set(x, "setPhoneRegionCode", js.Any.fromFunction1((t0: /* regionCode */ String) => value(t0).runNow()))
      
      inline def setSetRawValue(value: /* value */ String => Callback): Self = StObject.set(x, "setRawValue", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    }
  }
  
  trait RawValue extends StObject {
    
    var rawValue: String
  }
  object RawValue {
    
    inline def apply(rawValue: String): RawValue = {
      val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawValue]
    }
    
    extension [Self <: RawValue](x: Self) {
      
      inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    }
  }
}
