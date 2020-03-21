package typingsJapgolly.jestDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var getStringDiff: js.Function3[
    /* expected */ String, 
    /* received */ String, 
    /* options */ js.UndefOr[typingsJapgolly.jestDiff.typesMod.DiffOptions], 
    AnonAnnotatedDiff | AnonA | Null
  ] = js.native
  def apply(a: js.Any, b: js.Any): String | Null = js.native
  def apply(a: js.Any, b: js.Any, options: typingsJapgolly.jestDiff.typesMod.DiffOptions): String | Null = js.native
  type DiffOptions = typingsJapgolly.jestDiff.typesMod.DiffOptions
}

