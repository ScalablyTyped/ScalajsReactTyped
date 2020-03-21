package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactVirtualized.AnonSortDirection
import typingsJapgolly.reactVirtualized.esTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SortIndicator {
  def apply(
    sortDirection: SortDirectionType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    AnonSortDirection, 
    MountedWithRawType[AnonSortDirection, js.Object, RawMounted[AnonSortDirection, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactVirtualized.AnonSortDirection, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.AnonSortDirection])(children: _*)
  }
  @JSImport("react-virtualized", "SortIndicator")
  @js.native
  object componentImport extends js.Object
  
}

