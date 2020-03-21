package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.loadableContentMod.ILoadableContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LoadableContent {
  def apply(
    loading: Boolean,
    variableLength: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ILoadableContentProps, 
    typingsJapgolly.blueprintjsTable.loadableContentMod.LoadableContent, 
    Unit, 
    ILoadableContentProps
  ] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
  
      if (!js.isUndefined(variableLength)) __obj.updateDynamic("variableLength")(variableLength.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.loadableContentMod.ILoadableContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.loadableContentMod.LoadableContent](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.loadableContentMod.ILoadableContentProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/common/loadableContent", "LoadableContent")
  @js.native
  object componentImport extends js.Object
  
}

