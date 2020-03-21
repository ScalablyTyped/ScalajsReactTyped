package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.IPersonaPropsValidationSt
import typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps
import typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedStyleProps
import typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedStyles
import typingsJapgolly.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IPeoplePickerItemSelectedProps_1054615157 () {
  val componentImport: js.Any
  def apply(
    IPickerItemProps: IPickerItemProps[IPersonaPropsValidationSt],
    styles: IStyleFunctionOrObject[IPeoplePickerItemSelectedStyleProps, IPeoplePickerItemSelectedStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IPeoplePickerItemSelectedProps, 
    MountedWithRawType[
      IPeoplePickerItemSelectedProps, 
      js.Object, 
      RawMounted[IPeoplePickerItemSelectedProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps])(children: _*)
  }
}

