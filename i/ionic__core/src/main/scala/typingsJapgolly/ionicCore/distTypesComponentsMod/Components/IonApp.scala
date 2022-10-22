package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonApp extends StObject {
  
  def setFocus(elements: js.Array[HTMLElement]): js.Promise[Unit]
}
object IonApp {
  
  inline def apply(setFocus: js.Array[HTMLElement] => js.Promise[Unit]): IonApp = {
    val __obj = js.Dynamic.literal(setFocus = js.Any.fromFunction1(setFocus))
    __obj.asInstanceOf[IonApp]
  }
  
  extension [Self <: IonApp](x: Self) {
    
    inline def setSetFocus(value: js.Array[HTMLElement] => js.Promise[Unit]): Self = StObject.set(x, "setFocus", js.Any.fromFunction1(value))
  }
}
