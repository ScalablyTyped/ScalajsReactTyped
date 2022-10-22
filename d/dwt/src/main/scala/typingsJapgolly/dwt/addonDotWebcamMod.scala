package typingsJapgolly.dwt

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCameraControlProperty
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode
import typingsJapgolly.dwt.webTwainMod.WebTwain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonDotWebcamMod {
  
  trait CameraControlProperty extends StObject {
    
    /**
      * Return whether the property is set autmatically or not.
      */
    def GetIfAuto(): Boolean
    
    /**
      * Return the value of the property.
      */
    def GetValue(): Double
  }
  object CameraControlProperty {
    
    inline def apply(GetIfAuto: CallbackTo[Boolean], GetValue: CallbackTo[Double]): CameraControlProperty = {
      val __obj = js.Dynamic.literal(GetIfAuto = GetIfAuto.toJsFn, GetValue = GetValue.toJsFn)
      __obj.asInstanceOf[CameraControlProperty]
    }
    
    extension [Self <: CameraControlProperty](x: Self) {
      
      inline def setGetIfAuto(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetIfAuto", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetValue", value.toJsFn)
    }
  }
  
  trait CameraControlPropertyExtra extends StObject {
    
    /**
      * Return the default value of the property.
      */
    def GetDefaultValue(): Double
    
    /**
      * Return whether the property is set autmatically or not.
      */
    def GetIfAuto(): Boolean
    
    /**
      * Return the maximum value of the property.
      */
    def GetMaxValue(): Double
    
    /**
      * Return the minimum value of the property.
      */
    def GetMinValue(): Double
    
    /**
      * Return the smallest increment by which the property can change.
      */
    def GetSteppingDelta(): Double
  }
  object CameraControlPropertyExtra {
    
    inline def apply(
      GetDefaultValue: CallbackTo[Double],
      GetIfAuto: CallbackTo[Boolean],
      GetMaxValue: CallbackTo[Double],
      GetMinValue: CallbackTo[Double],
      GetSteppingDelta: CallbackTo[Double]
    ): CameraControlPropertyExtra = {
      val __obj = js.Dynamic.literal(GetDefaultValue = GetDefaultValue.toJsFn, GetIfAuto = GetIfAuto.toJsFn, GetMaxValue = GetMaxValue.toJsFn, GetMinValue = GetMinValue.toJsFn, GetSteppingDelta = GetSteppingDelta.toJsFn)
      __obj.asInstanceOf[CameraControlPropertyExtra]
    }
    
    extension [Self <: CameraControlPropertyExtra](x: Self) {
      
      inline def setGetDefaultValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetDefaultValue", value.toJsFn)
      
      inline def setGetIfAuto(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetIfAuto", value.toJsFn)
      
      inline def setGetMaxValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetMaxValue", value.toJsFn)
      
      inline def setGetMinValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetMinValue", value.toJsFn)
      
      inline def setGetSteppingDelta(value: CallbackTo[Double]): Self = StObject.set(x, "GetSteppingDelta", value.toJsFn)
    }
  }
  
  trait FrameRate extends StObject {
    
    /**
      * Return the specified frame rate.
      */
    def Get(index: Double): Double
    
    /**
      * Return the number of available frame rates.
      */
    def GetCount(): Double
    
    /**
      * Return the current frame rate.
      */
    def GetCurrent(): Double
  }
  object FrameRate {
    
    inline def apply(Get: Double => Double, GetCount: CallbackTo[Double], GetCurrent: CallbackTo[Double]): FrameRate = {
      val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = GetCount.toJsFn, GetCurrent = GetCurrent.toJsFn)
      __obj.asInstanceOf[FrameRate]
    }
    
    extension [Self <: FrameRate](x: Self) {
      
      inline def setGet(value: Double => Double): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
      
      inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetCount", value.toJsFn)
      
      inline def setGetCurrent(value: CallbackTo[Double]): Self = StObject.set(x, "GetCurrent", value.toJsFn)
    }
  }
  
  trait MediaType extends StObject {
    
    /**
      * Return the specified media type.
      */
    def Get(index: Double): String
    
    /**
      * Return the number of available media types.
      */
    def GetCount(): Double
    
    /**
      * Return the current media type.
      */
    def GetCurrent(): String
    
    /**
      * internal use
      */
    var _resultlist: Any
  }
  object MediaType {
    
    inline def apply(
      Get: Double => String,
      GetCount: CallbackTo[Double],
      GetCurrent: CallbackTo[String],
      _resultlist: Any
    ): MediaType = {
      val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = GetCount.toJsFn, GetCurrent = GetCurrent.toJsFn, _resultlist = _resultlist.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaType]
    }
    
    extension [Self <: MediaType](x: Self) {
      
      inline def setGet(value: Double => String): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
      
      inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetCount", value.toJsFn)
      
      inline def setGetCurrent(value: CallbackTo[String]): Self = StObject.set(x, "GetCurrent", value.toJsFn)
      
      inline def set_resultlist(value: Any): Self = StObject.set(x, "_resultlist", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resolution extends StObject {
    
    /**
      * Return the specified resolution.
      */
    def Get(index: Double): String
    
    /**
      * Return the number of available resolutions.
      */
    def GetCount(): Double
    
    /**
      * Return the current resolution.
      */
    def GetCurrent(): String
  }
  object Resolution {
    
    inline def apply(Get: Double => String, GetCount: CallbackTo[Double], GetCurrent: CallbackTo[String]): Resolution = {
      val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = GetCount.toJsFn, GetCurrent = GetCurrent.toJsFn)
      __obj.asInstanceOf[Resolution]
    }
    
    extension [Self <: Resolution](x: Self) {
      
      inline def setGet(value: Double => String): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
      
      inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetCount", value.toJsFn)
      
      inline def setGetCurrent(value: CallbackTo[String]): Self = StObject.set(x, "GetCurrent", value.toJsFn)
    }
  }
  
  trait VideoControlProperty extends StObject {
    
    /**
      * Return whether the property is set autmatically or not.
      */
    def GetIfAuto(): Boolean
    
    /**
      * Return the value of the property.
      */
    def GetValue(): Double
  }
  object VideoControlProperty {
    
    inline def apply(GetIfAuto: CallbackTo[Boolean], GetValue: CallbackTo[Double]): VideoControlProperty = {
      val __obj = js.Dynamic.literal(GetIfAuto = GetIfAuto.toJsFn, GetValue = GetValue.toJsFn)
      __obj.asInstanceOf[VideoControlProperty]
    }
    
    extension [Self <: VideoControlProperty](x: Self) {
      
      inline def setGetIfAuto(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetIfAuto", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetValue", value.toJsFn)
    }
  }
  
  trait VideoControlPropertyExtra extends StObject {
    
    /**
      * Return the default value of the property.
      */
    def GetDefaultValue(): Double
    
    /**
      * Return whether the property is set autmatically or not.
      */
    def GetIfAuto(): Boolean
    
    /**
      * Return the maximum value of the property.
      */
    def GetMaxValue(): Double
    
    /**
      * Return the minimum value of the property.
      */
    def GetMinValue(): Double
    
    /**
      * Return the smallest increment by which the property can change.
      */
    def GetSteppingDelta(): Double
  }
  object VideoControlPropertyExtra {
    
    inline def apply(
      GetDefaultValue: CallbackTo[Double],
      GetIfAuto: CallbackTo[Boolean],
      GetMaxValue: CallbackTo[Double],
      GetMinValue: CallbackTo[Double],
      GetSteppingDelta: CallbackTo[Double]
    ): VideoControlPropertyExtra = {
      val __obj = js.Dynamic.literal(GetDefaultValue = GetDefaultValue.toJsFn, GetIfAuto = GetIfAuto.toJsFn, GetMaxValue = GetMaxValue.toJsFn, GetMinValue = GetMinValue.toJsFn, GetSteppingDelta = GetSteppingDelta.toJsFn)
      __obj.asInstanceOf[VideoControlPropertyExtra]
    }
    
    extension [Self <: VideoControlPropertyExtra](x: Self) {
      
      inline def setGetDefaultValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetDefaultValue", value.toJsFn)
      
      inline def setGetIfAuto(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetIfAuto", value.toJsFn)
      
      inline def setGetMaxValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetMaxValue", value.toJsFn)
      
      inline def setGetMinValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetMinValue", value.toJsFn)
      
      inline def setGetSteppingDelta(value: CallbackTo[Double]): Self = StObject.set(x, "GetSteppingDelta", value.toJsFn)
    }
  }
  
  @js.native
  trait Webcam extends StObject {
    
    /**
      * Capture an image from the current camera.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error String
      */
    def CaptureImage(
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Close the current camera.
      */
    def CloseSource(): Boolean = js.native
    
    def GetCameraControlPropertyMoreSetting(property: Double): CameraControlPropertyExtra = js.native
    /**
      * Return detailed information about the specified camera property.
      * @param property Specify the property.
      */
    def GetCameraControlPropertyMoreSetting(property: EnumDWTCameraControlProperty): CameraControlPropertyExtra = js.native
    
    def GetCameraControlPropertySetting(property: Double): CameraControlProperty = js.native
    /**
      * Return information about the specified camera property.
      * @param property Specify the property.
      */
    def GetCameraControlPropertySetting(property: EnumDWTCameraControlProperty): CameraControlProperty = js.native
    
    /**
      * Return the internal URL (dwt://) for the latest frame.
      */
    def GetFramePartURL(): String = js.native
    
    /**
      * Return the frame rates supported by the current camera.
      */
    def GetFrameRate(): FrameRate = js.native
    
    /**
      * Return the URL (http(s)://) for the latest frame.
      */
    def GetFrameURL(): String = js.native
    
    /**
      * Return the media types supported by the current camera.
      */
    def GetMediaType(): MediaType = js.native
    
    /**
      * Return the resolutions supported by the current camera.
      */
    def GetResolution(): Resolution = js.native
    
    /**
      * Return a list of all available cameras.
      */
    def GetSourceList(): js.Array[String] = js.native
    
    def GetVideoPropertyMoreSetting(property: Double): VideoControlPropertyExtra = js.native
    /**
      * Return detailed information about the specified video property.
      * @param property Specify the property.
      */
    def GetVideoPropertyMoreSetting(property: EnumDWTVideoProperty): VideoControlPropertyExtra = js.native
    
    def GetVideoPropertySetting(property: Double): VideoControlProperty = js.native
    /**
      * Return information about the specified video property.
      * @param property Specify the property.
      */
    def GetVideoPropertySetting(property: EnumDWTVideoProperty): VideoControlProperty = js.native
    
    /**
      * Return whether the Webcam module has been installed.
      */
    def IsModuleInstalled(): Boolean = js.native
    
    /**
      * Pause the video.
      */
    def PauseVideo(): Boolean = js.native
    
    /**
      * Start to play the video stream from the current camera.
      * @param DWObject Specify a WebTwain instance to show the video.
      * @param quality Specify the quality of the video.
      * @param frameDidShow A callback function that is triggered after each video frame is shown.
      */
    def PlayVideo(DWObject: WebTwain, quality: Double): Boolean = js.native
    def PlayVideo(DWObject: WebTwain, quality: Double, frameDidShow: js.Function0[Unit]): Boolean = js.native
    
    /**
      * Select a camera to use.
      * @param name Specify the camera.
      */
    def SelectSource(name: String): Boolean = js.native
    
    def SetCameraControlPropertySetting(property: Double, value: Double, auto: Boolean): Boolean = js.native
    /**
      * Set the specified camera property.
      * @param property Specify the property.
      * @param value Specify the value.
      * @param auto Specify whether the propery should change automatically.
      */
    def SetCameraControlPropertySetting(property: EnumDWTCameraControlProperty, value: Double, auto: Boolean): Boolean = js.native
    
    /**
      * Set the frame rate.
      * @param rate Specify the frame rate.
      */
    def SetFrameRate(rate: Double): Boolean = js.native
    
    /**
      * Set the media type.
      * @param type Sepcify the media type.
      */
    def SetMediaType(`type`: String): Boolean = js.native
    
    /**
      * Set the resolution.
      * @param resolution Specify the resolution.
      */
    def SetResolution(resolution: String): Boolean = js.native
    
    def SetVideoPropertySetting(property: Double, value: Double, auto: Boolean): Boolean = js.native
    /**
      * Set the specified video property.
      * @param property Specify the property.
      * @param value Specify the value.
      * @param auto Specify whether the propery should change automatically.
      */
    def SetVideoPropertySetting(property: EnumDWTVideoProperty, value: Double, auto: Boolean): Boolean = js.native
    
    def SetVideoRotateMode(mode: Double): Boolean = js.native
    /**
      * Rotate the video.
      * @param mode Specify the rotate mode
      */
    def SetVideoRotateMode(mode: EnumDWTVideoRotateMode): Boolean = js.native
    
    /**
      * Stop the video.
      */
    def StopVideo(): Boolean = js.native
  }
}
