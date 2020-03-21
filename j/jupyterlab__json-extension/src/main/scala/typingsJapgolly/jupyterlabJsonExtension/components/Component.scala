package typingsJapgolly.jupyterlabJsonExtension.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabJsonExtension.componentMod.IProps
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Component {
  def apply(
    data: JSONValue = null,
    metadata: JSONObject = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IProps, typingsJapgolly.jupyterlabJsonExtension.componentMod.Component, Unit, IProps] = {
    val __obj = js.Dynamic.literal()
  
      if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.jupyterlabJsonExtension.componentMod.IProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.jupyterlabJsonExtension.componentMod.Component](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.jupyterlabJsonExtension.componentMod.IProps])(children: _*)
  }
  @JSImport("@jupyterlab/json-extension/lib/component", "Component")
  @js.native
  object componentImport extends js.Object
  
}

