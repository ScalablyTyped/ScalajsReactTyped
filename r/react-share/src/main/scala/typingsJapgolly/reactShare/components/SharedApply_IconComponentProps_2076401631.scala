package typingsJapgolly.reactShare.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactShare.mod.IconComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IconComponentProps_2076401631 () {
  val componentImport: js.Any
  def apply(
    borderRadius: Int | Double = null,
    iconBgStyle: CSSProperties = null,
    logoFillColor: String = null,
    round: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IconComponentProps, 
    MountedWithRawType[IconComponentProps, js.Object, RawMounted[IconComponentProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (iconBgStyle != null) __obj.updateDynamic("iconBgStyle")(iconBgStyle.asInstanceOf[js.Any])
    if (logoFillColor != null) __obj.updateDynamic("logoFillColor")(logoFillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactShare.mod.IconComponentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactShare.mod.IconComponentProps])(children: _*)
  }
}

