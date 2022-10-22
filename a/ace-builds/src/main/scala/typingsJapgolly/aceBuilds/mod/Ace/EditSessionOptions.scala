package typingsJapgolly.aceBuilds.mod.Ace

import typingsJapgolly.aceBuilds.aceBuildsStrings.auto
import typingsJapgolly.aceBuilds.aceBuildsStrings.code
import typingsJapgolly.aceBuilds.aceBuildsStrings.free
import typingsJapgolly.aceBuilds.aceBuildsStrings.manual
import typingsJapgolly.aceBuilds.aceBuildsStrings.markbegin
import typingsJapgolly.aceBuilds.aceBuildsStrings.markbeginend
import typingsJapgolly.aceBuilds.aceBuildsStrings.off
import typingsJapgolly.aceBuilds.aceBuildsStrings.printmargin_
import typingsJapgolly.aceBuilds.aceBuildsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditSessionOptions extends StObject {
  
  var firstLineNumber: Double
  
  var foldStyle: markbegin | markbeginend | manual
  
  var indentedSoftWrap: Boolean
  
  var mode: String
  
  var navigateWithinSoftTabs: Boolean
  
  var newLineMode: NewLineMode
  
  var overwrite: Boolean
  
  var tabSize: Double
  
  var useSoftTabs: Boolean
  
  var useWorker: Boolean
  
  var wrap: off | free | printmargin_ | Boolean | Double
  
  var wrapMethod: code | text | auto
}
object EditSessionOptions {
  
  inline def apply(
    firstLineNumber: Double,
    foldStyle: markbegin | markbeginend | manual,
    indentedSoftWrap: Boolean,
    mode: String,
    navigateWithinSoftTabs: Boolean,
    newLineMode: NewLineMode,
    overwrite: Boolean,
    tabSize: Double,
    useSoftTabs: Boolean,
    useWorker: Boolean,
    wrap: off | free | printmargin_ | Boolean | Double,
    wrapMethod: code | text | auto
  ): EditSessionOptions = {
    val __obj = js.Dynamic.literal(firstLineNumber = firstLineNumber.asInstanceOf[js.Any], foldStyle = foldStyle.asInstanceOf[js.Any], indentedSoftWrap = indentedSoftWrap.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigateWithinSoftTabs = navigateWithinSoftTabs.asInstanceOf[js.Any], newLineMode = newLineMode.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], useSoftTabs = useSoftTabs.asInstanceOf[js.Any], useWorker = useWorker.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapMethod = wrapMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSessionOptions]
  }
  
  extension [Self <: EditSessionOptions](x: Self) {
    
    inline def setFirstLineNumber(value: Double): Self = StObject.set(x, "firstLineNumber", value.asInstanceOf[js.Any])
    
    inline def setFoldStyle(value: markbegin | markbeginend | manual): Self = StObject.set(x, "foldStyle", value.asInstanceOf[js.Any])
    
    inline def setIndentedSoftWrap(value: Boolean): Self = StObject.set(x, "indentedSoftWrap", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNavigateWithinSoftTabs(value: Boolean): Self = StObject.set(x, "navigateWithinSoftTabs", value.asInstanceOf[js.Any])
    
    inline def setNewLineMode(value: NewLineMode): Self = StObject.set(x, "newLineMode", value.asInstanceOf[js.Any])
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setUseSoftTabs(value: Boolean): Self = StObject.set(x, "useSoftTabs", value.asInstanceOf[js.Any])
    
    inline def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
    
    inline def setWrap(value: off | free | printmargin_ | Boolean | Double): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapMethod(value: code | text | auto): Self = StObject.set(x, "wrapMethod", value.asInstanceOf[js.Any])
  }
}
