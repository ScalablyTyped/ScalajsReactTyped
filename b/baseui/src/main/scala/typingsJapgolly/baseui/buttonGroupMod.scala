package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.anon.InitialState
import typingsJapgolly.baseui.anon.Kind
import typingsJapgolly.baseui.anon.Length
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.round_
import typingsJapgolly.baseui.buttonGroupButtonGroupMod.default
import typingsJapgolly.baseui.buttonGroupTypesMod.StatefulButtonGroupProps
import typingsJapgolly.baseui.buttonGroupTypesMod.StatefulContainerProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod {
  
  @JSImport("baseui/button-group", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/button-group", "ButtonGroup")
  @js.native
  open class ButtonGroup () extends default
  /* static members */
  object ButtonGroup {
    
    @JSImport("baseui/button-group", "ButtonGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/button-group", "ButtonGroup.defaultProps")
    @js.native
    def defaultProps: Kind = js.native
    inline def defaultProps_=(x: Kind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Readonly<{ readonly radio :'radio',  readonly checkbox :'checkbox'}> */
  object MODE {
    
    @JSImport("baseui/button-group", "MODE.checkbox")
    @js.native
    val checkbox: typingsJapgolly.baseui.baseuiStrings.checkbox = js.native
    
    @JSImport("baseui/button-group", "MODE.radio")
    @js.native
    val radio: typingsJapgolly.baseui.baseuiStrings.radio = js.native
  }
  
  object SHAPE extends Shortcut {
    
    @JSImport("baseui/button-group", "SHAPE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/button-group", "SHAPE.circle")
    @js.native
    val circle: typingsJapgolly.baseui.baseuiStrings.circle = js.native
    
    @JSImport("baseui/button-group", "SHAPE.pill")
    @js.native
    val pill: typingsJapgolly.baseui.baseuiStrings.pill = js.native
    
    @JSImport("baseui/button-group", "SHAPE.round")
    @js.native
    val round: round_ = js.native
    
    @JSImport("baseui/button-group", "SHAPE.square")
    @js.native
    val square: typingsJapgolly.baseui.baseuiStrings.square = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SHAPE.foo` */
    override def _to: default_ = default
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/button-group", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/button-group", "SIZE.compact")
    @js.native
    val compact: typingsJapgolly.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/button-group", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/button-group", "SIZE.mini")
    @js.native
    val mini: typingsJapgolly.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  /* Inlined std.Readonly<{ readonly change :'change'}> */
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/button-group", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
  }
  
  inline def StatefulButtonGroup(props: StatefulButtonGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulButtonGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/button-group", "StatefulContainer")
  @js.native
  open class StatefulContainer protected ()
    extends typingsJapgolly.baseui.buttonGroupStatefulContainerMod.default {
    def this(props: StatefulContainerProps) = this()
  }
  /* static members */
  object StatefulContainer {
    
    @JSImport("baseui/button-group", "StatefulContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/button-group", "StatefulContainer.defaultProps")
    @js.native
    def defaultProps: InitialState = js.native
    inline def defaultProps_=(x: InitialState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/button-group", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, Length] = js.native
}
