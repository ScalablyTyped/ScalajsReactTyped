package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.HFADD
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "SimpleArithmerticPlugin")
@js.native
open class SimpleArithmerticPlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginSimpleArithmerticMod.SimpleArithmerticPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object SimpleArithmerticPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "SimpleArithmerticPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "SimpleArithmerticPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: HFADD = js.native
  inline def implementedFunctions_=(x: HFADD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
