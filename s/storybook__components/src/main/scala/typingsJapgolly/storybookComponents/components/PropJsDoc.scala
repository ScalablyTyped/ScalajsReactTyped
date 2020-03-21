package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.propDefMod.JsDocTags
import typingsJapgolly.storybookComponents.propJsDocMod.PropJsDocProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PropJsDoc {
  def apply(
    tags: JsDocTags,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PropJsDocProps, 
    MountedWithRawType[PropJsDocProps, js.Object, RawMounted[PropJsDocProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.propJsDocMod.PropJsDocProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.propJsDocMod.PropJsDocProps])(children: _*)
  }
  @JSImport("@storybook/components/dist/blocks/PropsTable/PropJsDoc", "PropJsDoc")
  @js.native
  object componentImport extends js.Object
  
}

