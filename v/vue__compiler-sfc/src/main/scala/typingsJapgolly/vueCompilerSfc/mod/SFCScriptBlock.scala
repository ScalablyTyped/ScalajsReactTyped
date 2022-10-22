package typingsJapgolly.vueCompilerSfc.mod

import typingsJapgolly.std.Record
import typingsJapgolly.vueCompilerCore.mod.BindingMetadata
import typingsJapgolly.vueCompilerCore.mod.SourceLocation
import typingsJapgolly.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import typingsJapgolly.vueCompilerSfc.vueCompilerSfcStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCScriptBlock
  extends StObject
     with SFCBlock {
  
  var bindings: js.UndefOr[BindingMetadata] = js.undefined
  
  var imports: js.UndefOr[Record[String, ImportBinding]] = js.undefined
  
  /**
    * import('\@babel/types').Statement
    */
  var scriptAst: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * import('\@babel/types').Statement
    */
  var scriptSetupAst: js.UndefOr[js.Array[Any]] = js.undefined
  
  var setup: js.UndefOr[String | Boolean] = js.undefined
  
  @JSName("type")
  var type_SFCScriptBlock: script
}
object SFCScriptBlock {
  
  inline def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation): SFCScriptBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("script")
    __obj.asInstanceOf[SFCScriptBlock]
  }
  
  extension [Self <: SFCScriptBlock](x: Self) {
    
    inline def setBindings(value: BindingMetadata): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setImports(value: Record[String, ImportBinding]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setScriptAst(value: js.Array[Any]): Self = StObject.set(x, "scriptAst", value.asInstanceOf[js.Any])
    
    inline def setScriptAstUndefined: Self = StObject.set(x, "scriptAst", js.undefined)
    
    inline def setScriptAstVarargs(value: Any*): Self = StObject.set(x, "scriptAst", js.Array(value*))
    
    inline def setScriptSetupAst(value: js.Array[Any]): Self = StObject.set(x, "scriptSetupAst", value.asInstanceOf[js.Any])
    
    inline def setScriptSetupAstUndefined: Self = StObject.set(x, "scriptSetupAst", js.undefined)
    
    inline def setScriptSetupAstVarargs(value: Any*): Self = StObject.set(x, "scriptSetupAst", js.Array(value*))
    
    inline def setSetup(value: String | Boolean): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    
    inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    inline def setType(value: script): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
