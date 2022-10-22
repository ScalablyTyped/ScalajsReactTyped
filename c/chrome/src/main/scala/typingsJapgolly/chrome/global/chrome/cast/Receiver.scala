package typingsJapgolly.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.Receiver")
@js.native
open class Receiver protected ()
  extends StObject
     with typingsJapgolly.chrome.chrome.cast.Receiver {
  /**
    * @param label
    * @param friendlyName
    * @param opt_capabilities
    * @param opt_volume
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Receiver
    */
  def this(label: String, friendlyName: String) = this()
  def this(
    label: String,
    friendlyName: String,
    capabilities: js.Array[typingsJapgolly.chrome.chrome.cast.Capability]
  ) = this()
  def this(
    label: String,
    friendlyName: String,
    capabilities: js.Array[typingsJapgolly.chrome.chrome.cast.Capability],
    volume: typingsJapgolly.chrome.chrome.cast.Volume
  ) = this()
  def this(
    label: String,
    friendlyName: String,
    capabilities: Unit,
    volume: typingsJapgolly.chrome.chrome.cast.Volume
  ) = this()
  
  /* CompleteClass */
  var capabilities: js.Array[typingsJapgolly.chrome.chrome.cast.Capability] = js.native
  
  /* CompleteClass */
  var displayStatus: typingsJapgolly.chrome.chrome.cast.ReceiverDisplayStatus = js.native
  
  /* CompleteClass */
  var friendlyName: String = js.native
  
  /* CompleteClass */
  var label: String = js.native
  
  /* CompleteClass */
  var receiverType: typingsJapgolly.chrome.chrome.cast.ReceiverType = js.native
  
  /* CompleteClass */
  var volume: typingsJapgolly.chrome.chrome.cast.Volume = js.native
}
