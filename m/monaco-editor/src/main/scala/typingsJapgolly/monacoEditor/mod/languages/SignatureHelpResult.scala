package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.Callback
import typingsJapgolly.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpResult
  extends StObject
     with IDisposable {
  
  var value: SignatureHelp
}
object SignatureHelpResult {
  
  inline def apply(dispose: Callback, value: SignatureHelp): SignatureHelpResult = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpResult]
  }
  
  extension [Self <: SignatureHelpResult](x: Self) {
    
    inline def setValue(value: SignatureHelp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
