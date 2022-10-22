package typingsJapgolly.babylon

import typingsJapgolly.babelTypes.mod.Expression
import typingsJapgolly.babelTypes.mod.File_
import typingsJapgolly.babylon.babylonStrings.module
import typingsJapgolly.babylon.babylonStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babylon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(code: String): File_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[File_]
  inline def parse(code: String, opts: BabylonOptions): File_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[File_]
  
  inline def parseExpression(input: String): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(input.asInstanceOf[js.Any]).asInstanceOf[Expression]
  inline def parseExpression(input: String, options: BabylonOptions): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  trait BabylonOptions extends StObject {
    
    /**
      * By default, import and export declarations can only appear at a program's top level.
      * Setting this option to true allows them anywhere where a statement is allowed.
      */
    var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, a return statement at the top level raises an error. Set this to true to accept such code.
      */
    var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array containing the plugins that you want to enable.
      */
    var plugins: js.UndefOr[js.Array[PluginName]] = js.undefined
    
    /**
      * Correlate output AST nodes with their source filename. Useful when
      * generating code and source maps from the ASTs of multiple input files.
      */
    var sourceFilename: js.UndefOr[String] = js.undefined
    
    /**
      * Indicate the mode the code should be parsed in. Can be either "script" or "module".
      */
    var sourceType: js.UndefOr[script | module] = js.undefined
  }
  object BabylonOptions {
    
    inline def apply(): BabylonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BabylonOptions]
    }
    
    extension [Self <: BabylonOptions](x: Self) {
      
      inline def setAllowImportExportEverywhere(value: Boolean): Self = StObject.set(x, "allowImportExportEverywhere", value.asInstanceOf[js.Any])
      
      inline def setAllowImportExportEverywhereUndefined: Self = StObject.set(x, "allowImportExportEverywhere", js.undefined)
      
      inline def setAllowReturnOutsideFunction(value: Boolean): Self = StObject.set(x, "allowReturnOutsideFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowReturnOutsideFunctionUndefined: Self = StObject.set(x, "allowReturnOutsideFunction", js.undefined)
      
      inline def setAllowSuperOutsideMethod(value: Boolean): Self = StObject.set(x, "allowSuperOutsideMethod", value.asInstanceOf[js.Any])
      
      inline def setAllowSuperOutsideMethodUndefined: Self = StObject.set(x, "allowSuperOutsideMethod", js.undefined)
      
      inline def setPlugins(value: js.Array[PluginName]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginName*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
      
      inline def setSourceFilenameUndefined: Self = StObject.set(x, "sourceFilename", js.undefined)
      
      inline def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.babylon.babylonStrings.estree
    - typingsJapgolly.babylon.babylonStrings.jsx
    - typingsJapgolly.babylon.babylonStrings.flow
    - typingsJapgolly.babylon.babylonStrings.typescript
    - typingsJapgolly.babylon.babylonStrings.classConstructorCall
    - typingsJapgolly.babylon.babylonStrings.doExpressions
    - typingsJapgolly.babylon.babylonStrings.objectRestSpread
    - typingsJapgolly.babylon.babylonStrings.decorators
    - typingsJapgolly.babylon.babylonStrings.classProperties
    - typingsJapgolly.babylon.babylonStrings.exportExtensions
    - typingsJapgolly.babylon.babylonStrings.asyncGenerators
    - typingsJapgolly.babylon.babylonStrings.functionBind
    - typingsJapgolly.babylon.babylonStrings.functionSent
    - typingsJapgolly.babylon.babylonStrings.dynamicImport
  */
  trait PluginName extends StObject
  object PluginName {
    
    inline def asyncGenerators: typingsJapgolly.babylon.babylonStrings.asyncGenerators = "asyncGenerators".asInstanceOf[typingsJapgolly.babylon.babylonStrings.asyncGenerators]
    
    inline def classConstructorCall: typingsJapgolly.babylon.babylonStrings.classConstructorCall = "classConstructorCall".asInstanceOf[typingsJapgolly.babylon.babylonStrings.classConstructorCall]
    
    inline def classProperties: typingsJapgolly.babylon.babylonStrings.classProperties = "classProperties".asInstanceOf[typingsJapgolly.babylon.babylonStrings.classProperties]
    
    inline def decorators: typingsJapgolly.babylon.babylonStrings.decorators = "decorators".asInstanceOf[typingsJapgolly.babylon.babylonStrings.decorators]
    
    inline def doExpressions: typingsJapgolly.babylon.babylonStrings.doExpressions = "doExpressions".asInstanceOf[typingsJapgolly.babylon.babylonStrings.doExpressions]
    
    inline def dynamicImport: typingsJapgolly.babylon.babylonStrings.dynamicImport = "dynamicImport".asInstanceOf[typingsJapgolly.babylon.babylonStrings.dynamicImport]
    
    inline def estree: typingsJapgolly.babylon.babylonStrings.estree = "estree".asInstanceOf[typingsJapgolly.babylon.babylonStrings.estree]
    
    inline def exportExtensions: typingsJapgolly.babylon.babylonStrings.exportExtensions = "exportExtensions".asInstanceOf[typingsJapgolly.babylon.babylonStrings.exportExtensions]
    
    inline def flow: typingsJapgolly.babylon.babylonStrings.flow = "flow".asInstanceOf[typingsJapgolly.babylon.babylonStrings.flow]
    
    inline def functionBind: typingsJapgolly.babylon.babylonStrings.functionBind = "functionBind".asInstanceOf[typingsJapgolly.babylon.babylonStrings.functionBind]
    
    inline def functionSent: typingsJapgolly.babylon.babylonStrings.functionSent = "functionSent".asInstanceOf[typingsJapgolly.babylon.babylonStrings.functionSent]
    
    inline def jsx: typingsJapgolly.babylon.babylonStrings.jsx = "jsx".asInstanceOf[typingsJapgolly.babylon.babylonStrings.jsx]
    
    inline def objectRestSpread: typingsJapgolly.babylon.babylonStrings.objectRestSpread = "objectRestSpread".asInstanceOf[typingsJapgolly.babylon.babylonStrings.objectRestSpread]
    
    inline def typescript: typingsJapgolly.babylon.babylonStrings.typescript = "typescript".asInstanceOf[typingsJapgolly.babylon.babylonStrings.typescript]
  }
}
