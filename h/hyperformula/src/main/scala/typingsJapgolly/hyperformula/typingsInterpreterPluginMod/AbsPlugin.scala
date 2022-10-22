package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.ABS
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "AbsPlugin")
@js.native
open class AbsPlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginAbsPluginMod.AbsPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object AbsPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "AbsPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "AbsPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: ABS = js.native
  inline def implementedFunctions_=(x: ABS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
