package typingsJapgolly.theo.mod

import typingsJapgolly.immutable.Immutable.Map
import typingsJapgolly.theo.theoStrings.aliases
import typingsJapgolly.theo.theoStrings.global
import typingsJapgolly.theo.theoStrings.imports
import typingsJapgolly.theo.theoStrings.meta
import typingsJapgolly.theo.theoStrings.options
import typingsJapgolly.theo.theoStrings.props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmutableStyleMap
  extends Map[String, js.Any] {
  @JSName("get")
  def get_aliases(key: aliases): Aliases = js.native
  @JSName("get")
  def get_global(key: global): Props = js.native
  @JSName("get")
  def get_imports(key: imports): js.Array[String] = js.native
  @JSName("get")
  def get_meta(key: meta): Meta = js.native
  @JSName("get")
  def get_options(key: options): js.Object = js.native
  @JSName("get")
  def get_props(key: props): Props = js.native
}

