package typingsJapgolly.ink.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ink.AnonChildren
import typingsJapgolly.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Static {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ReactNodeArray
  ): UnmountedSimple[
    AnonChildren, 
    MountedWithRawType[AnonChildren, js.Object, RawMounted[AnonChildren, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[typingsJapgolly.ink.AnonChildren, japgolly.scalajs.react.Children.None, js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.ink.AnonChildren])
  }
  @JSImport("ink", "Static")
  @js.native
  object componentImport extends js.Object
  
}

