package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsNestedRowsNestedRowsMod {
  
  @JSImport("handsontable/plugins/nestedRows/nestedRows", "NestedRows")
  @js.native
  open class NestedRows protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def disableCoreAPIModifiers(): Unit = js.native
    
    def enableCoreAPIModifiers(): Unit = js.native
    
    def isEnabled(): Boolean = js.native
  }
  
  type Settings = Boolean
}
