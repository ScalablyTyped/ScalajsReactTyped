package typingsJapgolly.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linterMod {
  type IndieProvider = js.Function1[
    /* register */ js.Function1[
      /* config */ typingsJapgolly.atom.linterMod.Config, 
      typingsJapgolly.atom.linterMod.IndieDelegate
    ], 
    scala.Unit
  ]
  type LintResult = js.Array[typingsJapgolly.atom.linterMod.Message] | scala.Null
}
