package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.PartialBasePopoverProps
import typingsJapgolly.baseui.anon.PopoverPropsinnerRefRefHT
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverPopoverMod {
  
  object default {
    
    inline def apply(props: PopoverPropsinnerRefRefHT): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/popover/popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/popover/popover", "default.defaultProps")
    @js.native
    def defaultProps: PartialBasePopoverProps = js.native
    inline def defaultProps_=(x: PartialBasePopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
