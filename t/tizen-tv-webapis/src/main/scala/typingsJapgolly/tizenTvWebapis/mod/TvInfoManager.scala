package typingsJapgolly.tizenTvWebapis.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tizenTvWebapis.anon.ACCESSIBILITYFOCUSZOOM
import typingsJapgolly.tizenTvWebapis.anon.AUDIOLANGUAGECODEAFR
import typingsJapgolly.tizenTvWebapis.anon.TVVIEWERBGEXECUTABLE
import typingsJapgolly.tizenTvWebapis.anon.TVVIEWERBGNOTEXECUTABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TvInfoManager extends StObject {
  
  /**
    * Defines constants for TV information keys.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var TvInfoKey: TVVIEWERBGEXECUTABLE
  
  /**
    * Defines constants for caption settings keys.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var TvInfoMenuKey: ACCESSIBILITYFOCUSZOOM
  
  /**
    * Defines constants for TV menu settings values.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var TvInfoMenuValue: AUDIOLANGUAGECODEAFR
  
  /**
    * Defines constants for TV information values.
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var TvInfoValue: TVVIEWERBGNOTEXECUTABLE
  
  /**
    * Registers a caption menu change listener callback.
    *
    * @param listener TvInfoCaptionChangeCallback listener
    *
    * @param key Caption menu key
    *
    * @returns Listener ID
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    *
    */
  def addCaptionChangeListener(key: TvInfoMenuKey, listener: TvInfoCaptionChangeCallback): Double
  
  /**
    * Retrieves the specified caption or subtitle menu key value.
    *
    * @param key Caption or subtitle menu key
    *
    * @returns Key value
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    *
    */
  def getMenuValue(key: TvInfoMenuKey): TvInfoMenuValue
  
  /**
    * Retrieves the plugin version number.
    *
    * @returns Plugin version
    *
    * @throw None N/A
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getVersion(): String
  
  /**
    * Checks whether the picture size has been resized.
    *
    * @returns Boolean value:
    * - true: Yes
    * - false: No
    *
    * @throw WebAPIException with error type NotSupportedError, if the device is a BD device.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    *
    */
  def isTvsPicSizeResized(): Boolean
  
  /**
    * Enables controlling caption display dynamically from within the application.
    * The application gains full permission to show and hide the captions.
    * When the application launches or resumes, call registerInAppCaptionControl(true).
    * When the application is sent to the background or deactivated states, you must call registerInAppCaptionControl(false).
    *
    * @param status Enable or disable dynamic caption display control.
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def registerInAppCaptionControl(status: Boolean): Unit
  
  /**
    * Unregisters a caption menu change listener callback.
    *
    * @param listenerId TvInfoCaptionChangeCallback ID
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value. (Since plugin version 3.0)
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note Since plugin version 3.0, if a parameter value is out of range, InvalidValuesError is thrown instead of TypeMismatchError.
    *
    */
  def removeCaptionChangeListener(listenerId: Double): Unit
  
  /**
    * If captions are switched on in the TV menu, controls the caption visibility state.
    * If captions are switched off in the TV menu, captions are not shown even if the application calls showCaption(true).
    *
    * @param show Boolean value
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def showCaption(show: Boolean): Unit
}
object TvInfoManager {
  
  inline def apply(
    TvInfoKey: TVVIEWERBGEXECUTABLE,
    TvInfoMenuKey: ACCESSIBILITYFOCUSZOOM,
    TvInfoMenuValue: AUDIOLANGUAGECODEAFR,
    TvInfoValue: TVVIEWERBGNOTEXECUTABLE,
    addCaptionChangeListener: (TvInfoMenuKey, TvInfoCaptionChangeCallback) => Double,
    getMenuValue: TvInfoMenuKey => TvInfoMenuValue,
    getVersion: CallbackTo[String],
    isTvsPicSizeResized: CallbackTo[Boolean],
    registerInAppCaptionControl: Boolean => Callback,
    removeCaptionChangeListener: Double => Callback,
    showCaption: Boolean => Callback
  ): TvInfoManager = {
    val __obj = js.Dynamic.literal(TvInfoKey = TvInfoKey.asInstanceOf[js.Any], TvInfoMenuKey = TvInfoMenuKey.asInstanceOf[js.Any], TvInfoMenuValue = TvInfoMenuValue.asInstanceOf[js.Any], TvInfoValue = TvInfoValue.asInstanceOf[js.Any], addCaptionChangeListener = js.Any.fromFunction2(addCaptionChangeListener), getMenuValue = js.Any.fromFunction1(getMenuValue), getVersion = getVersion.toJsFn, isTvsPicSizeResized = isTvsPicSizeResized.toJsFn, registerInAppCaptionControl = js.Any.fromFunction1((t0: Boolean) => registerInAppCaptionControl(t0).runNow()), removeCaptionChangeListener = js.Any.fromFunction1((t0: Double) => removeCaptionChangeListener(t0).runNow()), showCaption = js.Any.fromFunction1((t0: Boolean) => showCaption(t0).runNow()))
    __obj.asInstanceOf[TvInfoManager]
  }
  
  extension [Self <: TvInfoManager](x: Self) {
    
    inline def setAddCaptionChangeListener(value: (TvInfoMenuKey, TvInfoCaptionChangeCallback) => Double): Self = StObject.set(x, "addCaptionChangeListener", js.Any.fromFunction2(value))
    
    inline def setGetMenuValue(value: TvInfoMenuKey => TvInfoMenuValue): Self = StObject.set(x, "getMenuValue", js.Any.fromFunction1(value))
    
    inline def setGetVersion(value: CallbackTo[String]): Self = StObject.set(x, "getVersion", value.toJsFn)
    
    inline def setIsTvsPicSizeResized(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTvsPicSizeResized", value.toJsFn)
    
    inline def setRegisterInAppCaptionControl(value: Boolean => Callback): Self = StObject.set(x, "registerInAppCaptionControl", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setRemoveCaptionChangeListener(value: Double => Callback): Self = StObject.set(x, "removeCaptionChangeListener", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setShowCaption(value: Boolean => Callback): Self = StObject.set(x, "showCaption", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setTvInfoKey(value: TVVIEWERBGEXECUTABLE): Self = StObject.set(x, "TvInfoKey", value.asInstanceOf[js.Any])
    
    inline def setTvInfoMenuKey(value: ACCESSIBILITYFOCUSZOOM): Self = StObject.set(x, "TvInfoMenuKey", value.asInstanceOf[js.Any])
    
    inline def setTvInfoMenuValue(value: AUDIOLANGUAGECODEAFR): Self = StObject.set(x, "TvInfoMenuValue", value.asInstanceOf[js.Any])
    
    inline def setTvInfoValue(value: TVVIEWERBGNOTEXECUTABLE): Self = StObject.set(x, "TvInfoValue", value.asInstanceOf[js.Any])
  }
}
