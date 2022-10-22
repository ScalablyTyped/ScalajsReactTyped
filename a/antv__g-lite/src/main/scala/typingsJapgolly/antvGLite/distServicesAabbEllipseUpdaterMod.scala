package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Depth
import typingsJapgolly.antvGLite.anon.Height
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distDisplayObjectsEllipseMod.Ellipse
import typingsJapgolly.antvGLite.distDisplayObjectsEllipseMod.ParsedEllipseStyleProps
import typingsJapgolly.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbEllipseUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/EllipseUpdater", "EllipseUpdater")
  @js.native
  open class EllipseUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedEllipseStyleProps] {
    
    /* CompleteClass */
    override def update(parsedStyle: ParsedEllipseStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
    def update(parsedStyle: ParsedEllipseStyleProps, `object`: Ellipse): Height = js.native
  }
}
