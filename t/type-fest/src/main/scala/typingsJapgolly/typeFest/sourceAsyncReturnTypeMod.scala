package typingsJapgolly.typeFest

import typingsJapgolly.std.Awaited
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceAsyncReturnTypeMod {
  
  @js.native
  trait AsyncFunction extends StObject {
    
    def apply(args: Any*): js.Promise[Any] = js.native
  }
  
  type AsyncReturnType[Target /* <: AsyncFunction */] = Awaited[ReturnType[Target]]
}
