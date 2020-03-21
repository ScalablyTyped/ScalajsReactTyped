package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.ClassMethodKind
import typingsJapgolly.astTypes.kindsMod.ClassPrivateMethodKind
import typingsJapgolly.astTypes.kindsMod.ClassPrivatePropertyKind
import typingsJapgolly.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsJapgolly.astTypes.kindsMod.ClassPropertyKind
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DeclarationKind
import typingsJapgolly.astTypes.kindsMod.MethodDefinitionKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSDeclareMethodKind
import typingsJapgolly.astTypes.kindsMod.TSIndexSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSMethodSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSPropertySignatureKind
import typingsJapgolly.astTypes.kindsMod.VariableDeclaratorKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
trait ClassBody
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: js.Array[
    MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
  ]
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ClassBody
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassBody")
@js.native
object ClassBody extends TopLevel[Type[ClassBody]]

