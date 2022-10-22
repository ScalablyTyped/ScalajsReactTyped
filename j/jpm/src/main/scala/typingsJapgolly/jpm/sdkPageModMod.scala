package typingsJapgolly.jpm

import japgolly.scalajs.react.Callback
import typingsJapgolly.jpm.anon.AttachTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Run scripts in the context of web pages whose URL matches a given pattern
  */
object sdkPageModMod {
  
  trait PageMod extends StObject {
    
    def destroy(): Unit
    
    var include: String | (js.Array[js.RegExp | String]) | js.RegExp
  }
  object PageMod {
    
    @JSImport("sdk/page-mod", "PageMod")
    @js.native
    def apply(options: AttachTo): PageMod = js.native
    
    extension [Self <: PageMod](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setInclude(value: String | (js.Array[js.RegExp | String]) | js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jpm.jpmStrings.existing
    - typingsJapgolly.jpm.jpmStrings.top
    - typingsJapgolly.jpm.jpmStrings.frame
  */
  trait attachmentMode extends StObject
  object attachmentMode {
    
    inline def existing: typingsJapgolly.jpm.jpmStrings.existing = "existing".asInstanceOf[typingsJapgolly.jpm.jpmStrings.existing]
    
    inline def frame: typingsJapgolly.jpm.jpmStrings.frame = "frame".asInstanceOf[typingsJapgolly.jpm.jpmStrings.frame]
    
    inline def top: typingsJapgolly.jpm.jpmStrings.top = "top".asInstanceOf[typingsJapgolly.jpm.jpmStrings.top]
  }
}
