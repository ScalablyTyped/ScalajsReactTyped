package typingsJapgolly.reactNavigationNative.anon

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactNavigationNative.libTypescriptSrcUseScrollToTopMod.ScrollableWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScrollResponder
  extends StObject
     with ScrollableWrapper {
  
  def getScrollResponder(): Node
}
object GetScrollResponder {
  
  inline def apply(getScrollResponder: CallbackTo[Node]): GetScrollResponder = {
    val __obj = js.Dynamic.literal(getScrollResponder = getScrollResponder.toJsFn)
    __obj.asInstanceOf[GetScrollResponder]
  }
  
  extension [Self <: GetScrollResponder](x: Self) {
    
    inline def setGetScrollResponder(value: CallbackTo[Node]): Self = StObject.set(x, "getScrollResponder", value.toJsFn)
  }
}
