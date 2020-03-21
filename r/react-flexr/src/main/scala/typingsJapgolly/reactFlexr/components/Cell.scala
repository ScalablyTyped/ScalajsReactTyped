package typingsJapgolly.reactFlexr.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFlexr.ReactFlexr.CellProps
import typingsJapgolly.reactFlexr.reactFlexrStrings.bottom
import typingsJapgolly.reactFlexr.reactFlexrStrings.center
import typingsJapgolly.reactFlexr.reactFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cell {
  def apply(
    align: top | center | bottom = null,
    desk: String | Double = null,
    flex: js.UndefOr[Boolean] = js.undefined,
    gutter: String = null,
    lap: String | Double = null,
    palm: String | Double = null,
    portable: String | Double = null,
    size: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CellProps, typingsJapgolly.reactFlexr.mod.Cell, Unit, CellProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (desk != null) __obj.updateDynamic("desk")(desk.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (lap != null) __obj.updateDynamic("lap")(lap.asInstanceOf[js.Any])
    if (palm != null) __obj.updateDynamic("palm")(palm.asInstanceOf[js.Any])
    if (portable != null) __obj.updateDynamic("portable")(portable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFlexr.ReactFlexr.CellProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFlexr.mod.Cell](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFlexr.ReactFlexr.CellProps])(children: _*)
  }
  @JSImport("react-flexr", "Cell")
  @js.native
  object componentImport extends js.Object
  
}

