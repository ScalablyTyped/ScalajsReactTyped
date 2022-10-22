package typingsJapgolly.naverWhale.whale.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullscreenContentSetting
  extends StObject
     with typingsJapgolly.chrome.chrome.contentSettings.ContentSetting {
  
  def set(details: typingsJapgolly.chrome.chrome.contentSettings.FullscreenSetDetails): Unit = js.native
  def set(
    details: typingsJapgolly.chrome.chrome.contentSettings.FullscreenSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}
