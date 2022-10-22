package typingsJapgolly.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.ReceiverDisplayStatus")
@js.native
open class ReceiverDisplayStatus protected ()
  extends StObject
     with typingsJapgolly.chrome.chrome.cast.ReceiverDisplayStatus {
  /**
    * @param statusText
    * @param appImages
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.ReceiverDisplayStatus
    */
  def this(statusText: String, appImages: js.Array[typingsJapgolly.chrome.chrome.cast.Image]) = this()
  
  /* CompleteClass */
  var appImages: js.Array[typingsJapgolly.chrome.chrome.cast.Image] = js.native
  
  /* CompleteClass */
  var statusText: String = js.native
}
