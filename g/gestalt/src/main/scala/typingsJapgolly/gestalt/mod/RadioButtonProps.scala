package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.gestalt.anon.Checked
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioButtonProps extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var image: js.UndefOr[Node] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: AbstractEventHandler[ReactEventFrom[HTMLInputElement], Checked]
  
  var size: js.UndefOr[sm | md] = js.undefined
  
  var subtext: js.UndefOr[String] = js.undefined
  
  var value: String
}
object RadioButtonProps {
  
  inline def apply(
    id: String,
    onChange: /* arg */ Checked & Event[ReactEventFrom[HTMLInputElement]] => Callback,
    value: String
  ): RadioButtonProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: /* arg */ Checked & Event[ReactEventFrom[HTMLInputElement]]) => onChange(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonProps]
  }
  
  extension [Self <: RadioButtonProps](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: VdomNode): Self = StObject.set(x, "image", value.rawNode.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
    
    inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: /* arg */ Checked & Event[ReactEventFrom[HTMLInputElement]] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* arg */ Checked & Event[ReactEventFrom[HTMLInputElement]]) => value(t0).runNow()))
    
    inline def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubtext(value: String): Self = StObject.set(x, "subtext", value.asInstanceOf[js.Any])
    
    inline def setSubtextUndefined: Self = StObject.set(x, "subtext", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
