package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.GridList.GridTileProps
import typingsJapgolly.materialDashUi.gridListGridTileMod.default
import typingsJapgolly.materialDashUi.materialDashUiStrings.bottom
import typingsJapgolly.materialDashUi.materialDashUiStrings.left
import typingsJapgolly.materialDashUi.materialDashUiStrings.right
import typingsJapgolly.materialDashUi.materialDashUiStrings.top
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GridTile {
  def apply(
    actionIcon: VdomElement = null,
    actionPosition: left | right = null,
    cols: Int | Double = null,
    containerElement: String | Element | ComponentClassP[js.Object] = null,
    onClick: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    rows: Int | Double = null,
    style: CSSProperties = null,
    subtitle: VdomNode = null,
    subtitleStyle: CSSProperties = null,
    title: VdomNode = null,
    titleBackground: String = null,
    titlePosition: top | bottom = null,
    titleStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GridTileProps, default, Unit, GridTileProps] = {
    val __obj = js.Dynamic.literal()
  
      if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon.rawElement.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.rawNode.asInstanceOf[js.Any])
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (titleBackground != null) __obj.updateDynamic("titleBackground")(titleBackground.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.GridList.GridTileProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.gridListGridTileMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.GridList.GridTileProps])(children: _*)
  }
  @JSImport("material-ui/GridList/GridTile", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

