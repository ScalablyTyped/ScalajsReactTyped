package typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The phases during which a transformation may be applied to a plugin.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.compose
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.fetch
*/
trait Phase extends js.Object

object Phase {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compose: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.compose = this.cast("compose")
  @scala.inline
  def fetch: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.fetch = this.cast("fetch")
}

