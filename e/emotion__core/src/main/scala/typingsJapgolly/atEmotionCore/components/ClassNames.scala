package typingsJapgolly.atEmotionCore.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atEmotionCore.atEmotionCoreMod.ClassNamesContent
import typingsJapgolly.atEmotionCore.atEmotionCoreMod.ClassNamesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClassNames {
  def apply[Theme](
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ClassNamesContent[Theme] => CallbackTo[Node]
  ): UnmountedSimple[
    ClassNamesProps[Theme], 
    MountedWithRawType[ClassNamesProps[Theme], js.Object, RawMounted[ClassNamesProps[Theme], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.atEmotionCore.atEmotionCoreMod.ClassNamesContent[Theme]) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.atEmotionCore.atEmotionCoreMod.ClassNamesProps[Theme], 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atEmotionCore.atEmotionCoreMod.ClassNamesProps[Theme]])
  }
  @JSImport("@emotion/core", "ClassNames")
  @js.native
  object componentImport extends js.Object
  
}

