package typingsJapgolly.ol

import typingsJapgolly.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderBoxMod {
  
  @JSImport("ol/render/Box", JSImport.Default)
  @js.native
  open class default protected () extends RenderBox {
    def this(className: String) = this()
  }
  
  @js.native
  trait RenderBox
    extends typingsJapgolly.ol.disposableMod.default {
    
    /**
      * Creates or updates the cached geometry.
      */
    def createOrUpdateGeometry(): Unit = js.native
    
    def getGeometry(): typingsJapgolly.ol.geomPolygonMod.default = js.native
    
    def setMap(map: typingsJapgolly.ol.pluggableMapMod.default): Unit = js.native
    
    def setPixels(startPixel: Pixel, endPixel: Pixel): Unit = js.native
  }
}
