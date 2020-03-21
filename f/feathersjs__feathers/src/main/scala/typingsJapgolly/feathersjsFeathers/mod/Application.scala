package typingsJapgolly.feathersjsFeathers.mod

import typingsJapgolly.feathersjsFeathers.PartialHooksObject
import typingsJapgolly.feathersjsFeathers.PartialServiceMethodsanyS
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[ServiceTypes] extends EventEmitter {
  var version: String = js.native
  def configure(callback: js.ThisFunction1[/* this */ this.type, /* app */ this.type, Unit]): this.type = js.native
  def disable(name: String): this.type = js.native
  def disabled(name: String): Boolean = js.native
  def enable(name: String): this.type = js.native
  def enabled(name: String): Boolean = js.native
  def get(name: String): js.Any = js.native
  def hooks(hooks: PartialHooksObject): this.type = js.native
  def service(location: String): Service[_] = js.native
  def service[L /* <: String */](location: L): Service[
    /* import warning: importer.ImportType#apply Failed type conversion: ServiceTypes[L] */ js.Any
  ] = js.native
  def set(name: String, value: js.Any): this.type = js.native
  def setup(): this.type = js.native
  def setup(server: js.Any): this.type = js.native
  def use(path: String, service: PartialServiceMethodsanyS): this.type = js.native
  def use(path: String, service: PartialServiceMethodsanyS, options: js.Any): this.type = js.native
  def use(path: String, service: Application[_]): this.type = js.native
  def use(path: String, service: Application[_], options: js.Any): this.type = js.native
}

