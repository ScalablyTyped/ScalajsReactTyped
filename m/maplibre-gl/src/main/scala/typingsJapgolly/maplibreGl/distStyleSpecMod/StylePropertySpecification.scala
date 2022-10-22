package typingsJapgolly.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.anon.PropertytypeTransition
  - typingsJapgolly.maplibreGl.anon.Tokens
  - typingsJapgolly.maplibreGl.anon.TransitionType
  - typingsJapgolly.maplibreGl.anon.TypeValues
  - typingsJapgolly.maplibreGl.anon.ExpressionOverridable
  - typingsJapgolly.maplibreGl.anon.ExpressionLength
  - typingsJapgolly.maplibreGl.anon.LengthPropertytype
  - typingsJapgolly.maplibreGl.anon.DefaultExpressionPropertytype
*/
trait StylePropertySpecification extends StObject
object StylePropertySpecification {
  
  inline def DefaultExpressionPropertytype(`property-type`: ExpressionType, transition: Boolean): typingsJapgolly.maplibreGl.anon.DefaultExpressionPropertytype = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("padding")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.DefaultExpressionPropertytype]
  }
  
  inline def ExpressionLength(`property-type`: ExpressionType, transition: Boolean): typingsJapgolly.maplibreGl.anon.ExpressionLength = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], value = "number")
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.ExpressionLength]
  }
  
  inline def ExpressionOverridable(overridable: Boolean, `property-type`: ExpressionType, transition: Boolean): typingsJapgolly.maplibreGl.anon.ExpressionOverridable = {
    val __obj = js.Dynamic.literal(overridable = overridable.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.ExpressionOverridable]
  }
  
  inline def LengthPropertytype(`property-type`: ExpressionType, transition: Boolean): typingsJapgolly.maplibreGl.anon.LengthPropertytype = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], value = "string")
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.LengthPropertytype]
  }
  
  inline def PropertytypeTransition(`property-type`: ExpressionType, transition: Boolean): typingsJapgolly.maplibreGl.anon.PropertytypeTransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.PropertytypeTransition]
  }
  
  inline def Tokens(`property-type`: ExpressionType, transition: Boolean): typingsJapgolly.maplibreGl.anon.Tokens = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Tokens]
  }
  
  inline def TransitionType(`property-type`: ExpressionType, transition: Boolean): typingsJapgolly.maplibreGl.anon.TransitionType = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.TransitionType]
  }
  
  inline def TypeValues(`property-type`: ExpressionType, transition: Boolean, values: StringDictionary[js.Object]): typingsJapgolly.maplibreGl.anon.TypeValues = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("enum")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.TypeValues]
  }
}
