package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesComponentsCreateOverlayComponentMod.OverlayElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[OverlayType /* <: OverlayElement */] extends StObject {
  
  def create(options: Any): js.Promise[OverlayType]
}
object `5` {
  
  inline def apply[OverlayType /* <: OverlayElement */](create: Any => js.Promise[OverlayType]): `5`[OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[`5`[OverlayType]]
  }
  
  extension [Self <: `5`[?], OverlayType /* <: OverlayElement */](x: Self & `5`[OverlayType]) {
    
    inline def setCreate(value: Any => js.Promise[OverlayType]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
