package typingsJapgolly.hapiHapi.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hapiCatbox.mod.GenerateFuncFlags
import typingsJapgolly.hapiCatbox.mod.Id
import typingsJapgolly.hapiCatbox.mod.PolicyOptions
import typingsJapgolly.hapiHapi.hapiHapiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerMethodCache
  extends PolicyOptions[js.Any] {
  @JSName("generateTimeout")
  var generateTimeout_ServerMethodCache: Double | `false`
}

object ServerMethodCache {
  @scala.inline
  def apply(
    generateTimeout: Double | `false`,
    dropOnError: js.UndefOr[Boolean] = js.undefined,
    expiresAt: String = null,
    expiresIn: Int | Double = null,
    generateFunc: (/* id */ Id, /* flags */ GenerateFuncFlags) => CallbackTo[js.Promise[js.Any]] = null,
    generateIgnoreWriteError: js.UndefOr[Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[Boolean] = js.undefined,
    pendingGenerateTimeout: Int | Double = null,
    staleIn: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double]) = null,
    staleTimeout: Int | Double = null
  ): ServerMethodCache = {
    val __obj = js.Dynamic.literal(generateTimeout = generateTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError.asInstanceOf[js.Any])
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(js.Any.fromFunction2((t0: /* id */ typingsJapgolly.hapiCatbox.mod.Id, t1: /* flags */ typingsJapgolly.hapiCatbox.mod.GenerateFuncFlags) => generateFunc(t0, t1).runNow()))
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError.asInstanceOf[js.Any])
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError.asInstanceOf[js.Any])
    if (pendingGenerateTimeout != null) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.asInstanceOf[js.Any])
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (staleTimeout != null) __obj.updateDynamic("staleTimeout")(staleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerMethodCache]
  }
}

