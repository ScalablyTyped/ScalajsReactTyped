package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.COMPLEX
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "ComplexPlugin")
@js.native
open class ComplexPlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginComplexPluginMod.ComplexPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object ComplexPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ComplexPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ComplexPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: COMPLEX = js.native
  inline def implementedFunctions_=(x: COMPLEX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
