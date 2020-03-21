package typingsJapgolly.reactstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactstrap.collapseMod.CollapseProps
import typingsJapgolly.reactstrap.collapseMod.UncontrolledCollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UncontrolledCollapse {
  def apply[T](
    toggler: String,
    CollapseProps: CollapseProps = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    toggleEvents: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    UncontrolledCollapseProps, 
    typingsJapgolly.reactstrap.mod.UncontrolledCollapse[T], 
    Unit, 
    UncontrolledCollapseProps
  ] = {
    val __obj = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
  
      if (CollapseProps != null) js.Dynamic.global.Object.assign(__obj, CollapseProps)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (toggleEvents != null) __obj.updateDynamic("toggleEvents")(toggleEvents.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactstrap.collapseMod.UncontrolledCollapseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactstrap.mod.UncontrolledCollapse[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactstrap.collapseMod.UncontrolledCollapseProps])(children: _*)
  }
  @JSImport("reactstrap", "UncontrolledCollapse")
  @js.native
  object componentImport extends js.Object
  
}

