package typingsJapgolly.trtcCallingJs.mod

import typingsJapgolly.trtcCallingJs.trtcCallingJsStrings.AUDIO_CALL
import typingsJapgolly.trtcCallingJs.trtcCallingJsStrings.UNKNOWN
import typingsJapgolly.trtcCallingJs.trtcCallingJsStrings.VIDEO_CALL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 通话类型 */
/* static member */
object CALL_TYPE {
  
  @JSImport("trtc-calling-js", "CALL_TYPE")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("trtc-calling-js", "CALL_TYPE.0")
  @js.native
  val `0`: UNKNOWN = js.native
  
  @JSImport("trtc-calling-js", "CALL_TYPE.1")
  @js.native
  val `1`: AUDIO_CALL = js.native
  
  @JSImport("trtc-calling-js", "CALL_TYPE.2")
  @js.native
  val `2`: VIDEO_CALL = js.native
  
  @JSImport("trtc-calling-js", "CALL_TYPE.AUDIO_CALL")
  @js.native
  def AUDIO_CALL: typingsJapgolly.trtcCallingJs.trtcCallingJsInts.`1` = js.native
  inline def AUDIO_CALL_=(x: typingsJapgolly.trtcCallingJs.trtcCallingJsInts.`1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_CALL")(x.asInstanceOf[js.Any])
  
  @JSImport("trtc-calling-js", "CALL_TYPE.UNKNOWN")
  @js.native
  def UNKNOWN: typingsJapgolly.trtcCallingJs.trtcCallingJsInts.`0` = js.native
  inline def UNKNOWN_=(x: typingsJapgolly.trtcCallingJs.trtcCallingJsInts.`0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
  
  @JSImport("trtc-calling-js", "CALL_TYPE.VIDEO_CALL")
  @js.native
  def VIDEO_CALL: typingsJapgolly.trtcCallingJs.trtcCallingJsInts.`2` = js.native
  inline def VIDEO_CALL_=(x: typingsJapgolly.trtcCallingJs.trtcCallingJsInts.`2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIDEO_CALL")(x.asInstanceOf[js.Any])
}
