package typingsJapgolly.baseui.headingMod

import japgolly.scalajs.react.raw.React.ElementType
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.baseui.blockMod.AlignContent
import typingsJapgolly.baseui.blockMod.AlignItems
import typingsJapgolly.baseui.blockMod.AlignSelf
import typingsJapgolly.baseui.blockMod.BlockOverrides
import typingsJapgolly.baseui.blockMod.BlockProps
import typingsJapgolly.baseui.blockMod.Display
import typingsJapgolly.baseui.blockMod.Flex
import typingsJapgolly.baseui.blockMod.FlexDirection
import typingsJapgolly.baseui.blockMod.GridAutoFlow
import typingsJapgolly.baseui.blockMod.JustifyContent
import typingsJapgolly.baseui.blockMod.JustifyItems
import typingsJapgolly.baseui.blockMod.JustifySelf
import typingsJapgolly.baseui.blockMod.Overflow
import typingsJapgolly.baseui.blockMod.Position
import typingsJapgolly.baseui.blockMod.Responsive
import typingsJapgolly.baseui.blockMod.Scale
import typingsJapgolly.styletronReact.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  styleLevel ? :number} & baseui.baseui/block.BlockProps */
@js.native
trait HeadingProps extends js.Object {
  @JSName("$style")
  var $style: js.UndefOr[StyleProp[BlockProps]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-content */
  var alignContent: js.UndefOr[Responsive[AlignContent]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-items */
  var alignItems: js.UndefOr[Responsive[AlignItems]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-self */
  var alignSelf: js.UndefOr[Responsive[AlignSelf]] = js.native
  var as: js.UndefOr[ElementType] = js.native
  var backgroundColor: js.UndefOr[Responsive[String]] = js.native
  var bottom: js.UndefOr[Responsive[Scale]] = js.native
  var children: js.UndefOr[Node] = js.native
  var color: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/display */
  var display: js.UndefOr[Responsive[Display]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/flex */
  var flex: js.UndefOr[Responsive[Flex]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction */
  var flexDirection: js.UndefOr[Responsive[FlexDirection]] = js.native
  var flexWrap: js.UndefOr[Responsive[Boolean]] = js.native
  var font: js.UndefOr[String | js.Array[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid */
  var grid: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-area */
  var gridArea: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns */
  var gridAutoColumns: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow */
  var gridAutoFlow: js.UndefOr[Responsive[GridAutoFlow]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows */
  var gridAutoRows: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column */
  var gridColumn: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-end */
  var gridColumnEnd: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-gap */
  var gridColumnGap: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-start */
  var gridColumnStart: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-gap */
  var gridGap: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row */
  var gridRow: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-end */
  var gridRowEnd: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-gap */
  var gridRowGap: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-start */
  var gridRowStart: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template */
  var gridTemplate: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas */
  var gridTemplateAreas: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns */
  var gridTemplateColumns: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-rows */
  var gridTemplateRows: js.UndefOr[Responsive[String]] = js.native
  var height: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content */
  var justifyContent: js.UndefOr[Responsive[JustifyContent]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items */
  var justifyItems: js.UndefOr[Responsive[JustifyItems]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self */
  var justifySelf: js.UndefOr[Responsive[JustifySelf]] = js.native
  var left: js.UndefOr[Responsive[Scale]] = js.native
  var margin: js.UndefOr[Responsive[Scale]] = js.native
  var marginBottom: js.UndefOr[Responsive[Scale]] = js.native
  var marginLeft: js.UndefOr[Responsive[Scale]] = js.native
  var marginRight: js.UndefOr[Responsive[Scale]] = js.native
  var marginTop: js.UndefOr[Responsive[Scale]] = js.native
  var maxHeight: js.UndefOr[Responsive[Scale]] = js.native
  var maxWidth: js.UndefOr[Responsive[Scale]] = js.native
  var minHeight: js.UndefOr[Responsive[Scale]] = js.native
  var minWidth: js.UndefOr[Responsive[Scale]] = js.native
  var overflow: js.UndefOr[Responsive[Overflow]] = js.native
  var overrides: js.UndefOr[BlockOverrides] = js.native
  var padding: js.UndefOr[Responsive[Scale]] = js.native
  var paddingBottom: js.UndefOr[Responsive[Scale]] = js.native
  var paddingLeft: js.UndefOr[Responsive[Scale]] = js.native
  var paddingRight: js.UndefOr[Responsive[Scale]] = js.native
  var paddingTop: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-content */
  var placeContent: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-items */
  var placeItems: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-self */
  var placeSelf: js.UndefOr[Responsive[String]] = js.native
  var position: js.UndefOr[Responsive[Position]] = js.native
  var ref: js.UndefOr[Ref] = js.native
  var right: js.UndefOr[Responsive[Scale]] = js.native
  var src: js.UndefOr[String] = js.native
  var styleLevel: js.UndefOr[Double] = js.native
  var top: js.UndefOr[Responsive[Scale]] = js.native
  var width: js.UndefOr[Responsive[Scale]] = js.native
}

