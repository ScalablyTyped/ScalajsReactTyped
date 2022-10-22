package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEPhotoOverlayViewer extends StObject {
  
  /**
    * Enters the given photo overlay object, exiting any other currently active photo overlay. 
    * If the argument is null, then any currently active photo overlay is exited and normal global navigation is enabled.
    */
  def setPhotoOverlay(photoOverlay: KmlPhotoOverlay): Unit
}
object GEPhotoOverlayViewer {
  
  inline def apply(setPhotoOverlay: KmlPhotoOverlay => Callback): GEPhotoOverlayViewer = {
    val __obj = js.Dynamic.literal(setPhotoOverlay = js.Any.fromFunction1((t0: KmlPhotoOverlay) => setPhotoOverlay(t0).runNow()))
    __obj.asInstanceOf[GEPhotoOverlayViewer]
  }
  
  extension [Self <: GEPhotoOverlayViewer](x: Self) {
    
    inline def setSetPhotoOverlay(value: KmlPhotoOverlay => Callback): Self = StObject.set(x, "setPhotoOverlay", js.Any.fromFunction1((t0: KmlPhotoOverlay) => value(t0).runNow()))
  }
}
