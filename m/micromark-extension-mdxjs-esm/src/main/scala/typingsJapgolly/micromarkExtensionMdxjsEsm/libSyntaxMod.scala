package typingsJapgolly.micromarkExtensionMdxjsEsm

import typingsJapgolly.micromarkExtensionMdxjsEsm.anon.Flow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyntaxMod {
  
  @JSImport("micromark-extension-mdxjs-esm/lib/syntax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxjsEsm(options: Options): Flow = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxjsEsm")(options.asInstanceOf[js.Any]).asInstanceOf[Flow]
  
  type Acorn = typingsJapgolly.micromarkUtilEventsToAcorn.mod.Acorn
  
  type AcornOptions = typingsJapgolly.micromarkUtilEventsToAcorn.mod.AcornOptions
  
  type Extension = typingsJapgolly.micromarkUtilTypes.mod.Extension
  
  trait Options extends StObject {
    
    var acorn: Acorn
    
    var acornOptions: js.UndefOr[typingsJapgolly.acorn.mod.Options] = js.undefined
    
    var addResult: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(acorn: Acorn): Options = {
      val __obj = js.Dynamic.literal(acorn = acorn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAcorn(value: Acorn): Self = StObject.set(x, "acorn", value.asInstanceOf[js.Any])
      
      inline def setAcornOptions(value: typingsJapgolly.acorn.mod.Options): Self = StObject.set(x, "acornOptions", value.asInstanceOf[js.Any])
      
      inline def setAcornOptionsUndefined: Self = StObject.set(x, "acornOptions", js.undefined)
      
      inline def setAddResult(value: Boolean): Self = StObject.set(x, "addResult", value.asInstanceOf[js.Any])
      
      inline def setAddResultUndefined: Self = StObject.set(x, "addResult", js.undefined)
    }
  }
  
  type State = typingsJapgolly.micromarkUtilTypes.mod.State
  
  type Tokenizer = typingsJapgolly.micromarkUtilTypes.mod.Tokenizer
}
