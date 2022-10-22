package typingsJapgolly.commonErrors

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.commonErrors.mod.Error
import typingsJapgolly.commonErrors.mod.GenerateMessageMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var `extends`: js.UndefOr[Error] = js.undefined
    
    var generateMessage: js.UndefOr[GenerateMessageMethod] = js.undefined
    
    var globalize: js.UndefOr[Boolean] = js.undefined
  }
  object Args {
    
    inline def apply(): Args = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setExtends(value: Error): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setGenerateMessage(value: CallbackTo[String]): Self = StObject.set(x, "generateMessage", value.toJsFn)
      
      inline def setGenerateMessageUndefined: Self = StObject.set(x, "generateMessage", js.undefined)
      
      inline def setGlobalize(value: Boolean): Self = StObject.set(x, "globalize", value.asInstanceOf[js.Any])
      
      inline def setGlobalizeUndefined: Self = StObject.set(x, "globalize", js.undefined)
    }
  }
}
