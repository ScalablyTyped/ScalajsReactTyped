package typingsJapgolly.stormReactDiagrams.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stormReactDiagrams.distSrcBaseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.distSrcBaseEntityMod.BaseListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/DiagramModel.DiagramModel> & {  offsetX :number,   offsetY :number} */
trait BaseEventDiagramModeloffs extends StObject {
  
  var entity: BaseEntity[BaseListener[Any]]
  
  var firing: Boolean
  
  var id: String
  
  var offsetX: Double
  
  var offsetY: Double
  
  def stopPropagation(): Any
}
object BaseEventDiagramModeloffs {
  
  inline def apply(
    entity: BaseEntity[BaseListener[Any]],
    firing: Boolean,
    id: String,
    offsetX: Double,
    offsetY: Double,
    stopPropagation: CallbackTo[Any]
  ): BaseEventDiagramModeloffs = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn)
    __obj.asInstanceOf[BaseEventDiagramModeloffs]
  }
  
  extension [Self <: BaseEventDiagramModeloffs](x: Self) {
    
    inline def setEntity(value: BaseEntity[BaseListener[Any]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: CallbackTo[Any]): Self = StObject.set(x, "stopPropagation", value.toJsFn)
  }
}
