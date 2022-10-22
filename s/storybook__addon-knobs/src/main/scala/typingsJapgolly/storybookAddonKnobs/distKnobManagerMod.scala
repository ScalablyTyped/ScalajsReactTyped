package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesMod.KnobType
import typingsJapgolly.storybookAddonKnobs.distTypeDefsMod.Knob
import typingsJapgolly.storybookAddonKnobs.distTypeDefsMod.Mutable
import typingsJapgolly.storybookChannels.mod.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKnobManagerMod {
  
  @JSImport("@storybook/addon-knobs/dist/KnobManager", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with KnobManager {
    
    /* CompleteClass */
    override def _mayCallChannel(): Unit = js.native
    
    /* CompleteClass */
    var calling: Boolean = js.native
    
    /* CompleteClass */
    override def getKnobValue(hasValue: Knob[Any]): Any = js.native
    
    /* CompleteClass */
    override def knob[T /* <: KnobType */](name: String, options: Knob[T]): Mutable[
        /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
      ] = js.native
    
    /* CompleteClass */
    var knobStore: typingsJapgolly.storybookAddonKnobs.distKnobStoreMod.default = js.native
    
    /* CompleteClass */
    var options: KnobManagerOptions = js.native
    
    /* CompleteClass */
    override def setChannel(channel: Channel): Unit = js.native
    
    /* CompleteClass */
    override def setOptions(options: KnobManagerOptions): Unit = js.native
  }
  
  trait KnobManager extends StObject {
    
    def _mayCallChannel(): Unit
    
    var calling: Boolean
    
    var channel: js.UndefOr[Channel] = js.undefined
    
    def getKnobValue(hasValue: Knob[Any]): Any
    
    def knob[T /* <: KnobType */](name: String, options: Knob[T]): Mutable[
        /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
      ]
    
    var knobStore: typingsJapgolly.storybookAddonKnobs.distKnobStoreMod.default
    
    var options: KnobManagerOptions
    
    def setChannel(channel: Channel): Unit
    
    def setOptions(options: KnobManagerOptions): Unit
  }
  object KnobManager {
    
    inline def apply(
      _mayCallChannel: Callback,
      calling: Boolean,
      getKnobValue: Knob[Any] => Any,
      knob: (String, Knob[Any]) => Mutable[
          /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
        ],
      knobStore: typingsJapgolly.storybookAddonKnobs.distKnobStoreMod.default,
      options: KnobManagerOptions,
      setChannel: Channel => Callback,
      setOptions: KnobManagerOptions => Callback
    ): KnobManager = {
      val __obj = js.Dynamic.literal(_mayCallChannel = _mayCallChannel.toJsFn, calling = calling.asInstanceOf[js.Any], getKnobValue = js.Any.fromFunction1(getKnobValue), knob = js.Any.fromFunction2(knob), knobStore = knobStore.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setChannel = js.Any.fromFunction1((t0: Channel) => setChannel(t0).runNow()), setOptions = js.Any.fromFunction1((t0: KnobManagerOptions) => setOptions(t0).runNow()))
      __obj.asInstanceOf[KnobManager]
    }
    
    extension [Self <: KnobManager](x: Self) {
      
      inline def setCalling(value: Boolean): Self = StObject.set(x, "calling", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setGetKnobValue(value: Knob[Any] => Any): Self = StObject.set(x, "getKnobValue", js.Any.fromFunction1(value))
      
      inline def setKnob(
        value: (String, Knob[Any]) => Mutable[
              /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
            ]
      ): Self = StObject.set(x, "knob", js.Any.fromFunction2(value))
      
      inline def setKnobStore(value: typingsJapgolly.storybookAddonKnobs.distKnobStoreMod.default): Self = StObject.set(x, "knobStore", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: KnobManagerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSetChannel(value: Channel => Callback): Self = StObject.set(x, "setChannel", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
      
      inline def setSetOptions(value: KnobManagerOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: KnobManagerOptions) => value(t0).runNow()))
      
      inline def set_mayCallChannel(value: Callback): Self = StObject.set(x, "_mayCallChannel", value.toJsFn)
    }
  }
  
  trait KnobManagerOptions extends StObject {
    
    var disableDebounce: js.UndefOr[Boolean] = js.undefined
    
    var disableForceUpdate: js.UndefOr[Boolean] = js.undefined
    
    var escapeHTML: js.UndefOr[Boolean] = js.undefined
  }
  object KnobManagerOptions {
    
    inline def apply(): KnobManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KnobManagerOptions]
    }
    
    extension [Self <: KnobManagerOptions](x: Self) {
      
      inline def setDisableDebounce(value: Boolean): Self = StObject.set(x, "disableDebounce", value.asInstanceOf[js.Any])
      
      inline def setDisableDebounceUndefined: Self = StObject.set(x, "disableDebounce", js.undefined)
      
      inline def setDisableForceUpdate(value: Boolean): Self = StObject.set(x, "disableForceUpdate", value.asInstanceOf[js.Any])
      
      inline def setDisableForceUpdateUndefined: Self = StObject.set(x, "disableForceUpdate", js.undefined)
      
      inline def setEscapeHTML(value: Boolean): Self = StObject.set(x, "escapeHTML", value.asInstanceOf[js.Any])
      
      inline def setEscapeHTMLUndefined: Self = StObject.set(x, "escapeHTML", js.undefined)
    }
  }
}
