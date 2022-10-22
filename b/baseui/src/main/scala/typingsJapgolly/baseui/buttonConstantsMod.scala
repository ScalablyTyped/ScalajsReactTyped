package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.round_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonConstantsMod {
  
  object KIND {
    
    @JSImport("baseui/button/constants", "KIND.primary")
    @js.native
    val primary: typingsJapgolly.baseui.baseuiStrings.primary = js.native
    
    @JSImport("baseui/button/constants", "KIND.secondary")
    @js.native
    val secondary: typingsJapgolly.baseui.baseuiStrings.secondary = js.native
    
    @JSImport("baseui/button/constants", "KIND.tertiary")
    @js.native
    val tertiary: typingsJapgolly.baseui.baseuiStrings.tertiary = js.native
  }
  
  object SHAPE extends Shortcut {
    
    @JSImport("baseui/button/constants", "SHAPE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/button/constants", "SHAPE.circle")
    @js.native
    val circle: typingsJapgolly.baseui.baseuiStrings.circle = js.native
    
    @JSImport("baseui/button/constants", "SHAPE.pill")
    @js.native
    val pill: typingsJapgolly.baseui.baseuiStrings.pill = js.native
    
    @JSImport("baseui/button/constants", "SHAPE.round")
    @js.native
    val round: round_ = js.native
    
    @JSImport("baseui/button/constants", "SHAPE.square")
    @js.native
    val square: typingsJapgolly.baseui.baseuiStrings.square = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SHAPE.foo` */
    override def _to: default_ = default
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/button/constants", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/button/constants", "SIZE.compact")
    @js.native
    val compact: typingsJapgolly.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/button/constants", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/button/constants", "SIZE.mini")
    @js.native
    val mini: typingsJapgolly.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
}
