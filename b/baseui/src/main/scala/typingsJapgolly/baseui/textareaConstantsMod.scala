package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaConstantsMod {
  
  object ADJOINED {
    
    @JSImport("baseui/textarea/constants", "ADJOINED.both")
    @js.native
    val both: typingsJapgolly.baseui.baseuiStrings.both = js.native
    
    @JSImport("baseui/textarea/constants", "ADJOINED.left")
    @js.native
    val left: typingsJapgolly.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/textarea/constants", "ADJOINED.none")
    @js.native
    val none: typingsJapgolly.baseui.baseuiStrings.none = js.native
    
    @JSImport("baseui/textarea/constants", "ADJOINED.right")
    @js.native
    val right: typingsJapgolly.baseui.baseuiStrings.right = js.native
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/textarea/constants", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/textarea/constants", "SIZE.compact")
    @js.native
    val compact: typingsJapgolly.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/textarea/constants", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/textarea/constants", "SIZE.mini")
    @js.native
    val mini: typingsJapgolly.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/textarea/constants", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
  }
}
