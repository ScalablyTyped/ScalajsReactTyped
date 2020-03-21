package typingsJapgolly.documentdbSession

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressSession.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  var MemoryStore: Instantiable0[typingsJapgolly.expressSession.mod.MemoryStore] = js.native
  var Store: Instantiable0[typingsJapgolly.expressSession.mod.Store] = js.native
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: SessionOptions): RequestHandler[ParamsDictionary] = js.native
}

