package typingsJapgolly.postcssModulesLocalByDefault.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.global
import typingsJapgolly.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.local
import typingsJapgolly.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.pure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var mode: js.UndefOr[global | local | pure] = js.undefined
  var rewriteUrl: js.UndefOr[js.Function2[/* global */ Boolean, /* url */ String, String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    mode: global | local | pure = null,
    rewriteUrl: (/* global */ Boolean, /* url */ String) => CallbackTo[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rewriteUrl != null) __obj.updateDynamic("rewriteUrl")(js.Any.fromFunction2((t0: /* global */ scala.Boolean, t1: /* url */ java.lang.String) => rewriteUrl(t0, t1).runNow()))
    __obj.asInstanceOf[Options]
  }
}

