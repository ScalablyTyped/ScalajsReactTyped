package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcWebpackUtilsHelpersMod.HashFormat
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsRemoveHashPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/remove-hash-plugin", "RemoveHashPlugin")
  @js.native
  open class RemoveHashPlugin protected () extends StObject {
    def this(options: RemoveHashPluginOptions) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ var options: Any = js.native
  }
  
  trait RemoveHashPluginOptions extends StObject {
    
    var chunkNames: js.Array[String]
    
    var hashFormat: HashFormat
  }
  object RemoveHashPluginOptions {
    
    inline def apply(chunkNames: js.Array[String], hashFormat: HashFormat): RemoveHashPluginOptions = {
      val __obj = js.Dynamic.literal(chunkNames = chunkNames.asInstanceOf[js.Any], hashFormat = hashFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveHashPluginOptions]
    }
    
    extension [Self <: RemoveHashPluginOptions](x: Self) {
      
      inline def setChunkNames(value: js.Array[String]): Self = StObject.set(x, "chunkNames", value.asInstanceOf[js.Any])
      
      inline def setChunkNamesVarargs(value: String*): Self = StObject.set(x, "chunkNames", js.Array(value*))
      
      inline def setHashFormat(value: HashFormat): Self = StObject.set(x, "hashFormat", value.asInstanceOf[js.Any])
    }
  }
}
