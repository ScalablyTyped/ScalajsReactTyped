package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.HLOOKUP
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "LookupPlugin")
@js.native
open class LookupPlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginLookupPluginMod.LookupPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object LookupPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "LookupPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "LookupPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: HLOOKUP = js.native
  inline def implementedFunctions_=(x: HLOOKUP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
