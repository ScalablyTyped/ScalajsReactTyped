package typingsJapgolly.reactNativeHtmlview.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextProperties
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeHtmlview.mod.HTMLViewNode
import typingsJapgolly.reactNativeHtmlview.mod.HTMLViewProps
import typingsJapgolly.reactNativeHtmlview.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeHtmlview {
  def apply(
    value: String,
    NodeComponent: ComponentType[js.Object] = null,
    RootComponent: ComponentType[js.Object] = null,
    TextComponent: ComponentType[js.Object] = null,
    addLineBreaks: js.UndefOr[Boolean] = js.undefined,
    bullet: String = null,
    lineBreak: String = null,
    nodeComponentProps: TextProperties = null,
    onLinkLongPress: /* url */ String => Callback = null,
    onLinkPress: /* url */ String => Callback = null,
    paragraphBreak: String = null,
    renderNode: (/* node */ HTMLViewNode, /* index */ Double, /* siblings */ HTMLViewNode, /* parent */ HTMLViewNode, /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, Node]) => CallbackTo[Node] = null,
    rootComponentProps: ViewProperties = null,
    stylesheet: StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]] = null,
    textComponentProps: TextProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HTMLViewProps, default, Unit, HTMLViewProps] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (NodeComponent != null) __obj.updateDynamic("NodeComponent")(NodeComponent.asInstanceOf[js.Any])
    if (RootComponent != null) __obj.updateDynamic("RootComponent")(RootComponent.asInstanceOf[js.Any])
    if (TextComponent != null) __obj.updateDynamic("TextComponent")(TextComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(addLineBreaks)) __obj.updateDynamic("addLineBreaks")(addLineBreaks.asInstanceOf[js.Any])
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(lineBreak.asInstanceOf[js.Any])
    if (nodeComponentProps != null) __obj.updateDynamic("nodeComponentProps")(nodeComponentProps.asInstanceOf[js.Any])
    if (onLinkLongPress != null) __obj.updateDynamic("onLinkLongPress")(js.Any.fromFunction1((t0: /* url */ java.lang.String) => onLinkLongPress(t0).runNow()))
    if (onLinkPress != null) __obj.updateDynamic("onLinkPress")(js.Any.fromFunction1((t0: /* url */ java.lang.String) => onLinkPress(t0).runNow()))
    if (paragraphBreak != null) __obj.updateDynamic("paragraphBreak")(paragraphBreak.asInstanceOf[js.Any])
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction5((t0: /* node */ typingsJapgolly.reactNativeHtmlview.mod.HTMLViewNode, t1: /* index */ scala.Double, t2: /* siblings */ typingsJapgolly.reactNativeHtmlview.mod.HTMLViewNode, t3: /* parent */ typingsJapgolly.reactNativeHtmlview.mod.HTMLViewNode, t4: /* defaultRenderer */ js.Function2[
  /* node */ typingsJapgolly.reactNativeHtmlview.mod.HTMLViewNode, 
  /* parent */ typingsJapgolly.reactNativeHtmlview.mod.HTMLViewNode, 
  japgolly.scalajs.react.raw.React.Node]) => renderNode(t0, t1, t2, t3, t4).runNow()))
    if (rootComponentProps != null) __obj.updateDynamic("rootComponentProps")(rootComponentProps.asInstanceOf[js.Any])
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    if (textComponentProps != null) __obj.updateDynamic("textComponentProps")(textComponentProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeHtmlview.mod.HTMLViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeHtmlview.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeHtmlview.mod.HTMLViewProps])(children: _*)
  }
  @JSImport("react-native-htmlview", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

