package typingsJapgolly.winrt.Windows.System

import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.UI.ViewManagement.ViewSizePreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LauncherOptions
  extends StObject
     with ILauncherOptions
object LauncherOptions {
  
  inline def apply(
    contentType: String,
    desiredRemainingView: ViewSizePreference,
    displayApplicationPicker: Boolean,
    fallbackUri: Uri,
    preferredApplicationDisplayName: String,
    preferredApplicationPackageFamilyName: String,
    treatAsUntrusted: Boolean,
    uI: LauncherUIOptions
  ): LauncherOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any], displayApplicationPicker = displayApplicationPicker.asInstanceOf[js.Any], fallbackUri = fallbackUri.asInstanceOf[js.Any], preferredApplicationDisplayName = preferredApplicationDisplayName.asInstanceOf[js.Any], preferredApplicationPackageFamilyName = preferredApplicationPackageFamilyName.asInstanceOf[js.Any], treatAsUntrusted = treatAsUntrusted.asInstanceOf[js.Any], uI = uI.asInstanceOf[js.Any])
    __obj.asInstanceOf[LauncherOptions]
  }
}
