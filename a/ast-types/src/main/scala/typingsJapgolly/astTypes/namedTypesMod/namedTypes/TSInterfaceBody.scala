package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSIndexSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSMethodSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSPropertySignatureKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait TSInterfaceBody
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var body: js.Array[
    TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
  ]
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSInterfaceBody
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSInterfaceBody")
@js.native
object TSInterfaceBody extends TopLevel[Type[TSInterfaceBody]]

