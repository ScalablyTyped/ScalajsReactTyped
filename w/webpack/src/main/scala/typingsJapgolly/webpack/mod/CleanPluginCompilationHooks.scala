package typingsJapgolly.webpack.mod

import typingsJapgolly.tapable.mod.SyncBailHook
import typingsJapgolly.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CleanPluginCompilationHooks extends StObject {
  
  /**
  	 * when returning true the file/directory will be kept during cleaning, returning false will clean it and ignore the following plugins and config
  	 */
  var keep: SyncBailHook[js.Array[String], Boolean, UnsetAdditionalOptions]
}
object CleanPluginCompilationHooks {
  
  inline def apply(keep: SyncBailHook[js.Array[String], Boolean, UnsetAdditionalOptions]): CleanPluginCompilationHooks = {
    val __obj = js.Dynamic.literal(keep = keep.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanPluginCompilationHooks]
  }
  
  extension [Self <: CleanPluginCompilationHooks](x: Self) {
    
    inline def setKeep(value: SyncBailHook[js.Array[String], Boolean, UnsetAdditionalOptions]): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
  }
}
