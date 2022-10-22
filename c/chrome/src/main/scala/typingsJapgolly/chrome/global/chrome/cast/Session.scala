package typingsJapgolly.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.Session")
@js.native
open class Session protected ()
  extends StObject
     with typingsJapgolly.chrome.chrome.cast.Session {
  /**
    * @param sessionId
    * @param appId
    * @param displayName
    * @param appImages
    * @param receiver
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Session
    */
  def this(
    sessionId: String,
    appId: String,
    displayName: String,
    appImages: js.Array[typingsJapgolly.chrome.chrome.cast.Image],
    receiver: typingsJapgolly.chrome.chrome.cast.Receiver
  ) = this()
}
