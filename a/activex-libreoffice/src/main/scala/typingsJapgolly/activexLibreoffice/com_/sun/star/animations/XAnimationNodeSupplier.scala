package typingsJapgolly.activexLibreoffice.com_.sun.star.animations

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAnimationNodeSupplier extends StObject {
  
  val AnimationNode: XAnimationNode
  
  def getAnimationNode(): XAnimationNode
}
object XAnimationNodeSupplier {
  
  inline def apply(AnimationNode: XAnimationNode, getAnimationNode: CallbackTo[XAnimationNode]): XAnimationNodeSupplier = {
    val __obj = js.Dynamic.literal(AnimationNode = AnimationNode.asInstanceOf[js.Any], getAnimationNode = getAnimationNode.toJsFn)
    __obj.asInstanceOf[XAnimationNodeSupplier]
  }
  
  extension [Self <: XAnimationNodeSupplier](x: Self) {
    
    inline def setAnimationNode(value: XAnimationNode): Self = StObject.set(x, "AnimationNode", value.asInstanceOf[js.Any])
    
    inline def setGetAnimationNode(value: CallbackTo[XAnimationNode]): Self = StObject.set(x, "getAnimationNode", value.toJsFn)
  }
}
