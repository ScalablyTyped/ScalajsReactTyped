package typingsJapgolly.reactabularTable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactabularTable.PartialCSSStyleDeclaratio
import typingsJapgolly.reactabularTable.mod.Column
import typingsJapgolly.reactabularTable.mod.ProviderProps
import typingsJapgolly.reactabularTable.mod.Renderers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  def apply(
    columns: js.Array[Column],
    className: String = null,
    renderers: Renderers = null,
    style: PartialCSSStyleDeclaratio = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ProviderProps, typingsJapgolly.reactabularTable.mod.Provider, Unit, ProviderProps] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderers != null) __obj.updateDynamic("renderers")(renderers.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactabularTable.mod.ProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactabularTable.mod.Provider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactabularTable.mod.ProviderProps])(children: _*)
  }
  @JSImport("reactabular-table", "Provider")
  @js.native
  object componentImport extends js.Object
  
}

