package typingsJapgolly.styledDashComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ServerStyleSheet
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyleSheetManager {
  def apply(
    sheet: ServerStyleSheet = null,
    target: HTMLElement = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StyleSheetManagerProps, 
    typingsJapgolly.styledDashComponents.macroMod.StyleSheetManager, 
    Unit, 
    StyleSheetManagerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.styledDashComponents.macroMod.StyleSheetManager](js.constructorOf[typingsJapgolly.styledDashComponents.macroMod.StyleSheetManager])
    f(__obj.asInstanceOf[typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps])(children: _*)
  }
}

