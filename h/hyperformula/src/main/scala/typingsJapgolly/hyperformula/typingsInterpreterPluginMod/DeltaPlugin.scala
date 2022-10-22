package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.DELTA
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "DeltaPlugin")
@js.native
open class DeltaPlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginDeltaPluginMod.DeltaPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object DeltaPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "DeltaPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "DeltaPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: DELTA = js.native
  inline def implementedFunctions_=(x: DELTA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
