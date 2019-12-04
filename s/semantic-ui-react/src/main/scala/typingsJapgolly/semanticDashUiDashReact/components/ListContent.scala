package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsListListContentMod.ListContentProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsListListDescriptionMod.ListDescriptionProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsListListHeaderMod.ListHeaderProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListContent {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[ListDescriptionProps] = null,
    floated: SemanticFLOATS = null,
    header: SemanticShorthandItem[ListHeaderProps] = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ListContentProps, 
    MountedWithRawType[ListContentProps, js.Object, RawMounted[ListContentProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsListListContentMod.ListContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsListListContentMod.ListContentProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListContent", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

