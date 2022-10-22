package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsTouchScrollTouchScrollMod {
  
  @JSImport("handsontable/plugins/touchScroll/touchScroll", "TouchScroll")
  @js.native
  open class TouchScroll protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    var clones: js.Array[Any] = js.native
    
    var freezeOverlays: Boolean = js.native
    
    var lockedCollection: Boolean = js.native
    
    var scrollbars: js.Array[Any] = js.native
  }
  
  type Settings = Boolean
}
