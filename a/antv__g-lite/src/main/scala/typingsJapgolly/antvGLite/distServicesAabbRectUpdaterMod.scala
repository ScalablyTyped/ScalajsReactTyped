package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Depth
import typingsJapgolly.antvGLite.anon.Height
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distDisplayObjectsImageMod.ParsedImageStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsMod.Group
import typingsJapgolly.antvGLite.distDisplayObjectsMod.Image
import typingsJapgolly.antvGLite.distDisplayObjectsMod.Rect
import typingsJapgolly.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbRectUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/RectUpdater", "RectUpdater")
  @js.native
  open class RectUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedImageStyleProps] {
    
    /* CompleteClass */
    override def update(parsedStyle: ParsedImageStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
    def update(parsedStyle: ParsedImageStyleProps, `object`: Group): Height = js.native
    def update(parsedStyle: ParsedImageStyleProps, `object`: Image): Height = js.native
    def update(parsedStyle: ParsedImageStyleProps, `object`: Rect): Height = js.native
  }
}
