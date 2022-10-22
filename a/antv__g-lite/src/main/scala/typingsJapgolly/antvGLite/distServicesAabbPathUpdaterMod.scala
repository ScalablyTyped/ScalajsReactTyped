package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Depth
import typingsJapgolly.antvGLite.anon.Height
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distDisplayObjectsPathMod.ParsedPathStyleProps
import typingsJapgolly.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbPathUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/PathUpdater", "PathUpdater")
  @js.native
  open class PathUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedPathStyleProps] {
    
    def update(parsedStyle: ParsedPathStyleProps): Height = js.native
    /* CompleteClass */
    override def update(parsedStyle: ParsedPathStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
  }
}
