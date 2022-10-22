package typingsJapgolly.ol

import typingsJapgolly.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasPolygonBuilderMod {
  
  @JSImport("ol/render/canvas/PolygonBuilder", JSImport.Default)
  @js.native
  open class default protected () extends CanvasPolygonBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait CanvasPolygonBuilder
    extends typingsJapgolly.ol.renderCanvasBuilderMod.default
}
