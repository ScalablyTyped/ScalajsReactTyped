package typingsJapgolly.phaser

import typingsJapgolly.phaser.MatterJS._Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVersion extends _Dependency {
  var name: String
  var version: String
}

object AnonVersion {
  @scala.inline
  def apply(name: String, version: String): AnonVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVersion]
  }
}

