package typingsJapgolly.tern.ternMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.estree.mod.Node
import typingsJapgolly.estree.mod.Program
import typingsJapgolly.tern.inferMod.Scope
import typingsJapgolly.tern.inferMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  /** After analyzing a file. */
  def afterLoad(file: File): Unit
  /** Before analyzing a file. file is an object holding {name, text, scope} properties. */
  def beforeLoad(file: File): Unit
  /** Run at the start of a completion query. May return a valid completion result to replace the default completion algorithm. */
  def completion(file: File, query: CompletionsQuery): CompletionsQueryResult | Unit
  /** Run after the type inference pass. */
  def postInfer(ast: Program, scope: Scope): Unit
  /** Run right after a file is parsed, and passed the parse tree and the parsed file as arguments. */
  def postParse(ast: Program, text: String): Unit
  /** Run right before the type inference pass, passing the syntax tree and a scope object. */
  def preInfer(ast: Program, scope: Scope): Unit
  /**
    * Will be run right before a file is parsed, and passed the given text and options. If a handler
    * returns a new text value, the origin text will be overriden. This is useful for
    * instance when a plugin is able to extract JavaScript content from an HTML file.
    */
  def preParse(text: String, options: js.Object): String | Unit
  /** When the server throws away its current analysis data and starts a fresh run. */
  def reset(): Unit
  /**
    * Run after Tern attempts to find the type at the position end in the given file.
    * A handler may return either the given type (already calculated by Tern and earlier "typeAt" passes)
    * or an alternate type to be used instead. This is useful when
    * a plugin can provide a more helpful type than Tern (e.g. within comments).
    */
  def typeAt(file: File, end: Position, expr: Node, `type`: Type): Type | Unit
}

object Events {
  @scala.inline
  def apply(
    afterLoad: File => Callback,
    beforeLoad: File => Callback,
    completion: (File, CompletionsQuery) => CallbackTo[CompletionsQueryResult | Unit],
    postInfer: (Program, Scope) => Callback,
    postParse: (Program, String) => Callback,
    preInfer: (Program, Scope) => Callback,
    preParse: (String, js.Object) => CallbackTo[String | Unit],
    reset: Callback,
    typeAt: (File, Position, Node, Type) => CallbackTo[Type | Unit]
  ): Events = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterLoad")(js.Any.fromFunction1((t0: typingsJapgolly.tern.ternMod.File) => afterLoad(t0).runNow()))
    __obj.updateDynamic("beforeLoad")(js.Any.fromFunction1((t0: typingsJapgolly.tern.ternMod.File) => beforeLoad(t0).runNow()))
    __obj.updateDynamic("completion")(js.Any.fromFunction2((t0: typingsJapgolly.tern.ternMod.File, t1: typingsJapgolly.tern.ternMod.CompletionsQuery) => completion(t0, t1).runNow()))
    __obj.updateDynamic("postInfer")(js.Any.fromFunction2((t0: typingsJapgolly.estree.mod.Program, t1: typingsJapgolly.tern.inferMod.Scope) => postInfer(t0, t1).runNow()))
    __obj.updateDynamic("postParse")(js.Any.fromFunction2((t0: typingsJapgolly.estree.mod.Program, t1: java.lang.String) => postParse(t0, t1).runNow()))
    __obj.updateDynamic("preInfer")(js.Any.fromFunction2((t0: typingsJapgolly.estree.mod.Program, t1: typingsJapgolly.tern.inferMod.Scope) => preInfer(t0, t1).runNow()))
    __obj.updateDynamic("preParse")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => preParse(t0, t1).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("typeAt")(js.Any.fromFunction4((t0: typingsJapgolly.tern.ternMod.File, t1: typingsJapgolly.tern.ternMod.Position, t2: typingsJapgolly.estree.mod.Node, t3: typingsJapgolly.tern.inferMod.Type) => typeAt(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Events]
  }
}

