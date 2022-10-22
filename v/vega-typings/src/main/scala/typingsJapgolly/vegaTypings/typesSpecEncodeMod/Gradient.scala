package typingsJapgolly.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesSpecEncodeMod.LinearGradient
  - typingsJapgolly.vegaTypings.typesSpecEncodeMod.RadialGradient
*/
trait Gradient extends StObject
object Gradient {
  
  inline def LinearGradient(stops: js.Array[GradientStop]): typingsJapgolly.vegaTypings.typesSpecEncodeMod.LinearGradient = {
    val __obj = js.Dynamic.literal(gradient = "linear", stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecEncodeMod.LinearGradient]
  }
  
  inline def RadialGradient(stops: js.Array[GradientStop]): typingsJapgolly.vegaTypings.typesSpecEncodeMod.RadialGradient = {
    val __obj = js.Dynamic.literal(gradient = "radial", stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecEncodeMod.RadialGradient]
  }
}
