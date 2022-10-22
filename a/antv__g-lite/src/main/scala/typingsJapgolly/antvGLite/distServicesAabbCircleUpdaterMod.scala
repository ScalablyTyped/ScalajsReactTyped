package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Depth
import typingsJapgolly.antvGLite.anon.Height
import typingsJapgolly.antvGLite.distDisplayObjectsCircleMod.Circle
import typingsJapgolly.antvGLite.distDisplayObjectsCircleMod.ParsedCircleStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbCircleUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/CircleUpdater", "CircleUpdater")
  @js.native
  open class CircleUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedCircleStyleProps] {
    
    def update(parsedStyle: ParsedCircleStyleProps, `object`: Circle): Height = js.native
    /* CompleteClass */
    override def update(parsedStyle: ParsedCircleStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
  }
}
