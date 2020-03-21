package typingsJapgolly.cssModulesLoaderCore.mod

import typingsJapgolly.postcss.mod.Plugin_
import typingsJapgolly.postcss.mod.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css-modules-loader-core", JSImport.Namespace)
@js.native
class ^ () extends Core {
  def this(plugins: js.Array[Plugin_[_]]) = this()
}

@JSImport("css-modules-loader-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultPlugins: js.Array[Plugin_[js.Object]] = js.native
  @JSName("extractImports")
  var extractImports_Original: Plugin_[js.Object] = js.native
  @JSName("localByDefault")
  var localByDefault_Original: Plugin_[js.Object] = js.native
  @JSName("scope")
  var scope_Original: Plugin_[js.Object] = js.native
  @JSName("values")
  var values_Original: Plugin_[js.Object] = js.native
  def extractImports(): Transformer = js.native
  def extractImports(opts: js.Object): Transformer = js.native
  def localByDefault(): Transformer = js.native
  def localByDefault(opts: js.Object): Transformer = js.native
  def scope(): Transformer = js.native
  def scope(opts: js.Object): Transformer = js.native
  def values(): Transformer = js.native
  def values(opts: js.Object): Transformer = js.native
}

