package typingsJapgolly.reactHtml5CameraPhoto.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactHtml5CameraPhoto.anon.Height
import typingsJapgolly.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.environment
import typingsJapgolly.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.jpg
import typingsJapgolly.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.png
import typingsJapgolly.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CameraProps_466704511 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def idealFacingMode(value: environment | user): this.type = set("idealFacingMode", value.asInstanceOf[js.Any])
  
  inline def idealResolution(value: Height): this.type = set("idealResolution", value.asInstanceOf[js.Any])
  
  inline def imageCompression(value: Double): this.type = set("imageCompression", value.asInstanceOf[js.Any])
  
  inline def imageType(value: png | jpg): this.type = set("imageType", value.asInstanceOf[js.Any])
  
  inline def isDisplayStartCameraError(value: Boolean): this.type = set("isDisplayStartCameraError", value.asInstanceOf[js.Any])
  
  inline def isFullscreen(value: Boolean): this.type = set("isFullscreen", value.asInstanceOf[js.Any])
  
  inline def isImageMirror(value: Boolean): this.type = set("isImageMirror", value.asInstanceOf[js.Any])
  
  inline def isMaxResolution(value: Boolean): this.type = set("isMaxResolution", value.asInstanceOf[js.Any])
  
  inline def isSilentMode(value: Boolean): this.type = set("isSilentMode", value.asInstanceOf[js.Any])
  
  inline def onCameraError(value: /* error */ js.Error => Callback): this.type = set("onCameraError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
  
  inline def onCameraStart(value: Callback): this.type = set("onCameraStart", value.toJsFn)
  
  inline def onCameraStop(value: Callback): this.type = set("onCameraStop", value.toJsFn)
  
  inline def onTakePhoto(value: /* dataUri */ String => Callback): this.type = set("onTakePhoto", js.Any.fromFunction1((t0: /* dataUri */ String) => value(t0).runNow()))
  
  inline def onTakePhotoAnimationDone(value: /* dataUri */ String => Callback): this.type = set("onTakePhotoAnimationDone", js.Any.fromFunction1((t0: /* dataUri */ String) => value(t0).runNow()))
  
  inline def sizeFactor(value: Double): this.type = set("sizeFactor", value.asInstanceOf[js.Any])
}
