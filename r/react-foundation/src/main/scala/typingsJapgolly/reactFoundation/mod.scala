package typingsJapgolly.reactFoundation

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactFoundation.anon.AlignX
import typingsJapgolly.reactFoundation.anon.Breakpoint
import typingsJapgolly.reactFoundation.componentsAccordionMod.AccordianContentProps
import typingsJapgolly.reactFoundation.componentsAccordionMod.AccordianItemProps
import typingsJapgolly.reactFoundation.componentsAccordionMod.AccordianProps
import typingsJapgolly.reactFoundation.componentsAccordionMod.AccordionTitleProps
import typingsJapgolly.reactFoundation.componentsBadgeMod.BadgeProps
import typingsJapgolly.reactFoundation.componentsBreadcrumbsMod.BreadcrumbItemProps
import typingsJapgolly.reactFoundation.componentsBreadcrumbsMod.BreadcrumbsProps
import typingsJapgolly.reactFoundation.componentsButtonGroupMod.ButtonGroupProps
import typingsJapgolly.reactFoundation.componentsButtonMod.ButtonProps
import typingsJapgolly.reactFoundation.componentsButtonMod.LinkProps
import typingsJapgolly.reactFoundation.componentsCalloutMod.CalloutProps
import typingsJapgolly.reactFoundation.componentsCloseButtonMod.CloseButtonProps
import typingsJapgolly.reactFoundation.componentsElementMod.BlockProps
import typingsJapgolly.reactFoundation.componentsElementMod.InlineProps
import typingsJapgolly.reactFoundation.componentsFlexVideoMod.FlexVideoProps
import typingsJapgolly.reactFoundation.componentsGridMod.ColumnProps
import typingsJapgolly.reactFoundation.componentsGridMod.RowProps
import typingsJapgolly.reactFoundation.componentsIconMod.IconProps
import typingsJapgolly.reactFoundation.componentsLabelMod.LabelProps
import typingsJapgolly.reactFoundation.componentsMediaObjectMod.MediaObjectProps
import typingsJapgolly.reactFoundation.componentsMediaObjectMod.MediaObjectSectionProps
import typingsJapgolly.reactFoundation.componentsMenuMod.MenuItemProps
import typingsJapgolly.reactFoundation.componentsMenuMod.MenuProps
import typingsJapgolly.reactFoundation.componentsPaginationMod.PaginationItemProps
import typingsJapgolly.reactFoundation.componentsPaginationMod.PaginationProps
import typingsJapgolly.reactFoundation.componentsProgressBarMod.NativeProgressProps
import typingsJapgolly.reactFoundation.componentsProgressBarMod.ProgressMeterProps
import typingsJapgolly.reactFoundation.componentsProgressBarMod.ProgressMeterTextProps
import typingsJapgolly.reactFoundation.componentsProgressBarMod.ProgressMeterWithTextProps
import typingsJapgolly.reactFoundation.componentsResponsiveMod.MenuIconProps
import typingsJapgolly.reactFoundation.componentsResponsiveMod.TitleBarProps
import typingsJapgolly.reactFoundation.componentsResponsiveMod.TitleBarTitleProps
import typingsJapgolly.reactFoundation.componentsSliderMod.SliderFillProps
import typingsJapgolly.reactFoundation.componentsSliderMod.SliderHandleProps
import typingsJapgolly.reactFoundation.componentsSwitchMod.SwitchActiveProps
import typingsJapgolly.reactFoundation.componentsSwitchMod.SwitchInactiveProps
import typingsJapgolly.reactFoundation.componentsSwitchMod.SwitchInputProps
import typingsJapgolly.reactFoundation.componentsSwitchMod.SwitchPaddleProps
import typingsJapgolly.reactFoundation.componentsSwitchMod.SwitchProps
import typingsJapgolly.reactFoundation.componentsTabsMod.TabItemProps
import typingsJapgolly.reactFoundation.componentsTabsMod.TabPanelProps
import typingsJapgolly.reactFoundation.componentsTabsMod.TabsContentProps
import typingsJapgolly.reactFoundation.componentsTabsMod.TabsProps
import typingsJapgolly.reactFoundation.componentsThumbnailMod.ThumbnailProps
import typingsJapgolly.reactFoundation.componentsTopBarMod.TopBarProps
import typingsJapgolly.reactFoundation.componentsXyGridMod.CellProps
import typingsJapgolly.reactFoundation.componentsXyGridMod.GridContainerProps
import typingsJapgolly.reactFoundation.componentsXyGridMod.GridProps
import typingsJapgolly.reactFoundation.enumsMod.BadgeColors
import typingsJapgolly.reactFoundation.enumsMod.ButtonColors
import typingsJapgolly.reactFoundation.enumsMod.ButtonSizes
import typingsJapgolly.reactFoundation.enumsMod.HorizontalAlignments
import typingsJapgolly.reactFoundation.enumsMod.MenuAlignments
import typingsJapgolly.reactFoundation.enumsMod.ProgressColors
import typingsJapgolly.reactFoundation.enumsMod.SwitchInputTypes
import typingsJapgolly.reactFoundation.enumsMod.VerticalAlignments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-foundation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-foundation", "Accordion")
  @js.native
  val Accordion: FunctionComponent[AccordianProps] = js.native
  
  @JSImport("react-foundation", "AccordionContent")
  @js.native
  val AccordionContent: FunctionComponent[AccordianContentProps] = js.native
  
  @JSImport("react-foundation", "AccordionItem")
  @js.native
  val AccordionItem: FunctionComponent[AccordianItemProps] = js.native
  
  @JSImport("react-foundation", "AccordionTitle")
  @js.native
  val AccordionTitle: FunctionComponent[AccordionTitleProps] = js.native
  
  object Alignments {
    
    @JSImport("react-foundation", "Alignments")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Alignments.BOTTOM")
    @js.native
    def BOTTOM: VerticalAlignments = js.native
    inline def BOTTOM_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.CENTER")
    @js.native
    def CENTER: MenuAlignments = js.native
    inline def CENTER_=(x: MenuAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.JUSTIFY")
    @js.native
    def JUSTIFY: HorizontalAlignments = js.native
    inline def JUSTIFY_=(x: HorizontalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JUSTIFY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.MIDDLE")
    @js.native
    def MIDDLE: VerticalAlignments = js.native
    inline def MIDDLE_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIDDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.RIGHT")
    @js.native
    def RIGHT: MenuAlignments = js.native
    inline def RIGHT_=(x: MenuAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.SPACED")
    @js.native
    def SPACED: HorizontalAlignments = js.native
    inline def SPACED_=(x: HorizontalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.STRETCH")
    @js.native
    def STRETCH: VerticalAlignments = js.native
    inline def STRETCH_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRETCH")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.TOP")
    @js.native
    def TOP: VerticalAlignments = js.native
    inline def TOP_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Badge")
  @js.native
  val Badge: FunctionComponent[BadgeProps] = js.native
  
  @JSImport("react-foundation", "Block")
  @js.native
  val Block: FunctionComponent[BlockProps] = js.native
  
  @JSImport("react-foundation", "BreadcrumbItem")
  @js.native
  val BreadcrumbItem: FunctionComponent[BreadcrumbItemProps] = js.native
  
  @JSImport("react-foundation", "Breadcrumbs")
  @js.native
  val Breadcrumbs: FunctionComponent[BreadcrumbsProps] = js.native
  
  object Breakpoints {
    
    @JSImport("react-foundation", "Breakpoints")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Breakpoints.LARGE")
    @js.native
    def LARGE: typingsJapgolly.reactFoundation.enumsMod.Breakpoints = js.native
    inline def LARGE_=(x: typingsJapgolly.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.MEDIUM")
    @js.native
    def MEDIUM: typingsJapgolly.reactFoundation.enumsMod.Breakpoints = js.native
    inline def MEDIUM_=(x: typingsJapgolly.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.SMALL")
    @js.native
    def SMALL: typingsJapgolly.reactFoundation.enumsMod.Breakpoints = js.native
    inline def SMALL_=(x: typingsJapgolly.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.XLARGE")
    @js.native
    def XLARGE: typingsJapgolly.reactFoundation.enumsMod.Breakpoints = js.native
    inline def XLARGE_=(x: typingsJapgolly.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XLARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.XXLARGE")
    @js.native
    def XXLARGE: typingsJapgolly.reactFoundation.enumsMod.Breakpoints = js.native
    inline def XXLARGE_=(x: typingsJapgolly.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XXLARGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Button")
  @js.native
  val Button: FunctionComponent[ButtonProps] = js.native
  
  @JSImport("react-foundation", "ButtonGroup")
  @js.native
  val ButtonGroup: FunctionComponent[ButtonGroupProps] = js.native
  
  @JSImport("react-foundation", "Callout")
  @js.native
  val Callout: FunctionComponent[CalloutProps] = js.native
  
  @JSImport("react-foundation", "Cell")
  @js.native
  val Cell: FunctionComponent[CellProps] = js.native
  
  @JSImport("react-foundation", "CloseButton")
  @js.native
  val CloseButton: FunctionComponent[CloseButtonProps] = js.native
  
  object Colors {
    
    @JSImport("react-foundation", "Colors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Colors.ALERT")
    @js.native
    def ALERT: ProgressColors = js.native
    inline def ALERT_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALERT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.INFO")
    @js.native
    def INFO: BadgeColors = js.native
    inline def INFO_=(x: BadgeColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.PRIMARY")
    @js.native
    def PRIMARY: ButtonColors = js.native
    inline def PRIMARY_=(x: ButtonColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.SECONDARY")
    @js.native
    def SECONDARY: ProgressColors = js.native
    inline def SECONDARY_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.SUCCESS")
    @js.native
    def SUCCESS: ProgressColors = js.native
    inline def SUCCESS_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.WARNING")
    @js.native
    def WARNING: ProgressColors = js.native
    inline def WARNING_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Column")
  @js.native
  val Column: FunctionComponent[ColumnProps] = js.native
  
  object ExtendedBreakpoints {
    
    @JSImport("react-foundation", "ExtendedBreakpoints")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "ExtendedBreakpoints.ALL")
    @js.native
    def ALL: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def ALL_=(x: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.LARGE")
    @js.native
    def LARGE: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def LARGE_=(x: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.MEDIUM")
    @js.native
    def MEDIUM: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def MEDIUM_=(x: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.SMALL")
    @js.native
    def SMALL: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def SMALL_=(x: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.XLARGE")
    @js.native
    def XLARGE: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def XLARGE_=(x: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XLARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.XXLARGE")
    @js.native
    def XXLARGE: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def XXLARGE_=(x: typingsJapgolly.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XXLARGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "FlexVideo")
  @js.native
  val FlexVideo: FunctionComponent[FlexVideoProps] = js.native
  
  object FloatTypes {
    
    @JSImport("react-foundation", "FloatTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "FloatTypes.CENTER")
    @js.native
    def CENTER: typingsJapgolly.reactFoundation.enumsMod.FloatTypes = js.native
    inline def CENTER_=(x: typingsJapgolly.reactFoundation.enumsMod.FloatTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "FloatTypes.LEFT")
    @js.native
    def LEFT: typingsJapgolly.reactFoundation.enumsMod.FloatTypes = js.native
    inline def LEFT_=(x: typingsJapgolly.reactFoundation.enumsMod.FloatTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "FloatTypes.RIGHT")
    @js.native
    def RIGHT: typingsJapgolly.reactFoundation.enumsMod.FloatTypes = js.native
    inline def RIGHT_=(x: typingsJapgolly.reactFoundation.enumsMod.FloatTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Grid")
  @js.native
  val Grid: FunctionComponent[GridProps] = js.native
  
  @JSImport("react-foundation", "GridContainer")
  @js.native
  val GridContainer: FunctionComponent[GridContainerProps] = js.native
  
  object GutterTypes {
    
    @JSImport("react-foundation", "GutterTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "GutterTypes.MARGIN")
    @js.native
    def MARGIN: typingsJapgolly.reactFoundation.enumsMod.GutterTypes = js.native
    inline def MARGIN_=(x: typingsJapgolly.reactFoundation.enumsMod.GutterTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "GutterTypes.PADDING")
    @js.native
    def PADDING: typingsJapgolly.reactFoundation.enumsMod.GutterTypes = js.native
    inline def PADDING_=(x: typingsJapgolly.reactFoundation.enumsMod.GutterTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PADDING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Icon")
  @js.native
  val Icon: FunctionComponent[IconProps] = js.native
  
  @JSImport("react-foundation", "Inline")
  @js.native
  val Inline: FunctionComponent[InlineProps] = js.native
  
  object InputTypes {
    
    @JSImport("react-foundation", "InputTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "InputTypes.CHECKBOX")
    @js.native
    def CHECKBOX: SwitchInputTypes = js.native
    inline def CHECKBOX_=(x: SwitchInputTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKBOX")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "InputTypes.RADIO")
    @js.native
    def RADIO: SwitchInputTypes = js.native
    inline def RADIO_=(x: SwitchInputTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RADIO")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Label")
  @js.native
  val Label: FunctionComponent[LabelProps] = js.native
  
  @JSImport("react-foundation", "Link")
  @js.native
  val Link: FunctionComponent[LinkProps] = js.native
  
  @JSImport("react-foundation", "MediaObject")
  @js.native
  val MediaObject: FunctionComponent[MediaObjectProps] = js.native
  
  @JSImport("react-foundation", "MediaObjectSection")
  @js.native
  val MediaObjectSection: FunctionComponent[MediaObjectSectionProps] = js.native
  
  @JSImport("react-foundation", "Menu")
  @js.native
  val Menu: FunctionComponent[MenuProps] = js.native
  
  @JSImport("react-foundation", "MenuIcon")
  @js.native
  val MenuIcon: FunctionComponent[MenuIconProps] = js.native
  
  @JSImport("react-foundation", "MenuItem")
  @js.native
  val MenuItem: FunctionComponent[MenuItemProps] = js.native
  
  inline def MenuText(props: MenuItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-foundation", "NativeProgress")
  @js.native
  val NativeProgress: FunctionComponent[NativeProgressProps] = js.native
  
  @JSImport("react-foundation", "Pagination")
  @js.native
  val Pagination: FunctionComponent[PaginationProps] = js.native
  
  @JSImport("react-foundation", "PaginationEllipsis")
  @js.native
  val PaginationEllipsis: FunctionComponent[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "PaginationItem")
  @js.native
  val PaginationItem: FunctionComponent[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "PaginationNext")
  @js.native
  val PaginationNext: FunctionComponent[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "PaginationPrevious")
  @js.native
  val PaginationPrevious: FunctionComponent[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "Progress")
  @js.native
  val Progress: FunctionComponent[typingsJapgolly.reactFoundation.componentsProgressBarMod.PaginationProps] = js.native
  
  @JSImport("react-foundation", "ProgressMeter")
  @js.native
  val ProgressMeter: FunctionComponent[ProgressMeterProps] = js.native
  
  @JSImport("react-foundation", "ProgressMeterText")
  @js.native
  val ProgressMeterText: FunctionComponent[ProgressMeterTextProps] = js.native
  
  @JSImport("react-foundation", "ProgressMeterWithText")
  @js.native
  val ProgressMeterWithText: FunctionComponent[ProgressMeterWithTextProps] = js.native
  
  @JSImport("react-foundation", "ResponsiveNavigation")
  @js.native
  open class ResponsiveNavigation ()
    extends typingsJapgolly.reactFoundation.componentsResponsiveMod.ResponsiveNavigation
  /* static members */
  object ResponsiveNavigation {
    
    @JSImport("react-foundation", "ResponsiveNavigation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "ResponsiveNavigation.defaultProps")
    @js.native
    def defaultProps: Breakpoint = js.native
    inline def defaultProps_=(x: Breakpoint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ResponsiveNavigation.propTypes")
    @js.native
    def propTypes: AlignX = js.native
    inline def propTypes_=(x: AlignX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Reveal")
  @js.native
  val Reveal: FunctionComponent[typingsJapgolly.reactFoundation.componentsRevealMod.PaginationProps] = js.native
  
  @JSImport("react-foundation", "Row")
  @js.native
  val Row: FunctionComponent[RowProps] = js.native
  
  object Sizes {
    
    @JSImport("react-foundation", "Sizes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Sizes.LARGE")
    @js.native
    def LARGE: ButtonSizes = js.native
    inline def LARGE_=(x: ButtonSizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Sizes.SMALL")
    @js.native
    def SMALL: ButtonSizes = js.native
    inline def SMALL_=(x: ButtonSizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Sizes.TINY")
    @js.native
    def TINY: ButtonSizes = js.native
    inline def TINY_=(x: ButtonSizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TINY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Slider")
  @js.native
  open class Slider ()
    extends typingsJapgolly.reactFoundation.componentsSliderMod.Slider
  
  @JSImport("react-foundation", "SliderFill")
  @js.native
  val SliderFill: FunctionComponent[SliderFillProps] = js.native
  
  @JSImport("react-foundation", "SliderHandle")
  @js.native
  val SliderHandle: FunctionComponent[SliderHandleProps] = js.native
  
  object SpaceControls {
    
    @JSImport("react-foundation", "SpaceControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "SpaceControls.AUTO")
    @js.native
    def AUTO: typingsJapgolly.reactFoundation.enumsMod.SpaceControls = js.native
    inline def AUTO_=(x: typingsJapgolly.reactFoundation.enumsMod.SpaceControls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "SpaceControls.GROW")
    @js.native
    def GROW: typingsJapgolly.reactFoundation.enumsMod.SpaceControls = js.native
    inline def GROW_=(x: typingsJapgolly.reactFoundation.enumsMod.SpaceControls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROW")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "SpaceControls.SHRINK")
    @js.native
    def SHRINK: typingsJapgolly.reactFoundation.enumsMod.SpaceControls = js.native
    inline def SHRINK_=(x: typingsJapgolly.reactFoundation.enumsMod.SpaceControls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHRINK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Switch")
  @js.native
  val Switch: FunctionComponent[SwitchProps] = js.native
  
  @JSImport("react-foundation", "SwitchActive")
  @js.native
  val SwitchActive: FunctionComponent[SwitchActiveProps] = js.native
  
  @JSImport("react-foundation", "SwitchInactive")
  @js.native
  val SwitchInactive: FunctionComponent[SwitchInactiveProps] = js.native
  
  @JSImport("react-foundation", "SwitchInput")
  @js.native
  val SwitchInput: FunctionComponent[SwitchInputProps] = js.native
  
  @JSImport("react-foundation", "SwitchPaddle")
  @js.native
  val SwitchPaddle: FunctionComponent[SwitchPaddleProps] = js.native
  
  @JSImport("react-foundation", "TabItem")
  @js.native
  val TabItem: FunctionComponent[TabItemProps] = js.native
  
  @JSImport("react-foundation", "TabPanel")
  @js.native
  val TabPanel: FunctionComponent[TabPanelProps] = js.native
  
  @JSImport("react-foundation", "Tabs")
  @js.native
  val Tabs: FunctionComponent[TabsProps] = js.native
  
  @JSImport("react-foundation", "TabsContent")
  @js.native
  val TabsContent: FunctionComponent[TabsContentProps] = js.native
  
  @JSImport("react-foundation", "Thumbnail")
  @js.native
  val Thumbnail: FunctionComponent[ThumbnailProps] = js.native
  
  @JSImport("react-foundation", "ThumbnailLink")
  @js.native
  val ThumbnailLink: FunctionComponent[ThumbnailProps] = js.native
  
  @JSImport("react-foundation", "TitleBar")
  @js.native
  val TitleBar: FunctionComponent[TitleBarProps] = js.native
  
  @JSImport("react-foundation", "TitleBarTitle")
  @js.native
  val TitleBarTitle: FunctionComponent[TitleBarTitleProps] = js.native
  
  @JSImport("react-foundation", "TopBar")
  @js.native
  val TopBar: FunctionComponent[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TopBarLeft")
  @js.native
  val TopBarLeft: FunctionComponent[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TopBarRight")
  @js.native
  val TopBarRight: FunctionComponent[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TopBarTitle")
  @js.native
  val TopBarTitle: FunctionComponent[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TwoHandleSlider")
  @js.native
  open class TwoHandleSlider ()
    extends typingsJapgolly.reactFoundation.componentsSliderMod.TwoHandleSlider
}
