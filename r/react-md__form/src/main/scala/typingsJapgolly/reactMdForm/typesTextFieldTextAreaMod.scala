package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.TextareaHTMLAttributes
import typingsJapgolly.reactMdForm.anon.OmitHTMLAttributesHTMLDiv
import typingsJapgolly.reactMdForm.typesTextFieldTextFieldContainerMod.TextFieldContainerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTextFieldTextAreaMod {
  
  @JSImport("@react-md/form/types/text-field/TextArea", "TextArea")
  @js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps & RefAttributes[HTMLTextAreaElement]] = js.native
  
  trait TextAreaProps
    extends StObject
       with TextareaHTMLAttributes[HTMLTextAreaElement]
       with TextFieldContainerOptions {
    
    /**
      * Boolean if the height changes should be animated when the `resize` prop is
      * set to `"auto"`.
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional className to apply to the textarea element. The base `style`
      * prop is applied to the surrounding `div` instead.
      */
    var areaClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional style to apply to the textarea element. The base `style` prop
      * is applied to the surrounding `div` instead.
      */
    var areaStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Any additional html attributes that should be applied to the main container
      * div. This is probably only going to be used internally so that additional
      * accessibility can be added to text fields for more complex widgets.
      *
      * @remarks \@since 2.5.2
      */
    var containerProps: js.UndefOr[OmitHTMLAttributesHTMLDiv] = js.undefined
    
    /**
      * An optional ref to apply to the text field's container div element. The
      * default ref is forwarded on to the `input` element.
      */
    var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    /**
      * The default value for the text field which will make it uncontrolled.  If
      * you manually change the `defaultValue` prop, the input's value **will not
      * change** unless you provide a different `key` as well. Use the `value` prop
      * instead for a controlled input.
      */
    @JSName("defaultValue")
    var defaultValue_TextAreaProps: js.UndefOr[String] = js.undefined
    
    /**
      * An id to apply to the text area. This is required for a11y.
      */
    @JSName("id")
    var id_TextAreaProps: String
    
    /**
      * An optional floating label to use for the text field. This should really
      * only be used when the `theme` prop is not set to `"none"`. This will be
      * wrapped in the `<Label>` component itself and automatically apply the
      * `htmlFor` prop for this text field.
      */
    var label: js.UndefOr[Node] = js.undefined
    
    /**
      * An optional className to apply to the label wrapper.
      */
    var labelClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional style to apply to the label wrapper.
      */
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The maximum number of rows that are allowed. When this is set to `-1`, it
      * will infinitely expand based on the text content.
      */
    var maxRows: js.UndefOr[Double] = js.undefined
    
    /**
      * Updates the resize ability for the textarea. Native textareas are resizable
      * both horizontally and vertically, but this component will prevent resizing
      * by default and instead animate height changes as the user types.
      */
    var resize: js.UndefOr[TextAreaResize] = js.undefined
    
    /**
      * The value to use for the text field. This will make the component
      * controlled and require the `onChange` prop to be provided as well otherwise
      * this will act as a read only text field.
      */
    @JSName("value")
    var value_TextAreaProps: js.UndefOr[String] = js.undefined
  }
  object TextAreaProps {
    
    inline def apply(id: String): TextAreaProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextAreaProps]
    }
    
    extension [Self <: TextAreaProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAreaClassName(value: String): Self = StObject.set(x, "areaClassName", value.asInstanceOf[js.Any])
      
      inline def setAreaClassNameUndefined: Self = StObject.set(x, "areaClassName", js.undefined)
      
      inline def setAreaStyle(value: CSSProperties): Self = StObject.set(x, "areaStyle", value.asInstanceOf[js.Any])
      
      inline def setAreaStyleUndefined: Self = StObject.set(x, "areaStyle", js.undefined)
      
      inline def setContainerProps(value: OmitHTMLAttributesHTMLDiv): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
      
      inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
      
      inline def setContainerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setContainerRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "containerRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setContainerRefNull: Self = StObject.set(x, "containerRef", null)
      
      inline def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelClassName(value: String): Self = StObject.set(x, "labelClassName", value.asInstanceOf[js.Any])
      
      inline def setLabelClassNameUndefined: Self = StObject.set(x, "labelClassName", js.undefined)
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      inline def setResize(value: TextAreaResize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdForm.reactMdFormStrings.none
    - typingsJapgolly.reactMdForm.reactMdFormStrings.auto
    - typingsJapgolly.reactMdForm.reactMdFormStrings.horizontal
    - typingsJapgolly.reactMdForm.reactMdFormStrings.vertical
    - typingsJapgolly.reactMdForm.reactMdFormStrings.both
  */
  trait TextAreaResize extends StObject
  object TextAreaResize {
    
    inline def auto: typingsJapgolly.reactMdForm.reactMdFormStrings.auto = "auto".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.auto]
    
    inline def both: typingsJapgolly.reactMdForm.reactMdFormStrings.both = "both".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.both]
    
    inline def horizontal: typingsJapgolly.reactMdForm.reactMdFormStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.horizontal]
    
    inline def none: typingsJapgolly.reactMdForm.reactMdFormStrings.none = "none".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.none]
    
    inline def vertical: typingsJapgolly.reactMdForm.reactMdFormStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.vertical]
  }
}
