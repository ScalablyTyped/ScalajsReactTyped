package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Depth
import typingsJapgolly.antvGLite.anon.Height
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distDisplayObjectsLineMod.ParsedLineStyleProps
import typingsJapgolly.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbLineUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/LineUpdater", "LineUpdater")
  @js.native
  open class LineUpdater ()
    extends StObject
       with GeometryAABBUpdater[ParsedLineStyleProps] {
    
    def update(parsedStyle: ParsedLineStyleProps): Height = js.native
    /* CompleteClass */
    override def update(parsedStyle: ParsedLineStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
  }
}
