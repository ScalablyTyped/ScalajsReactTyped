package typingsJapgolly.serialport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Callbacks Type Defs
  type ErrorCallback = js.Function1[/* error */ js.UndefOr[js.Error | scala.Null], scala.Unit]
  type ModemBitsCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* status */ typingsJapgolly.serialport.AnonCts, 
    scala.Unit
  ]
  type darwinBinding = typingsJapgolly.serialport.mod.BaseBinding
  type linuxBinding = typingsJapgolly.serialport.mod.BaseBinding
  // Binding Type Defs
  type win32Binding = typingsJapgolly.serialport.mod.BaseBinding
}
