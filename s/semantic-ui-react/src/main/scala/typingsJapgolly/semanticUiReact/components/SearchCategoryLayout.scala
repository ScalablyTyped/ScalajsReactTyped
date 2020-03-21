package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.searchCategoryLayoutMod.SearchCategoryLayoutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchCategoryLayout {
  def apply(
    categoryContent: VdomElement,
    resultsContent: VdomElement,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SearchCategoryLayoutProps, 
    MountedWithRawType[
      SearchCategoryLayoutProps, 
      js.Object, 
      RawMounted[SearchCategoryLayoutProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (categoryContent != null) __obj.updateDynamic("categoryContent")(categoryContent.rawElement.asInstanceOf[js.Any])
    if (resultsContent != null) __obj.updateDynamic("resultsContent")(resultsContent.rawElement.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.semanticUiReact.searchCategoryLayoutMod.SearchCategoryLayoutProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticUiReact.searchCategoryLayoutMod.SearchCategoryLayoutProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategoryLayout", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

