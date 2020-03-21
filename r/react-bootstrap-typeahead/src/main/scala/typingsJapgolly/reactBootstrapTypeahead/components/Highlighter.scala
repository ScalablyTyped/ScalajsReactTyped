package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBootstrapTypeahead.mod.HighligherProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Highlighter {
  def apply(
    search: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HighligherProps, 
    typingsJapgolly.reactBootstrapTypeahead.mod.Highlighter, 
    Unit, 
    HighligherProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTypeahead.mod.HighligherProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTypeahead.mod.Highlighter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTypeahead.mod.HighligherProps])(children: _*)
  }
  @JSImport("react-bootstrap-typeahead", "Highlighter")
  @js.native
  object componentImport extends js.Object
  
}

