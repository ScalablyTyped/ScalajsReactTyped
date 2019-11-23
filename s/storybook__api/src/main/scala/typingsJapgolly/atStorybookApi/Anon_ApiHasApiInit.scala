package typingsJapgolly.atStorybookApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atStorybookApi.distModulesVersionsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiHasApiInit extends js.Object {
  var api: SubAPI
  var state: Anon_DismissedVersionNotification
  def init(hasApi: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any): js.Promise[Unit]
}

object Anon_ApiHasApiInit {
  @scala.inline
  def apply(
    api: SubAPI,
    init: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any => CallbackTo[js.Promise[Unit]],
    state: Anon_DismissedVersionNotification
  ): Anon_ApiHasApiInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any) => init(t0).runNow()))
    __obj.asInstanceOf[Anon_ApiHasApiInit]
  }
}

