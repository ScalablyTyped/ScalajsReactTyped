package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "parse")
@js.native
object parse extends js.Object {
  def apply(source: String): DocumentNode = js.native
  def apply(source: String, options: ParseOptions): DocumentNode = js.native
  def apply(source: typingsJapgolly.graphql.sourceMod.Source): DocumentNode = js.native
  def apply(source: typingsJapgolly.graphql.sourceMod.Source, options: ParseOptions): DocumentNode = js.native
}

