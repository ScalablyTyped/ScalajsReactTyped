package typingsJapgolly.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.yandexMaps.mod.Map_
import typingsJapgolly.yandexMaps.mod.map.margin.Accessor
import typingsJapgolly.yandexMaps.mod.map.margin.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofmargin extends StObject {
  
  var Accessor: Instantiable1[/* screenArea */ js.Object, typingsJapgolly.yandexMaps.mod.map.margin.Accessor]
  
  var Manager: Instantiable1[/* map */ Map_, typingsJapgolly.yandexMaps.mod.map.margin.Manager]
}
object Typeofmargin {
  
  inline def apply(
    Accessor: Instantiable1[/* screenArea */ js.Object, Accessor],
    Manager: Instantiable1[/* map */ Map_, Manager]
  ): Typeofmargin = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Manager = Manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmargin]
  }
  
  extension [Self <: Typeofmargin](x: Self) {
    
    inline def setAccessor(value: Instantiable1[/* screenArea */ js.Object, Accessor]): Self = StObject.set(x, "Accessor", value.asInstanceOf[js.Any])
    
    inline def setManager(value: Instantiable1[/* map */ Map_, Manager]): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
  }
}
