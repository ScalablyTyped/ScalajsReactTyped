package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.ExportAllDeclaration
import typingsJapgolly.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import typingsJapgolly.babelTypes.babelTypesStrings.ExportNamedDeclaration
import typingsJapgolly.babelTypes.babelTypesStrings.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.ExportAllDeclaration_
  - typingsJapgolly.babelTypes.mod.ExportDefaultDeclaration_
  - typingsJapgolly.babelTypes.mod.ExportNamedDeclaration_
  - typingsJapgolly.babelTypes.mod.ImportDeclaration_
*/
trait ModuleDeclaration extends js.Object

object ModuleDeclaration {
  @scala.inline
  def ExportAllDeclaration_(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral_,
    start: Double,
    `type`: ExportAllDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleDeclaration]
  }
  @scala.inline
  def ExportDefaultDeclaration_(
    declaration: Declaration | Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ExportDefaultDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleDeclaration]
  }
  @scala.inline
  def ExportNamedDeclaration_(
    declaration: Declaration,
    end: Double,
    loc: SourceLocation,
    specifiers: js.Array[ExportSpecifier_],
    start: Double,
    `type`: ExportNamedDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    source: StringLiteral_ = null,
    trailingComments: js.Array[Comment] = null
  ): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleDeclaration]
  }
  @scala.inline
  def ImportDeclaration_(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    start: Double,
    `type`: ImportDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleDeclaration]
  }
}

