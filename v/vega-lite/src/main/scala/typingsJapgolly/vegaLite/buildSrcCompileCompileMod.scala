package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.Normalized
import typingsJapgolly.vegaLite.buildSrcBinMod.Bin
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDefBase
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldTitleFormatter
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcSpecMod.TopLevelSpec
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaUtil.mod.LoggerInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileCompileMod {
  
  @JSImport("vega-lite/build/src/compile/compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(inputSpec: TopLevelSpec): Normalized = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(inputSpec.asInstanceOf[js.Any]).asInstanceOf[Normalized]
  inline def compile(inputSpec: TopLevelSpec, opt: CompileOptions): Normalized = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(inputSpec.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Normalized]
  
  trait CompileOptions extends StObject {
    
    /**
      * Sets a Vega-Lite configuration.
      */
    var config: js.UndefOr[Config[ExprRef | SignalRef]] = js.undefined
    
    /**
      * Sets a field title formatter.
      */
    var fieldTitle: js.UndefOr[FieldTitleFormatter] = js.undefined
    
    /**
      * Sets a custom logger.
      */
    var logger: js.UndefOr[LoggerInterface] = js.undefined
  }
  object CompileOptions {
    
    inline def apply(): CompileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompileOptions]
    }
    
    extension [Self <: CompileOptions](x: Self) {
      
      inline def setConfig(value: Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFieldTitle(
        value: (/* fieldDef */ FieldDefBase[String, Bin], /* config */ Config[ExprRef | SignalRef]) => String
      ): Self = StObject.set(x, "fieldTitle", js.Any.fromFunction2(value))
      
      inline def setFieldTitleUndefined: Self = StObject.set(x, "fieldTitle", js.undefined)
      
      inline def setLogger(value: LoggerInterface): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
