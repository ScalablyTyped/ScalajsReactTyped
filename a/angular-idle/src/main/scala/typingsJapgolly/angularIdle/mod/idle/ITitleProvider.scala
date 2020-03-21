package typingsJapgolly.angularIdle.mod.idle

import typingsJapgolly.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to configure the Title service.
  */
@js.native
trait ITitleProvider extends IServiceProvider {
  /**
    * Enables or disables the Title functionality.
    *
    * @param enabled Boolean, default is true.
    */
  def enabled(enabled: Boolean): Unit = js.native
}

