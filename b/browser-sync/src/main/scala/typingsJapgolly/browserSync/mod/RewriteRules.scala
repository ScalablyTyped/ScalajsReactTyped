package typingsJapgolly.browserSync.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RewriteRules extends js.Object {
  var fn: js.UndefOr[
    js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* match */ String, String]
  ] = js.undefined
  var `match`: js.RegExp
  var replace: js.UndefOr[String] = js.undefined
}

object RewriteRules {
  @scala.inline
  def apply(
    `match`: js.RegExp,
    fn: (/* req */ IncomingMessage, /* res */ ServerResponse, /* match */ String) => CallbackTo[String] = null,
    replace: String = null
  ): RewriteRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* res */ typingsJapgolly.node.httpMod.ServerResponse, t2: /* match */ java.lang.String) => fn(t0, t1, t2).runNow()))
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[RewriteRules]
  }
}

