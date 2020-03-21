package typingsJapgolly.ionic.npmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.ionicStrings.dedupe
  - typingsJapgolly.ionic.ionicStrings.rebuild
  - typingsJapgolly.ionic.ionicStrings.install
  - typingsJapgolly.ionic.ionicStrings.uninstall
  - typingsJapgolly.ionic.ionicStrings.run
  - typingsJapgolly.ionic.ionicStrings.info
*/
trait PkgManagerCommand extends js.Object

object PkgManagerCommand {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dedupe: typingsJapgolly.ionic.ionicStrings.dedupe = this.cast("dedupe")
  @scala.inline
  def info: typingsJapgolly.ionic.ionicStrings.info = this.cast("info")
  @scala.inline
  def install: typingsJapgolly.ionic.ionicStrings.install = this.cast("install")
  @scala.inline
  def rebuild: typingsJapgolly.ionic.ionicStrings.rebuild = this.cast("rebuild")
  @scala.inline
  def run: typingsJapgolly.ionic.ionicStrings.run = this.cast("run")
  @scala.inline
  def uninstall: typingsJapgolly.ionic.ionicStrings.uninstall = this.cast("uninstall")
}

