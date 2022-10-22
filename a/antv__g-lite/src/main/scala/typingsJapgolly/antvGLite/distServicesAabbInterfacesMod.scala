package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Depth
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbInterfacesMod {
  
  trait GeometryAABBUpdater[T /* <: ParsedBaseStyleProps */] extends StObject {
    
    def update(parsedStyle: T, `object`: DisplayObject[Any, Any]): Depth
  }
  object GeometryAABBUpdater {
    
    @JSImport("@antv/g-lite/dist/services/aabb/interfaces", "GeometryAABBUpdater")
    @js.native
    val ^ : DefinedToken = js.native
    
    extension [Self <: GeometryAABBUpdater[?], T /* <: ParsedBaseStyleProps */](x: Self & GeometryAABBUpdater[T]) {
      
      inline def setUpdate(value: (T, DisplayObject[Any, Any]) => Depth): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  @JSImport("@antv/g-lite/dist/services/aabb/interfaces", "GeometryUpdaterFactory")
  @js.native
  val GeometryUpdaterFactory: DefinedToken = js.native
}
