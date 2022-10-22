package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.anon.SucceededBoolean
import typingsJapgolly.winrt.anon.SucceededValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDeviceControl
  extends StObject
     with IMediaDeviceControl
object MediaDeviceControl {
  
  inline def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: CallbackTo[SucceededBoolean],
    tryGetValue: CallbackTo[SucceededValue],
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): MediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], tryGetAuto = tryGetAuto.toJsFn, tryGetValue = tryGetValue.toJsFn, trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
    __obj.asInstanceOf[MediaDeviceControl]
  }
}
