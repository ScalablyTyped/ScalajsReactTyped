package typingsJapgolly.nwJs.mod._Global_.nw

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.WindowOpenOption
import typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.win
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Window: http://docs.nwjs.io/en/latest/References/Window/ */
/**
  * Window is a wrapper of the DOM's window object. It has extended operations and can receive various window events.
  */
@js.native
trait Window extends EventEmitter {
  /**
    * Get the native Window Object.
    *
    * @param event {DOM Window} (Optional) Is the DOM window
    */
  def get(): win = js.native
  def get(window_object: js.Object): win = js.native
  /**
    * Open a new window and load url in it.
    *
    * @param url {string} URL to be loaded in the opened window
    * @param option {object} (Optional) New window open options like window subfields in manifest format plus some more options
    * @param callback {string} (Optional) Callback when with the opened native Window object
    * - (Optional) new_win {object} New opened window object.
    */
  def open(url: String): Unit = js.native
  def open(url: String, option: WindowOpenOption): Unit = js.native
  def open(url: String, option: WindowOpenOption, callback: js.Function1[/* new_win */ js.UndefOr[win], Unit]): Unit = js.native
}

@JSGlobal("nw.Window")
@js.native
object Window extends TopLevel[Window]

