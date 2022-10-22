package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.`private`
import typingsJapgolly.babelTypes.babelTypesStrings.`protected`
import typingsJapgolly.babelTypes.babelTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSParameterProperty
  extends StObject
     with Node
     with LVal {
  
  var accessibility: public | `private` | `protected` | Null
  
  var parameter: Identifier_ | AssignmentPattern_
  
  var readonly: Boolean | Null
  
  @JSName("type")
  var type_TSParameterProperty: typingsJapgolly.babelTypes.babelTypesStrings.TSParameterProperty
}
object TSParameterProperty {
  
  @JSImport("babel-types", "TSParameterProperty")
  @js.native
  def apply(parameter: AssignmentPattern_): TSParameterProperty = js.native
  @JSImport("babel-types", "TSParameterProperty")
  @js.native
  def apply(parameter: Identifier_): TSParameterProperty = js.native
  
  extension [Self <: TSParameterProperty](x: Self) {
    
    inline def setAccessibility(value: public | `private` | `protected`): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    inline def setParameter(value: Identifier_ | AssignmentPattern_): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSParameterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
