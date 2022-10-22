package typingsJapgolly.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarGroupConstructorOptions extends StObject {
  
  /**
    * Items to display as a group.
    */
  var items: TouchBar
}
object TouchBarGroupConstructorOptions {
  
  inline def apply(items: TouchBar): TouchBarGroupConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarGroupConstructorOptions]
  }
  
  extension [Self <: TouchBarGroupConstructorOptions](x: Self) {
    
    inline def setItems(value: TouchBar): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
