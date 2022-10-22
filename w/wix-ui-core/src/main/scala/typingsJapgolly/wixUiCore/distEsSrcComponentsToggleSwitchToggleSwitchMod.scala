package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixUiCore.anon.FocusFocusVisible
import typingsJapgolly.wixUiCore.anon.TabIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsToggleSwitchToggleSwitchMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/toggle-switch/ToggleSwitch", "ToggleSwitch")
  @js.native
  open class ToggleSwitch protected () extends PureComponent[ToggleSwitchProps, ToggleSwitchState, Any] {
    def this(props: ToggleSwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ToggleSwitchProps, context: Any) = this()
    
    /* private */ var focusedByMouse: Any = js.native
    
    /* private */ val handleBlur: Any = js.native
    
    /* private */ val handleFocus: Any = js.native
    
    /* private */ val handleKeyDown: Any = js.native
    
    /* private */ val handleMouseDown: Any = js.native
    
    @JSName("state")
    var state_ToggleSwitch: FocusFocusVisible = js.native
  }
  /* static members */
  object ToggleSwitch {
    
    @JSImport("wix-ui-core/dist/es/src/components/toggle-switch/ToggleSwitch", "ToggleSwitch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/toggle-switch/ToggleSwitch", "ToggleSwitch.defaultProps")
    @js.native
    def defaultProps: TabIndex = js.native
    inline def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/toggle-switch/ToggleSwitch", "ToggleSwitch.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ToggleSwitchProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkedIcon: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var styles: js.UndefOr[ToggleSwitchStyles] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var uncheckedIcon: js.UndefOr[Node] = js.undefined
  }
  object ToggleSwitchProps {
    
    inline def apply(): ToggleSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleSwitchProps]
    }
    
    extension [Self <: ToggleSwitchProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedIcon(value: VdomNode): Self = StObject.set(x, "checkedIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCheckedIconNull: Self = StObject.set(x, "checkedIcon", null)
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setCheckedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checkedIcon", js.Array(value*))
      
      inline def setCheckedIconVdomElement(value: VdomElement): Self = StObject.set(x, "checkedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyles(value: ToggleSwitchStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setUncheckedIcon(value: VdomNode): Self = StObject.set(x, "uncheckedIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setUncheckedIconNull: Self = StObject.set(x, "uncheckedIcon", null)
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
      
      inline def setUncheckedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "uncheckedIcon", js.Array(value*))
      
      inline def setUncheckedIconVdomElement(value: VdomElement): Self = StObject.set(x, "uncheckedIcon", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait ToggleSwitchState extends StObject {
    
    var focus: Boolean
    
    var focusVisible: Boolean
  }
  object ToggleSwitchState {
    
    inline def apply(focus: Boolean, focusVisible: Boolean): ToggleSwitchState = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleSwitchState]
    }
    
    extension [Self <: ToggleSwitchState](x: Self) {
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToggleSwitchStyles extends StObject {
    
    var knob: js.UndefOr[CSSProperties] = js.undefined
    
    var knobIcon: js.UndefOr[CSSProperties] = js.undefined
    
    var root: js.UndefOr[CSSProperties] = js.undefined
    
    var track: js.UndefOr[CSSProperties] = js.undefined
  }
  object ToggleSwitchStyles {
    
    inline def apply(): ToggleSwitchStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleSwitchStyles]
    }
    
    extension [Self <: ToggleSwitchStyles](x: Self) {
      
      inline def setKnob(value: CSSProperties): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
      
      inline def setKnobIcon(value: CSSProperties): Self = StObject.set(x, "knobIcon", value.asInstanceOf[js.Any])
      
      inline def setKnobIconUndefined: Self = StObject.set(x, "knobIcon", js.undefined)
      
      inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
      
      inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTrack(value: CSSProperties): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
}
