package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.DATE
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "DateTimePlugin")
@js.native
open class DateTimePlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginDateTimePluginMod.DateTimePlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object DateTimePlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "DateTimePlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "DateTimePlugin.implementedFunctions")
  @js.native
  def implementedFunctions: DATE = js.native
  inline def implementedFunctions_=(x: DATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
