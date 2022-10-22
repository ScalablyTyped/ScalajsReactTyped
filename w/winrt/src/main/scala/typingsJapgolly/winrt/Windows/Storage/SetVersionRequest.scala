package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVersionRequest
  extends StObject
     with ISetVersionRequest
object SetVersionRequest {
  
  inline def apply(currentVersion: Double, desiredVersion: Double, getDeferral: CallbackTo[SetVersionDeferral]): SetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], desiredVersion = desiredVersion.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[SetVersionRequest]
  }
}
