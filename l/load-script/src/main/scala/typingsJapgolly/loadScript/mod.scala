package typingsJapgolly.loadScript

import org.scalajs.dom.HTMLScriptElement
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("load-script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(src: String, opts: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(src: String, opts: Options, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.loadScript.loadScriptStrings.`type`
    - typingsJapgolly.loadScript.loadScriptStrings.charset
    - typingsJapgolly.loadScript.loadScriptStrings.async
    - typingsJapgolly.loadScript.loadScriptStrings.text
  */
  trait AllowedAttributes extends StObject
  object AllowedAttributes {
    
    inline def async: typingsJapgolly.loadScript.loadScriptStrings.async = "async".asInstanceOf[typingsJapgolly.loadScript.loadScriptStrings.async]
    
    inline def charset: typingsJapgolly.loadScript.loadScriptStrings.charset = "charset".asInstanceOf[typingsJapgolly.loadScript.loadScriptStrings.charset]
    
    inline def text: typingsJapgolly.loadScript.loadScriptStrings.text = "text".asInstanceOf[typingsJapgolly.loadScript.loadScriptStrings.text]
    
    inline def `type`: typingsJapgolly.loadScript.loadScriptStrings.`type` = "type".asInstanceOf[typingsJapgolly.loadScript.loadScriptStrings.`type`]
  }
  
  type Callback = js.Function2[/* errorOrNull */ js.Error | Null, /* script */ HTMLScriptElement, Unit]
  
  /* Inlined std.Partial<std.Pick<std.HTMLScriptElement, load-script.load-script.AllowedAttributes>> & {  attrs :std.Record<string, string> | undefined} */
  trait Options extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var attrs: js.UndefOr[Record[String, String]] = js.undefined
    
    var charset: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAttrs(value: Record[String, String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
