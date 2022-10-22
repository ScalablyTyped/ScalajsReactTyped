package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.AVERAGE
import typingsJapgolly.hyperformula.anon.STDEV
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "NumericAggregationPlugin")
@js.native
open class NumericAggregationPlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginNumericAggregationPluginMod.NumericAggregationPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object NumericAggregationPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "NumericAggregationPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "NumericAggregationPlugin.aliases")
  @js.native
  def aliases: STDEV = js.native
  inline def aliases_=(x: STDEV): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula/typings/interpreter/plugin", "NumericAggregationPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: AVERAGE = js.native
  inline def implementedFunctions_=(x: AVERAGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
