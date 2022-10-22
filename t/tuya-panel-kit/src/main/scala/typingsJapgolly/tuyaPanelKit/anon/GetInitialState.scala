package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInitialState extends StObject {
  
  def getInitialState(): PromiseLike[js.UndefOr[PartialPickReadonlykeystrHistory]]
}
object GetInitialState {
  
  inline def apply(getInitialState: CallbackTo[PromiseLike[js.UndefOr[PartialPickReadonlykeystrHistory]]]): GetInitialState = {
    val __obj = js.Dynamic.literal(getInitialState = getInitialState.toJsFn)
    __obj.asInstanceOf[GetInitialState]
  }
  
  extension [Self <: GetInitialState](x: Self) {
    
    inline def setGetInitialState(value: CallbackTo[PromiseLike[js.UndefOr[PartialPickReadonlykeystrHistory]]]): Self = StObject.set(x, "getInitialState", value.toJsFn)
  }
}
