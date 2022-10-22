package typingsJapgolly.stormReactDiagrams.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stormReactDiagrams.distSrcBaseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.distSrcBaseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.stormReactDiagramsInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/defaults/models/DefaultLinkModel.DefaultLinkModel> & {  width :0 | number} */
trait BaseEventDefaultLinkModelEntity extends StObject {
  
  var entity: BaseEntity[BaseListener[Any]]
  
  var firing: Boolean
  
  var id: String
  
  def stopPropagation(): Any
  
  var width: `0` | Double
}
object BaseEventDefaultLinkModelEntity {
  
  inline def apply(
    entity: BaseEntity[BaseListener[Any]],
    firing: Boolean,
    id: String,
    stopPropagation: CallbackTo[Any],
    width: `0` | Double
  ): BaseEventDefaultLinkModelEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEventDefaultLinkModelEntity]
  }
  
  extension [Self <: BaseEventDefaultLinkModelEntity](x: Self) {
    
    inline def setEntity(value: BaseEntity[BaseListener[Any]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: CallbackTo[Any]): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    
    inline def setWidth(value: `0` | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
