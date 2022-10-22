package typingsJapgolly.winrt.Windows.UI.Core

import typingsJapgolly.winrt.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWindowSizeChangedEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var size: Size
}
object IWindowSizeChangedEventArgs {
  
  inline def apply(handled: Boolean, size: Size): IWindowSizeChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindowSizeChangedEventArgs]
  }
  
  extension [Self <: IWindowSizeChangedEventArgs](x: Self) {
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
