package typingsJapgolly.webpackStream

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.webpack.mod.Compiler_.Handler
import typingsJapgolly.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Run webpack with the specified configuration and webpack instance
    *
    * @param config - Webpack configuration
    * @param wp - A webpack object
    * @param callback - A callback with the webpack stats and error objects.
    */
  def apply(): ReadWriteStream = js.native
  def apply(config: Configuration): ReadWriteStream = js.native
  def apply(config: Configuration, wp: AnonCall): ReadWriteStream = js.native
  def apply(config: Configuration, wp: AnonCall, callback: Handler): ReadWriteStream = js.native
}

