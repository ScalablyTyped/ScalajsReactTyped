package typingsJapgolly.randomstring

import typingsJapgolly.randomstring.Randomstring.GenerateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Randomstring {
    
    @JSGlobal("Randomstring")
    @js.native
    val ^ : js.Any = js.native
    
    inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
    inline def generate(options: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def generate(options: GenerateOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
