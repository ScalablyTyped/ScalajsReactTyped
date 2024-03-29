package typingsJapgolly.winrtUwp.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.facedetected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an effect that attempts to detect faces in a video stream. */
@js.native
trait FaceDetectionEffect extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_facedetected(`type`: facedetected, listener: TypedEventHandler[FaceDetectionEffect, FaceDetectedEventArgs]): Unit = js.native
  
  /** Gets or sets the time span for which face detection should be performed. */
  var desiredDetectionInterval: Double = js.native
  
  /** Gets or sets a value indicating whether face detection is enabled. */
  var enabled: Boolean = js.native
  
  /** Occurs when a face is detected. */
  def onfacedetected(ev: FaceDetectedEventArgs & WinRTEvent[FaceDetectionEffect]): Unit = js.native
  /** Occurs when a face is detected. */
  @JSName("onfacedetected")
  var onfacedetected_Original: TypedEventHandler[FaceDetectionEffect, FaceDetectedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_facedetected(`type`: facedetected, listener: TypedEventHandler[FaceDetectionEffect, FaceDetectedEventArgs]): Unit = js.native
  
  /**
    * Sets properties on the IMediaExtension .
    * @param configuration The property set.
    */
  def setProperties(configuration: IPropertySet): Unit = js.native
}
