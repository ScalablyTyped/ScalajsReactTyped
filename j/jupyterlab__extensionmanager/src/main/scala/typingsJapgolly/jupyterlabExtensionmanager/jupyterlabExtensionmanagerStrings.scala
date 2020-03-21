package typingsJapgolly.jupyterlabExtensionmanager

import typingsJapgolly.jupyterlabExtensionmanager.modelMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jupyterlabExtensionmanagerStrings {
  @js.native
  sealed trait deprecated extends js.Object
  
  @js.native
  sealed trait disable extends Action
  
  @js.native
  sealed trait enable extends Action
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait install extends Action
  
  @js.native
  sealed trait ok extends js.Object
  
  @js.native
  sealed trait uninstall extends Action
  
  @js.native
  sealed trait warning extends js.Object
  
  @scala.inline
  def deprecated: deprecated = "deprecated".asInstanceOf[deprecated]
  @scala.inline
  def disable: disable = "disable".asInstanceOf[disable]
  @scala.inline
  def enable: enable = "enable".asInstanceOf[enable]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def install: install = "install".asInstanceOf[install]
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  @scala.inline
  def uninstall: uninstall = "uninstall".asInstanceOf[uninstall]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

