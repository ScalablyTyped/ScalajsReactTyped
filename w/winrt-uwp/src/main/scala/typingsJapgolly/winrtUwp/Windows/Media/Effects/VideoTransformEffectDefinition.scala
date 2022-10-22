package typingsJapgolly.winrtUwp.Windows.Media.Effects

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.Windows.Foundation.Size
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.MediaMirroringOptions
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.MediaRotation
import typingsJapgolly.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm
import typingsJapgolly.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the definition of a video transform effect. */
trait VideoTransformEffectDefinition extends StObject {
  
  /** Gets the activatable class ID of the video transform effect definition. */
  var activatableClassId: String
  
  /** Gets or sets the rectangle within which the video will be cropped, specified in pixels. */
  var cropRectangle: Rect
  
  /** Gets or sets the direction in which the video will be mirrored. */
  var mirror: MediaMirroringOptions
  
  /** Gets or sets the output size of the video, in pixels. */
  var outputSize: Size
  
  /** Gets or sets the color that will be used to fill pixels in the frame that are not filled with video, such as when video is letterboxed. */
  var paddingColor: Color
  
  /** Gets or sets the media processing algorithm that is used for the video transform. */
  var processingAlgorithm: MediaVideoProcessingAlgorithm
  
  /** Gets the set of properties for configuring the VideoTransformEffectDefinition object. */
  var properties: IPropertySet
  
  /** Gets or sets the angle and direction in which the video will be rotated. */
  var rotation: MediaRotation
}
object VideoTransformEffectDefinition {
  
  inline def apply(
    activatableClassId: String,
    cropRectangle: Rect,
    mirror: MediaMirroringOptions,
    outputSize: Size,
    paddingColor: Color,
    processingAlgorithm: MediaVideoProcessingAlgorithm,
    properties: IPropertySet,
    rotation: MediaRotation
  ): VideoTransformEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], cropRectangle = cropRectangle.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], outputSize = outputSize.asInstanceOf[js.Any], paddingColor = paddingColor.asInstanceOf[js.Any], processingAlgorithm = processingAlgorithm.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTransformEffectDefinition]
  }
  
  extension [Self <: VideoTransformEffectDefinition](x: Self) {
    
    inline def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    inline def setCropRectangle(value: Rect): Self = StObject.set(x, "cropRectangle", value.asInstanceOf[js.Any])
    
    inline def setMirror(value: MediaMirroringOptions): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setOutputSize(value: Size): Self = StObject.set(x, "outputSize", value.asInstanceOf[js.Any])
    
    inline def setPaddingColor(value: Color): Self = StObject.set(x, "paddingColor", value.asInstanceOf[js.Any])
    
    inline def setProcessingAlgorithm(value: MediaVideoProcessingAlgorithm): Self = StObject.set(x, "processingAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: MediaRotation): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
