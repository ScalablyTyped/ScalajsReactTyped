package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeStatic extends StObject {
  
  def create(): YogaNode
  
  def createDefault(): YogaNode
  
  def createWithConfig(config: YogaConfig): YogaNode
  
  def destroy(node: YogaNode): Any
}
object NodeStatic {
  
  inline def apply(
    create: CallbackTo[YogaNode],
    createDefault: CallbackTo[YogaNode],
    createWithConfig: YogaConfig => YogaNode,
    destroy: YogaNode => Any
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(create = create.toJsFn, createDefault = createDefault.toJsFn, createWithConfig = js.Any.fromFunction1(createWithConfig), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[NodeStatic]
  }
  
  extension [Self <: NodeStatic](x: Self) {
    
    inline def setCreate(value: CallbackTo[YogaNode]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setCreateDefault(value: CallbackTo[YogaNode]): Self = StObject.set(x, "createDefault", value.toJsFn)
    
    inline def setCreateWithConfig(value: YogaConfig => YogaNode): Self = StObject.set(x, "createWithConfig", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: YogaNode => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
  }
}
