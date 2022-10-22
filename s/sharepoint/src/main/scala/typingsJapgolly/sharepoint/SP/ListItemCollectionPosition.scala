package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemCollectionPosition
  extends StObject
     with ClientValueObject {
  
  def get_pagingInfo(): String
  
  def set_pagingInfo(value: String): Unit
}
object ListItemCollectionPosition {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_pagingInfo: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_pagingInfo: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ListItemCollectionPosition = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_pagingInfo = get_pagingInfo.toJsFn, get_typeId = get_typeId.toJsFn, set_pagingInfo = js.Any.fromFunction1((t0: String) => set_pagingInfo(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ListItemCollectionPosition]
  }
  
  extension [Self <: ListItemCollectionPosition](x: Self) {
    
    inline def setGet_pagingInfo(value: CallbackTo[String]): Self = StObject.set(x, "get_pagingInfo", value.toJsFn)
    
    inline def setSet_pagingInfo(value: String => Callback): Self = StObject.set(x, "set_pagingInfo", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
