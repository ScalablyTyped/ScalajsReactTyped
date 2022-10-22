package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.baseui.anon.Kind
import typingsJapgolly.baseui.buttonGroupTypesMod.ButtonGroupProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupButtonGroupMod {
  
  @JSImport("baseui/button-group/button-group", JSImport.Default)
  @js.native
  open class default () extends ButtonGroup
  /* static members */
  object default {
    
    @JSImport("baseui/button-group/button-group", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/button-group/button-group", "default.defaultProps")
    @js.native
    def defaultProps: Kind = js.native
    inline def defaultProps_=(x: Kind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ButtonGroup
    extends Component[ButtonGroupProps, js.Object, Any] {
    
    var childRefs: NumberDictionary[RefHandle[Any]] = js.native
  }
}
