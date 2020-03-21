package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleSpecifier extends Node {
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  var local: js.UndefOr[IdentifierKind | Null] = js.undefined
  var name: js.UndefOr[IdentifierKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ModuleSpecifier")
@js.native
object ModuleSpecifier extends TopLevel[Type[ModuleSpecifier]]

