package typingsJapgolly.storybookAddonNotes.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonNotes.panelMod.NotesLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NotesLink {
  def apply(
    href: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    NotesLinkProps, 
    MountedWithRawType[NotesLinkProps, js.Object, RawMounted[NotesLinkProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookAddonNotes.panelMod.NotesLinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonNotes.panelMod.NotesLinkProps])(children: _*)
  }
  @JSImport("@storybook/addon-notes/dist/Panel", "NotesLink")
  @js.native
  object componentImport extends js.Object
  
}

