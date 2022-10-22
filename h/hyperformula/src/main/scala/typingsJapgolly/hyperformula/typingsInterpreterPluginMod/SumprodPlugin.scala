package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.SUMPRODUCT
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "SumprodPlugin")
@js.native
open class SumprodPlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginSumprodPluginMod.SumprodPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object SumprodPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "SumprodPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "SumprodPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: SUMPRODUCT = js.native
  inline def implementedFunctions_=(x: SUMPRODUCT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
