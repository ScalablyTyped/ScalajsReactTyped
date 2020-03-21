package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.ModuleSpecifierKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.SpecifierKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier, 'type'> */
trait ImportNamespaceSpecifier
  extends ASTNode
     with ModuleSpecifierKind
     with NodeKind
     with PrintableKind
     with SpecifierKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: js.UndefOr[IdentifierKind] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var local: js.UndefOr[IdentifierKind] = js.undefined
  var name: js.UndefOr[IdentifierKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ImportNamespaceSpecifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ImportNamespaceSpecifier")
@js.native
object ImportNamespaceSpecifier extends TopLevel[Type[ImportNamespaceSpecifier]]

