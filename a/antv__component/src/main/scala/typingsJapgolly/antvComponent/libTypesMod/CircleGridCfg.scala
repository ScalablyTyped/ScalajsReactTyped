package typingsJapgolly.antvComponent.libTypesMod

import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import typingsJapgolly.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleGridCfg
  extends StObject
     with GridBaseCfg {
  
  /**
    * 中心点
    * @type {Point}
    */
  var center: Point
}
object CircleGridCfg {
  
  inline def apply(center: Point, container: IGroup, items: js.Array[GridItem]): CircleGridCfg = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleGridCfg]
  }
  
  extension [Self <: CircleGridCfg](x: Self) {
    
    inline def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
  }
}
