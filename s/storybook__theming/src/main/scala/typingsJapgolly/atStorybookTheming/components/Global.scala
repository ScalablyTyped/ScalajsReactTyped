package typingsJapgolly.atStorybookTheming.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atEmotionCore.atEmotionCoreMod.GlobalProps
import typingsJapgolly.atEmotionCore.atEmotionCoreMod.InterpolationWithTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Global {
  def apply[Theme](
    styles: InterpolationWithTheme[Theme] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    GlobalProps[Theme], 
    MountedWithRawType[GlobalProps[Theme], js.Object, RawMounted[GlobalProps[Theme], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.atEmotionCore.atEmotionCoreMod.GlobalProps[Theme], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](typingsJapgolly.atStorybookTheming.atStorybookThemingMod.Global)
    f(__obj.asInstanceOf[typingsJapgolly.atEmotionCore.atEmotionCoreMod.GlobalProps[Theme]])(children: _*)
  }
}

