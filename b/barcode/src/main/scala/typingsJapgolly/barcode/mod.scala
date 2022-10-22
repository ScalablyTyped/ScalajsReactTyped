package typingsJapgolly.barcode

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(`type`: String, options: BarcodeOptions): BarcodeResult = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BarcodeResult]
  
  @JSImport("barcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BarcodeOptions extends StObject {
    
    var data: String | Double
    
    var height: Double
    
    var width: Double
  }
  object BarcodeOptions {
    
    inline def apply(data: String | Double, height: Double, width: Double): BarcodeOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarcodeOptions]
    }
    
    extension [Self <: BarcodeOptions](x: Self) {
      
      inline def setData(value: String | Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BarcodeResult extends StObject {
    
    def getBase64(callback: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit]): Unit
    
    def getStream(callback: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit]): Unit
    
    def saveImage(outputfilePath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit
  }
  object BarcodeResult {
    
    inline def apply(
      getBase64: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit] => Callback,
      getStream: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit] => Callback,
      saveImage: (String, js.Function1[/* err */ ErrnoException, Unit]) => Callback
    ): BarcodeResult = {
      val __obj = js.Dynamic.literal(getBase64 = js.Any.fromFunction1((t0: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit]) => getBase64(t0).runNow()), getStream = js.Any.fromFunction1((t0: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit]) => getStream(t0).runNow()), saveImage = js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ ErrnoException, Unit]) => (saveImage(t0, t1)).runNow()))
      __obj.asInstanceOf[BarcodeResult]
    }
    
    extension [Self <: BarcodeResult](x: Self) {
      
      inline def setGetBase64(value: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit] => Callback): Self = StObject.set(x, "getBase64", js.Any.fromFunction1((t0: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit]) => value(t0).runNow()))
      
      inline def setGetStream(value: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit] => Callback): Self = StObject.set(x, "getStream", js.Any.fromFunction1((t0: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit]) => value(t0).runNow()))
      
      inline def setSaveImage(value: (String, js.Function1[/* err */ ErrnoException, Unit]) => Callback): Self = StObject.set(x, "saveImage", js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ ErrnoException, Unit]) => (value(t0, t1)).runNow()))
    }
  }
}
