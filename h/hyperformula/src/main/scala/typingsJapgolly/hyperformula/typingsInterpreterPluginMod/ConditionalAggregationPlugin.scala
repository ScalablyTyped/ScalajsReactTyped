package typingsJapgolly.hyperformula.typingsInterpreterPluginMod

import typingsJapgolly.hyperformula.anon.AVERAGEIF
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "ConditionalAggregationPlugin")
@js.native
open class ConditionalAggregationPlugin protected ()
  extends typingsJapgolly.hyperformula.typingsInterpreterPluginConditionalAggregationPluginMod.ConditionalAggregationPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object ConditionalAggregationPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ConditionalAggregationPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ConditionalAggregationPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: AVERAGEIF = js.native
  inline def implementedFunctions_=(x: AVERAGEIF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
