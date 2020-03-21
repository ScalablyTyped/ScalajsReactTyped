package typingsJapgolly.eslintPluginReact.mod._Global_

import typingsJapgolly.eslint.mod.SourceCode
import typingsJapgolly.eslint.mod.SourceCode.CursorWithCountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends SourceCode {
  def getFirstTokens(node: ASTNode): js.Array[typingsJapgolly.eslint.mod.AST.Token] = js.native
  def getFirstTokens(node: ASTNode, options: CursorWithCountOptions): js.Array[typingsJapgolly.eslint.mod.AST.Token] = js.native
}

