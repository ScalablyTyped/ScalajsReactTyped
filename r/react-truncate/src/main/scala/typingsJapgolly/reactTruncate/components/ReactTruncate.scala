package typingsJapgolly.reactTruncate.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactTruncate.mod.Truncate
import typingsJapgolly.reactTruncate.mod.TruncateProps
import typingsJapgolly.reactTruncate.mod.default
import typingsJapgolly.reactTruncate.reactTruncateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTruncate {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Truncate] = null,
    ClassAttributes: ClassAttributes[Truncate] = null,
    ellipsis: VdomNode = null,
    lines: Double | `false` = null,
    onTruncate: /* isTruncated */ Boolean => Callback = null,
    trimWhitespace: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TruncateProps, default, Unit, TruncateProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.rawNode.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (onTruncate != null) __obj.updateDynamic("onTruncate")(js.Any.fromFunction1((t0: /* isTruncated */ scala.Boolean) => onTruncate(t0).runNow()))
    if (!js.isUndefined(trimWhitespace)) __obj.updateDynamic("trimWhitespace")(trimWhitespace.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTruncate.mod.TruncateProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTruncate.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTruncate.mod.TruncateProps])(children: _*)
  }
  @JSImport("react-truncate", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

