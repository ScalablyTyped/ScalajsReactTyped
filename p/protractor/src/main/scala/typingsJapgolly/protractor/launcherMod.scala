package typingsJapgolly.protractor

import typingsJapgolly.protractor.configMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/launcher", JSImport.Namespace)
@js.native
object launcherMod extends js.Object {
  var init: js.Function2[/* configFile */ String, /* additionalConfig */ Config, Unit] = js.native
}

