package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.ValueNode
import typingsJapgolly.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "parseValue")
@js.native
object parseValue extends js.Object {
  def apply(source: String): ValueNode = js.native
  def apply(source: String, options: ParseOptions): ValueNode = js.native
  def apply(source: typingsJapgolly.graphql.sourceMod.Source): ValueNode = js.native
  def apply(source: typingsJapgolly.graphql.sourceMod.Source, options: ParseOptions): ValueNode = js.native
}

