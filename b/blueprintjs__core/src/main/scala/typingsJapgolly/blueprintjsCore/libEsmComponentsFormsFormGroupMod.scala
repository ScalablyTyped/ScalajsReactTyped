package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsFormsFormGroupMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/formGroup", "FormGroup")
  @js.native
  open class FormGroup protected ()
    extends AbstractPureComponent2[FormGroupProps, js.Object, js.Object] {
    def this(props: FormGroupProps) = this()
    def this(props: FormGroupProps, context: Any) = this()
    
    /* private */ var getClassName: Any = js.native
  }
  /* static members */
  object FormGroup {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/formGroup", "FormGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/formGroup", "FormGroup.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type FormGroupProps = IFormGroupProps
  
  trait IFormGroupProps
    extends StObject
       with IIntentProps
       with IProps {
    
    /** Group contents. */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * A space-delimited list of class names to pass along to the
      * `Classes.FORM_CONTENT` element that contains `children`.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Whether form group should appear as non-interactive.
      * Remember that `input` elements must be disabled separately.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional helper text. The given content will be wrapped in
      * `Classes.FORM_HELPER_TEXT` and displayed beneath `children`.
      * Helper text color is determined by the `intent`.
      */
    var helperText: js.UndefOr[Node] = js.undefined
    
    /** Whether to render the label and children on a single line. */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /** Label of this form group. */
    var label: js.UndefOr[Node] = js.undefined
    
    /**
      * `id` attribute of the labelable form element that this `FormGroup` controls,
      * used as `<label for>` attribute.
      */
    var labelFor: js.UndefOr[String] = js.undefined
    
    /**
      * Optional secondary text that appears after the label.
      */
    var labelInfo: js.UndefOr[Node] = js.undefined
    
    /** CSS properties to apply to the root element. */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Optional text for `label`. The given content will be wrapped in
      * `Classes.FORM_GROUP_SUB_LABEL` and displayed beneath `label`. The text color
      * is determined by the `intent`.
      */
    var subLabel: js.UndefOr[Node] = js.undefined
  }
  object IFormGroupProps {
    
    inline def apply(): IFormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFormGroupProps]
    }
    
    extension [Self <: IFormGroupProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHelperText(value: VdomNode): Self = StObject.set(x, "helperText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHelperTextNull: Self = StObject.set(x, "helperText", null)
      
      inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      inline def setHelperTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "helperText", js.Array(value*))
      
      inline def setHelperTextVdomElement(value: VdomElement): Self = StObject.set(x, "helperText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelFor(value: String): Self = StObject.set(x, "labelFor", value.asInstanceOf[js.Any])
      
      inline def setLabelForUndefined: Self = StObject.set(x, "labelFor", js.undefined)
      
      inline def setLabelInfo(value: VdomNode): Self = StObject.set(x, "labelInfo", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelInfoNull: Self = StObject.set(x, "labelInfo", null)
      
      inline def setLabelInfoUndefined: Self = StObject.set(x, "labelInfo", js.undefined)
      
      inline def setLabelInfoVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "labelInfo", js.Array(value*))
      
      inline def setLabelInfoVdomElement(value: VdomElement): Self = StObject.set(x, "labelInfo", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubLabel(value: VdomNode): Self = StObject.set(x, "subLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubLabelNull: Self = StObject.set(x, "subLabel", null)
      
      inline def setSubLabelUndefined: Self = StObject.set(x, "subLabel", js.undefined)
      
      inline def setSubLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subLabel", js.Array(value*))
      
      inline def setSubLabelVdomElement(value: VdomElement): Self = StObject.set(x, "subLabel", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
