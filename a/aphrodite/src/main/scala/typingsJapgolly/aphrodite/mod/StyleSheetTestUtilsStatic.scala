package typingsJapgolly.aphrodite.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetTestUtilsStatic extends js.Object {
  /**
    * Opposite method of preventStyleInject.
    */
  def clearBufferAndResumeStyleInjection(): Unit
  /**
    * Returns a string of buffered styles which have not been flushed
    *
    * @returns {string}  Buffer of styles which have not yet been flushed.
    */
  def getBufferedStyles(): js.Array[String]
  /**
    * Prevent styles from being injected into the DOM.
    *
    * This is useful in situations where you'd like to test rendering UI
    * components which use Aphrodite without any of the side-effects of
    * Aphrodite happening. Particularly useful for testing the output of
    * components when you have no DOM, e.g. testing in Node without a fake DOM.
    *
    * Should be paired with a subsequent call to
    * clearBufferAndResumeStyleInjection.
    */
  def suppressStyleInjection(): Unit
}

object StyleSheetTestUtilsStatic {
  @scala.inline
  def apply(
    clearBufferAndResumeStyleInjection: Callback,
    getBufferedStyles: CallbackTo[js.Array[String]],
    suppressStyleInjection: Callback
  ): StyleSheetTestUtilsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearBufferAndResumeStyleInjection")(clearBufferAndResumeStyleInjection.toJsFn)
    __obj.updateDynamic("getBufferedStyles")(getBufferedStyles.toJsFn)
    __obj.updateDynamic("suppressStyleInjection")(suppressStyleInjection.toJsFn)
    __obj.asInstanceOf[StyleSheetTestUtilsStatic]
  }
}

