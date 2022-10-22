package typingsJapgolly.hippyReact.mod

import typingsJapgolly.hippyReact.hippyReactStrings.android
import typingsJapgolly.hippyReact.hippyReactStrings.ios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platform extends StObject {
  
  var OS: ios | android
}
object Platform {
  
  @JSImport("@hippy/react", "Platform")
  @js.native
  val ^ : Platform = js.native
  
  extension [Self <: Platform](x: Self) {
    
    inline def setOS(value: ios | android): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
  }
}
