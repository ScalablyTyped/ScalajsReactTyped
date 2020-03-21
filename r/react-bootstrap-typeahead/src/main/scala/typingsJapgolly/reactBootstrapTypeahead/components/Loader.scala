package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBootstrapTypeahead.mod.LoaderProps
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadBsSizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Loader {
  def apply(
    bsSize: TypeaheadBsSizes,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    LoaderProps, 
    MountedWithRawType[LoaderProps, js.Object, RawMounted[LoaderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(bsSize = bsSize.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactBootstrapTypeahead.mod.LoaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTypeahead.mod.LoaderProps])(children: _*)
  }
  @JSImport("react-bootstrap-typeahead", "Loader")
  @js.native
  object componentImport extends js.Object
  
}

