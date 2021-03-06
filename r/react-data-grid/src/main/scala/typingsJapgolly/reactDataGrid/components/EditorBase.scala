package typingsJapgolly.reactDataGrid.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.EditorBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object EditorBase {
  def apply[P, S](
    props: P with EditorBaseProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    P with EditorBaseProps with js.Object, 
    typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase[P, S], 
    Unit, 
    P with EditorBaseProps with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  P with typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.EditorBaseProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase[P, S]](this.componentImport)
    f(__obj.asInstanceOf[P with typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.EditorBaseProps with js.Object])(children: _*)
  }
  @JSGlobal("AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase")
  @js.native
  object componentImport extends js.Object
  
}

