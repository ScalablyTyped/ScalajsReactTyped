package typingsJapgolly.wdioTypes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Array
import typingsJapgolly.std.Pick
import typingsJapgolly.wdioTypes.buildOptionsMod.Testrunner
import typingsJapgolly.wdioTypes.buildReportersMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type FunctionProperties[T] = Pick[T, FunctionPropertyNames[T]]
  
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  
  @js.native
  trait JsonArray
    extends StObject
       with Array[JsonPrimitive | JsonObject | JsonArray]
  
  type JsonCompatible = JsonObject | Any
  
  trait JsonObject
    extends StObject
       with /* x */ StringDictionary[JsonPrimitive | JsonObject | JsonArray]
  object JsonObject {
    
    inline def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  type JsonPrimitive = String | Double | Boolean | Null
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.PromiseLike<infer U> ? U : T
    }}}
    */
  @js.native
  trait ThenArg[T] extends StObject
  
  object global {
    
    object WebDriver {
      
      type Capabilities = typingsJapgolly.wdioTypes.buildCapabilitiesMod.Capabilities
      
      type DesiredCapabilities = typingsJapgolly.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
    }
    
    object WebdriverIO {
      
      type Config = Testrunner
      
      type CucumberOpts = StringDictionary[Any]
      
      trait HookFunctionExtension extends StObject
      
      type JasmineOpts = StringDictionary[Any]
      
      type MochaOpts = StringDictionary[Any]
      
      type ReporterOption = Options
      
      type ServiceOption = typingsJapgolly.wdioTypes.buildServicesMod.ServiceOption
      
      trait WDIODevtoolsOptions extends StObject
      
      trait WDIOVSCodeServiceOptions extends StObject
    }
  }
}
