package typingsJapgolly.rcDashMentions.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ConsumerProps
import typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.RenderFn
import typingsJapgolly.rcDashMentions.libMentionsContextMod.MentionsContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MentionsContextConsumer {
  def apply(
    observedBits: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: RenderFn[MentionsContextProps] | js.Array[RenderFn[MentionsContextProps]]
  ): UnmountedWithRoot[
    ConsumerProps[MentionsContextProps], 
    typingsJapgolly.rcDashMentions.libMentionsContextMod.MentionsContextConsumer, 
    Unit, 
    ConsumerProps[MentionsContextProps]
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (observedBits != null) __obj.updateDynamic("observedBits")(observedBits.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ConsumerProps[typingsJapgolly.rcDashMentions.libMentionsContextMod.MentionsContextProps], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.rcDashMentions.libMentionsContextMod.MentionsContextConsumer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ConsumerProps[typingsJapgolly.rcDashMentions.libMentionsContextMod.MentionsContextProps]])
  }
  @JSImport("rc-mentions/lib/MentionsContext", "MentionsContextConsumer")
  @js.native
  object componentImport extends js.Object
  
}

