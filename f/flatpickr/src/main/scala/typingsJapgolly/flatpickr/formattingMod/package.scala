package typingsJapgolly.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formattingMod {
  type RevFormatFn = js.Function3[
    /* date */ typingsJapgolly.flatpickr.globalsMod._Global_.Date, 
    /* data */ java.lang.String, 
    /* locale */ typingsJapgolly.flatpickr.localeMod.Locale, 
    js.UndefOr[typingsJapgolly.flatpickr.globalsMod._Global_.Date | scala.Unit]
  ]
  type RevFormat_ = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.flatpickr.formattingMod.RevFormatFn]
}
