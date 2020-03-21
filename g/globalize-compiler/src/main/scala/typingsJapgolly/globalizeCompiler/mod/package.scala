package typingsJapgolly.globalizeCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtractFunction = js.Function1[
    /* globalize */ typingsJapgolly.globalize.globalizeMod.Static, 
    js.Array[typingsJapgolly.globalizeCompiler.mod.FormatterOrParserFunction]
  ]
  type FormatterOrParserFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
