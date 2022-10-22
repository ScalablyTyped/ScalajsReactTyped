package typingsJapgolly.handsontable

import org.scalajs.dom.Blob
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsExportFileExportFileMod {
  
  @JSImport("handsontable/plugins/exportFile/exportFile", "ExportFile")
  @js.native
  open class ExportFile protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def downloadFile(format: String): Unit = js.native
    def downloadFile(format: String, options: js.Object): Unit = js.native
    
    def exportAsBlob(format: String): Blob = js.native
    def exportAsBlob(format: String, options: js.Object): Blob = js.native
    
    def exportAsString(format: String): String = js.native
    def exportAsString(format: String, options: js.Object): String = js.native
    
    def isEnabled(): Boolean = js.native
  }
  
  type Settings = Boolean
}
