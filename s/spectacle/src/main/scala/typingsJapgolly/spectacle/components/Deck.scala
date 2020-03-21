package typingsJapgolly.spectacle.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spectacle.mod.DeckProps
import typingsJapgolly.spectacle.mod.Theme
import typingsJapgolly.spectacle.mod.progressType
import typingsJapgolly.spectacle.mod.transitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Deck {
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayDuration: Int | Double = null,
    autoplayLoop: js.UndefOr[Boolean] = js.undefined,
    autoplayOnStart: js.UndefOr[Boolean] = js.undefined,
    contentHeight: String = null,
    contentWidth: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardControls: js.UndefOr[Boolean] = js.undefined,
    disableTouchControls: js.UndefOr[Boolean] = js.undefined,
    globalStyles: js.UndefOr[Boolean] = js.undefined,
    history: js.Any = null,
    onStateChange: (/* previousState */ js.UndefOr[String], /* nextState */ js.UndefOr[String]) => Callback = null,
    progress: progressType = null,
    showFullscreenControl: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null,
    transition: js.Array[transitionType] = null,
    transitionDuration: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DeckProps, typingsJapgolly.spectacle.mod.Deck, Unit, DeckProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayDuration != null) __obj.updateDynamic("autoplayDuration")(autoplayDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayLoop)) __obj.updateDynamic("autoplayLoop")(autoplayLoop.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayOnStart)) __obj.updateDynamic("autoplayOnStart")(autoplayOnStart.asInstanceOf[js.Any])
    if (contentHeight != null) __obj.updateDynamic("contentHeight")(contentHeight.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardControls)) __obj.updateDynamic("disableKeyboardControls")(disableKeyboardControls.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchControls)) __obj.updateDynamic("disableTouchControls")(disableTouchControls.asInstanceOf[js.Any])
    if (!js.isUndefined(globalStyles)) __obj.updateDynamic("globalStyles")(globalStyles.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction2((t0: /* previousState */ js.UndefOr[java.lang.String], t1: /* nextState */ js.UndefOr[java.lang.String]) => onStateChange(t0, t1).runNow()))
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (!js.isUndefined(showFullscreenControl)) __obj.updateDynamic("showFullscreenControl")(showFullscreenControl.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.spectacle.mod.DeckProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.spectacle.mod.Deck](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.spectacle.mod.DeckProps])(children: _*)
  }
  @JSImport("spectacle", "Deck")
  @js.native
  object componentImport extends js.Object
  
}

