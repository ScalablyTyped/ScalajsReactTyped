package typingsJapgolly.tern.libTernMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.estree.mod.Node
import typingsJapgolly.estree.mod.Program
import typingsJapgolly.tern.libInferMod.Scope
import typingsJapgolly.tern.libInferMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
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
  
  inline def apply(
    afterLoad: File => Callback,
    beforeLoad: File => Callback,
    completion: (File, CompletionsQuery) => CompletionsQueryResult | Unit,
    postInfer: (Program, Scope) => Callback,
    postParse: (Program, String) => Callback,
    preInfer: (Program, Scope) => Callback,
    preParse: (String, js.Object) => String | Unit,
    reset: Callback,
    typeAt: (File, Position, Node, Type) => Type | Unit
  ): Events = {
    val __obj = js.Dynamic.literal(afterLoad = js.Any.fromFunction1((t0: File) => afterLoad(t0).runNow()), beforeLoad = js.Any.fromFunction1((t0: File) => beforeLoad(t0).runNow()), completion = js.Any.fromFunction2(completion), postInfer = js.Any.fromFunction2((t0: Program, t1: Scope) => (postInfer(t0, t1)).runNow()), postParse = js.Any.fromFunction2((t0: Program, t1: String) => (postParse(t0, t1)).runNow()), preInfer = js.Any.fromFunction2((t0: Program, t1: Scope) => (preInfer(t0, t1)).runNow()), preParse = js.Any.fromFunction2(preParse), reset = reset.toJsFn, typeAt = js.Any.fromFunction4(typeAt))
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setAfterLoad(value: File => Callback): Self = StObject.set(x, "afterLoad", js.Any.fromFunction1((t0: File) => value(t0).runNow()))
    
    inline def setBeforeLoad(value: File => Callback): Self = StObject.set(x, "beforeLoad", js.Any.fromFunction1((t0: File) => value(t0).runNow()))
    
    inline def setCompletion(value: (File, CompletionsQuery) => CompletionsQueryResult | Unit): Self = StObject.set(x, "completion", js.Any.fromFunction2(value))
    
    inline def setPostInfer(value: (Program, Scope) => Callback): Self = StObject.set(x, "postInfer", js.Any.fromFunction2((t0: Program, t1: Scope) => (value(t0, t1)).runNow()))
    
    inline def setPostParse(value: (Program, String) => Callback): Self = StObject.set(x, "postParse", js.Any.fromFunction2((t0: Program, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setPreInfer(value: (Program, Scope) => Callback): Self = StObject.set(x, "preInfer", js.Any.fromFunction2((t0: Program, t1: Scope) => (value(t0, t1)).runNow()))
    
    inline def setPreParse(value: (String, js.Object) => String | Unit): Self = StObject.set(x, "preParse", js.Any.fromFunction2(value))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setTypeAt(value: (File, Position, Node, Type) => Type | Unit): Self = StObject.set(x, "typeAt", js.Any.fromFunction4(value))
  }
}
