package typingsJapgolly.micromarkFactoryDestination

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-factory-destination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factoryDestination(
    effects: Effects,
    ok: State,
    nok: State,
    `type`: String,
    literalType: String,
    literalMarkerType: String,
    rawType: String,
    stringType: String
  ): State = (^.asInstanceOf[js.Dynamic].applyDynamic("factoryDestination")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], nok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], literalType.asInstanceOf[js.Any], literalMarkerType.asInstanceOf[js.Any], rawType.asInstanceOf[js.Any], stringType.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def factoryDestination(
    effects: Effects,
    ok: State,
    nok: State,
    `type`: String,
    literalType: String,
    literalMarkerType: String,
    rawType: String,
    stringType: String,
    max: Double
  ): State = (^.asInstanceOf[js.Dynamic].applyDynamic("factoryDestination")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], nok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], literalType.asInstanceOf[js.Any], literalMarkerType.asInstanceOf[js.Any], rawType.asInstanceOf[js.Any], stringType.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[State]
  
  type Effects = typingsJapgolly.micromarkUtilTypes.mod.Effects
  
  type State = typingsJapgolly.micromarkUtilTypes.mod.State
}
