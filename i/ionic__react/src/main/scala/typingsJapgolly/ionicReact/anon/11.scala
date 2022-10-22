package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesHooksUseOverlayMod.OverlayBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11`[OptionsType, OverlayType /* <: OverlayBase */] extends StObject {
  
  def create(options: OptionsType): js.Promise[OverlayType]
}
object `11` {
  
  inline def apply[OptionsType, OverlayType /* <: OverlayBase */](create: OptionsType => js.Promise[OverlayType]): `11`[OptionsType, OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[`11`[OptionsType, OverlayType]]
  }
  
  extension [Self <: `11`[?, ?], OptionsType, OverlayType /* <: OverlayBase */](x: Self & (`11`[OptionsType, OverlayType])) {
    
    inline def setCreate(value: OptionsType => js.Promise[OverlayType]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
