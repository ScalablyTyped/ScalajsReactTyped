package typingsJapgolly.matchMediaMock.mod

import org.scalajs.dom.raw.MediaQueryList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchMediaMock extends js.Object {
  /**
    * Execute query based on provided configuration
    */
  def apply(query: String): MediaQueryList = js.native
  /**
    * Set configuration
    */
  def setConfig(config: ConfigOptions): Unit = js.native
}

