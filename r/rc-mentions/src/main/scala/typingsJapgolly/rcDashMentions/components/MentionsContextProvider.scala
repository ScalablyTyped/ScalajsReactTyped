package typingsJapgolly.rcDashMentions.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ProviderProps
import typingsJapgolly.rcDashMentions.libMentionsContextMod.MentionsContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MentionsContextProvider {
  def apply(
    value: MentionsContextProps,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ProviderProps[MentionsContextProps], 
    typingsJapgolly.rcDashMentions.libMentionsContextMod.MentionsContextProvider, 
    Unit, 
    ProviderProps[MentionsContextProps]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ProviderProps[typingsJapgolly.rcDashMentions.libMentionsContextMod.MentionsContextProps], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcDashMentions.libMentionsContextMod.MentionsContextProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ProviderProps[typingsJapgolly.rcDashMentions.libMentionsContextMod.MentionsContextProps]])(children: _*)
  }
  @JSImport("rc-mentions/lib/MentionsContext", "MentionsContextProvider")
  @js.native
  object componentImport extends js.Object
  
}

