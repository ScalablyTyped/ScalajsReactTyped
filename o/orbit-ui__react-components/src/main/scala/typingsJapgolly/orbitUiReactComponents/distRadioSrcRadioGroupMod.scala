package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`0`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`10`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`11`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`12`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`13`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`1`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`2`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`3`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`4`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`5`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`6`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`7`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`8`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`9`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRadioSrcRadioGroupMod {
  
  @JSImport("@orbit-ui/react-components/dist/radio/src/RadioGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerRadioGroup(props: InnerRadioGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerRadioGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/radio/src/RadioGroup", "RadioGroup")
  @js.native
  val RadioGroup: OrbitComponent[HTMLElement, InnerRadioGroupProps] = js.native
  
  trait InnerRadioGroupProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * Whether or not the radio group should autoFocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * React children.
      */
    var children: Node
    
    /**
      * The initial value of `value`.
      */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the radio group is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The space between the group elements.
      */
    var gap: js.UndefOr[
        `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ] = js.undefined
    
    /**
      * Radio group name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Called when any of the group elements is checked or unchecked.
      * @param {SyntheticEvent} event - React's original event.
      * @param {string} value - The new value.
      * @returns {void}
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[org.scalajs.dom.Element], /* value */ String, Unit]
      ] = js.undefined
    
    /**
      * The orientation of the group elements.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * Whether or not a user input is required before form submission.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Invert the order of the radio button and his label.
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the group should display as "valid" or "invalid".
      */
    var validationState: js.UndefOr[valid | invalid] = js.undefined
    
    /**
      * The value of the radio group.
      */
    var value: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether the group elements are forced onto one line or can wrap onto multiple lines
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object InnerRadioGroupProps {
    
    inline def apply(): InnerRadioGroupProps = {
      val __obj = js.Dynamic.literal(children = null, forwardedRef = null)
      __obj.asInstanceOf[InnerRadioGroupProps]
    }
    
    extension [Self <: InnerRadioGroupProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setGap(
        value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* value */ String) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* value */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type RadioGroupProps = ComponentProps[OrbitComponent[HTMLElement, InnerRadioGroupProps]]
}
