package typingsJapgolly.webpackChain.mod

import typingsJapgolly.std.RegExp
import typingsJapgolly.webpack.mod.ResolvePlugin
import typingsJapgolly.webpackChain.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Resolve")
@js.native
class Resolve ()
  extends typingsJapgolly.webpackChain.mod._Config.TypedChainedMap[Config, js.Any] {
  var alias: TypedChainedMap[this.type, String] = js.native
  var aliasFields: TypedChainedSet[this.type, String] = js.native
  var descriptionFiles: TypedChainedSet[this.type, String] = js.native
  var extensions: TypedChainedSet[this.type, String] = js.native
  var mainFields: TypedChainedSet[this.type, String] = js.native
  var mainFiles: TypedChainedSet[this.type, String] = js.native
  var modules: TypedChainedSet[this.type, String] = js.native
  var plugins: TypedChainedMap[this.type, Plugin[this.type, ResolvePlugin]] = js.native
  def cachePredicate(value: js.Function1[/* data */ AnonPath, Boolean]): this.type = js.native
  def cacheWithContext(value: Boolean): this.type = js.native
  /* CompleteClass */
  override def end(): Config = js.native
  def enforceExtension(value: Boolean): this.type = js.native
  def enforceModuleExtension(value: Boolean): this.type = js.native
  def plugin(name: String): Plugin[this.type, ResolvePlugin] = js.native
  def symlinks(value: Boolean): this.type = js.native
  def unsafeCache(value: js.Array[RegExp]): this.type = js.native
  def unsafeCache(value: Boolean): this.type = js.native
  def unsafeCache(value: RegExp): this.type = js.native
}

