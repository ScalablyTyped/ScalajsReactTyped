package typingsJapgolly.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowEventArgs extends StObject {
  
  var handled: Boolean
}
object ICoreWindowEventArgs {
  
  inline def apply(handled: Boolean): ICoreWindowEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreWindowEventArgs]
  }
  
  extension [Self <: ICoreWindowEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
