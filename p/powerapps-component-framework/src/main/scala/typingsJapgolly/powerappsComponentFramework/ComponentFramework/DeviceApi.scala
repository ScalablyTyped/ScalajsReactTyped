package typingsJapgolly.powerappsComponentFramework.ComponentFramework

import typingsJapgolly.powerappsComponentFramework.anon.Accuracy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper of Device API interface
  */
object DeviceApi {
  
  /**
    * Interface of input argument 'options' in context.device.captureImage
    */
  trait CaptureImageOptions extends StObject {
    
    /**
      * Indicates whether to edit the image before saving.
      */
    var allowEdit: Boolean
    
    /**
      * Height of the image to capture.
      */
    var height: Double
    
    /**
      * Indicates whether to capture image using the front camera of the device.
      */
    var preferFrontCamera: Boolean
    
    /**
      * Quality of the image file in percentage.
      */
    var quality: Double
    
    /**
      * Width of the image to capture.
      */
    var width: Double
  }
  object CaptureImageOptions {
    
    inline def apply(allowEdit: Boolean, height: Double, preferFrontCamera: Boolean, quality: Double, width: Double): CaptureImageOptions = {
      val __obj = js.Dynamic.literal(allowEdit = allowEdit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], preferFrontCamera = preferFrontCamera.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureImageOptions]
    }
    
    extension [Self <: CaptureImageOptions](x: Self) {
      
      inline def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPreferFrontCamera(value: Boolean): Self = StObject.set(x, "preferFrontCamera", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface of input argument 'pickupFileOption' in context.device.pickupFile
    */
  trait PickFileOptions extends StObject {
    
    /**
      * Image file types to select. Valid values are "audio", "video", or "image".
      */
    var accept: String
    
    /**
      * Indicates whether to allow selecting multiple files.
      */
    var allowMultipleFiles: Boolean
    
    /**
      * Maximum size of the files(s) to be selected.
      */
    var maximumAllowedFileSize: Double
  }
  object PickFileOptions {
    
    inline def apply(accept: String, allowMultipleFiles: Boolean, maximumAllowedFileSize: Double): PickFileOptions = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], allowMultipleFiles = allowMultipleFiles.asInstanceOf[js.Any], maximumAllowedFileSize = maximumAllowedFileSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickFileOptions]
    }
    
    extension [Self <: PickFileOptions](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleFiles(value: Boolean): Self = StObject.set(x, "allowMultipleFiles", value.asInstanceOf[js.Any])
      
      inline def setMaximumAllowedFileSize(value: Double): Self = StObject.set(x, "maximumAllowedFileSize", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface of return geological information in context.device.getCurrentPosition
    */
  trait Position extends StObject {
    
    /**
      * Contains a set of geographic coordinates along with associated accuracy as well as a set of other optional attributes such as altitude and speed.
      */
    var coords: Accuracy
    
    /**
      * Represents the time when the object was acquired and is represented as DOMTimeStamp.
      */
    var timestamp: js.Date
  }
  object Position {
    
    inline def apply(coords: Accuracy, timestamp: js.Date): Position = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setCoords(value: Accuracy): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
