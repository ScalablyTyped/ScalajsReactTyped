package typingsJapgolly.grommet.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grommet.AnonSkipTo
import typingsJapgolly.grommet.skipLinksMod.SkipLinksProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SkipLinks {
  def apply(
    messages: AnonSkipTo = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SkipLinksProps, 
    MountedWithRawType[SkipLinksProps, js.Object, RawMounted[SkipLinksProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.grommet.skipLinksMod.SkipLinksProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommet.skipLinksMod.SkipLinksProps])(children: _*)
  }
  @JSImport("grommet", "SkipLinks")
  @js.native
  object componentImport extends js.Object
  
}

