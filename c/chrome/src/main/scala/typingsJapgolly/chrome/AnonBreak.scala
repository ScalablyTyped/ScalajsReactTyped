package typingsJapgolly.chrome

import typingsJapgolly.chrome.chromeStrings.break
import typingsJapgolly.chrome.chromeStrings.buffer_overflow
import typingsJapgolly.chrome.chromeStrings.device_lost
import typingsJapgolly.chrome.chromeStrings.disconnected
import typingsJapgolly.chrome.chromeStrings.frame_error
import typingsJapgolly.chrome.chromeStrings.overrun
import typingsJapgolly.chrome.chromeStrings.parity_error
import typingsJapgolly.chrome.chromeStrings.system_error
import typingsJapgolly.chrome.chromeStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBreak extends js.Object {
  /* The device detected a break condition. */
  var break: typingsJapgolly.chrome.chromeStrings.break
  /* An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
  var buffer_overflow: typingsJapgolly.chrome.chromeStrings.buffer_overflow
  /* The device was most likely disconnected from the host. */
  var device_lost: typingsJapgolly.chrome.chromeStrings.device_lost
  /* The connection was disconnected. */
  var disconnected: typingsJapgolly.chrome.chromeStrings.disconnected
  /* The device detected a framing error. */
  var frame_error: typingsJapgolly.chrome.chromeStrings.frame_error
  /* A character-buffer overrun has occurred. The next character is lost. */
  var overrun: typingsJapgolly.chrome.chromeStrings.overrun
  /* The device detected a parity error. */
  var parity_error: typingsJapgolly.chrome.chromeStrings.parity_error
  /* A system error occurred and the connection may be unrecoverable. */
  var system_error: typingsJapgolly.chrome.chromeStrings.system_error
  /* No data has been received for receiveTimeout milliseconds. */
  var timeout: typingsJapgolly.chrome.chromeStrings.timeout
}

object AnonBreak {
  @scala.inline
  def apply(
    break: break,
    buffer_overflow: buffer_overflow,
    device_lost: device_lost,
    disconnected: disconnected,
    frame_error: frame_error,
    overrun: overrun,
    parity_error: parity_error,
    system_error: system_error,
    timeout: timeout
  ): AnonBreak = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], buffer_overflow = buffer_overflow.asInstanceOf[js.Any], device_lost = device_lost.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], frame_error = frame_error.asInstanceOf[js.Any], overrun = overrun.asInstanceOf[js.Any], parity_error = parity_error.asInstanceOf[js.Any], system_error = system_error.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBreak]
  }
}

