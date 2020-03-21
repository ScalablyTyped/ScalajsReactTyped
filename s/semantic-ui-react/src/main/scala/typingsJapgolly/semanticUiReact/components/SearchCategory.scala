package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typingsJapgolly.semanticUiReact.searchResultMod.SearchResultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchCategory {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    layoutRenderer: (/* categoryContent */ Element, /* resultsContent */ Element) => CallbackTo[Element] = null,
    name: String = null,
    renderer: /* props */ SearchCategoryProps => CallbackTo[Element] = null,
    results: js.Array[ComponentClassP[SearchResultProps with js.Object]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SearchCategoryProps, 
    MountedWithRawType[SearchCategoryProps, js.Object, RawMounted[SearchCategoryProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (layoutRenderer != null) __obj.updateDynamic("layoutRenderer")(js.Any.fromFunction2((t0: /* categoryContent */ japgolly.scalajs.react.raw.React.Element, t1: /* resultsContent */ japgolly.scalajs.react.raw.React.Element) => layoutRenderer(t0, t1).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.semanticUiReact.searchCategoryMod.SearchCategoryProps) => renderer(t0).runNow()))
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.semanticUiReact.searchCategoryMod.SearchCategoryProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticUiReact.searchCategoryMod.SearchCategoryProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategory", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

