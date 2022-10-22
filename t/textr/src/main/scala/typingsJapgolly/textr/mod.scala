package typingsJapgolly.textr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): typingsJapgolly.textr.mod.textr = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.textr.mod.textr]
  inline def apply(defaults: TextrArgs): typingsJapgolly.textr.mod.textr = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.textr.mod.textr]
  
  @JSImport("textr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type TextrArgs = String | js.Object
  
  @js.native
  trait textr extends StObject {
    
    /**
      * Process given text by the middlewares.
      */
    def exec(text: String): String = js.native
    def exec(text: String, options: js.Object): String = js.native
    
    /**
      * List of registred middlewares.
      */
    def mws(): js.Array[String] = js.native
    
    /**
      * Register new middleware and array of middlewares.
      */
    def use(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fn because its type any is not an array type */ fn: Any
    ): typingsJapgolly.textr.mod.textr = js.native
  }
}
