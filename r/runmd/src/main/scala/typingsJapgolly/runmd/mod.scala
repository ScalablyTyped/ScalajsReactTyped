package typingsJapgolly.runmd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("runmd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def render(inputText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(inputText.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def render(inputText: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(inputText.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
      * name of input file
      */
    var inputName: js.UndefOr[String] = js.undefined
    
    /**
      * if true, disables RunMD footer
      */
    var lame: js.UndefOr[Boolean] = js.undefined
    
    /**
      * name of output file
      */
    var outputName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
      
      inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
      
      inline def setLame(value: Boolean): Self = StObject.set(x, "lame", value.asInstanceOf[js.Any])
      
      inline def setLameUndefined: Self = StObject.set(x, "lame", js.undefined)
      
      inline def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      inline def setOutputNameUndefined: Self = StObject.set(x, "outputName", js.undefined)
    }
  }
}
