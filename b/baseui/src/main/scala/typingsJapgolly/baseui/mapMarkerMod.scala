package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.anon.Height
import typingsJapgolly.baseui.baseuiStrings.`bottom-left`
import typingsJapgolly.baseui.baseuiStrings.`bottom-right`
import typingsJapgolly.baseui.baseuiStrings.`medium-icon`
import typingsJapgolly.baseui.baseuiStrings.`medium-text`
import typingsJapgolly.baseui.baseuiStrings.`top-left`
import typingsJapgolly.baseui.baseuiStrings.`top-right`
import typingsJapgolly.baseui.baseuiStrings.`x-small-circle`
import typingsJapgolly.baseui.baseuiStrings.`x-small-square`
import typingsJapgolly.baseui.baseuiStrings.`x-small`
import typingsJapgolly.baseui.baseuiStrings.`xx-small-circle`
import typingsJapgolly.baseui.baseuiStrings.`xx-small-square`
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.medium_
import typingsJapgolly.baseui.baseuiStrings.small_
import typingsJapgolly.baseui.mapMarkerTypesMod.AnchorPositions
import typingsJapgolly.baseui.mapMarkerTypesMod.BadgeEnhancer
import typingsJapgolly.baseui.mapMarkerTypesMod.BadgeEnhancerComponent
import typingsJapgolly.baseui.mapMarkerTypesMod.BadgeEnhancerSize
import typingsJapgolly.baseui.mapMarkerTypesMod.BadgePosition
import typingsJapgolly.baseui.mapMarkerTypesMod.DragShadowProps
import typingsJapgolly.baseui.mapMarkerTypesMod.FixedMarkerOverrides
import typingsJapgolly.baseui.mapMarkerTypesMod.FixedMarkerProps
import typingsJapgolly.baseui.mapMarkerTypesMod.FloatingMarkerAnchorType
import typingsJapgolly.baseui.mapMarkerTypesMod.FloatingMarkerOverrides
import typingsJapgolly.baseui.mapMarkerTypesMod.FloatingMarkerProps
import typingsJapgolly.baseui.mapMarkerTypesMod.FloatingMarkerSize
import typingsJapgolly.baseui.mapMarkerTypesMod.ItemProps
import typingsJapgolly.baseui.mapMarkerTypesMod.Kind
import typingsJapgolly.baseui.mapMarkerTypesMod.LabelEhancerComponent
import typingsJapgolly.baseui.mapMarkerTypesMod.LabelEnhancer
import typingsJapgolly.baseui.mapMarkerTypesMod.LabelEnhancerPosition
import typingsJapgolly.baseui.mapMarkerTypesMod.LocationPuckProps
import typingsJapgolly.baseui.mapMarkerTypesMod.NeedleProps
import typingsJapgolly.baseui.mapMarkerTypesMod.NeedleSize
import typingsJapgolly.baseui.mapMarkerTypesMod.PinHead
import typingsJapgolly.baseui.mapMarkerTypesMod.PinHeadProps
import typingsJapgolly.baseui.mapMarkerTypesMod.PinHeadSize
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMarkerMod {
  
  @JSImport("baseui/map-marker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<{ readonly none :'none',  readonly xSmall :'x-small',  readonly small :'small',  readonly mediumText :'medium-text',  readonly mediumIcon :'medium-icon'}> */
  object BADGE_ENHANCER_SIZES {
    
    @JSImport("baseui/map-marker", "BADGE_ENHANCER_SIZES.mediumIcon")
    @js.native
    val mediumIcon: `medium-icon` = js.native
    
    @JSImport("baseui/map-marker", "BADGE_ENHANCER_SIZES.mediumText")
    @js.native
    val mediumText: `medium-text` = js.native
    
    @JSImport("baseui/map-marker", "BADGE_ENHANCER_SIZES.none")
    @js.native
    val none: typingsJapgolly.baseui.baseuiStrings.none = js.native
    
    @JSImport("baseui/map-marker", "BADGE_ENHANCER_SIZES.small")
    @js.native
    val small: small_ = js.native
    
    @JSImport("baseui/map-marker", "BADGE_ENHANCER_SIZES.xSmall")
    @js.native
    val xSmall: `x-small` = js.native
  }
  
  /* Inlined std.Readonly<{ readonly none :'none',  readonly topLeft :'top-left',  readonly topRight :'top-right',  readonly bottomRight :'bottom-right',  readonly bottomLeft :'bottom-left'}> */
  object FLOATING_MARKER_ANCHOR_POSITIONS {
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_ANCHOR_POSITIONS.bottomLeft")
    @js.native
    val bottomLeft: `bottom-left` = js.native
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_ANCHOR_POSITIONS.bottomRight")
    @js.native
    val bottomRight: `bottom-right` = js.native
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_ANCHOR_POSITIONS.none")
    @js.native
    val none: typingsJapgolly.baseui.baseuiStrings.none = js.native
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_ANCHOR_POSITIONS.topLeft")
    @js.native
    val topLeft: `top-left` = js.native
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_ANCHOR_POSITIONS.topRight")
    @js.native
    val topRight: `top-right` = js.native
  }
  
  /* Inlined std.Readonly<{ readonly circle :'circle',  readonly square :'square',  readonly xxSmallCircle :'xx-small-circle',  readonly xxSmallSquare :'xx-small-square'}> */
  object FLOATING_MARKER_ANCHOR_TYPES {
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_ANCHOR_TYPES.circle")
    @js.native
    val circle: typingsJapgolly.baseui.baseuiStrings.circle = js.native
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_ANCHOR_TYPES.square")
    @js.native
    val square: typingsJapgolly.baseui.baseuiStrings.square = js.native
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_ANCHOR_TYPES.xxSmallCircle")
    @js.native
    val xxSmallCircle: `xx-small-circle` = js.native
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_ANCHOR_TYPES.xxSmallSquare")
    @js.native
    val xxSmallSquare: `xx-small-square` = js.native
  }
  
  /* Inlined std.Readonly<{ readonly small :'small',  readonly medium :'medium',  readonly large :'large'}> */
  object FLOATING_MARKER_SIZES {
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_SIZES.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_SIZES.medium")
    @js.native
    val medium: medium_ = js.native
    
    @JSImport("baseui/map-marker", "FLOATING_MARKER_SIZES.small")
    @js.native
    val small: small_ = js.native
  }
  
  inline def FixedMarker(
    hasSizeNeedleLabelStartEnhancerEndEnhancerKindDraggingOverridesLabelEnhancerContentLabelEnhancerPositionBadgeEnhancerSizeBadgeEnhancerContentRestProps: FixedMarkerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FixedMarker")(hasSizeNeedleLabelStartEnhancerEndEnhancerKindDraggingOverridesLabelEnhancerContentLabelEnhancerPositionBadgeEnhancerSizeBadgeEnhancerContentRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FloatingMarker(hasLabelSizeAnchorEndEnhancerStartEnhancerAnchorTypeOverrides: FloatingMarkerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FloatingMarker")(hasLabelSizeAnchorEndEnhancerStartEnhancerAnchorTypeOverrides.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Readonly<{ readonly default :'default',  readonly accent :'accent',  readonly negative :'negative'}> */
  object KIND extends Shortcut {
    
    @JSImport("baseui/map-marker", "KIND.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/map-marker", "KIND.accent")
    @js.native
    val accent: typingsJapgolly.baseui.baseuiStrings.accent = js.native
    
    @JSImport("baseui/map-marker", "KIND.negative")
    @js.native
    val negative: typingsJapgolly.baseui.baseuiStrings.negative = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `KIND.foo` */
    override def _to: default_ = default
  }
  
  /* Inlined std.Readonly<{ readonly none :'none',  readonly top :'top',  readonly left :'left',  readonly right :'right',  readonly bottom :'bottom'}> */
  object LABEL_ENHANCER_POSITIONS {
    
    @JSImport("baseui/map-marker", "LABEL_ENHANCER_POSITIONS.bottom")
    @js.native
    val bottom: typingsJapgolly.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/map-marker", "LABEL_ENHANCER_POSITIONS.left")
    @js.native
    val left: typingsJapgolly.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/map-marker", "LABEL_ENHANCER_POSITIONS.none")
    @js.native
    val none: typingsJapgolly.baseui.baseuiStrings.none = js.native
    
    @JSImport("baseui/map-marker", "LABEL_ENHANCER_POSITIONS.right")
    @js.native
    val right: typingsJapgolly.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/map-marker", "LABEL_ENHANCER_POSITIONS.top")
    @js.native
    val top: typingsJapgolly.baseui.baseuiStrings.top = js.native
  }
  
  /* Inlined std.Readonly<{ readonly small :'small',  readonly medium :'medium',  readonly large :'large'}> */
  object LOCATION_PUCK_SIZES {
    
    @JSImport("baseui/map-marker", "LOCATION_PUCK_SIZES.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/map-marker", "LOCATION_PUCK_SIZES.medium")
    @js.native
    val medium: medium_ = js.native
    
    @JSImport("baseui/map-marker", "LOCATION_PUCK_SIZES.small")
    @js.native
    val small: small_ = js.native
  }
  
  /* Inlined std.Readonly<{ readonly consumer :'consumer',  readonly earner :'earner'}> */
  object LOCATION_PUCK_TYPES {
    
    @JSImport("baseui/map-marker", "LOCATION_PUCK_TYPES.consumer")
    @js.native
    val consumer: typingsJapgolly.baseui.baseuiStrings.consumer = js.native
    
    @JSImport("baseui/map-marker", "LOCATION_PUCK_TYPES.earner")
    @js.native
    val earner: typingsJapgolly.baseui.baseuiStrings.earner = js.native
  }
  
  inline def LocationPuck(hasSizeHeadingShowHeadingConfidenceRadiusTypeOverrides: LocationPuckProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LocationPuck")(hasSizeHeadingShowHeadingConfidenceRadiusTypeOverrides.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Readonly<{ readonly none :'none',  readonly short :'short',  readonly medium :'medium',  readonly tall :'tall'}> */
  object NEEDLE_SIZES {
    
    @JSImport("baseui/map-marker", "NEEDLE_SIZES.medium")
    @js.native
    val medium: medium_ = js.native
    
    @JSImport("baseui/map-marker", "NEEDLE_SIZES.none")
    @js.native
    val none: typingsJapgolly.baseui.baseuiStrings.none = js.native
    
    @JSImport("baseui/map-marker", "NEEDLE_SIZES.short")
    @js.native
    val short: typingsJapgolly.baseui.baseuiStrings.short = js.native
    
    @JSImport("baseui/map-marker", "NEEDLE_SIZES.tall")
    @js.native
    val tall: typingsJapgolly.baseui.baseuiStrings.tall = js.native
  }
  
  /* Inlined std.Readonly<{  xx-small-square :{  height :number,   icon :number},   xx-small-circle :{  height :number,   icon :number},   x-small-square :{  height :number,   icon :number},   x-small-circle :{  height :number,   icon :number},   small :{  height :number,   icon :number},   medium :{  height :number,   icon :number},   large :{  height :number,   icon :number}}> */
  object PINHEAD_DIMENSIONS {
    
    @JSImport("baseui/map-marker", "PINHEAD_DIMENSIONS.large")
    @js.native
    val large: Height = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_DIMENSIONS.medium")
    @js.native
    val medium: Height = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_DIMENSIONS.small")
    @js.native
    val small: Height = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_DIMENSIONS.x-small-circle")
    @js.native
    val xSmallCircle: Height = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_DIMENSIONS.x-small-square")
    @js.native
    val xSmallSquare: Height = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_DIMENSIONS.xx-small-circle")
    @js.native
    val xxSmallCircle: Height = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_DIMENSIONS.xx-small-square")
    @js.native
    val xxSmallSquare: Height = js.native
  }
  
  /* Inlined std.Readonly<{ readonly xxSmallCircle :'xx-small-circle',  readonly xxSmallSquare :'xx-small-square',  readonly xSmallCircle :'x-small-circle',  readonly xSmallSquare :'x-small-square',  readonly small :'small',  readonly medium :'medium',  readonly large :'large'}> */
  object PINHEAD_SIZES_SHAPES {
    
    @JSImport("baseui/map-marker", "PINHEAD_SIZES_SHAPES.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_SIZES_SHAPES.medium")
    @js.native
    val medium: medium_ = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_SIZES_SHAPES.small")
    @js.native
    val small: small_ = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_SIZES_SHAPES.xSmallCircle")
    @js.native
    val xSmallCircle: `x-small-circle` = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_SIZES_SHAPES.xSmallSquare")
    @js.native
    val xSmallSquare: `x-small-square` = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_SIZES_SHAPES.xxSmallCircle")
    @js.native
    val xxSmallCircle: `xx-small-circle` = js.native
    
    @JSImport("baseui/map-marker", "PINHEAD_SIZES_SHAPES.xxSmallSquare")
    @js.native
    val xxSmallSquare: `xx-small-square` = js.native
  }
  
  type AnchorPositionsT = AnchorPositions
  
  type BadgeEnhancerComponentT = BadgeEnhancerComponent
  
  type BadgeEnhancerSizeT = BadgeEnhancerSize
  
  type BadgeEnhancerT = BadgeEnhancer
  
  type BadgePositionT = BadgePosition
  
  type DragShadowPropsT = DragShadowProps
  
  type FixedMarkerOverridesT = FixedMarkerOverrides
  
  type FixedMarkerPropsT = FixedMarkerProps
  
  type FloatingMarkerAnchorTypeT = FloatingMarkerAnchorType
  
  type FloatingMarkerOverridesT = FloatingMarkerOverrides
  
  type FloatingMarkerPropsT = FloatingMarkerProps
  
  type FloatingMarkerSizeT = FloatingMarkerSize
  
  type ItemPropsT = ItemProps
  
  type KindT = Kind
  
  type LabelEhancerComponentT = LabelEhancerComponent
  
  type LabelEnhancerPositionT = LabelEnhancerPosition
  
  type LabelEnhancerT = LabelEnhancer
  
  type NeedlePropsT = NeedleProps
  
  type NeedleSizeT = NeedleSize
  
  type PinHeadPropsT = PinHeadProps
  
  type PinHeadSizeT = PinHeadSize
  
  type PinHeadT = PinHead
}
