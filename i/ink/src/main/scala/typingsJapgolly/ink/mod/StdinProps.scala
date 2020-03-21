package typingsJapgolly.ink.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.processMod._Global_.NodeJS.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StdinProps extends js.Object {
  /**
  	 * A boolean flag determining if the current `stdin` supports `setRawMode`. A component using `setRawMode` might want to use `isRawModeSupported` to nicely fall back in environments where raw mode is not supported.
  	 */
  val isRawModeSupported: Boolean
  /**
  	 * Ink exposes this function via own `<StdinContext>` to be able to handle Ctrl+C, that's why you should use Ink's `setRawMode` instead of `process.stdin.setRawMode`.
  	 * If the `stdin` stream passed to Ink does not support setRawMode, this function does nothing.
  	 */
  val setRawMode: js.Function1[/* mode */ Boolean, this.type]
  /**
  	 * Stdin stream passed to `render()` in `options.stdin` or `process.stdin` by default. Useful if your app needs to handle user input.
  	 */
  val stdin: ReadStream
}

object StdinProps {
  @scala.inline
  def apply(
    isRawModeSupported: Boolean,
    setRawMode: /* mode */ Boolean => CallbackTo[StdinProps],
    stdin: ReadStream
  ): StdinProps = {
    val __obj = js.Dynamic.literal(isRawModeSupported = isRawModeSupported.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any])
    __obj.updateDynamic("setRawMode")(js.Any.fromFunction1((t0: /* mode */ scala.Boolean) => setRawMode(t0).runNow()))
    __obj.asInstanceOf[StdinProps]
  }
}

