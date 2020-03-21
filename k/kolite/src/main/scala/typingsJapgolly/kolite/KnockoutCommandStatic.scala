package typingsJapgolly.kolite

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// when using AMD, it is exported
trait KnockoutCommandStatic extends js.Object {
  def asyncCommand(options: KoLiteCommandOptions): KoliteAsyncCommand
  def command(options: KoLiteCommandOptions): KoliteCommand
}

object KnockoutCommandStatic {
  @scala.inline
  def apply(
    asyncCommand: KoLiteCommandOptions => CallbackTo[KoliteAsyncCommand],
    command: KoLiteCommandOptions => CallbackTo[KoliteCommand]
  ): KnockoutCommandStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asyncCommand")(js.Any.fromFunction1((t0: typingsJapgolly.kolite.KoLiteCommandOptions) => asyncCommand(t0).runNow()))
    __obj.updateDynamic("command")(js.Any.fromFunction1((t0: typingsJapgolly.kolite.KoLiteCommandOptions) => command(t0).runNow()))
    __obj.asInstanceOf[KnockoutCommandStatic]
  }
}

