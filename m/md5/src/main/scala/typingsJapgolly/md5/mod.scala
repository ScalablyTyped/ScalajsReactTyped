package typingsJapgolly.md5

import typingsJapgolly.md5.anon.OptionsasBytestrue
import typingsJapgolly.md5.anon.PickOptionsasStringencodi
import typingsJapgolly.md5.md5Strings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(message: String): String = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(message: String, options: OptionsasBytestrue): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(message: String, options: PickOptionsasStringencodi): String = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(message: String, options: Options): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  inline def apply(message: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(message: js.Array[Double], options: OptionsasBytestrue): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(message: js.Array[Double], options: PickOptionsasStringencodi): String = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(message: js.Array[Double], options: Options): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  inline def apply(message: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(message: js.typedarray.Uint8Array, options: OptionsasBytestrue): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(message: js.typedarray.Uint8Array, options: PickOptionsasStringencodi): String = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(message: js.typedarray.Uint8Array, options: Options): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  
  @JSImport("md5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var asBytes: js.UndefOr[Boolean] = js.undefined
    
    var asString: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[binary | String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAsBytes(value: Boolean): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
      
      inline def setAsBytesUndefined: Self = StObject.set(x, "asBytes", js.undefined)
      
      inline def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
      inline def setEncoding(value: binary | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
