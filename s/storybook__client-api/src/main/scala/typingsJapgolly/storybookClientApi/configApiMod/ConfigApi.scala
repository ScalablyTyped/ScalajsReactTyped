package typingsJapgolly.storybookClientApi.configApiMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigApi extends js.Object {
  var _channel: typingsJapgolly.storybookChannels.mod.default
  var _storyStore: typingsJapgolly.storybookClientApi.storyStoreMod.default
  var clientApi: typingsJapgolly.storybookClientApi.clientApiMod.default
  def _clearDecorators(): Unit
  def _renderError(err: js.Error): Unit
  def _renderMain(): Unit
  def configure(loaders: js.Function0[Unit], module: NodeModule): Unit
}

object ConfigApi {
  @scala.inline
  def apply(
    _channel: typingsJapgolly.storybookChannels.mod.default,
    _clearDecorators: Callback,
    _renderError: js.Error => Callback,
    _renderMain: Callback,
    _storyStore: typingsJapgolly.storybookClientApi.storyStoreMod.default,
    clientApi: typingsJapgolly.storybookClientApi.clientApiMod.default,
    configure: (js.Function0[Unit], NodeModule) => Callback
  ): ConfigApi = {
    val __obj = js.Dynamic.literal(_channel = _channel.asInstanceOf[js.Any], _storyStore = _storyStore.asInstanceOf[js.Any], clientApi = clientApi.asInstanceOf[js.Any])
    __obj.updateDynamic("_clearDecorators")(_clearDecorators.toJsFn)
    __obj.updateDynamic("_renderError")(js.Any.fromFunction1((t0: js.Error) => _renderError(t0).runNow()))
    __obj.updateDynamic("_renderMain")(_renderMain.toJsFn)
    __obj.updateDynamic("configure")(js.Any.fromFunction2((t0: js.Function0[scala.Unit], t1: typingsJapgolly.node.NodeModule) => configure(t0, t1).runNow()))
    __obj.asInstanceOf[ConfigApi]
  }
}

