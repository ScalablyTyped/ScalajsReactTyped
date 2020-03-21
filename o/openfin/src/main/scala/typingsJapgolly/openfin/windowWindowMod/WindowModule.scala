package typingsJapgolly.openfin.windowWindowMod

import typingsJapgolly.openfin.baseMod.Base
import typingsJapgolly.openfin.identityMod.Identity
import typingsJapgolly.openfin.windowOptionMod.WindowOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowModule extends Base {
  /**
    * Creates a new Window.
    * @param { Window~options } options - Window creation options
    * @return {Promise.<_Window>}
    * @tutorial Window.create
    * @static
    */
  def create(options: WindowOption): js.Promise[Window] = js.native
  /**
    * Asynchronously returns a Window object that represents the current window
    * @return {Promise.<_Window>}
    * @tutorial Window.getCurrent
    * @static
    */
  def getCurrent(): js.Promise[Window] = js.native
  /**
    * Synchronously returns a Window object that represents the current window
    * @return {_Window}
    * @tutorial Window.getCurrentSync
    * @static
    */
  def getCurrentSync(): Window = js.native
  /**
    * Asynchronously returns a Window object that represents an existing window.
    * @param { Identity } identity
    * @return {Promise.<_Window>}
    * @tutorial Window.wrap
    * @static
    */
  def wrap(identity: Identity): js.Promise[Window] = js.native
  /**
    * Synchronously returns a Window object that represents an existing window.
    * @param { Identity } identity
    * @return {_Window}
    * @tutorial Window.wrapSync
    * @static
    */
  def wrapSync(identity: Identity): Window = js.native
}

