package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.TypeNode
import typingsJapgolly.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "parseType")
@js.native
object parseType extends js.Object {
  def apply(source: String): TypeNode = js.native
  def apply(source: String, options: ParseOptions): TypeNode = js.native
  def apply(source: typingsJapgolly.graphql.sourceMod.Source): TypeNode = js.native
  def apply(source: typingsJapgolly.graphql.sourceMod.Source, options: ParseOptions): TypeNode = js.native
}

