package typingsJapgolly.testingLibraryUserEvent.anon

import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var result: ReturnType[js.Function1[/* element */ this.type, js.UndefOr[PointerEvents]]]
}
object Result {
  
  inline def apply(result: ReturnType[js.Function1[Result, js.UndefOr[PointerEvents]]]): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setResult(value: ReturnType[js.Function1[Result, js.UndefOr[PointerEvents]]]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
