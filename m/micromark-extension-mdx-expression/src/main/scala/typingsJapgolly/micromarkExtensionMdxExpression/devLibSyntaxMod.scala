package typingsJapgolly.micromarkExtensionMdxExpression

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibSyntaxMod {
  
  @JSImport("micromark-extension-mdx-expression/dev/lib/syntax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxExpression(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxExpression")().asInstanceOf[Extension]
  inline def mdxExpression(options: Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxExpression")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  type Acorn = typingsJapgolly.micromarkUtilEventsToAcorn.mod.Acorn
  
  type AcornOptions = typingsJapgolly.micromarkUtilEventsToAcorn.mod.AcornOptions
  
  type Extension = typingsJapgolly.micromarkUtilTypes.mod.Extension
  
  trait Options extends StObject {
    
    var acorn: js.UndefOr[typingsJapgolly.micromarkUtilEventsToAcorn.mod.Acorn] = js.undefined
    
    var acornOptions: js.UndefOr[typingsJapgolly.acorn.mod.Options] = js.undefined
    
    var addResult: js.UndefOr[Boolean] = js.undefined
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var spread: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAcorn(value: typingsJapgolly.micromarkUtilEventsToAcorn.mod.Acorn): Self = StObject.set(x, "acorn", value.asInstanceOf[js.Any])
      
      inline def setAcornOptions(value: typingsJapgolly.acorn.mod.Options): Self = StObject.set(x, "acornOptions", value.asInstanceOf[js.Any])
      
      inline def setAcornOptionsUndefined: Self = StObject.set(x, "acornOptions", js.undefined)
      
      inline def setAcornUndefined: Self = StObject.set(x, "acorn", js.undefined)
      
      inline def setAddResult(value: Boolean): Self = StObject.set(x, "addResult", value.asInstanceOf[js.Any])
      
      inline def setAddResultUndefined: Self = StObject.set(x, "addResult", js.undefined)
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    }
  }
  
  type State = typingsJapgolly.micromarkUtilTypes.mod.State
  
  type Tokenizer = typingsJapgolly.micromarkUtilTypes.mod.Tokenizer
}
