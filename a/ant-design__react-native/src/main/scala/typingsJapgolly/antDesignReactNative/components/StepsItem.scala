package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.stepsItemMod.RenderIconParams
import typingsJapgolly.antDesignReactNative.stepsItemMod.StepsItemProps
import typingsJapgolly.antDesignReactNative.stepsItemMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StepsItem {
  def apply(
    current: Int | Double = null,
    description: VdomNode = null,
    direction: String = null,
    errorTail: Int | Double = null,
    icon: VdomNode = null,
    index: Int | Double = null,
    last: js.UndefOr[Boolean] = js.undefined,
    renderIcon: /* params */ RenderIconParams => CallbackTo[Node] = null,
    size: String = null,
    status: String = null,
    styles: js.Any = null,
    title: VdomNode = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StepsItemProps, default, Unit, StepsItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (errorTail != null) __obj.updateDynamic("errorTail")(errorTail.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.antDesignReactNative.stepsItemMod.RenderIconParams) => renderIcon(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.stepsItemMod.StepsItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.stepsItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.stepsItemMod.StepsItemProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/steps/StepsItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

