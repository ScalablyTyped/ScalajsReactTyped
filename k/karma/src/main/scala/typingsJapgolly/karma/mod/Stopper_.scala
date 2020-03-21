package typingsJapgolly.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stopper_ extends js.Object {
  /**
    * This function will signal a running server to stop. The equivalent of karma stop.
    */
  def stop(): Unit = js.native
  def stop(options: ConfigOptions): Unit = js.native
  def stop(options: ConfigOptions, callback: ServerCallback): Unit = js.native
}

