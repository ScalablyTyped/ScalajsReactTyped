package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import typingsJapgolly.graphql.schemaPrinterMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "printType")
@js.native
object printType extends js.Object {
  def apply(`type`: GraphQLNamedType): String = js.native
  def apply(`type`: GraphQLNamedType, options: Options): String = js.native
}

