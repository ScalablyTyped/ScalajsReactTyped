package typingsJapgolly.cleaveJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.cleaveJs.optionsMod.CleaveOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cleave.js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Cleave {
    def this(selector: String, options: CleaveOptions) = this()
    def this(selector: HTMLElement, options: CleaveOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getFormattedValue(): String = js.native
    
    /* CompleteClass */
    override def getISOFormatDate(): String = js.native
    
    /* CompleteClass */
    override def getRawValue(): String = js.native
    
    /* CompleteClass */
    var properties: Properties = js.native
    
    /* CompleteClass */
    override def setPhoneRegionCode(regionCode: String): Unit = js.native
    
    /* CompleteClass */
    override def setRawValue(value: String): Unit = js.native
  }
  
  trait Cleave extends StObject {
    
    def destroy(): Unit
    
    def getFormattedValue(): String
    
    def getISOFormatDate(): String
    
    def getRawValue(): String
    
    var properties: Properties
    
    def setPhoneRegionCode(regionCode: String): Unit
    
    def setRawValue(value: String): Unit
  }
  object Cleave {
    
    inline def apply(
      destroy: Callback,
      getFormattedValue: CallbackTo[String],
      getISOFormatDate: CallbackTo[String],
      getRawValue: CallbackTo[String],
      properties: Properties,
      setPhoneRegionCode: String => Callback,
      setRawValue: String => Callback
    ): Cleave = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getFormattedValue = getFormattedValue.toJsFn, getISOFormatDate = getISOFormatDate.toJsFn, getRawValue = getRawValue.toJsFn, properties = properties.asInstanceOf[js.Any], setPhoneRegionCode = js.Any.fromFunction1((t0: String) => setPhoneRegionCode(t0).runNow()), setRawValue = js.Any.fromFunction1((t0: String) => setRawValue(t0).runNow()))
      __obj.asInstanceOf[Cleave]
    }
    
    extension [Self <: Cleave](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetFormattedValue(value: CallbackTo[String]): Self = StObject.set(x, "getFormattedValue", value.toJsFn)
      
      inline def setGetISOFormatDate(value: CallbackTo[String]): Self = StObject.set(x, "getISOFormatDate", value.toJsFn)
      
      inline def setGetRawValue(value: CallbackTo[String]): Self = StObject.set(x, "getRawValue", value.toJsFn)
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSetPhoneRegionCode(value: String => Callback): Self = StObject.set(x, "setPhoneRegionCode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetRawValue(value: String => Callback): Self = StObject.set(x, "setRawValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait Properties
    extends StObject
       with CleaveOptions {
    
    var result: String
  }
  object Properties {
    
    inline def apply(result: String): Properties = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Properties]
    }
    
    extension [Self <: Properties](x: Self) {
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
