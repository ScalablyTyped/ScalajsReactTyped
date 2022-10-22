package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsManualColumnFreezeManualColumnFreezeMod {
  
  @JSImport("handsontable/plugins/manualColumnFreeze/manualColumnFreeze", "ManualColumnFreeze")
  @js.native
  open class ManualColumnFreeze protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def freezeColumn(column: Double): Unit = js.native
    
    def isEnabled(): Boolean = js.native
    
    def unfreezeColumn(column: Double): Unit = js.native
  }
  
  type Settings = Boolean
}
