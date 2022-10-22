package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdForm.typesFormThemeProviderMod.FormThemeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTextFieldTextFieldContainerMod {
  
  @JSImport("@react-md/form/types/text-field/TextFieldContainer", "TextFieldContainer")
  @js.native
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait TextFieldContainerOptions
    extends StObject
       with FormThemeOptions {
    
    /**
      * Boolean if the form components should be using the `dense` spec to reduce
      * the sizing slightly.
      */
    var dense: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the text field should gain the error state and update the
      * colors.
      */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the component should be rendered inline with
      * `display: inline-flex` instead of `display: flex`.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the left children should be wrapped in the `TextFieldAddon`
      * component. This is enabled by default since this is _normally_ the behavior
      * that is desired so that icons can be positioned correctly.
      */
    var isLeftAddon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the right children should be wrapped in the `TextFieldAddon`
      * component. This is enabled by default since this is _normally_ the behavior
      * that is desired so that icons can be positioned correctly.
      */
    var isRightAddon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional addon to apply to the left of the text field. This should
      * normally be an icon. This element will not have pointer events so it can be
      * "clicked through" to focus the text field instead.
      */
    var leftChildren: js.UndefOr[Node] = js.undefined
    
    /**
      * An optional addon to apply to the right of the text field. This should be a
      * clickable button such as a password field toggle or a reset button for the
      * field.
      */
    var rightChildren: js.UndefOr[Node] = js.undefined
    
    /**
      * Boolean if the component should gain `flex: 1 1 auto;` which is useful for
      * full-width behavior within flex containers.
      *
      * @defaultValue `false`
      * @remarks \@since 5.0.0
      */
    var stretch: js.UndefOr[Boolean] = js.undefined
  }
  object TextFieldContainerOptions {
    
    inline def apply(): TextFieldContainerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFieldContainerOptions]
    }
    
    extension [Self <: TextFieldContainerOptions](x: Self) {
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setIsLeftAddon(value: Boolean): Self = StObject.set(x, "isLeftAddon", value.asInstanceOf[js.Any])
      
      inline def setIsLeftAddonUndefined: Self = StObject.set(x, "isLeftAddon", js.undefined)
      
      inline def setIsRightAddon(value: Boolean): Self = StObject.set(x, "isRightAddon", value.asInstanceOf[js.Any])
      
      inline def setIsRightAddonUndefined: Self = StObject.set(x, "isRightAddon", js.undefined)
      
      inline def setLeftChildren(value: VdomNode): Self = StObject.set(x, "leftChildren", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLeftChildrenNull: Self = StObject.set(x, "leftChildren", null)
      
      inline def setLeftChildrenUndefined: Self = StObject.set(x, "leftChildren", js.undefined)
      
      inline def setLeftChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "leftChildren", js.Array(value*))
      
      inline def setLeftChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "leftChildren", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRightChildren(value: VdomNode): Self = StObject.set(x, "rightChildren", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRightChildrenNull: Self = StObject.set(x, "rightChildren", null)
      
      inline def setRightChildrenUndefined: Self = StObject.set(x, "rightChildren", js.undefined)
      
      inline def setRightChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "rightChildren", js.Array(value*))
      
      inline def setRightChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "rightChildren", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    }
  }
  
  trait TextFieldContainerProps
    extends StObject
       with TextFieldContainerOptions
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the text field is currently active (focused) to applied the
      * active color to the current theme.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the text field is currently disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if there is a floating label with the text field.
      */
    var label: js.UndefOr[Boolean] = js.undefined
  }
  object TextFieldContainerProps {
    
    inline def apply(): TextFieldContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFieldContainerProps]
    }
    
    extension [Self <: TextFieldContainerProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
