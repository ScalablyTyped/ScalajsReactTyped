package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.blockTypesMod.AlignContent
import typingsJapgolly.baseui.blockTypesMod.AlignItems
import typingsJapgolly.baseui.blockTypesMod.AlignSelf
import typingsJapgolly.baseui.blockTypesMod.BlockOverrides
import typingsJapgolly.baseui.blockTypesMod.BlockProps
import typingsJapgolly.baseui.blockTypesMod.Display
import typingsJapgolly.baseui.blockTypesMod.Flex
import typingsJapgolly.baseui.blockTypesMod.FlexDirection
import typingsJapgolly.baseui.blockTypesMod.GridAutoFlow
import typingsJapgolly.baseui.blockTypesMod.JustifyContent
import typingsJapgolly.baseui.blockTypesMod.JustifyItems
import typingsJapgolly.baseui.blockTypesMod.JustifySelf
import typingsJapgolly.baseui.blockTypesMod.Position
import typingsJapgolly.baseui.blockTypesMod.Responsive
import typingsJapgolly.baseui.blockTypesMod.Scale
import typingsJapgolly.baseui.blockTypesMod.StyledBlockProps
import typingsJapgolly.baseui.blockTypesMod.WhiteSpace
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AspectRatioBoxBody {
  
  inline def apply[C /* <: ElementType */](): Builder[C] = {
    val __props = js.Dynamic.literal()
    new Builder[C](js.Array(this.component, __props.asInstanceOf[BlockProps[C] & (Omit[
    StyledBlockProps & ComponentProps[C], 
    /* keyof baseui.baseui/block/types.BlockProps<react.react.ElementType<any>> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.baseui.baseuiStrings.children, typingsJapgolly.baseui.baseuiStrings.as_, typingsJapgolly.baseui.baseuiStrings.overrides */ Any
  ])]))
  }
  
  @JSImport("baseui/aspect-ratio-box", "AspectRatioBoxBody")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $alignContent(value: Responsive[AlignContent]): this.type = set("$alignContent", value.asInstanceOf[js.Any])
    
    inline def $alignContentVarargs(value: AlignContent*): this.type = set("$alignContent", js.Array(value*))
    
    inline def $alignItems(value: Responsive[AlignItems]): this.type = set("$alignItems", value.asInstanceOf[js.Any])
    
    inline def $alignItemsVarargs(value: AlignItems*): this.type = set("$alignItems", js.Array(value*))
    
    inline def $alignSelf(value: Responsive[AlignSelf]): this.type = set("$alignSelf", value.asInstanceOf[js.Any])
    
    inline def $alignSelfVarargs(value: AlignSelf*): this.type = set("$alignSelf", js.Array(value*))
    
    inline def $backgroundAttachment(value: Responsive[String]): this.type = set("$backgroundAttachment", value.asInstanceOf[js.Any])
    
    inline def $backgroundAttachmentVarargs(value: String*): this.type = set("$backgroundAttachment", js.Array(value*))
    
    inline def $backgroundClip(value: Responsive[String]): this.type = set("$backgroundClip", value.asInstanceOf[js.Any])
    
    inline def $backgroundClipVarargs(value: String*): this.type = set("$backgroundClip", js.Array(value*))
    
    inline def $backgroundColor(value: Responsive[String]): this.type = set("$backgroundColor", value.asInstanceOf[js.Any])
    
    inline def $backgroundColorVarargs(value: String*): this.type = set("$backgroundColor", js.Array(value*))
    
    inline def $backgroundImage(value: Responsive[String]): this.type = set("$backgroundImage", value.asInstanceOf[js.Any])
    
    inline def $backgroundImageVarargs(value: String*): this.type = set("$backgroundImage", js.Array(value*))
    
    inline def $backgroundOrigin(value: Responsive[String]): this.type = set("$backgroundOrigin", value.asInstanceOf[js.Any])
    
    inline def $backgroundOriginVarargs(value: String*): this.type = set("$backgroundOrigin", js.Array(value*))
    
    inline def $backgroundPosition(value: Responsive[String]): this.type = set("$backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def $backgroundPositionVarargs(value: String*): this.type = set("$backgroundPosition", js.Array(value*))
    
    inline def $backgroundRepeat(value: Responsive[String]): this.type = set("$backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def $backgroundRepeatVarargs(value: String*): this.type = set("$backgroundRepeat", js.Array(value*))
    
    inline def $backgroundSize(value: Responsive[String]): this.type = set("$backgroundSize", value.asInstanceOf[js.Any])
    
    inline def $backgroundSizeVarargs(value: String*): this.type = set("$backgroundSize", js.Array(value*))
    
    inline def $bottom(value: Responsive[Scale]): this.type = set("$bottom", value.asInstanceOf[js.Any])
    
    inline def $bottomVarargs(value: Scale*): this.type = set("$bottom", js.Array(value*))
    
    inline def $color(value: Responsive[String]): this.type = set("$color", value.asInstanceOf[js.Any])
    
    inline def $colorVarargs(value: String*): this.type = set("$color", js.Array(value*))
    
    inline def $display(value: Responsive[Display]): this.type = set("$display", value.asInstanceOf[js.Any])
    
    inline def $displayVarargs(value: Display*): this.type = set("$display", js.Array(value*))
    
    inline def $flex(value: Responsive[Flex]): this.type = set("$flex", value.asInstanceOf[js.Any])
    
    inline def $flexDirection(value: Responsive[FlexDirection]): this.type = set("$flexDirection", value.asInstanceOf[js.Any])
    
    inline def $flexDirectionVarargs(value: FlexDirection*): this.type = set("$flexDirection", js.Array(value*))
    
    inline def $flexVarargs(value: Flex*): this.type = set("$flex", js.Array(value*))
    
    inline def $flexWrap(value: Responsive[Boolean]): this.type = set("$flexWrap", value.asInstanceOf[js.Any])
    
    inline def $flexWrapVarargs(value: Boolean*): this.type = set("$flexWrap", js.Array(value*))
    
    inline def $font(value: Responsive[String]): this.type = set("$font", value.asInstanceOf[js.Any])
    
    inline def $fontVarargs(value: String*): this.type = set("$font", js.Array(value*))
    
    inline def $grid(value: Responsive[String]): this.type = set("$grid", value.asInstanceOf[js.Any])
    
    inline def $gridArea(value: Responsive[String]): this.type = set("$gridArea", value.asInstanceOf[js.Any])
    
    inline def $gridAreaVarargs(value: String*): this.type = set("$gridArea", js.Array(value*))
    
    inline def $gridAutoColumns(value: Responsive[String]): this.type = set("$gridAutoColumns", value.asInstanceOf[js.Any])
    
    inline def $gridAutoColumnsVarargs(value: String*): this.type = set("$gridAutoColumns", js.Array(value*))
    
    inline def $gridAutoFlow(value: Responsive[GridAutoFlow]): this.type = set("$gridAutoFlow", value.asInstanceOf[js.Any])
    
    inline def $gridAutoFlowVarargs(value: GridAutoFlow*): this.type = set("$gridAutoFlow", js.Array(value*))
    
    inline def $gridAutoRows(value: Responsive[String]): this.type = set("$gridAutoRows", value.asInstanceOf[js.Any])
    
    inline def $gridAutoRowsVarargs(value: String*): this.type = set("$gridAutoRows", js.Array(value*))
    
    inline def $gridColumn(value: Responsive[String]): this.type = set("$gridColumn", value.asInstanceOf[js.Any])
    
    inline def $gridColumnEnd(value: Responsive[String]): this.type = set("$gridColumnEnd", value.asInstanceOf[js.Any])
    
    inline def $gridColumnEndVarargs(value: String*): this.type = set("$gridColumnEnd", js.Array(value*))
    
    inline def $gridColumnGap(value: Responsive[Scale]): this.type = set("$gridColumnGap", value.asInstanceOf[js.Any])
    
    inline def $gridColumnGapVarargs(value: Scale*): this.type = set("$gridColumnGap", js.Array(value*))
    
    inline def $gridColumnStart(value: Responsive[String]): this.type = set("$gridColumnStart", value.asInstanceOf[js.Any])
    
    inline def $gridColumnStartVarargs(value: String*): this.type = set("$gridColumnStart", js.Array(value*))
    
    inline def $gridColumnVarargs(value: String*): this.type = set("$gridColumn", js.Array(value*))
    
    inline def $gridGap(value: Responsive[Scale]): this.type = set("$gridGap", value.asInstanceOf[js.Any])
    
    inline def $gridGapVarargs(value: Scale*): this.type = set("$gridGap", js.Array(value*))
    
    inline def $gridRow(value: Responsive[String]): this.type = set("$gridRow", value.asInstanceOf[js.Any])
    
    inline def $gridRowEnd(value: Responsive[String]): this.type = set("$gridRowEnd", value.asInstanceOf[js.Any])
    
    inline def $gridRowEndVarargs(value: String*): this.type = set("$gridRowEnd", js.Array(value*))
    
    inline def $gridRowGap(value: Responsive[Scale]): this.type = set("$gridRowGap", value.asInstanceOf[js.Any])
    
    inline def $gridRowGapVarargs(value: Scale*): this.type = set("$gridRowGap", js.Array(value*))
    
    inline def $gridRowStart(value: Responsive[String]): this.type = set("$gridRowStart", value.asInstanceOf[js.Any])
    
    inline def $gridRowStartVarargs(value: String*): this.type = set("$gridRowStart", js.Array(value*))
    
    inline def $gridRowVarargs(value: String*): this.type = set("$gridRow", js.Array(value*))
    
    inline def $gridTemplate(value: Responsive[String]): this.type = set("$gridTemplate", value.asInstanceOf[js.Any])
    
    inline def $gridTemplateAreas(value: Responsive[String]): this.type = set("$gridTemplateAreas", value.asInstanceOf[js.Any])
    
    inline def $gridTemplateAreasVarargs(value: String*): this.type = set("$gridTemplateAreas", js.Array(value*))
    
    inline def $gridTemplateColumns(value: Responsive[String]): this.type = set("$gridTemplateColumns", value.asInstanceOf[js.Any])
    
    inline def $gridTemplateColumnsVarargs(value: String*): this.type = set("$gridTemplateColumns", js.Array(value*))
    
    inline def $gridTemplateRows(value: Responsive[String]): this.type = set("$gridTemplateRows", value.asInstanceOf[js.Any])
    
    inline def $gridTemplateRowsVarargs(value: String*): this.type = set("$gridTemplateRows", js.Array(value*))
    
    inline def $gridTemplateVarargs(value: String*): this.type = set("$gridTemplate", js.Array(value*))
    
    inline def $gridVarargs(value: String*): this.type = set("$grid", js.Array(value*))
    
    inline def $height(value: Responsive[Scale]): this.type = set("$height", value.asInstanceOf[js.Any])
    
    inline def $heightVarargs(value: Scale*): this.type = set("$height", js.Array(value*))
    
    inline def $justifyContent(value: Responsive[JustifyContent]): this.type = set("$justifyContent", value.asInstanceOf[js.Any])
    
    inline def $justifyContentVarargs(value: JustifyContent*): this.type = set("$justifyContent", js.Array(value*))
    
    inline def $justifyItems(value: Responsive[JustifyItems]): this.type = set("$justifyItems", value.asInstanceOf[js.Any])
    
    inline def $justifyItemsVarargs(value: JustifyItems*): this.type = set("$justifyItems", js.Array(value*))
    
    inline def $justifySelf(value: Responsive[JustifySelf]): this.type = set("$justifySelf", value.asInstanceOf[js.Any])
    
    inline def $justifySelfVarargs(value: JustifySelf*): this.type = set("$justifySelf", js.Array(value*))
    
    inline def $left(value: Responsive[Scale]): this.type = set("$left", value.asInstanceOf[js.Any])
    
    inline def $leftVarargs(value: Scale*): this.type = set("$left", js.Array(value*))
    
    inline def $margin(value: Responsive[Scale]): this.type = set("$margin", value.asInstanceOf[js.Any])
    
    inline def $marginBottom(value: Responsive[Scale]): this.type = set("$marginBottom", value.asInstanceOf[js.Any])
    
    inline def $marginBottomVarargs(value: Scale*): this.type = set("$marginBottom", js.Array(value*))
    
    inline def $marginLeft(value: Responsive[Scale]): this.type = set("$marginLeft", value.asInstanceOf[js.Any])
    
    inline def $marginLeftVarargs(value: Scale*): this.type = set("$marginLeft", js.Array(value*))
    
    inline def $marginRight(value: Responsive[Scale]): this.type = set("$marginRight", value.asInstanceOf[js.Any])
    
    inline def $marginRightVarargs(value: Scale*): this.type = set("$marginRight", js.Array(value*))
    
    inline def $marginTop(value: Responsive[Scale]): this.type = set("$marginTop", value.asInstanceOf[js.Any])
    
    inline def $marginTopVarargs(value: Scale*): this.type = set("$marginTop", js.Array(value*))
    
    inline def $marginVarargs(value: Scale*): this.type = set("$margin", js.Array(value*))
    
    inline def $maxHeight(value: Responsive[Scale]): this.type = set("$maxHeight", value.asInstanceOf[js.Any])
    
    inline def $maxHeightVarargs(value: Scale*): this.type = set("$maxHeight", js.Array(value*))
    
    inline def $maxWidth(value: Responsive[Scale]): this.type = set("$maxWidth", value.asInstanceOf[js.Any])
    
    inline def $maxWidthVarargs(value: Scale*): this.type = set("$maxWidth", js.Array(value*))
    
    inline def $minHeight(value: Responsive[Scale]): this.type = set("$minHeight", value.asInstanceOf[js.Any])
    
    inline def $minHeightVarargs(value: Scale*): this.type = set("$minHeight", js.Array(value*))
    
    inline def $minWidth(value: Responsive[Scale]): this.type = set("$minWidth", value.asInstanceOf[js.Any])
    
    inline def $minWidthVarargs(value: Scale*): this.type = set("$minWidth", js.Array(value*))
    
    inline def $overflow(value: Responsive[typingsJapgolly.baseui.blockTypesMod.Overflow]): this.type = set("$overflow", value.asInstanceOf[js.Any])
    
    inline def $overflowVarargs(value: typingsJapgolly.baseui.blockTypesMod.Overflow*): this.type = set("$overflow", js.Array(value*))
    
    inline def $padding(value: Responsive[Scale]): this.type = set("$padding", value.asInstanceOf[js.Any])
    
    inline def $paddingBottom(value: Responsive[Scale]): this.type = set("$paddingBottom", value.asInstanceOf[js.Any])
    
    inline def $paddingBottomVarargs(value: Scale*): this.type = set("$paddingBottom", js.Array(value*))
    
    inline def $paddingLeft(value: Responsive[Scale]): this.type = set("$paddingLeft", value.asInstanceOf[js.Any])
    
    inline def $paddingLeftVarargs(value: Scale*): this.type = set("$paddingLeft", js.Array(value*))
    
    inline def $paddingRight(value: Responsive[Scale]): this.type = set("$paddingRight", value.asInstanceOf[js.Any])
    
    inline def $paddingRightVarargs(value: Scale*): this.type = set("$paddingRight", js.Array(value*))
    
    inline def $paddingTop(value: Responsive[Scale]): this.type = set("$paddingTop", value.asInstanceOf[js.Any])
    
    inline def $paddingTopVarargs(value: Scale*): this.type = set("$paddingTop", js.Array(value*))
    
    inline def $paddingVarargs(value: Scale*): this.type = set("$padding", js.Array(value*))
    
    inline def $placeContent(value: Responsive[String]): this.type = set("$placeContent", value.asInstanceOf[js.Any])
    
    inline def $placeContentVarargs(value: String*): this.type = set("$placeContent", js.Array(value*))
    
    inline def $placeItems(value: Responsive[String]): this.type = set("$placeItems", value.asInstanceOf[js.Any])
    
    inline def $placeItemsVarargs(value: String*): this.type = set("$placeItems", js.Array(value*))
    
    inline def $placeSelf(value: Responsive[String]): this.type = set("$placeSelf", value.asInstanceOf[js.Any])
    
    inline def $placeSelfVarargs(value: String*): this.type = set("$placeSelf", js.Array(value*))
    
    inline def $position(value: Responsive[Position]): this.type = set("$position", value.asInstanceOf[js.Any])
    
    inline def $positionVarargs(value: Position*): this.type = set("$position", js.Array(value*))
    
    inline def $right(value: Responsive[Scale]): this.type = set("$right", value.asInstanceOf[js.Any])
    
    inline def $rightVarargs(value: Scale*): this.type = set("$right", js.Array(value*))
    
    inline def $textOverflow(value: Responsive[String]): this.type = set("$textOverflow", value.asInstanceOf[js.Any])
    
    inline def $textOverflowVarargs(value: String*): this.type = set("$textOverflow", js.Array(value*))
    
    inline def $top(value: Responsive[Scale]): this.type = set("$top", value.asInstanceOf[js.Any])
    
    inline def $topVarargs(value: Scale*): this.type = set("$top", js.Array(value*))
    
    inline def $whiteSpace(value: Responsive[WhiteSpace]): this.type = set("$whiteSpace", value.asInstanceOf[js.Any])
    
    inline def $whiteSpaceVarargs(value: WhiteSpace*): this.type = set("$whiteSpace", js.Array(value*))
    
    inline def $width(value: Responsive[Scale]): this.type = set("$width", value.asInstanceOf[js.Any])
    
    inline def $widthVarargs(value: Scale*): this.type = set("$width", js.Array(value*))
    
    inline def alignContent(value: Responsive[AlignContent]): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    inline def alignContentVarargs(value: AlignContent*): this.type = set("alignContent", js.Array(value*))
    
    inline def alignItems(value: Responsive[AlignItems]): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def alignItemsVarargs(value: AlignItems*): this.type = set("alignItems", js.Array(value*))
    
    inline def alignSelf(value: Responsive[AlignSelf]): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def alignSelfVarargs(value: AlignSelf*): this.type = set("alignSelf", js.Array(value*))
    
    inline def as(value: C): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def backgroundAttachment(value: Responsive[String]): this.type = set("backgroundAttachment", value.asInstanceOf[js.Any])
    
    inline def backgroundAttachmentVarargs(value: String*): this.type = set("backgroundAttachment", js.Array(value*))
    
    inline def backgroundClip(value: Responsive[String]): this.type = set("backgroundClip", value.asInstanceOf[js.Any])
    
    inline def backgroundClipVarargs(value: String*): this.type = set("backgroundClip", js.Array(value*))
    
    inline def backgroundColor(value: Responsive[String]): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def backgroundColorVarargs(value: String*): this.type = set("backgroundColor", js.Array(value*))
    
    inline def backgroundImage(value: Responsive[String]): this.type = set("backgroundImage", value.asInstanceOf[js.Any])
    
    inline def backgroundImageVarargs(value: String*): this.type = set("backgroundImage", js.Array(value*))
    
    inline def backgroundOrigin(value: Responsive[String]): this.type = set("backgroundOrigin", value.asInstanceOf[js.Any])
    
    inline def backgroundOriginVarargs(value: String*): this.type = set("backgroundOrigin", js.Array(value*))
    
    inline def backgroundPosition(value: Responsive[String]): this.type = set("backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def backgroundPositionVarargs(value: String*): this.type = set("backgroundPosition", js.Array(value*))
    
    inline def backgroundRepeat(value: Responsive[String]): this.type = set("backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def backgroundRepeatVarargs(value: String*): this.type = set("backgroundRepeat", js.Array(value*))
    
    inline def backgroundSize(value: Responsive[String]): this.type = set("backgroundSize", value.asInstanceOf[js.Any])
    
    inline def backgroundSizeVarargs(value: String*): this.type = set("backgroundSize", js.Array(value*))
    
    inline def bottom(value: Responsive[Scale]): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    inline def bottomVarargs(value: Scale*): this.type = set("bottom", js.Array(value*))
    
    inline def color(value: Responsive[String]): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorVarargs(value: String*): this.type = set("color", js.Array(value*))
    
    inline def display(value: Responsive[Display]): this.type = set("display", value.asInstanceOf[js.Any])
    
    inline def displayVarargs(value: Display*): this.type = set("display", js.Array(value*))
    
    inline def flex(value: Responsive[Flex]): this.type = set("flex", value.asInstanceOf[js.Any])
    
    inline def flexDirection(value: Responsive[FlexDirection]): this.type = set("flexDirection", value.asInstanceOf[js.Any])
    
    inline def flexDirectionVarargs(value: FlexDirection*): this.type = set("flexDirection", js.Array(value*))
    
    inline def flexVarargs(value: Flex*): this.type = set("flex", js.Array(value*))
    
    inline def flexWrap(value: Responsive[Boolean]): this.type = set("flexWrap", value.asInstanceOf[js.Any])
    
    inline def flexWrapVarargs(value: Boolean*): this.type = set("flexWrap", js.Array(value*))
    
    inline def font(value: String | js.Array[String]): this.type = set("font", value.asInstanceOf[js.Any])
    
    inline def fontVarargs(value: String*): this.type = set("font", js.Array(value*))
    
    inline def grid(value: Responsive[String]): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: Responsive[String]): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def gridAreaVarargs(value: String*): this.type = set("gridArea", js.Array(value*))
    
    inline def gridAutoColumns(value: Responsive[String]): this.type = set("gridAutoColumns", value.asInstanceOf[js.Any])
    
    inline def gridAutoColumnsVarargs(value: String*): this.type = set("gridAutoColumns", js.Array(value*))
    
    inline def gridAutoFlow(value: Responsive[GridAutoFlow]): this.type = set("gridAutoFlow", value.asInstanceOf[js.Any])
    
    inline def gridAutoFlowVarargs(value: GridAutoFlow*): this.type = set("gridAutoFlow", js.Array(value*))
    
    inline def gridAutoRows(value: Responsive[String]): this.type = set("gridAutoRows", value.asInstanceOf[js.Any])
    
    inline def gridAutoRowsVarargs(value: String*): this.type = set("gridAutoRows", js.Array(value*))
    
    inline def gridColumn(value: Responsive[String]): this.type = set("gridColumn", value.asInstanceOf[js.Any])
    
    inline def gridColumnEnd(value: Responsive[String]): this.type = set("gridColumnEnd", value.asInstanceOf[js.Any])
    
    inline def gridColumnEndVarargs(value: String*): this.type = set("gridColumnEnd", js.Array(value*))
    
    inline def gridColumnGap(value: Responsive[Scale]): this.type = set("gridColumnGap", value.asInstanceOf[js.Any])
    
    inline def gridColumnGapVarargs(value: Scale*): this.type = set("gridColumnGap", js.Array(value*))
    
    inline def gridColumnStart(value: Responsive[String]): this.type = set("gridColumnStart", value.asInstanceOf[js.Any])
    
    inline def gridColumnStartVarargs(value: String*): this.type = set("gridColumnStart", js.Array(value*))
    
    inline def gridColumnVarargs(value: String*): this.type = set("gridColumn", js.Array(value*))
    
    inline def gridGap(value: Responsive[Scale]): this.type = set("gridGap", value.asInstanceOf[js.Any])
    
    inline def gridGapVarargs(value: Scale*): this.type = set("gridGap", js.Array(value*))
    
    inline def gridRow(value: Responsive[String]): this.type = set("gridRow", value.asInstanceOf[js.Any])
    
    inline def gridRowEnd(value: Responsive[String]): this.type = set("gridRowEnd", value.asInstanceOf[js.Any])
    
    inline def gridRowEndVarargs(value: String*): this.type = set("gridRowEnd", js.Array(value*))
    
    inline def gridRowGap(value: Responsive[Scale]): this.type = set("gridRowGap", value.asInstanceOf[js.Any])
    
    inline def gridRowGapVarargs(value: Scale*): this.type = set("gridRowGap", js.Array(value*))
    
    inline def gridRowStart(value: Responsive[String]): this.type = set("gridRowStart", value.asInstanceOf[js.Any])
    
    inline def gridRowStartVarargs(value: String*): this.type = set("gridRowStart", js.Array(value*))
    
    inline def gridRowVarargs(value: String*): this.type = set("gridRow", js.Array(value*))
    
    inline def gridTemplate(value: Responsive[String]): this.type = set("gridTemplate", value.asInstanceOf[js.Any])
    
    inline def gridTemplateAreas(value: Responsive[String]): this.type = set("gridTemplateAreas", value.asInstanceOf[js.Any])
    
    inline def gridTemplateAreasVarargs(value: String*): this.type = set("gridTemplateAreas", js.Array(value*))
    
    inline def gridTemplateColumns(value: Responsive[String]): this.type = set("gridTemplateColumns", value.asInstanceOf[js.Any])
    
    inline def gridTemplateColumnsVarargs(value: String*): this.type = set("gridTemplateColumns", js.Array(value*))
    
    inline def gridTemplateRows(value: Responsive[String]): this.type = set("gridTemplateRows", value.asInstanceOf[js.Any])
    
    inline def gridTemplateRowsVarargs(value: String*): this.type = set("gridTemplateRows", js.Array(value*))
    
    inline def gridTemplateVarargs(value: String*): this.type = set("gridTemplate", js.Array(value*))
    
    inline def gridVarargs(value: String*): this.type = set("grid", js.Array(value*))
    
    inline def height(value: Responsive[Scale]): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def heightVarargs(value: Scale*): this.type = set("height", js.Array(value*))
    
    inline def justifyContent(value: Responsive[JustifyContent]): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    inline def justifyContentVarargs(value: JustifyContent*): this.type = set("justifyContent", js.Array(value*))
    
    inline def justifyItems(value: Responsive[JustifyItems]): this.type = set("justifyItems", value.asInstanceOf[js.Any])
    
    inline def justifyItemsVarargs(value: JustifyItems*): this.type = set("justifyItems", js.Array(value*))
    
    inline def justifySelf(value: Responsive[JustifySelf]): this.type = set("justifySelf", value.asInstanceOf[js.Any])
    
    inline def justifySelfVarargs(value: JustifySelf*): this.type = set("justifySelf", js.Array(value*))
    
    inline def left(value: Responsive[Scale]): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def leftVarargs(value: Scale*): this.type = set("left", js.Array(value*))
    
    inline def margin(value: Responsive[Scale]): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def marginBottom(value: Responsive[Scale]): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    inline def marginBottomVarargs(value: Scale*): this.type = set("marginBottom", js.Array(value*))
    
    inline def marginLeft(value: Responsive[Scale]): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    inline def marginLeftVarargs(value: Scale*): this.type = set("marginLeft", js.Array(value*))
    
    inline def marginRight(value: Responsive[Scale]): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    inline def marginRightVarargs(value: Scale*): this.type = set("marginRight", js.Array(value*))
    
    inline def marginTop(value: Responsive[Scale]): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    inline def marginTopVarargs(value: Scale*): this.type = set("marginTop", js.Array(value*))
    
    inline def marginVarargs(value: Scale*): this.type = set("margin", js.Array(value*))
    
    inline def maxHeight(value: Responsive[Scale]): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxHeightVarargs(value: Scale*): this.type = set("maxHeight", js.Array(value*))
    
    inline def maxWidth(value: Responsive[Scale]): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def maxWidthVarargs(value: Scale*): this.type = set("maxWidth", js.Array(value*))
    
    inline def minHeight(value: Responsive[Scale]): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minHeightVarargs(value: Scale*): this.type = set("minHeight", js.Array(value*))
    
    inline def minWidth(value: Responsive[Scale]): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def minWidthVarargs(value: Scale*): this.type = set("minWidth", js.Array(value*))
    
    inline def overflow(value: Responsive[typingsJapgolly.baseui.blockTypesMod.Overflow]): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def overflowVarargs(value: typingsJapgolly.baseui.blockTypesMod.Overflow*): this.type = set("overflow", js.Array(value*))
    
    inline def overrides(value: BlockOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def padding(value: Responsive[Scale]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingBottom(value: Responsive[Scale]): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    inline def paddingBottomVarargs(value: Scale*): this.type = set("paddingBottom", js.Array(value*))
    
    inline def paddingLeft(value: Responsive[Scale]): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingLeftVarargs(value: Scale*): this.type = set("paddingLeft", js.Array(value*))
    
    inline def paddingRight(value: Responsive[Scale]): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def paddingRightVarargs(value: Scale*): this.type = set("paddingRight", js.Array(value*))
    
    inline def paddingTop(value: Responsive[Scale]): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    inline def paddingTopVarargs(value: Scale*): this.type = set("paddingTop", js.Array(value*))
    
    inline def paddingVarargs(value: Scale*): this.type = set("padding", js.Array(value*))
    
    inline def placeContent(value: Responsive[String]): this.type = set("placeContent", value.asInstanceOf[js.Any])
    
    inline def placeContentVarargs(value: String*): this.type = set("placeContent", js.Array(value*))
    
    inline def placeItems(value: Responsive[String]): this.type = set("placeItems", value.asInstanceOf[js.Any])
    
    inline def placeItemsVarargs(value: String*): this.type = set("placeItems", js.Array(value*))
    
    inline def placeSelf(value: Responsive[String]): this.type = set("placeSelf", value.asInstanceOf[js.Any])
    
    inline def placeSelfVarargs(value: String*): this.type = set("placeSelf", js.Array(value*))
    
    inline def position(value: Responsive[Position]): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def positionVarargs(value: Position*): this.type = set("position", js.Array(value*))
    
    inline def right(value: Responsive[Scale]): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def rightVarargs(value: Scale*): this.type = set("right", js.Array(value*))
    
    inline def textOverflow(value: Responsive[String]): this.type = set("textOverflow", value.asInstanceOf[js.Any])
    
    inline def textOverflowVarargs(value: String*): this.type = set("textOverflow", js.Array(value*))
    
    inline def top(value: Responsive[Scale]): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def topVarargs(value: Scale*): this.type = set("top", js.Array(value*))
    
    inline def whiteSpace(value: Responsive[WhiteSpace]): this.type = set("whiteSpace", value.asInstanceOf[js.Any])
    
    inline def whiteSpaceVarargs(value: WhiteSpace*): this.type = set("whiteSpace", js.Array(value*))
    
    inline def width(value: Responsive[Scale]): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def widthVarargs(value: Scale*): this.type = set("width", js.Array(value*))
  }
  
  implicit def make[C /* <: ElementType */](companion: AspectRatioBoxBody.type): Builder[C] = new Builder[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](
    p: BlockProps[C] & (Omit[
      StyledBlockProps & ComponentProps[C], 
      /* keyof baseui.baseui/block/types.BlockProps<react.react.ElementType<any>> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.baseui.baseuiStrings.children, typingsJapgolly.baseui.baseuiStrings.as_, typingsJapgolly.baseui.baseuiStrings.overrides */ Any
    ])
  ): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
