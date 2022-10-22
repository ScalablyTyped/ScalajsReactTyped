package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.baseuiStrings.CHANGE
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.input
import typingsJapgolly.baseui.baseuiStrings.label
import typingsJapgolly.baseui.baseuiStrings.span
import typingsJapgolly.baseui.checkboxCheckboxMod.default
import typingsJapgolly.baseui.checkboxTypesMod.DefaultProps
import typingsJapgolly.baseui.checkboxTypesMod.DefaultStatefulProps
import typingsJapgolly.baseui.checkboxTypesMod.SharedStyleProps
import typingsJapgolly.baseui.checkboxTypesMod.StatefulCheckboxProps
import typingsJapgolly.baseui.checkboxTypesMod.StatefulContainerProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("baseui/checkbox", "Checkbox")
  @js.native
  open class Checkbox () extends default
  object Checkbox {
    
    @JSImport("baseui/checkbox", "Checkbox")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/checkbox", "Checkbox.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Readonly<{ readonly top :'top',  readonly right :'right',  readonly bottom :'bottom',  readonly left :'left'}> */
  object LABEL_PLACEMENT {
    
    @JSImport("baseui/checkbox", "LABEL_PLACEMENT.bottom")
    @js.native
    val bottom: typingsJapgolly.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/checkbox", "LABEL_PLACEMENT.left")
    @js.native
    val left: typingsJapgolly.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/checkbox", "LABEL_PLACEMENT.right")
    @js.native
    val right: typingsJapgolly.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/checkbox", "LABEL_PLACEMENT.top")
    @js.native
    val top: typingsJapgolly.baseui.baseuiStrings.top = js.native
  }
  
  object STATE_TYPE {
    
    @JSImport("baseui/checkbox", "STATE_TYPE.change")
    @js.native
    val change: CHANGE = js.native
  }
  
  /* Inlined std.Readonly<{ readonly default :'default',  readonly toggle :'toggle',  readonly toggle_round :'toggle'}> */
  object STYLE_TYPE extends Shortcut {
    
    @JSImport("baseui/checkbox", "STYLE_TYPE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/checkbox", "STYLE_TYPE.toggle")
    @js.native
    val toggle: typingsJapgolly.baseui.baseuiStrings.toggle = js.native
    
    @JSImport("baseui/checkbox", "STYLE_TYPE.toggle_round")
    @js.native
    val toggleRound: typingsJapgolly.baseui.baseuiStrings.toggle = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `STYLE_TYPE.foo` */
    override def _to: default_ = default
  }
  
  object StatefulCheckbox {
    
    inline def apply(props: StatefulCheckboxProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/checkbox", "StatefulCheckbox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/checkbox", "StatefulCheckbox.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/checkbox", "StatefulContainer")
  @js.native
  open class StatefulContainer protected ()
    extends typingsJapgolly.baseui.checkboxStatefulCheckboxContainerMod.default {
    def this(props: StatefulContainerProps) = this()
  }
  object StatefulContainer {
    
    @JSImport("baseui/checkbox", "StatefulContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/checkbox", "StatefulContainer.defaultProps")
    @js.native
    def defaultProps: DefaultStatefulProps = js.native
    inline def defaultProps_=(x: DefaultStatefulProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/checkbox", "StyledCheckmark")
  @js.native
  val StyledCheckmark: StyletronComponent[span, SharedStyleProps] = js.native
  
  @JSImport("baseui/checkbox", "StyledInput")
  @js.native
  val StyledInput: StyletronComponent[input, js.Object] = js.native
  
  @JSImport("baseui/checkbox", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/checkbox", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[label, SharedStyleProps] = js.native
  
  @JSImport("baseui/checkbox", "StyledToggle")
  @js.native
  val StyledToggle: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/checkbox", "StyledToggleTrack")
  @js.native
  val StyledToggleTrack: StyletronComponent[div, SharedStyleProps] = js.native
}
