package typingsJapgolly.senchaTouch.Ext.device

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accelerometer {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Config Option] (Number) */
    var frequency: js.UndefOr[Double] = js.undefined
    
    /** [Method] Returns the value of frequency
      * @returns Number
      */
    var getFrequency: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Sets the value of frequency
      * @param frequency Number The new value.
      */
    var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setGetFrequency(value: CallbackTo[Double]): Self = StObject.set(x, "getFrequency", value.toJsFn)
      
      inline def setGetFrequencyUndefined: Self = StObject.set(x, "getFrequency", js.undefined)
      
      inline def setSetFrequency(value: /* frequency */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setFrequency", js.Any.fromFunction1((t0: /* frequency */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetFrequencyUndefined: Self = StObject.set(x, "setFrequency", js.undefined)
    }
  }
  
  type ICordova = IAbstract
  
  type IPhoneGap = IAbstract
  
  type ISimulator = IAbstract
}
