package typingsJapgolly.rollupPluginTypescript2

import typingsJapgolly.rollup.mod.PluginContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distContextMod {
  
  @JSImport("rollup-plugin-typescript2/dist/context", "RollupContext")
  @js.native
  open class RollupContext protected () extends StObject {
    def this(verbosity: VerbosityLevel, bail: Boolean, context: PluginContext) = this()
    def this(verbosity: VerbosityLevel, bail: Boolean, context: PluginContext, prefix: String) = this()
    
    /* private */ var bail: Any = js.native
    
    /* private */ var context: Any = js.native
    
    def debug(message: String): Unit = js.native
    def debug(message: js.Function0[String]): Unit = js.native
    
    def error(message: String): Unit | scala.Nothing = js.native
    def error(message: js.Function0[String]): Unit | scala.Nothing = js.native
    
    def info(message: String): Unit = js.native
    def info(message: js.Function0[String]): Unit = js.native
    
    /* private */ var prefix: Any = js.native
    
    /* private */ var verbosity: Any = js.native
    
    def warn(message: String): Unit = js.native
    def warn(message: js.Function0[String]): Unit = js.native
  }
  
  @js.native
  sealed trait VerbosityLevel extends StObject
  @JSImport("rollup-plugin-typescript2/dist/context", "VerbosityLevel")
  @js.native
  object VerbosityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VerbosityLevel & Double] = js.native
    
    @js.native
    sealed trait Debug
      extends StObject
         with VerbosityLevel
    /* 3 */ val Debug: typingsJapgolly.rollupPluginTypescript2.distContextMod.VerbosityLevel.Debug & Double = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with VerbosityLevel
    /* 0 */ val Error: typingsJapgolly.rollupPluginTypescript2.distContextMod.VerbosityLevel.Error & Double = js.native
    
    @js.native
    sealed trait Info
      extends StObject
         with VerbosityLevel
    /* 2 */ val Info: typingsJapgolly.rollupPluginTypescript2.distContextMod.VerbosityLevel.Info & Double = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with VerbosityLevel
    /* 1 */ val Warning: typingsJapgolly.rollupPluginTypescript2.distContextMod.VerbosityLevel.Warning & Double = js.native
  }
}
