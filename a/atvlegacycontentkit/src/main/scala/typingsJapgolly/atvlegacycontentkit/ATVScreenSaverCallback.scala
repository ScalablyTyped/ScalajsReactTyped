package typingsJapgolly.atvlegacycontentkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A callback for when the app is ready to return the results of a screensaver query.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVScreenSaverCallback extends StObject {
  
  /**
    * The photos were not successfully queried. Return an error. The screensaver will just show a default screensaver instead.
    * @param error An error to display in the syslog.
    */
  def failure(error: Any): Unit
  
  /**
    * The photos were successfully queried. Return them to the ATV.
    * @param photos The photos that were queried.
    */
  def success(photos: js.Array[ATVScreenSaverPhoto]): Unit
}
object ATVScreenSaverCallback {
  
  inline def apply(failure: Any => Callback, success: js.Array[ATVScreenSaverPhoto] => Callback): ATVScreenSaverCallback = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1((t0: Any) => failure(t0).runNow()), success = js.Any.fromFunction1((t0: js.Array[ATVScreenSaverPhoto]) => success(t0).runNow()))
    __obj.asInstanceOf[ATVScreenSaverCallback]
  }
  
  extension [Self <: ATVScreenSaverCallback](x: Self) {
    
    inline def setFailure(value: Any => Callback): Self = StObject.set(x, "failure", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSuccess(value: js.Array[ATVScreenSaverPhoto] => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: js.Array[ATVScreenSaverPhoto]) => value(t0).runNow()))
  }
}
