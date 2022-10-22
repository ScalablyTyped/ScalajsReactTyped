package typingsJapgolly.configFileTs

import typingsJapgolly.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTsCompileMod {
  
  @JSImport("config-file-ts/dist/tsCompile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tsCompile(fileNames: js.Array[String], options: CompilerOptions): CompileResult = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCompile")(fileNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompileResult]
  
  trait CompileResult extends StObject {
    
    var compiled: Boolean
    
    var localSources: js.Array[String]
  }
  object CompileResult {
    
    inline def apply(compiled: Boolean, localSources: js.Array[String]): CompileResult = {
      val __obj = js.Dynamic.literal(compiled = compiled.asInstanceOf[js.Any], localSources = localSources.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileResult]
    }
    
    extension [Self <: CompileResult](x: Self) {
      
      inline def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      inline def setLocalSources(value: js.Array[String]): Self = StObject.set(x, "localSources", value.asInstanceOf[js.Any])
      
      inline def setLocalSourcesVarargs(value: String*): Self = StObject.set(x, "localSources", js.Array(value*))
    }
  }
}
