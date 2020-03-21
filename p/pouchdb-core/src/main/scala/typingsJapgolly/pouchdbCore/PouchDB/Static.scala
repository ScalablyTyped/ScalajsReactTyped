package typingsJapgolly.pouchdbCore.PouchDB

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsJapgolly.debug.mod.Debugger
import typingsJapgolly.debug.mod.IDebug
import typingsJapgolly.pouchdbCore.AnonInstantiable
import typingsJapgolly.pouchdbCore.EventEmitter
import typingsJapgolly.pouchdbCore.Fetch
import typingsJapgolly.pouchdbCore.PouchDB.Configuration.DatabaseConfiguration
import typingsJapgolly.pouchdbCore.pouchdbCoreStrings.created
import typingsJapgolly.pouchdbCore.pouchdbCoreStrings.destroyed
import typingsJapgolly.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends EventEmitter
     with Instantiable0[Database[js.Object]]
     with Instantiable1[/* name */ String, Database[js.Object]]
     with Instantiable2[/* name */ String, /* options */ DatabaseConfiguration, Database[js.Object]] {
  @JSName("debug")
  var debug_Original: IDebug = js.native
  @JSName("fetch")
  var fetch_Original: Fetch = js.native
  var version: String = js.native
  def debug(namespace: String): Debugger = js.native
  /**
    * The returned object is a constructor function that works the same as PouchDB,
    * except that whenever you invoke it (e.g. with new), the given options will be passed in by default.
    */
  def defaults(options: DatabaseConfiguration): AnonInstantiable = js.native
  def fetch(url: String): js.Promise[Response] = js.native
  def fetch(url: String, opts: RequestInit): js.Promise[Response] = js.native
  def fetch(url: Request): js.Promise[Response] = js.native
  def fetch(url: Request, opts: RequestInit): js.Promise[Response] = js.native
  @JSName("on")
  def on_created(event: created, listener: js.Function1[/* dbName */ String, _]): this.type = js.native
  @JSName("on")
  def on_destroyed(event: destroyed, listener: js.Function1[/* dbName */ String, _]): this.type = js.native
  def plugin(plugin: Plugin): Static = js.native
}

