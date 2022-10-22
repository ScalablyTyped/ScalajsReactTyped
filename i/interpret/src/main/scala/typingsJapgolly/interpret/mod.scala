package typingsJapgolly.interpret

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.interpret.anon.Dictkey
import typingsJapgolly.interpret.anon.Extensions
import typingsJapgolly.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("interpret", "extensions")
  @js.native
  val extensions: Extensions_ = js.native
  
  @JSImport("interpret", "jsVariants")
  @js.native
  val jsVariants: Extensions_ = js.native
  
  type Extension = String | ExtensionDescriptor | (js.Array[String | ExtensionDescriptor])
  
  trait ExtensionDescriptor extends StObject {
    
    var module: String
    
    def register(hook: Hook): Unit
    @JSName("register")
    var register_Original: RegisterFn
  }
  object ExtensionDescriptor {
    
    inline def apply(module: String, register: /* hook */ Hook => Callback): ExtensionDescriptor = {
      val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], register = js.Any.fromFunction1((t0: /* hook */ Hook) => register(t0).runNow()))
      __obj.asInstanceOf[ExtensionDescriptor]
    }
    
    extension [Self <: ExtensionDescriptor](x: Self) {
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setRegister(value: /* hook */ Hook => Callback): Self = StObject.set(x, "register", js.Any.fromFunction1((t0: /* hook */ Hook) => value(t0).runNow()))
    }
  }
  
  type Extensions_ = StringDictionary[Extension | Null]
  
  @js.native
  trait Hook extends StObject {
    
    def apply(m: Extensions): Any = js.native
    def apply(m: NodeModule): Any = js.native
    
    def install(): Unit = js.native
    def install(m: Dictkey): Unit = js.native
  }
  
  type RegisterFn = js.Function1[/* hook */ Hook, Unit]
}
