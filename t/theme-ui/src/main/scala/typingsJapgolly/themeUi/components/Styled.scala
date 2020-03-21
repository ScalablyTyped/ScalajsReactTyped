package typingsJapgolly.themeUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.themeUi.AnonAs
import typingsJapgolly.themeUi.mod.SxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object Styled {
  def apply(
    props: (/* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements['div'] */ js.Any) with SxProps with AnonAs with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    (/* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements['div'] */ js.Any) with SxProps with AnonAs with js.Object, 
    typingsJapgolly.themeUi.mod.Styled, 
    Unit, 
    (/* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements['div'] */ js.Any) with SxProps with AnonAs with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  (/* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements['div'] */ js.Any) with typingsJapgolly.themeUi.mod.SxProps with typingsJapgolly.themeUi.AnonAs with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.themeUi.mod.Styled](this.componentImport)
    f(__obj.asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements['div'] */ js.Any) with typingsJapgolly.themeUi.mod.SxProps with typingsJapgolly.themeUi.AnonAs with js.Object])(children: _*)
  }
  @JSImport("theme-ui", "Styled")
  @js.native
  object componentImport extends js.Object
  
}

