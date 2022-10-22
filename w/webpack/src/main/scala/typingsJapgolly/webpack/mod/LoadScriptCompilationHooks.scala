package typingsJapgolly.webpack.mod

import typingsJapgolly.tapable.mod.SyncWaterfallHook
import typingsJapgolly.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadScriptCompilationHooks extends StObject {
  
  var createScript: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]
}
object LoadScriptCompilationHooks {
  
  inline def apply(createScript: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]): LoadScriptCompilationHooks = {
    val __obj = js.Dynamic.literal(createScript = createScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadScriptCompilationHooks]
  }
  
  extension [Self <: LoadScriptCompilationHooks](x: Self) {
    
    inline def setCreateScript(value: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]): Self = StObject.set(x, "createScript", value.asInstanceOf[js.Any])
  }
}
