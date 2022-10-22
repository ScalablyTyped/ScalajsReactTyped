package typingsJapgolly.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.GEPhotoOverlayViewer")
@js.native
open class GEPhotoOverlayViewer ()
  extends StObject
     with typingsJapgolly.googleEarth.google.earth.GEPhotoOverlayViewer {
  
  /**
    * Enters the given photo overlay object, exiting any other currently active photo overlay. 
    * If the argument is null, then any currently active photo overlay is exited and normal global navigation is enabled.
    */
  /* CompleteClass */
  override def setPhotoOverlay(photoOverlay: typingsJapgolly.googleEarth.google.earth.KmlPhotoOverlay): Unit = js.native
}
