package typingsJapgolly.rollupPluginDelete

import typingsJapgolly.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-delete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait Options
    extends StObject
       with typingsJapgolly.del.mod.Options {
    
    /**
      * Rollup hook the plugin should use.
      * @default 'buildStart'
      */
    val hook: js.UndefOr[String] = js.undefined
    
    /**
      * Delete items once. Useful in watch mode.
      * @default false
      */
    val runOnce: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Patterns of files and folders to be deleted.
      * @default []
      */
    val targets: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Outputs removed files and folders to console.
      * @default false
      */
    val verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHook(value: String): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      inline def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
      
      inline def setRunOnce(value: Boolean): Self = StObject.set(x, "runOnce", value.asInstanceOf[js.Any])
      
      inline def setRunOnceUndefined: Self = StObject.set(x, "runOnce", js.undefined)
      
      inline def setTargets(value: String | js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
