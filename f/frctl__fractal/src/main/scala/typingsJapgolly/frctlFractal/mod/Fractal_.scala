package typingsJapgolly.frctlFractal.mod

import typingsJapgolly.frctlFractal.mod.fractal.api.assets.AssetSourceCollection
import typingsJapgolly.frctlFractal.mod.fractal.api.components.ComponentSource
import typingsJapgolly.frctlFractal.mod.fractal.api.docs.DocSource
import typingsJapgolly.frctlFractal.mod.fractal.cli.Cli
import typingsJapgolly.frctlFractal.mod.fractal.web.Web
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.frctlFractal.mod.fractal.core.mixins.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @JSImport("@frctl/fractal", "Fractal")
@js.native
class Fractal_ () extends EventEmitter {
  def this(config: FractalConfig) = this()
  val assets: AssetSourceCollection = js.native
  val cli: Cli = js.native
  val components: ComponentSource = js.native
  val debug: Boolean = js.native
  val docs: DocSource = js.native
  val version: String = js.native
  val web: Web = js.native
  def config(): FractalConfig = js.native
  def config(config: FractalConfig): this.type = js.native
  def extend(plugin: String): this.type = js.native
  def extend(plugin: js.ThisFunction1[/* this */ this.type, /* core */ js.Any, Unit]): this.type = js.native
  def get[K /* <: String */, V](path: K): js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  def get[K /* <: String */, V](path: K, defaultValue: V): js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  def load(): js.Promise[Unit] = js.native
  def set[K /* <: String */](path: K): this.type = js.native
  def set[K /* <: String */](
    path: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def unwatch(): this.type = js.native
  def watch(): this.type = js.native
}

