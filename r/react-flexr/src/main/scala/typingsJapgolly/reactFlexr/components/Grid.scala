package typingsJapgolly.reactFlexr.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFlexr.ReactFlexr.GridProps
import typingsJapgolly.reactFlexr.reactFlexrStrings.bottom
import typingsJapgolly.reactFlexr.reactFlexrStrings.center
import typingsJapgolly.reactFlexr.reactFlexrStrings.left
import typingsJapgolly.reactFlexr.reactFlexrStrings.right
import typingsJapgolly.reactFlexr.reactFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
  def apply(
    align: top | center | bottom = null,
    flexCells: js.UndefOr[Boolean] = js.undefined,
    gutter: String = null,
    hAlign: left | center | right = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GridProps, typingsJapgolly.reactFlexr.mod.Grid, Unit, GridProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(flexCells)) __obj.updateDynamic("flexCells")(flexCells.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFlexr.ReactFlexr.GridProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFlexr.mod.Grid](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFlexr.ReactFlexr.GridProps])(children: _*)
  }
  @JSImport("react-flexr", "Grid")
  @js.native
  object componentImport extends js.Object
  
}

