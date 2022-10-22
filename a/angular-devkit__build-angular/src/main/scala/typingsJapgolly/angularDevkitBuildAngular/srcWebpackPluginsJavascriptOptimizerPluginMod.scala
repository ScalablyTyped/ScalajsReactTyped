package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.std.Record
import typingsJapgolly.typescript.mod.ScriptTarget
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsJavascriptOptimizerPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/javascript-optimizer-plugin", "JavaScriptOptimizerPlugin")
  @js.native
  open class JavaScriptOptimizerPlugin protected () extends StObject {
    def this(options: JavaScriptOptimizerOptions) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    var options: JavaScriptOptimizerOptions = js.native
  }
  
  trait JavaScriptOptimizerOptions extends StObject {
    
    /**
      * Enables advanced optimizations in the underlying JavaScript optimizers.
      * This currently increases the `terser` passes to 2 and enables the `pure_getters`
      * option for `terser`.
      */
    var advanced: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object record of string keys that will be replaced with their respective values when found
      * within the code during optimization.
      */
    var define: Record[String, String | Double | Boolean]
    
    /**
      * Enables the retention of identifier names and ensures that function and class names are
      * present in the output code.
      *
      * **Note**: in some cases symbols are still renamed to avoid collisions.
      */
    var keepIdentifierNames: Boolean
    
    /**
      * Enables the retention of original name of classes and functions.
      *
      * **Note**: this causes increase of bundle size as it causes dead-code elimination to not work fully.
      */
    var keepNames: Boolean
    
    /**
      * Enables the removal of all license comments from the output code.
      */
    var removeLicenses: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables the generation of a sourcemap during optimization.
      * The output sourcemap will be a full sourcemap containing the merge of the input sourcemap and
      * all intermediate sourcemaps.
      */
    var sourcemap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The ECMAScript version that should be used when generating output code.
      * The optimizer will not adjust the output code with features present in newer
      * ECMAScript versions.
      */
    var target: ScriptTarget
  }
  object JavaScriptOptimizerOptions {
    
    inline def apply(
      define: Record[String, String | Double | Boolean],
      keepIdentifierNames: Boolean,
      keepNames: Boolean,
      target: ScriptTarget
    ): JavaScriptOptimizerOptions = {
      val __obj = js.Dynamic.literal(define = define.asInstanceOf[js.Any], keepIdentifierNames = keepIdentifierNames.asInstanceOf[js.Any], keepNames = keepNames.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[JavaScriptOptimizerOptions]
    }
    
    extension [Self <: JavaScriptOptimizerOptions](x: Self) {
      
      inline def setAdvanced(value: Boolean): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
      
      inline def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
      
      inline def setDefine(value: Record[String, String | Double | Boolean]): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
      
      inline def setKeepIdentifierNames(value: Boolean): Self = StObject.set(x, "keepIdentifierNames", value.asInstanceOf[js.Any])
      
      inline def setKeepNames(value: Boolean): Self = StObject.set(x, "keepNames", value.asInstanceOf[js.Any])
      
      inline def setRemoveLicenses(value: Boolean): Self = StObject.set(x, "removeLicenses", value.asInstanceOf[js.Any])
      
      inline def setRemoveLicensesUndefined: Self = StObject.set(x, "removeLicenses", js.undefined)
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
      
      inline def setTarget(value: ScriptTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
