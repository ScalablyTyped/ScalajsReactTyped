package typingsJapgolly.activexMshtml

import typingsJapgolly.activexMshtml.MSHTML.CTemplatePrinter
import typingsJapgolly.activexMshtml.MSHTML.HTMLDocument
import typingsJapgolly.activexMshtml.MSHTML.Scriptlet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("ScriptBridge.ScriptBridge")
  var ScriptBridgeDotScriptBridge: Scriptlet
  
  @JSName("TemplatePrinter.TemplatePrinter")
  var TemplatePrinterDotTemplatePrinter: CTemplatePrinter
  
  var htmlfile: HTMLDocument
}
object ActiveXObjectNameMap {
  
  inline def apply(
    ScriptBridgeDotScriptBridge: Scriptlet,
    TemplatePrinterDotTemplatePrinter: CTemplatePrinter,
    htmlfile: HTMLDocument
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(htmlfile = htmlfile.asInstanceOf[js.Any])
    __obj.updateDynamic("ScriptBridge.ScriptBridge")(ScriptBridgeDotScriptBridge.asInstanceOf[js.Any])
    __obj.updateDynamic("TemplatePrinter.TemplatePrinter")(TemplatePrinterDotTemplatePrinter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setHtmlfile(value: HTMLDocument): Self = StObject.set(x, "htmlfile", value.asInstanceOf[js.Any])
    
    inline def setScriptBridgeDotScriptBridge(value: Scriptlet): Self = StObject.set(x, "ScriptBridge.ScriptBridge", value.asInstanceOf[js.Any])
    
    inline def setTemplatePrinterDotTemplatePrinter(value: CTemplatePrinter): Self = StObject.set(x, "TemplatePrinter.TemplatePrinter", value.asInstanceOf[js.Any])
  }
}
