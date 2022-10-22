package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsBindRowsWithHeadersBindRowsWithHeadersMod {
  
  @JSImport("handsontable/plugins/bindRowsWithHeaders/bindRowsWithHeaders", "BindRowsWithHeaders")
  @js.native
  open class BindRowsWithHeaders protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def isEnabled(): Boolean = js.native
  }
  
  type Settings = Boolean
}
