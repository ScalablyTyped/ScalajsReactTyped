package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableView
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNode
  extends StObject
     with ScrollableWrapper {
  
  def getNode(): ScrollableView
}
object GetNode {
  
  inline def apply(getNode: CallbackTo[ScrollableView]): GetNode = {
    val __obj = js.Dynamic.literal(getNode = getNode.toJsFn)
    __obj.asInstanceOf[GetNode]
  }
  
  extension [Self <: GetNode](x: Self) {
    
    inline def setGetNode(value: CallbackTo[ScrollableView]): Self = StObject.set(x, "getNode", value.toJsFn)
  }
}
