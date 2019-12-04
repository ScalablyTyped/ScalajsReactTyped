package typingsJapgolly.antd.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ConsumerProps
import typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.RenderFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigConsumer {
  def apply(
    observedBits: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: RenderFn[ConfigConsumerProps] | js.Array[RenderFn[ConfigConsumerProps]]
  ): UnmountedWithRoot[
    ConsumerProps[ConfigConsumerProps], 
    typingsJapgolly.antd.libConfigDashProviderMod.ConfigConsumer, 
    Unit, 
    ConsumerProps[ConfigConsumerProps]
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (observedBits != null) __obj.updateDynamic("observedBits")(observedBits.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ConsumerProps[typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antd.libConfigDashProviderMod.ConfigConsumer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ConsumerProps[typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps]])
  }
  @JSImport("antd/lib/config-provider", "ConfigConsumer")
  @js.native
  object componentImport extends js.Object
  
}

