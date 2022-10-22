package typingsJapgolly.koaXmlBody

import japgolly.scalajs.react.Callback
import typingsJapgolly.koa.mod.Context
import typingsJapgolly.xml2js.mod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Encoding extends StObject {
    
    // requested encoding. Default is utf8. If not set, the lib will retrive it from content-type(such as content-type:application/xml;charset=gb2312).
    var encoding: js.UndefOr[String] = js.undefined
    
    // Key used for decoding when to parse ctx.request; default is 'body'
    var key: js.UndefOr[String] = js.undefined
    
    // length of the body. When content-length is found, it will be overwritten automatically.
    var length: js.UndefOr[Double] = js.undefined
    
    // limit of the body. If the body ends up being larger than this limit, a 413 error code is returned. Default is 1mb.
    var limit: js.UndefOr[Double] = js.undefined
    
    // error handler. Default is a noop function. It means it will eat the error silently. You can config it to customize the response.
    var onerror: js.UndefOr[js.Function2[/* err */ js.Error, /* ctx */ Context, Unit]] = js.undefined
    
    // options which will be used to parse xml. Default is {}. See xml2js Options for details.
    var xmlOptions: js.UndefOr[ParserOptions] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOnerror(value: (/* err */ js.Error, /* ctx */ Context) => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction2((t0: /* err */ js.Error, t1: /* ctx */ Context) => (value(t0, t1)).runNow()))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setXmlOptions(value: ParserOptions): Self = StObject.set(x, "xmlOptions", value.asInstanceOf[js.Any])
      
      inline def setXmlOptionsUndefined: Self = StObject.set(x, "xmlOptions", js.undefined)
    }
  }
}
