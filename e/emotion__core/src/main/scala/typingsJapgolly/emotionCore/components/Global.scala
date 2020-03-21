package typingsJapgolly.emotionCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.emotionCore.mod.GlobalProps
import typingsJapgolly.emotionCore.mod.InterpolationWithTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Global {
  def apply[Theme](
    styles: InterpolationWithTheme[Theme] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    GlobalProps[Theme], 
    MountedWithRawType[GlobalProps[Theme], js.Object, RawMounted[GlobalProps[Theme], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.emotionCore.mod.GlobalProps[Theme], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.emotionCore.mod.GlobalProps[Theme]])(children: _*)
  }
  @JSImport("@emotion/core", "Global")
  @js.native
  object componentImport extends js.Object
  
}

