package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFromJson extends StObject {
  
  def customFromJson(initValue: Any): Boolean
  
  def fromJson(initValue: Any): Unit
}
object IFromJson {
  
  inline def apply(customFromJson: Any => Boolean, fromJson: Any => Callback): IFromJson = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()))
    __obj.asInstanceOf[IFromJson]
  }
  
  extension [Self <: IFromJson](x: Self) {
    
    inline def setCustomFromJson(value: Any => Boolean): Self = StObject.set(x, "customFromJson", js.Any.fromFunction1(value))
    
    inline def setFromJson(value: Any => Callback): Self = StObject.set(x, "fromJson", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
