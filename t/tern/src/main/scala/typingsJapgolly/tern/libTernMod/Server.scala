package typingsJapgolly.tern.libTernMod

import typingsJapgolly.tern.anon.`0`
import typingsJapgolly.tern.libInferMod.Context
import typingsJapgolly.tern.libTernMod.^
import typingsJapgolly.tern.ternStrings.afterLoad
import typingsJapgolly.tern.ternStrings.beforeLoad
import typingsJapgolly.tern.ternStrings.completion
import typingsJapgolly.tern.ternStrings.postInfer
import typingsJapgolly.tern.ternStrings.postParse
import typingsJapgolly.tern.ternStrings.preInfer
import typingsJapgolly.tern.ternStrings.preParse
import typingsJapgolly.tern.ternStrings.reset
import typingsJapgolly.tern.ternStrings.typeAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends StObject {
  
  /**
    * Add a set of type definitions to the server. If `atFront` is true, they will be added before all other
    * existing definitions. Otherwise, they are added at the back.
    */
  def addDefs(defs: js.Array[Def]): Unit = js.native
  def addDefs(defs: js.Array[Def], atFront: Boolean): Unit = js.native
  
  /**
    * Register a file with the server. Note that files can also be included in requests. When using this
    * to automatically load a dependency, specify the name of the file (as Tern knows it) as the third
    * argument. That way, the file is counted towards the dependency budget of the root of its dependency graph.
    */
  def addFile(name: String): Unit = js.native
  def addFile(name: String, text: String): Unit = js.native
  def addFile(name: String, text: String, parent: String): Unit = js.native
  def addFile(name: String, text: Unit, parent: String): Unit = js.native
  
  val cx: Context = js.native
  
  /** Unregister a file. */
  def delFile(name: String): Unit = js.native
  
  /**
    * Delete a set of type definitions from the server, by providing the name, taken from
    * `defs[!name]` property from the definitions. If that property is not available in the
    * current type definitions, it can’t be removed.
    */
  def deleteDefs(name: String): Unit = js.native
  
  val files: js.Array[File] = js.native
  
  /** Forces all files to be fetched an analyzed, and then calls the callback function. */
  def flush(callback: js.Function0[Unit]): Unit = js.native
  
  /** Load a server plugin (or don’t do anything, if the plugin is already loaded). */
  def loadPlugin(name: String, options: js.Object): Unit = js.native
  
  /** Unregister an event handler. */
  def off[K /* <: /* keyof tern.tern/lib/tern.Events */ reset | beforeLoad | afterLoad | preParse | postParse | preInfer | postInfer | typeAt | completion */](
    eventType: K,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Events[K] */ js.Any
  ): Unit = js.native
  
  /** Register an event handler for the named type of event. */
  def on[K /* <: /* keyof tern.tern/lib/tern.Events */ reset | beforeLoad | afterLoad | preParse | postParse | preInfer | postInfer | typeAt | completion */](
    eventType: K,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Events[K] */ js.Any
  ): Unit = js.native
  
  val options: ConstructorOptions = js.native
  
  val plugins: Any = js.native
  
  /**
    * Perform a request. `doc` is a (parsed) JSON document as described in the protocol documentation.
    * The `callback` function will be called when the request completes. If an `error` occurred,
    * it will be passed as a first argument. Otherwise, the `response` (parsed) JSON object will be passed as second argument.
    *
    * When the server hasn’t been configured to be asynchronous, the callback will be called before request returns.
    */
  def request[Q /* <: Query */, D /* <: Document */](
    doc: D & `0`[Q],
    callback: js.Function2[
      /* error */ String | Null, 
      /* response */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: D extends {  query :undefined} ? {} : D extends {  query :tern.tern/lib/tern.Query} ? tern.tern/lib/tern.QueryResult<Q> : {} */ js.Any
      ], 
      Unit
    ]
  ): Unit = js.native
  
  def reset(): Unit = js.native
  
  def signal(
    event: /* keyof tern.tern/lib/tern.Events */ reset | beforeLoad | afterLoad | preParse | postParse | preInfer | postInfer | typeAt | completion,
    file: File
  ): Unit = js.native
}
object Server {
  
  inline def apply: TernConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Server").asInstanceOf[TernConstructor]
}
