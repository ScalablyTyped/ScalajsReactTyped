package typingsJapgolly.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.yandexMaps.mod.router.Editor
import typingsJapgolly.yandexMaps.mod.router.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofrouter extends StObject {
  
  var Editor: Instantiable0[typingsJapgolly.yandexMaps.mod.router.Editor]
  
  var Route: Instantiable0[typingsJapgolly.yandexMaps.mod.router.Route]
}
object Typeofrouter {
  
  inline def apply(Editor: Instantiable0[Editor], Route: Instantiable0[Route]): Typeofrouter = {
    val __obj = js.Dynamic.literal(Editor = Editor.asInstanceOf[js.Any], Route = Route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofrouter]
  }
  
  extension [Self <: Typeofrouter](x: Self) {
    
    inline def setEditor(value: Instantiable0[Editor]): Self = StObject.set(x, "Editor", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: Instantiable0[Route]): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
  }
}
