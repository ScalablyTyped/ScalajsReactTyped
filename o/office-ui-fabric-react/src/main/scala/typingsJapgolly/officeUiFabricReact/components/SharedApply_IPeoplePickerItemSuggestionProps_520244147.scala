package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps
import typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionStyleProps
import typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionStyles
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IPeoplePickerItemSuggestionProps_520244147 () {
  val componentImport: js.Any
  def apply(
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    personaProps: IPersonaProps = null,
    styles: IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles] = null,
    suggestionsProps: IBasePickerSuggestionsProps[_] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IPeoplePickerItemSuggestionProps, 
    MountedWithRawType[
      IPeoplePickerItemSuggestionProps, 
      js.Object, 
      RawMounted[IPeoplePickerItemSuggestionProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (personaProps != null) __obj.updateDynamic("personaProps")(personaProps.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (suggestionsProps != null) __obj.updateDynamic("suggestionsProps")(suggestionsProps.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps])(children: _*)
  }
}

