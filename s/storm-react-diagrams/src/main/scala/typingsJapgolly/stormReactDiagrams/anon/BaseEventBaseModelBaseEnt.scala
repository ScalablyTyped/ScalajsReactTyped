package typingsJapgolly.stormReactDiagrams.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stormReactDiagrams.distSrcBaseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.distSrcBaseEntityMod.BaseListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/BaseModel.BaseModel<storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEntity<storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseListener<any>>, storm-react-diagrams.storm-react-diagrams/dist/src/models/BaseModel.BaseModelListener>> & {  isSelected :boolean} */
trait BaseEventBaseModelBaseEnt extends StObject {
  
  var entity: BaseEntity[BaseListener[Any]]
  
  var firing: Boolean
  
  var id: String
  
  var isSelected: Boolean
  
  def stopPropagation(): Any
}
object BaseEventBaseModelBaseEnt {
  
  inline def apply(
    entity: BaseEntity[BaseListener[Any]],
    firing: Boolean,
    id: String,
    isSelected: Boolean,
    stopPropagation: CallbackTo[Any]
  ): BaseEventBaseModelBaseEnt = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn)
    __obj.asInstanceOf[BaseEventBaseModelBaseEnt]
  }
  
  extension [Self <: BaseEventBaseModelBaseEnt](x: Self) {
    
    inline def setEntity(value: BaseEntity[BaseListener[Any]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: CallbackTo[Any]): Self = StObject.set(x, "stopPropagation", value.toJsFn)
  }
}
