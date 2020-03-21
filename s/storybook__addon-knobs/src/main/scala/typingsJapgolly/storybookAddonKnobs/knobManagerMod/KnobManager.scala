package typingsJapgolly.storybookAddonKnobs.knobManagerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.typeDefsMod.Knob
import typingsJapgolly.storybookAddonKnobs.typeDefsMod.Mutable
import typingsJapgolly.storybookAddonKnobs.typesMod.KnobType
import typingsJapgolly.storybookChannels.mod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobManager extends js.Object {
  var calling: Boolean
  var channel: js.UndefOr[Channel] = js.undefined
  var knobStore: typingsJapgolly.storybookAddonKnobs.knobStoreMod.default
  var options: KnobManagerOptions
  def _mayCallChannel(): Unit
  def getKnobValue(hasValue: Knob[_]): js.Any
  def knob[T /* <: KnobType */](name: String, options: Knob[T]): Mutable[
    /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
  ]
  def setChannel(channel: Channel): Unit
  def setOptions(options: KnobManagerOptions): Unit
}

object KnobManager {
  @scala.inline
  def apply(
    _mayCallChannel: Callback,
    calling: Boolean,
    getKnobValue: Knob[js.Any] => CallbackTo[js.Any],
    knob: (String, Knob[js.Any]) => CallbackTo[
      Mutable[
        /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
      ]
    ],
    knobStore: typingsJapgolly.storybookAddonKnobs.knobStoreMod.default,
    options: KnobManagerOptions,
    setChannel: Channel => Callback,
    setOptions: KnobManagerOptions => Callback,
    channel: Channel = null
  ): KnobManager = {
    val __obj = js.Dynamic.literal(calling = calling.asInstanceOf[js.Any], knobStore = knobStore.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("_mayCallChannel")(_mayCallChannel.toJsFn)
    __obj.updateDynamic("getKnobValue")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.typeDefsMod.Knob[js.Any]) => getKnobValue(t0).runNow()))
    __obj.updateDynamic("knob")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.storybookAddonKnobs.typeDefsMod.Knob[js.Any]) => knob(t0, t1).runNow()))
    __obj.updateDynamic("setChannel")(js.Any.fromFunction1((t0: typingsJapgolly.storybookChannels.mod.Channel) => setChannel(t0).runNow()))
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.knobManagerMod.KnobManagerOptions) => setOptions(t0).runNow()))
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobManager]
  }
}

