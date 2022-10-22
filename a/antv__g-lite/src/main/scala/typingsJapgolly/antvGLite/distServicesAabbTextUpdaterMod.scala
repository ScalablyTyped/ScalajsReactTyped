package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Depth
import typingsJapgolly.antvGLite.anon.OffsetX
import typingsJapgolly.antvGLite.anon.OffsetY
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distDisplayObjectsTextMod.ParsedTextStyleProps
import typingsJapgolly.antvGLite.distServicesAabbInterfacesMod.GeometryAABBUpdater
import typingsJapgolly.antvGLite.distServicesTextServiceMod.TextService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesAabbTextUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/TextUpdater", "TextUpdater")
  @js.native
  open class TextUpdater protected ()
    extends StObject
       with GeometryAABBUpdater[ParsedTextStyleProps] {
    def this(textService: TextService) = this()
    
    /* private */ var isReadyToMeasure: Any = js.native
    
    /* private */ var textService: Any = js.native
    
    /* CompleteClass */
    override def update(parsedStyle: ParsedTextStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
    def update(
      parsedStyle: ParsedTextStyleProps,
      `object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]
    ): OffsetX | OffsetY = js.native
  }
}
