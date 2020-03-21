package typingsJapgolly.jupyterlabExtensionmanager.modelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.install
  - typingsJapgolly.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.uninstall
  - typingsJapgolly.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.enable
  - typingsJapgolly.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.disable
*/
trait Action extends js.Object

object Action {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disable: typingsJapgolly.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.disable = this.cast("disable")
  @scala.inline
  def enable: typingsJapgolly.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.enable = this.cast("enable")
  @scala.inline
  def install: typingsJapgolly.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.install = this.cast("install")
  @scala.inline
  def uninstall: typingsJapgolly.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.uninstall = this.cast("uninstall")
}

