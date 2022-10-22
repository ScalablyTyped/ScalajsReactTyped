package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.anon.Ref
import typingsJapgolly.materialUiCore.internalSwitchBaseMod.SwitchBaseProps
import typingsJapgolly.materialUiCore.materialUiCoreStrings.default
import typingsJapgolly.materialUiCore.materialUiCoreStrings.medium
import typingsJapgolly.materialUiCore.materialUiCoreStrings.primary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.small
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchSwitchMod {
  
  @JSImport("@material-ui/core/Switch/Switch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SwitchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.switchBase
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeSmall
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.thumb
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.track
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.checked
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.input
  */
  trait SwitchClassKey extends StObject
  object SwitchClassKey {
    
    inline def checked: typingsJapgolly.materialUiCore.materialUiCoreStrings.checked = "checked".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.checked]
    
    inline def colorPrimary: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary = "colorPrimary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary]
    
    inline def colorSecondary: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary = "colorSecondary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def input: typingsJapgolly.materialUiCore.materialUiCoreStrings.input = "input".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.input]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def sizeSmall: typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeSmall = "sizeSmall".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeSmall]
    
    inline def switchBase: typingsJapgolly.materialUiCore.materialUiCoreStrings.switchBase = "switchBase".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.switchBase]
    
    inline def thumb: typingsJapgolly.materialUiCore.materialUiCoreStrings.thumb = "thumb".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.thumb]
    
    inline def track: typingsJapgolly.materialUiCore.materialUiCoreStrings.track = "track".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.track]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps extends any ? std.Pick<@material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps, std.Exclude<keyof @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps, 'classes' | 'checkedIcon' | 'color' | 'icon'>> : never */ trait SwitchProps
    extends StObject
       with StyledComponentProps[SwitchClassKey]
       with Ref[SwitchBaseProps] {
    
    /**
      * The icon to display when the component is checked.
      */
    var checkedIcon: js.UndefOr[Node] = js.undefined
    
    /**
      * The color of the component. It supports those theme colors that make sense for this component.
      */
    var color: js.UndefOr[primary | secondary | default] = js.undefined
    
    /**
      * If `true`, the switch will be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The icon to display when the component is unchecked.
      */
    var icon: js.UndefOr[Node] = js.undefined
    
    /**
      * The size of the switch.
      * `small` is equivalent to the dense switch styling.
      */
    var size: js.UndefOr[small | medium] = js.undefined
    
    /**
      * The value of the component. The DOM API casts this to a string.
      * The browser uses "on" as the default value.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    extension [Self <: SwitchProps](x: Self) {
      
      inline def setCheckedIcon(value: VdomNode): Self = StObject.set(x, "checkedIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCheckedIconNull: Self = StObject.set(x, "checkedIcon", null)
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setCheckedIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "checkedIcon", js.Array(value*))
      
      inline def setCheckedIconVdomElement(value: VdomElement): Self = StObject.set(x, "checkedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: primary | secondary | default): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
