package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.AnonTip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageLoading {
  def apply(
    tip: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[AnonTip, MountedWithRawType[AnonTip, js.Object, RawMounted[AnonTip, js.Object]]] = {
    val __obj = js.Dynamic.literal()
  
      if (tip != null) __obj.updateDynamic("tip")(tip.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antDesignProLayout.AnonTip, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignProLayout.AnonTip])(children: _*)
  }
  @JSImport("@ant-design/pro-layout/lib/PageLoading", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

