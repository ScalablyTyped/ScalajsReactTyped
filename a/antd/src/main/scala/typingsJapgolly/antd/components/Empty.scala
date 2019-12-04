package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libEmptyMod.EmptyProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Empty {
  def apply(
    className: String = null,
    description: VdomNode = null,
    image: VdomNode = null,
    imageStyle: CSSProperties = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    EmptyProps, 
    MountedWithRawType[EmptyProps, js.Object, RawMounted[EmptyProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.rawNode.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.libEmptyMod.EmptyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libEmptyMod.EmptyProps])(children: _*)
  }
  @JSImport("antd/lib/empty", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

