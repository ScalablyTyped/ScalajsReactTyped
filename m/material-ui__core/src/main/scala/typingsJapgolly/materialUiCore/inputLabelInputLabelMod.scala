package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.anon.Ref
import typingsJapgolly.materialUiCore.formLabelFormLabelMod.FormLabelProps
import typingsJapgolly.materialUiCore.materialUiCoreStrings.dense
import typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
import typingsJapgolly.materialUiCore.materialUiCoreStrings.label
import typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined
import typingsJapgolly.materialUiCore.materialUiCoreStrings.standard
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputLabelInputLabelMod {
  
  @JSImport("@material-ui/core/InputLabel/InputLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: InputLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focused
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.error
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.required
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.asterisk
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.formControl
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.shrink
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.animated
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined
  */
  trait InputLabelClassKey extends StObject
  object InputLabelClassKey {
    
    inline def animated: typingsJapgolly.materialUiCore.materialUiCoreStrings.animated = "animated".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.animated]
    
    inline def asterisk: typingsJapgolly.materialUiCore.materialUiCoreStrings.asterisk = "asterisk".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.asterisk]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def error: typingsJapgolly.materialUiCore.materialUiCoreStrings.error = "error".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.error]
    
    inline def filled: typingsJapgolly.materialUiCore.materialUiCoreStrings.filled = "filled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.filled]
    
    inline def focused: typingsJapgolly.materialUiCore.materialUiCoreStrings.focused = "focused".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focused]
    
    inline def formControl: typingsJapgolly.materialUiCore.materialUiCoreStrings.formControl = "formControl".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.formControl]
    
    inline def marginDense: typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense = "marginDense".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.marginDense]
    
    inline def outlined: typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined = "outlined".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined]
    
    inline def required: typingsJapgolly.materialUiCore.materialUiCoreStrings.required = "required".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.required]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def shrink: typingsJapgolly.materialUiCore.materialUiCoreStrings.shrink = "shrink".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.shrink]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}> extends any ? std.Pick<@material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}>, std.Exclude<keyof @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}>, 'classes' | never>> : never */ trait InputLabelProps
    extends StObject
       with StyledComponentProps[InputLabelClassKey]
       with Ref[FormLabelProps[label, js.Object]] {
    
    /**
      * The contents of the `InputLabel`.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    var color: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}>['color'] */ js.Any
      ] = js.undefined
    
    /**
      * If `true`, the transition animation is disabled.
      */
    var disableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, apply disabled class.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the label will be displayed in an error state.
      */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the input of this label is focused.
      */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `dense`, will adjust vertical spacing. This is normally obtained via context from
      * FormControl.
      */
    var margin: js.UndefOr[dense] = js.undefined
    
    /**
      * if `true`, the label will indicate that the input is required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the label is shrunk.
      */
    var shrink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The variant to use.
      */
    var variant: js.UndefOr[standard | outlined | filled] = js.undefined
  }
  object InputLabelProps {
    
    inline def apply(): InputLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputLabelProps]
    }
    
    extension [Self <: InputLabelProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}>['color'] */ js.Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setMargin(value: dense): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setShrink(value: Boolean): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
      
      inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
      
      inline def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
