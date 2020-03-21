package typingsJapgolly.rcMentions.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcMentions.keywordTriggerMod.KeywordTriggerProps
import typingsJapgolly.rcMentions.keywordTriggerMod.default
import typingsJapgolly.rcMentions.mentionsMod.Placement
import typingsJapgolly.rcMentions.optionMod.OptionProps
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
    _overrides: StringDictionary[js.Any] = null
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
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcMentions.keywordTriggerMod.KeywordTriggerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcMentions.keywordTriggerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcMentions.keywordTriggerMod.KeywordTriggerProps])(children: _*)
  }
  @JSImport("rc-mentions/lib/KeywordTrigger", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

