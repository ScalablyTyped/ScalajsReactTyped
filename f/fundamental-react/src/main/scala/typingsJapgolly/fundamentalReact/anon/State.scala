package typingsJapgolly.fundamentalReact.anon

import typingsJapgolly.fundamentalReact.fundamentalReactStrings.error
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.information
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.success
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var state: js.UndefOr[error | warning | information | success] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object State {
  
  inline def apply(): State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setState(value: error | warning | information | success): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
