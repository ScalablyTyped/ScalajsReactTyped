package typingsJapgolly.hyperformula

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterMod {
  
  /* note: abstract class */ @JSImport("hyperformula/typings/interpreter", "FunctionPlugin")
  @js.native
  open class FunctionPlugin protected ()
    extends typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin {
    def this(interpreter: Interpreter) = this()
  }
  /* static members */
  object FunctionPlugin {
    
    @JSImport("hyperformula/typings/interpreter", "FunctionPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter", "FunctionPlugin.aliases")
    @js.native
    def aliases: js.UndefOr[StringDictionary[String]] = js.native
    inline def aliases_=(x: js.UndefOr[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
    
    /**
      * Dictionary containing functions implemented by specific plugin, along with function name translations.
      */
    @JSImport("hyperformula/typings/interpreter", "FunctionPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ImplementedFunctions = js.native
    inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
