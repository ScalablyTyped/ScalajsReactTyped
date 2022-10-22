package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.distServicesTextServiceMod.TextService
import typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb", "CircleUpdater")
  @js.native
  open class CircleUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbCircleUpdaterMod.CircleUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "EllipseUpdater")
  @js.native
  open class EllipseUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbEllipseUpdaterMod.EllipseUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "GeometryAABBUpdater")
  @js.native
  val GeometryAABBUpdater: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services/aabb", "GeometryUpdaterFactory")
  @js.native
  val GeometryUpdaterFactory: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services/aabb", "LineUpdater")
  @js.native
  open class LineUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbLineUpdaterMod.LineUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "PathUpdater")
  @js.native
  open class PathUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbPathUpdaterMod.PathUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "PolylineUpdater")
  @js.native
  open class PolylineUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbPolylineUpdaterMod.PolylineUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "RectUpdater")
  @js.native
  open class RectUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbRectUpdaterMod.RectUpdater
  
  @JSImport("@antv/g-lite/dist/services/aabb", "TextUpdater")
  @js.native
  open class TextUpdater protected ()
    extends typingsJapgolly.antvGLite.distServicesAabbTextUpdaterMod.TextUpdater {
    def this(textService: TextService) = this()
  }
}
