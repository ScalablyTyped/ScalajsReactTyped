package typingsJapgolly.uiBox.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.AlignContent
import typingsJapgolly.csstype.mod.Property.AlignItems
import typingsJapgolly.csstype.mod.Property.AlignSelf
import typingsJapgolly.csstype.mod.Property.Background
import typingsJapgolly.csstype.mod.Property.BackgroundBlendMode
import typingsJapgolly.csstype.mod.Property.BackgroundClip
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.csstype.mod.Property.BackgroundImage
import typingsJapgolly.csstype.mod.Property.BackgroundOrigin
import typingsJapgolly.csstype.mod.Property.BackgroundPosition
import typingsJapgolly.csstype.mod.Property.BackgroundRepeat
import typingsJapgolly.csstype.mod.Property.BackgroundSize
import typingsJapgolly.csstype.mod.Property.Border
import typingsJapgolly.csstype.mod.Property.BorderBottom
import typingsJapgolly.csstype.mod.Property.BorderBottomColor
import typingsJapgolly.csstype.mod.Property.BorderBottomLeftRadius
import typingsJapgolly.csstype.mod.Property.BorderBottomRightRadius
import typingsJapgolly.csstype.mod.Property.BorderBottomStyle
import typingsJapgolly.csstype.mod.Property.BorderBottomWidth
import typingsJapgolly.csstype.mod.Property.BorderColor
import typingsJapgolly.csstype.mod.Property.BorderLeft
import typingsJapgolly.csstype.mod.Property.BorderLeftColor
import typingsJapgolly.csstype.mod.Property.BorderLeftStyle
import typingsJapgolly.csstype.mod.Property.BorderLeftWidth
import typingsJapgolly.csstype.mod.Property.BorderRadius
import typingsJapgolly.csstype.mod.Property.BorderRight
import typingsJapgolly.csstype.mod.Property.BorderRightColor
import typingsJapgolly.csstype.mod.Property.BorderRightStyle
import typingsJapgolly.csstype.mod.Property.BorderRightWidth
import typingsJapgolly.csstype.mod.Property.BorderStyle
import typingsJapgolly.csstype.mod.Property.BorderTop
import typingsJapgolly.csstype.mod.Property.BorderTopColor
import typingsJapgolly.csstype.mod.Property.BorderTopLeftRadius
import typingsJapgolly.csstype.mod.Property.BorderTopRightRadius
import typingsJapgolly.csstype.mod.Property.BorderTopStyle
import typingsJapgolly.csstype.mod.Property.BorderTopWidth
import typingsJapgolly.csstype.mod.Property.BorderWidth
import typingsJapgolly.csstype.mod.Property.Bottom
import typingsJapgolly.csstype.mod.Property.BoxShadow
import typingsJapgolly.csstype.mod.Property.BoxSizing
import typingsJapgolly.csstype.mod.Property.Clear
import typingsJapgolly.csstype.mod.Property.Color
import typingsJapgolly.csstype.mod.Property.ColumnGap
import typingsJapgolly.csstype.mod.Property.Cursor
import typingsJapgolly.csstype.mod.Property.Display
import typingsJapgolly.csstype.mod.Property.Flex
import typingsJapgolly.csstype.mod.Property.FlexBasis
import typingsJapgolly.csstype.mod.Property.FlexDirection
import typingsJapgolly.csstype.mod.Property.FlexFlow
import typingsJapgolly.csstype.mod.Property.FlexGrow
import typingsJapgolly.csstype.mod.Property.FlexShrink
import typingsJapgolly.csstype.mod.Property.FlexWrap
import typingsJapgolly.csstype.mod.Property.Float
import typingsJapgolly.csstype.mod.Property.Font
import typingsJapgolly.csstype.mod.Property.FontFamily
import typingsJapgolly.csstype.mod.Property.FontSize
import typingsJapgolly.csstype.mod.Property.FontStyle
import typingsJapgolly.csstype.mod.Property.FontVariant
import typingsJapgolly.csstype.mod.Property.FontWeight
import typingsJapgolly.csstype.mod.Property.Gap
import typingsJapgolly.csstype.mod.Property.Grid
import typingsJapgolly.csstype.mod.Property.GridArea
import typingsJapgolly.csstype.mod.Property.GridAutoColumns
import typingsJapgolly.csstype.mod.Property.GridAutoFlow
import typingsJapgolly.csstype.mod.Property.GridAutoRows
import typingsJapgolly.csstype.mod.Property.GridColumn
import typingsJapgolly.csstype.mod.Property.GridColumnEnd
import typingsJapgolly.csstype.mod.Property.GridColumnGap
import typingsJapgolly.csstype.mod.Property.GridColumnStart
import typingsJapgolly.csstype.mod.Property.GridGap
import typingsJapgolly.csstype.mod.Property.GridRow
import typingsJapgolly.csstype.mod.Property.GridRowEnd
import typingsJapgolly.csstype.mod.Property.GridRowGap
import typingsJapgolly.csstype.mod.Property.GridRowStart
import typingsJapgolly.csstype.mod.Property.GridTemplate
import typingsJapgolly.csstype.mod.Property.GridTemplateAreas
import typingsJapgolly.csstype.mod.Property.GridTemplateColumns
import typingsJapgolly.csstype.mod.Property.GridTemplateRows
import typingsJapgolly.csstype.mod.Property.Height
import typingsJapgolly.csstype.mod.Property.JustifyContent
import typingsJapgolly.csstype.mod.Property.JustifyItems
import typingsJapgolly.csstype.mod.Property.JustifySelf
import typingsJapgolly.csstype.mod.Property.Left
import typingsJapgolly.csstype.mod.Property.LetterSpacing
import typingsJapgolly.csstype.mod.Property.LineHeight
import typingsJapgolly.csstype.mod.Property.ListStyle
import typingsJapgolly.csstype.mod.Property.ListStyleImage
import typingsJapgolly.csstype.mod.Property.ListStylePosition
import typingsJapgolly.csstype.mod.Property.ListStyleType
import typingsJapgolly.csstype.mod.Property.Margin
import typingsJapgolly.csstype.mod.Property.MarginBottom
import typingsJapgolly.csstype.mod.Property.MarginLeft
import typingsJapgolly.csstype.mod.Property.MarginRight
import typingsJapgolly.csstype.mod.Property.MarginTop
import typingsJapgolly.csstype.mod.Property.MaxHeight
import typingsJapgolly.csstype.mod.Property.MaxWidth
import typingsJapgolly.csstype.mod.Property.MinHeight
import typingsJapgolly.csstype.mod.Property.MinWidth
import typingsJapgolly.csstype.mod.Property.Opacity
import typingsJapgolly.csstype.mod.Property.Order
import typingsJapgolly.csstype.mod.Property.Outline
import typingsJapgolly.csstype.mod.Property.Overflow
import typingsJapgolly.csstype.mod.Property.OverflowX
import typingsJapgolly.csstype.mod.Property.OverflowY
import typingsJapgolly.csstype.mod.Property.Padding
import typingsJapgolly.csstype.mod.Property.PaddingBottom
import typingsJapgolly.csstype.mod.Property.PaddingLeft
import typingsJapgolly.csstype.mod.Property.PaddingRight
import typingsJapgolly.csstype.mod.Property.PaddingTop
import typingsJapgolly.csstype.mod.Property.PlaceContent
import typingsJapgolly.csstype.mod.Property.PlaceItems
import typingsJapgolly.csstype.mod.Property.PlaceSelf
import typingsJapgolly.csstype.mod.Property.PointerEvents
import typingsJapgolly.csstype.mod.Property.Position
import typingsJapgolly.csstype.mod.Property.Resize
import typingsJapgolly.csstype.mod.Property.Right
import typingsJapgolly.csstype.mod.Property.RowGap
import typingsJapgolly.csstype.mod.Property.TextAlign
import typingsJapgolly.csstype.mod.Property.TextDecoration
import typingsJapgolly.csstype.mod.Property.TextOverflow
import typingsJapgolly.csstype.mod.Property.TextShadow
import typingsJapgolly.csstype.mod.Property.TextTransform
import typingsJapgolly.csstype.mod.Property.Top
import typingsJapgolly.csstype.mod.Property.Transform
import typingsJapgolly.csstype.mod.Property.TransformOrigin
import typingsJapgolly.csstype.mod.Property.Transition
import typingsJapgolly.csstype.mod.Property.TransitionDelay
import typingsJapgolly.csstype.mod.Property.TransitionDuration
import typingsJapgolly.csstype.mod.Property.TransitionProperty
import typingsJapgolly.csstype.mod.Property.TransitionTimingFunction
import typingsJapgolly.csstype.mod.Property.UserSelect
import typingsJapgolly.csstype.mod.Property.VerticalAlign
import typingsJapgolly.csstype.mod.Property.Visibility
import typingsJapgolly.csstype.mod.Property.WhiteSpace
import typingsJapgolly.csstype.mod.Property.Width
import typingsJapgolly.csstype.mod.Property.WordBreak
import typingsJapgolly.csstype.mod.Property.WordWrap
import typingsJapgolly.csstype.mod.Property.ZIndex
import typingsJapgolly.uiBox.distSrcTypesBoxTypesMod.BoxProps
import typingsJapgolly.uiBox.distSrcTypesEnhancersMod.BoxPropValue
import typingsJapgolly.uiBox.uiBoxBooleans.`false`
import typingsJapgolly.uiBox.uiBoxInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UiBox {
  
  inline def apply[E /* <: ElementType */](): Builder[E] = {
    val __props = js.Dynamic.literal()
    new Builder[E](js.Array(this.component, __props.asInstanceOf[BoxProps[E]]))
  }
  
  @JSImport("ui-box", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[E /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def alignContent(value: AlignContent | Double | `false`): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    inline def alignContentNull: this.type = set("alignContent", null)
    
    inline def alignItems(value: AlignItems | Double | `false`): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def alignItemsNull: this.type = set("alignItems", null)
    
    inline def alignSelf(value: AlignSelf | Double | `false`): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def alignSelfNull: this.type = set("alignSelf", null)
    
    inline def allowUnsafeHref(value: Boolean): this.type = set("allowUnsafeHref", value.asInstanceOf[js.Any])
    
    inline def background(value: (Background[String | `0`]) | Double | `false`): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def backgroundBlendMode(value: BackgroundBlendMode | Double | `false`): this.type = set("backgroundBlendMode", value.asInstanceOf[js.Any])
    
    inline def backgroundBlendModeNull: this.type = set("backgroundBlendMode", null)
    
    inline def backgroundClip(value: BackgroundClip | Double | `false`): this.type = set("backgroundClip", value.asInstanceOf[js.Any])
    
    inline def backgroundClipNull: this.type = set("backgroundClip", null)
    
    inline def backgroundColor(value: BackgroundColor | Double | `false`): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def backgroundColorNull: this.type = set("backgroundColor", null)
    
    inline def backgroundImage(value: BackgroundImage | Double | `false`): this.type = set("backgroundImage", value.asInstanceOf[js.Any])
    
    inline def backgroundImageNull: this.type = set("backgroundImage", null)
    
    inline def backgroundNull: this.type = set("background", null)
    
    inline def backgroundOrigin(value: BackgroundOrigin | Double | `false`): this.type = set("backgroundOrigin", value.asInstanceOf[js.Any])
    
    inline def backgroundOriginNull: this.type = set("backgroundOrigin", null)
    
    inline def backgroundPosition(value: (BackgroundPosition[String | `0`]) | Double | `false`): this.type = set("backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def backgroundPositionNull: this.type = set("backgroundPosition", null)
    
    inline def backgroundRepeat(value: BackgroundRepeat | Double | `false`): this.type = set("backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def backgroundRepeatNull: this.type = set("backgroundRepeat", null)
    
    inline def backgroundSize(value: (BackgroundSize[String | `0`]) | Double | `false`): this.type = set("backgroundSize", value.asInstanceOf[js.Any])
    
    inline def backgroundSizeNull: this.type = set("backgroundSize", null)
    
    inline def border(value: (Border[String | `0`]) | Double | `false`): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def borderBottom(value: (BorderBottom[String | `0`]) | Double | `false`): this.type = set("borderBottom", value.asInstanceOf[js.Any])
    
    inline def borderBottomColor(value: BorderBottomColor | Double | `false`): this.type = set("borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def borderBottomColorNull: this.type = set("borderBottomColor", null)
    
    inline def borderBottomLeftRadius(value: (BorderBottomLeftRadius[String | `0`]) | Double | `false`): this.type = set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    inline def borderBottomLeftRadiusNull: this.type = set("borderBottomLeftRadius", null)
    
    inline def borderBottomNull: this.type = set("borderBottom", null)
    
    inline def borderBottomRightRadius(value: (BorderBottomRightRadius[String | `0`]) | Double | `false`): this.type = set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    inline def borderBottomRightRadiusNull: this.type = set("borderBottomRightRadius", null)
    
    inline def borderBottomStyle(value: BorderBottomStyle | Double | `false`): this.type = set("borderBottomStyle", value.asInstanceOf[js.Any])
    
    inline def borderBottomStyleNull: this.type = set("borderBottomStyle", null)
    
    inline def borderBottomWidth(value: (BorderBottomWidth[String | `0`]) | Double | `false`): this.type = set("borderBottomWidth", value.asInstanceOf[js.Any])
    
    inline def borderBottomWidthNull: this.type = set("borderBottomWidth", null)
    
    inline def borderColor(value: BorderColor | Double | `false`): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderColorNull: this.type = set("borderColor", null)
    
    inline def borderLeft(value: (BorderLeft[String | `0`]) | Double | `false`): this.type = set("borderLeft", value.asInstanceOf[js.Any])
    
    inline def borderLeftColor(value: BorderLeftColor | Double | `false`): this.type = set("borderLeftColor", value.asInstanceOf[js.Any])
    
    inline def borderLeftColorNull: this.type = set("borderLeftColor", null)
    
    inline def borderLeftNull: this.type = set("borderLeft", null)
    
    inline def borderLeftStyle(value: BorderLeftStyle | Double | `false`): this.type = set("borderLeftStyle", value.asInstanceOf[js.Any])
    
    inline def borderLeftStyleNull: this.type = set("borderLeftStyle", null)
    
    inline def borderLeftWidth(value: (BorderLeftWidth[String | `0`]) | Double | `false`): this.type = set("borderLeftWidth", value.asInstanceOf[js.Any])
    
    inline def borderLeftWidthNull: this.type = set("borderLeftWidth", null)
    
    inline def borderNull: this.type = set("border", null)
    
    inline def borderRadius(value: (BorderRadius[String | `0`]) | Double | `false`): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def borderRadiusNull: this.type = set("borderRadius", null)
    
    inline def borderRight(value: (BorderRight[String | `0`]) | Double | `false`): this.type = set("borderRight", value.asInstanceOf[js.Any])
    
    inline def borderRightColor(value: BorderRightColor | Double | `false`): this.type = set("borderRightColor", value.asInstanceOf[js.Any])
    
    inline def borderRightColorNull: this.type = set("borderRightColor", null)
    
    inline def borderRightNull: this.type = set("borderRight", null)
    
    inline def borderRightStyle(value: BorderRightStyle | Double | `false`): this.type = set("borderRightStyle", value.asInstanceOf[js.Any])
    
    inline def borderRightStyleNull: this.type = set("borderRightStyle", null)
    
    inline def borderRightWidth(value: (BorderRightWidth[String | `0`]) | Double | `false`): this.type = set("borderRightWidth", value.asInstanceOf[js.Any])
    
    inline def borderRightWidthNull: this.type = set("borderRightWidth", null)
    
    inline def borderStyle(value: BorderStyle | Double | `false`): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    
    inline def borderStyleNull: this.type = set("borderStyle", null)
    
    inline def borderTop(value: (BorderTop[String | `0`]) | Double | `false`): this.type = set("borderTop", value.asInstanceOf[js.Any])
    
    inline def borderTopColor(value: BorderTopColor | Double | `false`): this.type = set("borderTopColor", value.asInstanceOf[js.Any])
    
    inline def borderTopColorNull: this.type = set("borderTopColor", null)
    
    inline def borderTopLeftRadius(value: (BorderTopLeftRadius[String | `0`]) | Double | `false`): this.type = set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    inline def borderTopLeftRadiusNull: this.type = set("borderTopLeftRadius", null)
    
    inline def borderTopNull: this.type = set("borderTop", null)
    
    inline def borderTopRightRadius(value: (BorderTopRightRadius[String | `0`]) | Double | `false`): this.type = set("borderTopRightRadius", value.asInstanceOf[js.Any])
    
    inline def borderTopRightRadiusNull: this.type = set("borderTopRightRadius", null)
    
    inline def borderTopStyle(value: BorderTopStyle | Double | `false`): this.type = set("borderTopStyle", value.asInstanceOf[js.Any])
    
    inline def borderTopStyleNull: this.type = set("borderTopStyle", null)
    
    inline def borderTopWidth(value: (BorderTopWidth[String | `0`]) | Double | `false`): this.type = set("borderTopWidth", value.asInstanceOf[js.Any])
    
    inline def borderTopWidthNull: this.type = set("borderTopWidth", null)
    
    inline def borderWidth(value: (BorderWidth[String | `0`]) | Double | `false`): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def borderWidthNull: this.type = set("borderWidth", null)
    
    inline def bottom(value: (Bottom[String | `0`]) | Double | `false`): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    inline def bottomNull: this.type = set("bottom", null)
    
    inline def boxShadow(value: BoxShadow | Double | `false`): this.type = set("boxShadow", value.asInstanceOf[js.Any])
    
    inline def boxShadowNull: this.type = set("boxShadow", null)
    
    inline def boxSizing(value: BoxSizing | Double | `false`): this.type = set("boxSizing", value.asInstanceOf[js.Any])
    
    inline def boxSizingNull: this.type = set("boxSizing", null)
    
    inline def clear(value: Clear | Double | `false`): this.type = set("clear", value.asInstanceOf[js.Any])
    
    inline def clearNull: this.type = set("clear", null)
    
    inline def clearfix(value: Boolean): this.type = set("clearfix", value.asInstanceOf[js.Any])
    
    inline def color(value: Color | Double | `false`): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorNull: this.type = set("color", null)
    
    inline def columnGap(value: (ColumnGap[String | `0`]) | Double | `false`): this.type = set("columnGap", value.asInstanceOf[js.Any])
    
    inline def columnGapNull: this.type = set("columnGap", null)
    
    inline def cursor(value: Cursor | Double | `false`): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    inline def cursorNull: this.type = set("cursor", null)
    
    inline def display(value: Display | Double | `false`): this.type = set("display", value.asInstanceOf[js.Any])
    
    inline def displayNull: this.type = set("display", null)
    
    inline def flex(value: (Flex[String | `0`]) | Double | `false`): this.type = set("flex", value.asInstanceOf[js.Any])
    
    inline def flexBasis(value: (FlexBasis[String | `0`]) | Double | `false`): this.type = set("flexBasis", value.asInstanceOf[js.Any])
    
    inline def flexBasisNull: this.type = set("flexBasis", null)
    
    inline def flexDirection(value: FlexDirection | Double | `false`): this.type = set("flexDirection", value.asInstanceOf[js.Any])
    
    inline def flexDirectionNull: this.type = set("flexDirection", null)
    
    inline def flexFlow(value: FlexFlow | Double | `false`): this.type = set("flexFlow", value.asInstanceOf[js.Any])
    
    inline def flexFlowNull: this.type = set("flexFlow", null)
    
    inline def flexGrow(value: FlexGrow | Double | `false`): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    
    inline def flexGrowNull: this.type = set("flexGrow", null)
    
    inline def flexNull: this.type = set("flex", null)
    
    inline def flexShrink(value: FlexShrink | Double | `false`): this.type = set("flexShrink", value.asInstanceOf[js.Any])
    
    inline def flexShrinkNull: this.type = set("flexShrink", null)
    
    inline def flexWrap(value: FlexWrap | Double | `false`): this.type = set("flexWrap", value.asInstanceOf[js.Any])
    
    inline def flexWrapNull: this.type = set("flexWrap", null)
    
    inline def float(value: Float | Double | `false`): this.type = set("float", value.asInstanceOf[js.Any])
    
    inline def floatNull: this.type = set("float", null)
    
    inline def font(value: Font | Double | `false`): this.type = set("font", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: FontFamily | Double | `false`): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontFamilyNull: this.type = set("fontFamily", null)
    
    inline def fontNull: this.type = set("font", null)
    
    inline def fontSize(value: (FontSize[String | `0`]) | Double | `false`): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def fontSizeNull: this.type = set("fontSize", null)
    
    inline def fontStyle(value: FontStyle | Double | `false`): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    inline def fontStyleNull: this.type = set("fontStyle", null)
    
    inline def fontVariant(value: FontVariant | Double | `false`): this.type = set("fontVariant", value.asInstanceOf[js.Any])
    
    inline def fontVariantNull: this.type = set("fontVariant", null)
    
    inline def fontWeight(value: FontWeight | Double | `false`): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    inline def fontWeightNull: this.type = set("fontWeight", null)
    
    inline def gap(value: (Gap[String | `0`]) | Double | `false`): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def gapNull: this.type = set("gap", null)
    
    inline def grid(value: Grid | Double | `false`): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridArea | Double | `false`): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def gridAreaNull: this.type = set("gridArea", null)
    
    inline def gridAutoColumns(value: (GridAutoColumns[String | `0`]) | Double | `false`): this.type = set("gridAutoColumns", value.asInstanceOf[js.Any])
    
    inline def gridAutoColumnsNull: this.type = set("gridAutoColumns", null)
    
    inline def gridAutoFlow(value: GridAutoFlow | Double | `false`): this.type = set("gridAutoFlow", value.asInstanceOf[js.Any])
    
    inline def gridAutoFlowNull: this.type = set("gridAutoFlow", null)
    
    inline def gridAutoRows(value: (GridAutoRows[String | `0`]) | Double | `false`): this.type = set("gridAutoRows", value.asInstanceOf[js.Any])
    
    inline def gridAutoRowsNull: this.type = set("gridAutoRows", null)
    
    inline def gridColumn(value: GridColumn | Double | `false`): this.type = set("gridColumn", value.asInstanceOf[js.Any])
    
    inline def gridColumnEnd(value: GridColumnEnd | Double | `false`): this.type = set("gridColumnEnd", value.asInstanceOf[js.Any])
    
    inline def gridColumnEndNull: this.type = set("gridColumnEnd", null)
    
    inline def gridColumnGap(value: (GridColumnGap[String | `0`]) | Double | `false`): this.type = set("gridColumnGap", value.asInstanceOf[js.Any])
    
    inline def gridColumnGapNull: this.type = set("gridColumnGap", null)
    
    inline def gridColumnNull: this.type = set("gridColumn", null)
    
    inline def gridColumnStart(value: GridColumnStart | Double | `false`): this.type = set("gridColumnStart", value.asInstanceOf[js.Any])
    
    inline def gridColumnStartNull: this.type = set("gridColumnStart", null)
    
    inline def gridGap(value: (GridGap[String | `0`]) | Double | `false`): this.type = set("gridGap", value.asInstanceOf[js.Any])
    
    inline def gridGapNull: this.type = set("gridGap", null)
    
    inline def gridNull: this.type = set("grid", null)
    
    inline def gridRow(value: GridRow | Double | `false`): this.type = set("gridRow", value.asInstanceOf[js.Any])
    
    inline def gridRowEnd(value: GridRowEnd | Double | `false`): this.type = set("gridRowEnd", value.asInstanceOf[js.Any])
    
    inline def gridRowEndNull: this.type = set("gridRowEnd", null)
    
    inline def gridRowGap(value: (GridRowGap[String | `0`]) | Double | `false`): this.type = set("gridRowGap", value.asInstanceOf[js.Any])
    
    inline def gridRowGapNull: this.type = set("gridRowGap", null)
    
    inline def gridRowNull: this.type = set("gridRow", null)
    
    inline def gridRowStart(value: GridRowStart | Double | `false`): this.type = set("gridRowStart", value.asInstanceOf[js.Any])
    
    inline def gridRowStartNull: this.type = set("gridRowStart", null)
    
    inline def gridTemplate(value: GridTemplate | Double | `false`): this.type = set("gridTemplate", value.asInstanceOf[js.Any])
    
    inline def gridTemplateAreas(value: GridTemplateAreas | Double | `false`): this.type = set("gridTemplateAreas", value.asInstanceOf[js.Any])
    
    inline def gridTemplateAreasNull: this.type = set("gridTemplateAreas", null)
    
    inline def gridTemplateColumns(value: (GridTemplateColumns[String | `0`]) | Double | `false`): this.type = set("gridTemplateColumns", value.asInstanceOf[js.Any])
    
    inline def gridTemplateColumnsNull: this.type = set("gridTemplateColumns", null)
    
    inline def gridTemplateNull: this.type = set("gridTemplate", null)
    
    inline def gridTemplateRows(value: (GridTemplateRows[String | `0`]) | Double | `false`): this.type = set("gridTemplateRows", value.asInstanceOf[js.Any])
    
    inline def gridTemplateRowsNull: this.type = set("gridTemplateRows", null)
    
    inline def height(value: (Height[String | `0`]) | Double | `false`): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def heightNull: this.type = set("height", null)
    
    inline def is(value: E): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def justifyContent(value: JustifyContent | Double | `false`): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    inline def justifyContentNull: this.type = set("justifyContent", null)
    
    inline def justifyItems(value: JustifyItems | Double | `false`): this.type = set("justifyItems", value.asInstanceOf[js.Any])
    
    inline def justifyItemsNull: this.type = set("justifyItems", null)
    
    inline def justifySelf(value: JustifySelf | Double | `false`): this.type = set("justifySelf", value.asInstanceOf[js.Any])
    
    inline def justifySelfNull: this.type = set("justifySelf", null)
    
    inline def left(value: (Left[String | `0`]) | Double | `false`): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def leftNull: this.type = set("left", null)
    
    inline def letterSpacing(value: (LetterSpacing[String | `0`]) | Double | `false`): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    inline def letterSpacingNull: this.type = set("letterSpacing", null)
    
    inline def lineHeight(value: (LineHeight[String | `0`]) | Double | `false`): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    inline def lineHeightNull: this.type = set("lineHeight", null)
    
    inline def listStyle(value: ListStyle | Double | `false`): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    inline def listStyleImage(value: ListStyleImage | Double | `false`): this.type = set("listStyleImage", value.asInstanceOf[js.Any])
    
    inline def listStyleImageNull: this.type = set("listStyleImage", null)
    
    inline def listStyleNull: this.type = set("listStyle", null)
    
    inline def listStylePosition(value: ListStylePosition | Double | `false`): this.type = set("listStylePosition", value.asInstanceOf[js.Any])
    
    inline def listStylePositionNull: this.type = set("listStylePosition", null)
    
    inline def listStyleType(value: ListStyleType | Double | `false`): this.type = set("listStyleType", value.asInstanceOf[js.Any])
    
    inline def listStyleTypeNull: this.type = set("listStyleType", null)
    
    inline def margin(value: (Margin[String | `0`]) | Double | `false`): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def marginBottom(value: (MarginBottom[String | `0`]) | Double | `false`): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    inline def marginBottomNull: this.type = set("marginBottom", null)
    
    inline def marginLeft(value: (MarginLeft[String | `0`]) | Double | `false`): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    inline def marginLeftNull: this.type = set("marginLeft", null)
    
    inline def marginNull: this.type = set("margin", null)
    
    inline def marginRight(value: (MarginRight[String | `0`]) | Double | `false`): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    inline def marginRightNull: this.type = set("marginRight", null)
    
    inline def marginTop(value: (MarginTop[String | `0`]) | Double | `false`): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    inline def marginTopNull: this.type = set("marginTop", null)
    
    inline def marginX(value: BoxPropValue): this.type = set("marginX", value.asInstanceOf[js.Any])
    
    inline def marginXNull: this.type = set("marginX", null)
    
    inline def marginY(value: BoxPropValue): this.type = set("marginY", value.asInstanceOf[js.Any])
    
    inline def marginYNull: this.type = set("marginY", null)
    
    inline def maxHeight(value: (MaxHeight[String | `0`]) | Double | `false`): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxHeightNull: this.type = set("maxHeight", null)
    
    inline def maxWidth(value: (MaxWidth[String | `0`]) | Double | `false`): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def maxWidthNull: this.type = set("maxWidth", null)
    
    inline def minHeight(value: (MinHeight[String | `0`]) | Double | `false`): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minHeightNull: this.type = set("minHeight", null)
    
    inline def minWidth(value: (MinWidth[String | `0`]) | Double | `false`): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def minWidthNull: this.type = set("minWidth", null)
    
    inline def opacity(value: Opacity | Double | `false`): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def opacityNull: this.type = set("opacity", null)
    
    inline def order(value: Order | Double | `false`): this.type = set("order", value.asInstanceOf[js.Any])
    
    inline def orderNull: this.type = set("order", null)
    
    inline def outline(value: (Outline[String | `0`]) | Double | `false`): this.type = set("outline", value.asInstanceOf[js.Any])
    
    inline def outlineNull: this.type = set("outline", null)
    
    inline def overflow(value: Overflow | Double | `false`): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def overflowNull: this.type = set("overflow", null)
    
    inline def overflowX(value: OverflowX | Double | `false`): this.type = set("overflowX", value.asInstanceOf[js.Any])
    
    inline def overflowXNull: this.type = set("overflowX", null)
    
    inline def overflowY(value: OverflowY | Double | `false`): this.type = set("overflowY", value.asInstanceOf[js.Any])
    
    inline def overflowYNull: this.type = set("overflowY", null)
    
    inline def padding(value: (Padding[String | `0`]) | Double | `false`): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingBottom(value: (PaddingBottom[String | `0`]) | Double | `false`): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    inline def paddingBottomNull: this.type = set("paddingBottom", null)
    
    inline def paddingLeft(value: (PaddingLeft[String | `0`]) | Double | `false`): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingLeftNull: this.type = set("paddingLeft", null)
    
    inline def paddingNull: this.type = set("padding", null)
    
    inline def paddingRight(value: (PaddingRight[String | `0`]) | Double | `false`): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def paddingRightNull: this.type = set("paddingRight", null)
    
    inline def paddingTop(value: (PaddingTop[String | `0`]) | Double | `false`): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    inline def paddingTopNull: this.type = set("paddingTop", null)
    
    inline def paddingX(value: BoxPropValue): this.type = set("paddingX", value.asInstanceOf[js.Any])
    
    inline def paddingXNull: this.type = set("paddingX", null)
    
    inline def paddingY(value: BoxPropValue): this.type = set("paddingY", value.asInstanceOf[js.Any])
    
    inline def paddingYNull: this.type = set("paddingY", null)
    
    inline def placeContent(value: PlaceContent | Double | `false`): this.type = set("placeContent", value.asInstanceOf[js.Any])
    
    inline def placeContentNull: this.type = set("placeContent", null)
    
    inline def placeItems(value: PlaceItems | Double | `false`): this.type = set("placeItems", value.asInstanceOf[js.Any])
    
    inline def placeItemsNull: this.type = set("placeItems", null)
    
    inline def placeSelf(value: PlaceSelf | Double | `false`): this.type = set("placeSelf", value.asInstanceOf[js.Any])
    
    inline def placeSelfNull: this.type = set("placeSelf", null)
    
    inline def pointerEvents(value: PointerEvents | Double | `false`): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def pointerEventsNull: this.type = set("pointerEvents", null)
    
    inline def position(value: Position | Double | `false`): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def positionNull: this.type = set("position", null)
    
    inline def resize(value: Resize | Double | `false`): this.type = set("resize", value.asInstanceOf[js.Any])
    
    inline def resizeNull: this.type = set("resize", null)
    
    inline def right(value: (Right[String | `0`]) | Double | `false`): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def rightNull: this.type = set("right", null)
    
    inline def rowGap(value: (RowGap[String | `0`]) | Double | `false`): this.type = set("rowGap", value.asInstanceOf[js.Any])
    
    inline def rowGapNull: this.type = set("rowGap", null)
    
    inline def textAlign(value: TextAlign | Double | `false`): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def textAlignNull: this.type = set("textAlign", null)
    
    inline def textDecoration(value: (TextDecoration[String | `0`]) | Double | `false`): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    
    inline def textDecorationNull: this.type = set("textDecoration", null)
    
    inline def textOverflow(value: TextOverflow | Double | `false`): this.type = set("textOverflow", value.asInstanceOf[js.Any])
    
    inline def textOverflowNull: this.type = set("textOverflow", null)
    
    inline def textShadow(value: TextShadow | Double | `false`): this.type = set("textShadow", value.asInstanceOf[js.Any])
    
    inline def textShadowNull: this.type = set("textShadow", null)
    
    inline def textTransform(value: TextTransform | Double | `false`): this.type = set("textTransform", value.asInstanceOf[js.Any])
    
    inline def textTransformNull: this.type = set("textTransform", null)
    
    inline def top(value: (Top[String | `0`]) | Double | `false`): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def topNull: this.type = set("top", null)
    
    inline def transform(value: Transform | Double | `false`): this.type = set("transform", value.asInstanceOf[js.Any])
    
    inline def transformNull: this.type = set("transform", null)
    
    inline def transformOrigin(value: (TransformOrigin[String | `0`]) | Double | `false`): this.type = set("transformOrigin", value.asInstanceOf[js.Any])
    
    inline def transformOriginNull: this.type = set("transformOrigin", null)
    
    inline def transition(value: Transition[String] | Double | `false`): this.type = set("transition", value.asInstanceOf[js.Any])
    
    inline def transitionDelay(value: TransitionDelay[String] | Double | `false`): this.type = set("transitionDelay", value.asInstanceOf[js.Any])
    
    inline def transitionDelayNull: this.type = set("transitionDelay", null)
    
    inline def transitionDuration(value: TransitionDuration[String] | Double | `false`): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    inline def transitionDurationNull: this.type = set("transitionDuration", null)
    
    inline def transitionNull: this.type = set("transition", null)
    
    inline def transitionProperty(value: TransitionProperty | Double | `false`): this.type = set("transitionProperty", value.asInstanceOf[js.Any])
    
    inline def transitionPropertyNull: this.type = set("transitionProperty", null)
    
    inline def transitionTimingFunction(value: TransitionTimingFunction | Double | `false`): this.type = set("transitionTimingFunction", value.asInstanceOf[js.Any])
    
    inline def transitionTimingFunctionNull: this.type = set("transitionTimingFunction", null)
    
    inline def userSelect(value: UserSelect | Double | `false`): this.type = set("userSelect", value.asInstanceOf[js.Any])
    
    inline def userSelectNull: this.type = set("userSelect", null)
    
    inline def verticalAlign(value: (VerticalAlign[String | `0`]) | Double | `false`): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    inline def verticalAlignNull: this.type = set("verticalAlign", null)
    
    inline def visibility(value: Visibility | Double | `false`): this.type = set("visibility", value.asInstanceOf[js.Any])
    
    inline def visibilityNull: this.type = set("visibility", null)
    
    inline def whiteSpace(value: WhiteSpace | Double | `false`): this.type = set("whiteSpace", value.asInstanceOf[js.Any])
    
    inline def whiteSpaceNull: this.type = set("whiteSpace", null)
    
    inline def width(value: (Width[String | `0`]) | Double | `false`): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def widthNull: this.type = set("width", null)
    
    inline def wordBreak(value: WordBreak | Double | `false`): this.type = set("wordBreak", value.asInstanceOf[js.Any])
    
    inline def wordBreakNull: this.type = set("wordBreak", null)
    
    inline def wordWrap(value: WordWrap | Double | `false`): this.type = set("wordWrap", value.asInstanceOf[js.Any])
    
    inline def wordWrapNull: this.type = set("wordWrap", null)
    
    inline def zIndex(value: ZIndex | Double | `false`): this.type = set("zIndex", value.asInstanceOf[js.Any])
    
    inline def zIndexNull: this.type = set("zIndex", null)
  }
  
  implicit def make[E /* <: ElementType */](companion: UiBox.type): Builder[E] = new Builder[E](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[E /* <: ElementType */](p: BoxProps[E]): Builder[E] = new Builder[E](js.Array(this.component, p.asInstanceOf[js.Any]))
}
