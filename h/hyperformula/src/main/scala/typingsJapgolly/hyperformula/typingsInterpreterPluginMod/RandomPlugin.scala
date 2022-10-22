package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.RAND
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "RandomPlugin")
@js.native
open class RandomPlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginRandomPluginMod.RandomPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object RandomPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RandomPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RandomPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: RAND = js.native
  inline def implementedFunctions_=(x: RAND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
