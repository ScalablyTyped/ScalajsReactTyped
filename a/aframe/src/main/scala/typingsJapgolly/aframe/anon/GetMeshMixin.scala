package typingsJapgolly.aframe.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMeshMixin extends StObject {
  
  def getMeshMixin(): DefaultComponents
  
  var primitives: ObjectMap[Entity[ObjectMap[Component[Any, System[Any]]]]]
}
object GetMeshMixin {
  
  inline def apply(
    getMeshMixin: CallbackTo[DefaultComponents],
    primitives: ObjectMap[Entity[ObjectMap[Component[Any, System[Any]]]]]
  ): GetMeshMixin = {
    val __obj = js.Dynamic.literal(getMeshMixin = getMeshMixin.toJsFn, primitives = primitives.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeshMixin]
  }
  
  extension [Self <: GetMeshMixin](x: Self) {
    
    inline def setGetMeshMixin(value: CallbackTo[DefaultComponents]): Self = StObject.set(x, "getMeshMixin", value.toJsFn)
    
    inline def setPrimitives(value: ObjectMap[Entity[ObjectMap[Component[Any, System[Any]]]]]): Self = StObject.set(x, "primitives", value.asInstanceOf[js.Any])
  }
}
