package typingsJapgolly.hippyReact.mod

import typingsJapgolly.hippyReact.anon.Height
import typingsJapgolly.hippyReact.hippyReactStrings.screen
import typingsJapgolly.hippyReact.hippyReactStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  def get(dim: window | screen): Height
}
object Dimensions {
  
  @JSImport("@hippy/react", "Dimensions")
  @js.native
  val ^ : Dimensions = js.native
  
  extension [Self <: Dimensions](x: Self) {
    
    inline def setGet(value: window | screen => Height): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
