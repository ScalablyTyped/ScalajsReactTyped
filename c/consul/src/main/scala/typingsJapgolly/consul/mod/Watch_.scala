package typingsJapgolly.consul.mod

import typingsJapgolly.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watch_ extends EventEmitter {
  var consul: Consul = js.native
  /**
    * End watch
    */
  def end(): Unit = js.native
  /**
    * Is running
    */
  def isRunning(): Boolean = js.native
  /**
    * Update time
    */
  def updateTime(): Double = js.native
}

