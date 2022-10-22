package typingsJapgolly.reactBulmaComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactBulmaComponents.anon.Divider
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.right
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.Color
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsDropdownMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/dropdown", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ DropdownProps[Any] & (ElementProps[DropdownProps[Any], div]), Element]) & Divider = js.native
  
  trait DropdownItemProps[T] extends StObject {
    
    var value: T
  }
  object DropdownItemProps {
    
    inline def apply[T](value: T): DropdownItemProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownItemProps[T]]
    }
    
    extension [Self <: DropdownItemProps[?], T](x: Self & DropdownItemProps[T]) {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownProps[T] extends StObject {
    
    var align: js.UndefOr[right] = js.undefined
    
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* newValue */ T, Unit]] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
    
    var up: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object DropdownProps {
    
    inline def apply[T](): DropdownProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps[T]]
    }
    
    extension [Self <: DropdownProps[?], T](x: Self & DropdownProps[T]) {
      
      inline def setAlign(value: right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* newValue */ T => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* newValue */ T) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = (js.Function1[/* props */ DropdownProps[Any] & (ElementProps[DropdownProps[Any], div]), Element]) & Divider
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsDropdownMod.foo` */
  override def _to: (js.Function1[/* props */ DropdownProps[Any] & (ElementProps[DropdownProps[Any], div]), Element]) & Divider = default
}
