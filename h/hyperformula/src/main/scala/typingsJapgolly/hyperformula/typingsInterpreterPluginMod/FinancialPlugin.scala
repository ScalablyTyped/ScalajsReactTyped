package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.CUMIPMT
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "FinancialPlugin")
@js.native
open class FinancialPlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginFinancialPluginMod.FinancialPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object FinancialPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "FinancialPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "FinancialPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: CUMIPMT = js.native
  inline def implementedFunctions_=(x: CUMIPMT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
