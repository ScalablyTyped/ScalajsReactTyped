package typingsJapgolly.webcl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WEBCL {
  /* cl_context_info  */
  type ContextInfo = typingsJapgolly.webcl.webclNumbers.`0x1081`
  /* cl_device_exec_capabilities - bitfield */
  type DeviceExecCapabilitiesBits = typingsJapgolly.webcl.webclNumbers.`0x1`
  //2.5
  type WebCLCallback = js.Function1[/* event */ typingsJapgolly.webcl.WEBCL.WebCLEvent, scala.Unit]
}
