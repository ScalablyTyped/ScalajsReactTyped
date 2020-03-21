package typingsJapgolly.grommet.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grommet.skipLinkMod.SkipLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SkipLink {
  def apply(
    id: String,
    label: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SkipLinkProps, 
    MountedWithRawType[SkipLinkProps, js.Object, RawMounted[SkipLinkProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.grommet.skipLinkMod.SkipLinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommet.skipLinkMod.SkipLinkProps])(children: _*)
  }
  @JSImport("grommet", "SkipLink")
  @js.native
  object componentImport extends js.Object
  
}

