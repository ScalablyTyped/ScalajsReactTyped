package typingsJapgolly.onoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BinaryValue = typingsJapgolly.onoff.mod.High | typingsJapgolly.onoff.mod.Low
  type High = typingsJapgolly.onoff.onoffNumbers.`1`
  type Low = typingsJapgolly.onoff.onoffNumbers.`0`
  type ValueCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* value */ typingsJapgolly.onoff.mod.BinaryValue, 
    scala.Unit
  ]
}
