package typingsJapgolly.rcDashMentions.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcDashMentions.libKeywordTriggerMod.KeywordTriggerProps
import typingsJapgolly.rcDashMentions.libKeywordTriggerMod.default
import typingsJapgolly.rcDashMentions.libMentionsMod.Placement
import typingsJapgolly.rcDashMentions.libOptionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeywordTrigger {
  def apply(
    options: js.Array[OptionProps],
    getPopupContainer: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    placement: Placement = null,
    prefixCls: String = null,
    transitionName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[KeywordTriggerProps, default, Unit, KeywordTriggerProps] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
      getPopupContainer.foreach(p => __obj.updateDynamic("getPopupContainer")(p.toJsFn))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcDashMentions.libKeywordTriggerMod.KeywordTriggerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcDashMentions.libKeywordTriggerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcDashMentions.libKeywordTriggerMod.KeywordTriggerProps])(children: _*)
  }
  @JSImport("rc-mentions/lib/KeywordTrigger", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

