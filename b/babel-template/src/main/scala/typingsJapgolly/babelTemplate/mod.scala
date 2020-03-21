package typingsJapgolly.babelTemplate

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babylon.mod.BabylonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-template", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(code: String): UseTemplate = js.native
  def apply(code: String, opts: BabylonOptions): UseTemplate = js.native
  type Node = typingsJapgolly.babelTypes.mod.Node
  type UseTemplate = js.Function1[/* nodes */ js.UndefOr[StringDictionary[Node]], Node]
}

