package typingsJapgolly.storybookAddonA11y.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsJapgolly.storybookAddonA11y.TypeofHighlightToggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HighlightToggle {
  def apply(
    DollarDollartypeof: js.Symbol,
    displayName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    NamedExoticComponent[LibraryManagedAttributes[TypeofHighlightToggle, js.Any]], 
    MountedWithRawType[
      NamedExoticComponent[LibraryManagedAttributes[TypeofHighlightToggle, js.Any]], 
      js.Object, 
      RawMounted[
        NamedExoticComponent[LibraryManagedAttributes[TypeofHighlightToggle, js.Any]], 
        js.Object
      ]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.NamedExoticComponent[
    typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes[typingsJapgolly.storybookAddonA11y.TypeofHighlightToggle, js.Any]
  ], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.NamedExoticComponent[
  typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes[typingsJapgolly.storybookAddonA11y.TypeofHighlightToggle, js.Any]]])(children: _*)
  }
  @JSImport("@storybook/addon-a11y/dist/components/Report/HighlightToggle", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

