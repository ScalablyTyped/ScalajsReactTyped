package typingsJapgolly.reactLinkify.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactLinkify.mod.MatchInfo
import typingsJapgolly.reactLinkify.mod.Props
import typingsJapgolly.reactLinkify.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactLinkify {
  def apply(
    componentDecorator: (/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double) => CallbackTo[Node] = null,
    hrefDecorator: /* urlHref */ String => CallbackTo[String] = null,
    matchDecorator: /* text */ String => CallbackTo[js.Array[MatchInfo] | Null] = null,
    textDecorator: /* urlText */ String => CallbackTo[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (componentDecorator != null) __obj.updateDynamic("componentDecorator")(js.Any.fromFunction3((t0: /* decoratedHref */ java.lang.String, t1: /* decoratedText */ java.lang.String, t2: /* key */ scala.Double) => componentDecorator(t0, t1, t2).runNow()))
    if (hrefDecorator != null) __obj.updateDynamic("hrefDecorator")(js.Any.fromFunction1((t0: /* urlHref */ java.lang.String) => hrefDecorator(t0).runNow()))
    if (matchDecorator != null) __obj.updateDynamic("matchDecorator")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => matchDecorator(t0).runNow()))
    if (textDecorator != null) __obj.updateDynamic("textDecorator")(js.Any.fromFunction1((t0: /* urlText */ java.lang.String) => textDecorator(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLinkify.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLinkify.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLinkify.mod.Props])(children: _*)
  }
  @JSImport("react-linkify", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

