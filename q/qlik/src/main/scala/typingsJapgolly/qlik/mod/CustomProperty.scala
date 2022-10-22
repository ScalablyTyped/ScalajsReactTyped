package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.qlik.qlikStrings.StringExpr
import typingsJapgolly.qlik.qlikStrings.StringExpression
import typingsJapgolly.qlik.qlikStrings.ValueExpression
import typingsJapgolly.qlik.qlikStrings.dimension
import typingsJapgolly.qlik.qlikStrings.measure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlik.mod.CustomPropertyString
  - typingsJapgolly.qlik.mod.CustomPropertyInteger
  - typingsJapgolly.qlik.mod.CustomPropertyNumber
  - typingsJapgolly.qlik.mod.CustomPropertyArray
  - typingsJapgolly.qlik.mod.CustomPropertyButton
  - typingsJapgolly.qlik.mod.CustomPropertyButtonGroup
  - typingsJapgolly.qlik.mod.CustomPropertyCheckbox
  - typingsJapgolly.qlik.mod.CustomPropertyColorPicker
  - typingsJapgolly.qlik.mod.CustomPropertyDropdown
  - typingsJapgolly.qlik.mod.CustomPropertyLink
  - typingsJapgolly.qlik.mod.CustomProperyMedia
  - typingsJapgolly.qlik.mod.CustomPropertyRadio
  - typingsJapgolly.qlik.mod.CustomPropertySlider
  - typingsJapgolly.qlik.mod.CustomPropertyRangeSlider
  - typingsJapgolly.qlik.mod.CustomPropertySwitch
  - typingsJapgolly.qlik.mod.CustomPropertyText
  - typingsJapgolly.qlik.mod.CustomPropertyTextArea
  - typingsJapgolly.qlik.mod.CustomPropertyExpression
  - typingsJapgolly.qlik.mod.CustomPropertyItems
*/
trait CustomProperty extends StObject
object CustomProperty {
  
  inline def CustomPropertyArray(component: Unit): typingsJapgolly.qlik.mod.CustomPropertyArray = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyArray]
  }
  
  inline def CustomPropertyButton(action: VisualizationOptions => Callback): typingsJapgolly.qlik.mod.CustomPropertyButton = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1((t0: VisualizationOptions) => action(t0).runNow()), component = "button")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyButton]
  }
  
  inline def CustomPropertyButtonGroup(): typingsJapgolly.qlik.mod.CustomPropertyButtonGroup = {
    val __obj = js.Dynamic.literal(component = "buttongroup")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyButtonGroup]
  }
  
  inline def CustomPropertyCheckbox(): typingsJapgolly.qlik.mod.CustomPropertyCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyCheckbox]
  }
  
  inline def CustomPropertyColorPicker(): typingsJapgolly.qlik.mod.CustomPropertyColorPicker = {
    val __obj = js.Dynamic.literal(component = "color-picker")
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyColorPicker]
  }
  
  inline def CustomPropertyDropdown(ref: String): typingsJapgolly.qlik.mod.CustomPropertyDropdown = {
    val __obj = js.Dynamic.literal(component = "dropdown", ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyDropdown]
  }
  
  inline def CustomPropertyExpression(
    expressionType: dimension | measure | StringExpr | typingsJapgolly.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression,
    `type`: Unit
  ): typingsJapgolly.qlik.mod.CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = "expression", expressionType = expressionType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyExpression]
  }
  
  inline def CustomPropertyInteger(): typingsJapgolly.qlik.mod.CustomPropertyInteger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyInteger]
  }
  
  inline def CustomPropertyItems(items: StringDictionary[CustomProperty]): typingsJapgolly.qlik.mod.CustomPropertyItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("items")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyItems]
  }
  
  inline def CustomPropertyLink(): typingsJapgolly.qlik.mod.CustomPropertyLink = {
    val __obj = js.Dynamic.literal(component = "link")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyLink]
  }
  
  inline def CustomPropertyNumber(): typingsJapgolly.qlik.mod.CustomPropertyNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyNumber]
  }
  
  inline def CustomPropertyRadio(): typingsJapgolly.qlik.mod.CustomPropertyRadio = {
    val __obj = js.Dynamic.literal(component = "radiobuttons")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyRadio]
  }
  
  inline def CustomPropertyRangeSlider(): typingsJapgolly.qlik.mod.CustomPropertyRangeSlider = {
    val __obj = js.Dynamic.literal(component = "slider")
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyRangeSlider]
  }
  
  inline def CustomPropertySlider(): typingsJapgolly.qlik.mod.CustomPropertySlider = {
    val __obj = js.Dynamic.literal(component = "slider")
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertySlider]
  }
  
  inline def CustomPropertyString(): typingsJapgolly.qlik.mod.CustomPropertyString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyString]
  }
  
  inline def CustomPropertySwitch(): typingsJapgolly.qlik.mod.CustomPropertySwitch = {
    val __obj = js.Dynamic.literal(component = "switch")
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertySwitch]
  }
  
  inline def CustomPropertyText(): typingsJapgolly.qlik.mod.CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = "text")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyText]
  }
  
  inline def CustomPropertyTextArea(): typingsJapgolly.qlik.mod.CustomPropertyTextArea = {
    val __obj = js.Dynamic.literal(component = "textarea")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomPropertyTextArea]
  }
  
  inline def CustomProperyMedia(): typingsJapgolly.qlik.mod.CustomProperyMedia = {
    val __obj = js.Dynamic.literal(component = "media")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.qlik.mod.CustomProperyMedia]
  }
}
