package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tiledrendering {
  
  /** tiled rendering using a system-specific handle to a window */
  trait XTiledRenderable
    extends StObject
       with XInterface {
    
    /**
      * paint a tile to a system-specific window
      * @param Parent a system-specific handle to a window.  You must check the machine ID and the process ID. ;  WIN32: HWND. ;  WIN16: HWND. ;   JAVA: global
      * @param nOutputWidth horizontal output parameter measured in pixels.
      * @param nOutputHeight vertical output parameter measured in pixels.
      * @param nTilePosX logical X position of the top left corner of the rendered rectangle, in TWIPs.
      * @param nTilePosY logical Y position of the top left corner of the rendered rectangle, in TWIPs.
      * @param nTileWidth logical width of the rendered rectangle, in TWIPs.
      * @param nTileHeight logical height of the rendered rectangle, in TWIPs.
      * @since LibreOffice 5.0
      */
    def paintTile(
      Parent: Any,
      nOutputWidth: Double,
      nOutputHeight: Double,
      nTilePosX: Double,
      nTilePosY: Double,
      nTileWidth: Double,
      nTileHeight: Double
    ): Unit
  }
  object XTiledRenderable {
    
    inline def apply(
      acquire: Callback,
      paintTile: (Any, Double, Double, Double, Double, Double, Double) => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XTiledRenderable = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, paintTile = js.Any.fromFunction7((t0: Any, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double) => (paintTile(t0, t1, t2, t3, t4, t5, t6)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XTiledRenderable]
    }
    
    extension [Self <: XTiledRenderable](x: Self) {
      
      inline def setPaintTile(value: (Any, Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "paintTile", js.Any.fromFunction7((t0: Any, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    }
  }
}
