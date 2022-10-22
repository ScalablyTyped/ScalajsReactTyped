package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.materialUiCore.anon.Ref
import typingsJapgolly.materialUiCore.iconButtonIconButtonMod.IconButtonProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLInputTypeAttribute
import typingsJapgolly.react.mod.InputHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalSwitchBaseMod extends Shortcut {
  
  @JSImport("@material-ui/core/internal/SwitchBase", JSImport.Default)
  @js.native
  val default: ComponentType[SwitchBaseProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.checked
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.input
  */
  trait SwitchBaseClassKey extends StObject
  object SwitchBaseClassKey {
    
    inline def checked: typingsJapgolly.materialUiCore.materialUiCoreStrings.checked = "checked".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.checked]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def input: typingsJapgolly.materialUiCore.materialUiCoreStrings.input = "input".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.input]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @material-ui/core.@material-ui/core/IconButton/IconButton.IconButtonProps<@material-ui/core.anon.DefaultComponent['defaultComponent'], {}> extends any ? std.Pick<@material-ui/core.@material-ui/core/IconButton/IconButton.IconButtonProps<@material-ui/core.anon.DefaultComponent['defaultComponent'], {}>, std.Exclude<keyof @material-ui/core.@material-ui/core/IconButton/IconButton.IconButtonProps<@material-ui/core.anon.DefaultComponent['defaultComponent'], {}>, 'classes' | 'children' | 'onChange' | 'type' | 'value'>> : never */ trait SwitchBaseProps
    extends StObject
       with StyledComponentProps[SwitchBaseClassKey]
       with Ref[
          IconButtonProps[
            /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.anon.DefaultComponent['defaultComponent'] */ js.Any, 
            js.Object
          ]
        ] {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the component is checked.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkedIcon: Node
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the ripple effect will be disabled.
      */
    var disableRipple: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: Node
    
    /**
      * The id of the `input` element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
      */
    var inputProps: js.UndefOr[InputHTMLAttributes[HTMLInputElement]] = js.undefined
    
    /**
      * Pass a ref to the `input` element.
      */
    var inputRef: js.UndefOr[typingsJapgolly.react.mod.Ref[Any]] = js.undefined
    
    /**
      * Name attribute of the `input` element.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback fired when the state is changed.
      *
      * @param {object} event The event source of the callback.
      * You can pull out the new value by accessing `event.target.value` (string).
      * You can pull out the new checked state by accessing `event.target.checked` (boolean).
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[HTMLInputElement], /* checked */ Boolean, Unit]
      ] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the `input` element will be required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[HTMLInputTypeAttribute] = js.undefined
    
    /**
      * The value of the component. The DOM API casts this to a string.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object SwitchBaseProps {
    
    inline def apply(): SwitchBaseProps = {
      val __obj = js.Dynamic.literal(checkedIcon = null, icon = null)
      __obj.asInstanceOf[SwitchBaseProps]
    }
    
    extension [Self <: SwitchBaseProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedIcon(value: VdomNode): Self = StObject.set(x, "checkedIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCheckedIconNull: Self = StObject.set(x, "checkedIcon", null)
      
      inline def setCheckedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checkedIcon", js.Array(value*))
      
      inline def setCheckedIconVdomElement(value: VdomElement): Self = StObject.set(x, "checkedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputProps(value: InputHTMLAttributes[HTMLInputElement]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInputRef(value: typingsJapgolly.react.mod.Ref[Any]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (/* event */ ReactEventFrom[HTMLInputElement], /* checked */ Boolean) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* checked */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setType(value: HTMLInputTypeAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ComponentType[SwitchBaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `internalSwitchBaseMod.foo` */
  override def _to: ComponentType[SwitchBaseProps] = default
}
