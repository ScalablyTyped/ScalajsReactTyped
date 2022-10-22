package typingsJapgolly.senchaTouch.Ext.device

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camera {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] Allows you to capture a photo
      * @param options Object The options to use when taking a photo.
      * @param scope Object The scope in which to call the success and failure functions, if specified.
      * @param destination String The destination of the image which is returned. Available options are:  data - returns a base64 encoded string file - returns the file's URI
      * @param encoding String The encoding of the returned image. Available options are:  jpg png
      * @param width Number The width of the image to return
      * @param height Number The height of the image to return
      */
    var capture: js.UndefOr[
        js.Function6[
          /* options */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* destination */ js.UndefOr[String], 
          /* encoding */ js.UndefOr[String], 
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setCapture(
        value: (/* options */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* destination */ js.UndefOr[String], /* encoding */ js.UndefOr[String], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "capture", js.Any.fromFunction6((t0: /* options */ js.UndefOr[Any], t1: /* scope */ js.UndefOr[Any], t2: /* destination */ js.UndefOr[String], t3: /* encoding */ js.UndefOr[String], t4: /* width */ js.UndefOr[Double], t5: /* height */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  trait ICordova
    extends StObject
       with IAbstract {
    
    /** [Method] Allows you to capture a photo
      * @param args Object
      */
    @JSName("capture")
    var capture_ICordova: js.UndefOr[js.Function1[/* args */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object ICordova {
    
    inline def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
    
    extension [Self <: ICordova](x: Self) {
      
      inline def setCapture(value: /* args */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "capture", js.Any.fromFunction1((t0: /* args */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  trait IPhoneGap
    extends StObject
       with IAbstract {
    
    /** [Method] Allows you to capture a photo
      * @param args Object
      */
    @JSName("capture")
    var capture_IPhoneGap: js.UndefOr[js.Function1[/* args */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IPhoneGap {
    
    inline def apply(): IPhoneGap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPhoneGap]
    }
    
    extension [Self <: IPhoneGap](x: Self) {
      
      inline def setCapture(value: /* args */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "capture", js.Any.fromFunction1((t0: /* args */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  trait ISencha
    extends StObject
       with IAbstract {
    
    /** [Method] Allows you to capture a photo
      * @param options Object
      */
    @JSName("capture")
    var capture_ISencha: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object ISencha {
    
    inline def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    extension [Self <: ISencha](x: Self) {
      
      inline def setCapture(value: /* options */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "capture", js.Any.fromFunction1((t0: /* options */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  trait ISimulator
    extends StObject
       with IAbstract {
    
    /** [Method] Allows you to capture a photo
      * @param options Object
      */
    @JSName("capture")
    var capture_ISimulator: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Returns the value of samples
      * @returns Array
      */
    var getSamples: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Sets the value of samples
      * @param samples Array The new value.
      */
    var setSamples: js.UndefOr[js.Function1[/* samples */ js.UndefOr[Array], Unit]] = js.undefined
  }
  object ISimulator {
    
    inline def apply(): ISimulator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISimulator]
    }
    
    extension [Self <: ISimulator](x: Self) {
      
      inline def setCapture(value: /* options */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "capture", js.Any.fromFunction1((t0: /* options */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setGetSamples(value: CallbackTo[Array]): Self = StObject.set(x, "getSamples", value.toJsFn)
      
      inline def setGetSamplesUndefined: Self = StObject.set(x, "getSamples", js.undefined)
      
      inline def setSetSamples(value: /* samples */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setSamples", js.Any.fromFunction1((t0: /* samples */ js.UndefOr[Array]) => value(t0).runNow()))
      
      inline def setSetSamplesUndefined: Self = StObject.set(x, "setSamples", js.undefined)
    }
  }
}
