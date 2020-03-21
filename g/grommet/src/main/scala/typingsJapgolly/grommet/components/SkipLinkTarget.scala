package typingsJapgolly.grommet.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grommet.skipLinkTargetMod.SkipLinkTargetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SkipLinkTarget {
  def apply(
    id: String,
    label: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SkipLinkTargetProps, 
    MountedWithRawType[SkipLinkTargetProps, js.Object, RawMounted[SkipLinkTargetProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.grommet.skipLinkTargetMod.SkipLinkTargetProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommet.skipLinkTargetMod.SkipLinkTargetProps])(children: _*)
  }
  @JSImport("grommet", "SkipLinkTarget")
  @js.native
  object componentImport extends js.Object
  
}

