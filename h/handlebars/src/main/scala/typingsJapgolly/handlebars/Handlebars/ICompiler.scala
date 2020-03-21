package typingsJapgolly.handlebars.Handlebars

import typingsJapgolly.handlebars.hbs.AST.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompiler extends js.Object {
  def BlockStatement(block: typingsJapgolly.handlebars.hbs.AST.BlockStatement): Unit = js.native
  def BooleanLiteral(bool: typingsJapgolly.handlebars.hbs.AST.BooleanLiteral): Unit = js.native
  def CommentStatement(): Unit = js.native
  def CommentStatement(comment: typingsJapgolly.handlebars.hbs.AST.CommentStatement): Unit = js.native
  def ContentStatement(content: typingsJapgolly.handlebars.hbs.AST.ContentStatement): Unit = js.native
  def Decorator(decorator: typingsJapgolly.handlebars.hbs.AST.Decorator): Unit = js.native
  def DecoratorBlock(decorator: typingsJapgolly.handlebars.hbs.AST.DecoratorBlock): Unit = js.native
  def Hash(hash: typingsJapgolly.handlebars.hbs.AST.Hash): Unit = js.native
  def MustacheStatement(mustache: typingsJapgolly.handlebars.hbs.AST.MustacheStatement): Unit = js.native
  def NullLiteral(): Unit = js.native
  def NumberLiteral(num: typingsJapgolly.handlebars.hbs.AST.NumberLiteral): Unit = js.native
  def PartialBlockStatement(partial: typingsJapgolly.handlebars.hbs.AST.PartialBlockStatement): Unit = js.native
  def PartialStatement(partial: typingsJapgolly.handlebars.hbs.AST.PartialStatement): Unit = js.native
  def PathExpression(path: typingsJapgolly.handlebars.hbs.AST.PathExpression): Unit = js.native
  def Program(program: typingsJapgolly.handlebars.hbs.AST.Program): Unit = js.native
  def StringLiteral(str: typingsJapgolly.handlebars.hbs.AST.StringLiteral): Unit = js.native
  def SubExpression(sexpr: typingsJapgolly.handlebars.hbs.AST.SubExpression): Unit = js.native
  def UndefinedLiteral(): Unit = js.native
  def accept(node: Node): Unit = js.native
}

