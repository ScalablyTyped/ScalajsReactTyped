package typingsJapgolly.tsutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilUtilMod {
  type BooleanCompilerOptions = js.Any
  type ForEachCommentCallback = js.Function2[
    /* fullText */ java.lang.String, 
    /* comment */ typingsJapgolly.typescript.mod.CommentRange, 
    scala.Unit
  ]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typingsJapgolly.typescript.mod.SyntaxKind, 
    /* range */ typingsJapgolly.typescript.mod.TextRange, 
    /* parent */ typingsJapgolly.typescript.mod.Node, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typescript.mod.ImportDeclaration
    - typingsJapgolly.tsutils.ImportEqualsDeclarationmo
    - typingsJapgolly.tsutils.ExportDeclarationmoduleSp
    - typingsJapgolly.tsutils.CallExpressionexpressionT
    - typingsJapgolly.typescript.mod.ImportTypeNode
  */
  type ImportLike = typingsJapgolly.tsutils.utilUtilMod._ImportLike | typingsJapgolly.typescript.mod.ImportDeclaration | typingsJapgolly.typescript.mod.ImportTypeNode
}
