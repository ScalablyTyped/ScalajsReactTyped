package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.commonMod.CellValue
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsPersistentStatePersistentStateMod {
  
  @JSImport("handsontable/plugins/persistentState/persistentState", "PersistentState")
  @js.native
  open class PersistentState protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def isEnabled(): Boolean = js.native
    
    def loadValue(key: String, saveTo: CellValue): Unit = js.native
    
    def resetValue(key: String): Unit = js.native
    
    def saveValue(key: String, value: CellValue): Unit = js.native
  }
  
  type Settings = Boolean
}
