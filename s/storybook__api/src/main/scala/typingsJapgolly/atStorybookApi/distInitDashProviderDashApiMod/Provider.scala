package typingsJapgolly.atStorybookApi.distInitDashProviderDashApiMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atStorybookChannels.atStorybookChannelsMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider
  extends /* key */ StringDictionary[js.Any] {
  var channel: js.UndefOr[Channel] = js.undefined
  var renderPreview: js.UndefOr[js.Function0[Element]] = js.undefined
  def handleAPI(api: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any): Unit
}

object Provider {
  @scala.inline
  def apply(
    handleAPI: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any => Callback,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    channel: Channel = null,
    renderPreview: js.UndefOr[CallbackTo[Element]] = js.undefined
  ): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleAPI")(js.Any.fromFunction1((t0: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any) => handleAPI(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    renderPreview.foreach(p => __obj.updateDynamic("renderPreview")(p.toJsFn))
    __obj.asInstanceOf[Provider]
  }
}

