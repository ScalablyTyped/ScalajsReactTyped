package typingsJapgolly.ahooks

import typingsJapgolly.ahooks.ahooksStrings.css
import typingsJapgolly.ahooks.ahooksStrings.js_
import typingsJapgolly.ahooks.anon.PartialHTMLScriptElement
import typingsJapgolly.ahooks.anon.PartialHTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseExternalMod {
  
  @JSImport("ahooks/lib/useExternal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Status]
  inline def default(path: String): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[Status]
  inline def default(path: String, options: Options): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Status]
  inline def default(path: Unit, options: Options): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Status]
  
  trait Options extends StObject {
    
    var css: js.UndefOr[PartialHTMLStyleElement] = js.undefined
    
    @JSName("js")
    var js_ : js.UndefOr[PartialHTMLScriptElement] = js.undefined
    
    var `type`: js.UndefOr[js_ | css] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCss(value: PartialHTMLStyleElement): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setJs_(value: PartialHTMLScriptElement): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setType(value: js_ | css): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ahooks.ahooksStrings.unset
    - typingsJapgolly.ahooks.ahooksStrings.loading
    - typingsJapgolly.ahooks.ahooksStrings.ready
    - typingsJapgolly.ahooks.ahooksStrings.error
  */
  trait Status extends StObject
  object Status {
    
    inline def error: typingsJapgolly.ahooks.ahooksStrings.error = "error".asInstanceOf[typingsJapgolly.ahooks.ahooksStrings.error]
    
    inline def loading: typingsJapgolly.ahooks.ahooksStrings.loading = "loading".asInstanceOf[typingsJapgolly.ahooks.ahooksStrings.loading]
    
    inline def ready: typingsJapgolly.ahooks.ahooksStrings.ready = "ready".asInstanceOf[typingsJapgolly.ahooks.ahooksStrings.ready]
    
    inline def unset: typingsJapgolly.ahooks.ahooksStrings.unset = "unset".asInstanceOf[typingsJapgolly.ahooks.ahooksStrings.unset]
  }
}
