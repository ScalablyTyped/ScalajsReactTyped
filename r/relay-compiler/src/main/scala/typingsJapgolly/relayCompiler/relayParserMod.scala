package typingsJapgolly.relayCompiler

import typingsJapgolly.graphql.astMod.DefinitionNode
import typingsJapgolly.relayCompiler.iRMod.Fragment
import typingsJapgolly.relayCompiler.iRMod.Root
import typingsJapgolly.relayCompiler.schemaMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/RelayParser", JSImport.Namespace)
@js.native
object relayParserMod extends js.Object {
  def parse(schema: Schema, text: String): js.Array[Root | Fragment] = js.native
  def parse(schema: Schema, text: String, filename: String): js.Array[Root | Fragment] = js.native
  def transform(schema: Schema, documents: js.Array[DefinitionNode]): js.Array[Root | Fragment] = js.native
}

