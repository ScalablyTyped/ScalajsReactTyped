package typingsJapgolly.hapiAuthBearerToken.mod.hapiAugmentingMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.hapiAuthBearerToken.hapiAuthBearerTokenStrings.`bearer-access-token`
import typingsJapgolly.hapiAuthBearerToken.mod.SchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_beareraccesstoken(name: String, scheme: `bearer-access-token`, options: SchemaOptions): Unit
}

object ServerAuth {
  @scala.inline
  def apply(strategy: (String, `bearer-access-token`, SchemaOptions) => Callback): ServerAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strategy")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.hapiAuthBearerToken.hapiAuthBearerTokenStrings.`bearer-access-token`, t2: typingsJapgolly.hapiAuthBearerToken.mod.SchemaOptions) => strategy(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ServerAuth]
  }
}

