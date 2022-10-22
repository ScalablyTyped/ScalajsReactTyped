package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParentOnMap extends StObject {
  
  def getMap(): Map_
}
object IParentOnMap {
  
  inline def apply(getMap: CallbackTo[Map_]): IParentOnMap = {
    val __obj = js.Dynamic.literal(getMap = getMap.toJsFn)
    __obj.asInstanceOf[IParentOnMap]
  }
  
  extension [Self <: IParentOnMap](x: Self) {
    
    inline def setGetMap(value: CallbackTo[Map_]): Self = StObject.set(x, "getMap", value.toJsFn)
  }
}
