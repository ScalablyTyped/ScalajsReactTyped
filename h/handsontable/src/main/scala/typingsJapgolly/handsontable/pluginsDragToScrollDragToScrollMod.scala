package typingsJapgolly.handsontable

import org.scalajs.dom.DOMRect
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsDragToScrollDragToScrollMod {
  
  @JSImport("handsontable/plugins/dragToScroll/dragToScroll", "DragToScroll")
  @js.native
  open class DragToScroll protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    var boundaries: js.UndefOr[DOMRect] = js.native
    
    def check(x: Double, y: Double): Unit = js.native
    
    def isEnabled(): Boolean = js.native
    
    def setBoundaries(boundaries: DOMRect): Unit = js.native
    
    def setCallback(callback: js.Function0[Unit]): Unit = js.native
  }
  
  type Settings = Boolean
}
