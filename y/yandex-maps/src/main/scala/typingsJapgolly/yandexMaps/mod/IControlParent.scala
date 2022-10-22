package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IControlParent
  extends StObject
     with IParentOnMap {
  
  def getChildElement(child: IControl): js.Promise[HTMLElement]
}
object IControlParent {
  
  inline def apply(getChildElement: IControl => js.Promise[HTMLElement], getMap: CallbackTo[Map_]): IControlParent = {
    val __obj = js.Dynamic.literal(getChildElement = js.Any.fromFunction1(getChildElement), getMap = getMap.toJsFn)
    __obj.asInstanceOf[IControlParent]
  }
  
  extension [Self <: IControlParent](x: Self) {
    
    inline def setGetChildElement(value: IControl => js.Promise[HTMLElement]): Self = StObject.set(x, "getChildElement", js.Any.fromFunction1(value))
  }
}
