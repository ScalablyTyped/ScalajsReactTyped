package typingsJapgolly.ionic.cordovaResMod

import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunCordovaResDeps extends js.Object {
  val config: IConfig
  val log: ILogger
  val shell: IShell
}

object RunCordovaResDeps {
  @scala.inline
  def apply(config: IConfig, log: ILogger, shell: IShell): RunCordovaResDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunCordovaResDeps]
  }
}

