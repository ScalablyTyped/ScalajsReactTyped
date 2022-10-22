package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.baseuiStrings.CHANGE
import typingsJapgolly.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxConstantsMod {
  
  /* Inlined std.Readonly<{ readonly top :'top',  readonly right :'right',  readonly bottom :'bottom',  readonly left :'left'}> */
  object LABEL_PLACEMENT {
    
    @JSImport("baseui/checkbox/constants", "LABEL_PLACEMENT.bottom")
    @js.native
    val bottom: typingsJapgolly.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/checkbox/constants", "LABEL_PLACEMENT.left")
    @js.native
    val left: typingsJapgolly.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/checkbox/constants", "LABEL_PLACEMENT.right")
    @js.native
    val right: typingsJapgolly.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/checkbox/constants", "LABEL_PLACEMENT.top")
    @js.native
    val top: typingsJapgolly.baseui.baseuiStrings.top = js.native
  }
  
  object STATE_TYPE {
    
    @JSImport("baseui/checkbox/constants", "STATE_TYPE.change")
    @js.native
    val change: CHANGE = js.native
  }
  
  /* Inlined std.Readonly<{ readonly default :'default',  readonly toggle :'toggle',  readonly toggle_round :'toggle'}> */
  object STYLE_TYPE extends Shortcut {
    
    @JSImport("baseui/checkbox/constants", "STYLE_TYPE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/checkbox/constants", "STYLE_TYPE.toggle")
    @js.native
    val toggle: typingsJapgolly.baseui.baseuiStrings.toggle = js.native
    
    @JSImport("baseui/checkbox/constants", "STYLE_TYPE.toggle_round")
    @js.native
    val toggleRound: typingsJapgolly.baseui.baseuiStrings.toggle = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `STYLE_TYPE.foo` */
    override def _to: default_ = default
  }
}
