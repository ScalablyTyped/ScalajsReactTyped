package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.TextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand
- typingsJapgolly.typescript.mod.JSDocType because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _jsDocTypeBrand */ @js.native
trait JSDocFunctionType
  extends SignatureDeclarationBase
     with SignatureDeclaration
     with _HasJSDoc {
  var _jsDocTypeBrand: js.Any = js.native
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_JSDocFunctionType: typingsJapgolly.typescript.mod.SyntaxKind.JSDocFunctionType = js.native
}

