package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSpecifier
  extends NamedDeclaration
     with ImportOrExportSpecifier {
  @JSName("kind")
  var kind_ImportSpecifier: typingsJapgolly.typescript.mod.SyntaxKind.ImportSpecifier = js.native
  @JSName("name")
  var name_ImportSpecifier: Identifier = js.native
  @JSName("parent")
  var parent_ImportSpecifier: NamedImports = js.native
  var propertyName: js.UndefOr[Identifier] = js.native
}

