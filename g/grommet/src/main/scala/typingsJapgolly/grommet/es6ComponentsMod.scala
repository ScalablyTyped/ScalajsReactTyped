package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.grommet.anon.RoutedAnchorPropsOmitAnch
import typingsJapgolly.grommet.es6ComponentsAccordionMod.AccordionExtendedProps
import typingsJapgolly.grommet.es6ComponentsAccordionPanelMod.AccordionPanelExtendedProps
import typingsJapgolly.grommet.es6ComponentsAnchorMod.AnchorExtendedProps
import typingsJapgolly.grommet.es6ComponentsAvatarMod.AvatarExtendedProps
import typingsJapgolly.grommet.es6ComponentsBoxMod.BoxExtendedProps
import typingsJapgolly.grommet.es6ComponentsBoxMod.BoxTypes
import typingsJapgolly.grommet.es6ComponentsButtonMod.ButtonExtendedProps
import typingsJapgolly.grommet.es6ComponentsButtonMod.ButtonProps
import typingsJapgolly.grommet.es6ComponentsCalendarMod.CalendarExtendedProps
import typingsJapgolly.grommet.es6ComponentsCarouselMod.CarouselExtendedProps
import typingsJapgolly.grommet.es6ComponentsChartMod.CalcsOptions
import typingsJapgolly.grommet.es6ComponentsChartMod.CalcsResult
import typingsJapgolly.grommet.es6ComponentsChartMod.ChartExtendedProps
import typingsJapgolly.grommet.es6ComponentsCheckBoxGroupMod.CheckBoxGroupExtendedProps
import typingsJapgolly.grommet.es6ComponentsCheckBoxMod.CheckBoxExtendedProps
import typingsJapgolly.grommet.es6ComponentsClockMod.ClockExtendedProps
import typingsJapgolly.grommet.es6ComponentsCollapsibleMod.CollapsibleExtendedProps
import typingsJapgolly.grommet.es6ComponentsDataChartMod.DataChartProps
import typingsJapgolly.grommet.es6ComponentsDataTableMod.DataTableExtendedProps
import typingsJapgolly.grommet.es6ComponentsDateInputMod.DateInputExtendedProps
import typingsJapgolly.grommet.es6ComponentsDiagramMod.DiagramExtendedProps
import typingsJapgolly.grommet.es6ComponentsDistributionMod.DistributionExtendedProps
import typingsJapgolly.grommet.es6ComponentsDropButtonMod.DropButtonExtendedProps
import typingsJapgolly.grommet.es6ComponentsDropMod.DropExtendedProps
import typingsJapgolly.grommet.es6ComponentsFileInputMod.FileInputExtendedProps
import typingsJapgolly.grommet.es6ComponentsFormFieldMod.FormFieldExtendedProps
import typingsJapgolly.grommet.es6ComponentsFormMod.TypedFormProps
import typingsJapgolly.grommet.es6ComponentsGridMod.GridExtendedProps
import typingsJapgolly.grommet.es6ComponentsGrommetMod.GrommetExtendedProps
import typingsJapgolly.grommet.es6ComponentsHeaderMod.HeaderExtendedProps
import typingsJapgolly.grommet.es6ComponentsHeadingMod.HeadingExtendedProps
import typingsJapgolly.grommet.es6ComponentsImageMod.ImageExtendedProps
import typingsJapgolly.grommet.es6ComponentsInfiniteScrollMod.InfiniteScrollProps
import typingsJapgolly.grommet.es6ComponentsKeyboardMod.KeyboardProps
import typingsJapgolly.grommet.es6ComponentsLayerMod.LayerExtendedProps
import typingsJapgolly.grommet.es6ComponentsListMod.ListExtendedProps
import typingsJapgolly.grommet.es6ComponentsMarkdownMod.MarkdownExtendedProps
import typingsJapgolly.grommet.es6ComponentsMaskedInputMod.MaskedInputExtendedProps
import typingsJapgolly.grommet.es6ComponentsMenuMod.MenuExtendedProps
import typingsJapgolly.grommet.es6ComponentsMeterMod.MeterProps
import typingsJapgolly.grommet.es6ComponentsNameValueListMod.NameValueListExtendedProps
import typingsJapgolly.grommet.es6ComponentsNameValuePairMod.NameValuePairProps
import typingsJapgolly.grommet.es6ComponentsNotificationMod.NotificationProps
import typingsJapgolly.grommet.es6ComponentsPageHeaderMod.PageHeaderExtendedProps
import typingsJapgolly.grommet.es6ComponentsPaginationMod.PaginationProps
import typingsJapgolly.grommet.es6ComponentsParagraphMod.ParagraphExtendedProps
import typingsJapgolly.grommet.es6ComponentsRadioButtonGroupMod.RadioButtonGroupExtendedProps
import typingsJapgolly.grommet.es6ComponentsRadioButtonMod.RadioButtonExtendedProps
import typingsJapgolly.grommet.es6ComponentsRangeInputMod.RangeInputExtendedProps
import typingsJapgolly.grommet.es6ComponentsRangeSelectorMod.RangeSelectorProps
import typingsJapgolly.grommet.es6ComponentsRoutedButtonMod.RoutedButtonProps
import typingsJapgolly.grommet.es6ComponentsSelectMod.SelectExtendedProps
import typingsJapgolly.grommet.es6ComponentsSelectMultipleMod.SelectMultipleExtendedProps
import typingsJapgolly.grommet.es6ComponentsSidebarMod.SidebarExtendedProps
import typingsJapgolly.grommet.es6ComponentsSkipLinkMod.SkipLinkProps
import typingsJapgolly.grommet.es6ComponentsSkipLinkTargetMod.SkipLinkTargetProps
import typingsJapgolly.grommet.es6ComponentsSkipLinksMod.SkipLinksProps
import typingsJapgolly.grommet.es6ComponentsSpinnerMod.SpinnerExtendedProps
import typingsJapgolly.grommet.es6ComponentsStackMod.StackExtendedProps
import typingsJapgolly.grommet.es6ComponentsTabMod.TabExtendedProps
import typingsJapgolly.grommet.es6ComponentsTableBodyMod.TableBodyExtendedProps
import typingsJapgolly.grommet.es6ComponentsTableCellMod.TableCellExtendedProps
import typingsJapgolly.grommet.es6ComponentsTableFooterMod.TableFooterExtendedProps
import typingsJapgolly.grommet.es6ComponentsTableHeaderMod.TableHeaderExtendedProps
import typingsJapgolly.grommet.es6ComponentsTableMod.TableExtendedProps
import typingsJapgolly.grommet.es6ComponentsTableRowMod.TableRowExtendedProps
import typingsJapgolly.grommet.es6ComponentsTabsMod.TabsExtendedProps
import typingsJapgolly.grommet.es6ComponentsTagMod.TagExtendedProps
import typingsJapgolly.grommet.es6ComponentsTextAreaMod.TextAreaExtendedProps
import typingsJapgolly.grommet.es6ComponentsTextInputMod.TextInputProps
import typingsJapgolly.grommet.es6ComponentsTextMod.TextExtendedProps
import typingsJapgolly.grommet.es6ComponentsTipMod.TipProps
import typingsJapgolly.grommet.es6ComponentsVideoMod.VideoExtendedProps
import typingsJapgolly.grommet.es6ComponentsWorldMapMod.WorldMapExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.Omit
import typingsJapgolly.grommet.grommetStrings.color
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsMod {
  
  @JSImport("grommet/es6/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grommet/es6/components", "Accordion")
  @js.native
  val Accordion: FC[AccordionExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "AccordionPanel")
  @js.native
  val AccordionPanel: FC[AccordionPanelExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Anchor")
  @js.native
  val Anchor: FC[AnchorExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Avatar")
  @js.native
  val Avatar: FC[AvatarExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Box")
  @js.native
  val Box: FC[BoxExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Button")
  @js.native
  val Button: FC[ButtonExtendedProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/es6/components", "Calendar")
  @js.native
  open class Calendar protected ()
    extends Component[CalendarExtendedProps, js.Object, Any] {
    def this(props: CalendarExtendedProps) = this()
    def this(props: CalendarExtendedProps, context: Any) = this()
  }
  @JSImport("grommet/es6/components", "Calendar")
  @js.native
  val Calendar: ComponentClassP[CalendarExtendedProps & js.Object] = js.native
  
  @JSImport("grommet/es6/components", "Card")
  @js.native
  val Card: FC[BoxTypes] = js.native
  
  @JSImport("grommet/es6/components", "CardBody")
  @js.native
  val CardBody: FC[BoxTypes] = js.native
  
  @JSImport("grommet/es6/components", "CardFooter")
  @js.native
  val CardFooter: FC[BoxTypes] = js.native
  
  @JSImport("grommet/es6/components", "CardHeader")
  @js.native
  val CardHeader: FC[BoxTypes] = js.native
  
  @JSImport("grommet/es6/components", "Carousel")
  @js.native
  val Carousel: FC[CarouselExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Chart")
  @js.native
  val Chart: FC[ChartExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "CheckBox")
  @js.native
  val CheckBox: FC[CheckBoxExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "CheckBoxGroup")
  @js.native
  val CheckBoxGroup: FC[CheckBoxGroupExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Clock")
  @js.native
  val Clock: FC[ClockExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Collapsible")
  @js.native
  val Collapsible: FC[CollapsibleExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "DataChart")
  @js.native
  val DataChart: FC[DataChartProps] = js.native
  
  @JSImport("grommet/es6/components", "DataTable")
  @js.native
  open class DataTable[TRowType] protected ()
    extends typingsJapgolly.grommet.es6ComponentsDataTableMod.DataTable[TRowType] {
    def this(props: DataTableExtendedProps[TRowType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DataTableExtendedProps[TRowType], context: Any) = this()
  }
  
  @JSImport("grommet/es6/components", "DateInput")
  @js.native
  val DateInput: FC[DateInputExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Diagram")
  @js.native
  val Diagram: FC[DiagramExtendedProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/es6/components", "Distribution")
  @js.native
  open class Distribution protected ()
    extends Component[DistributionExtendedProps, js.Object, Any] {
    def this(props: DistributionExtendedProps) = this()
    def this(props: DistributionExtendedProps, context: Any) = this()
  }
  @JSImport("grommet/es6/components", "Distribution")
  @js.native
  val Distribution: ComponentClassP[DistributionExtendedProps & js.Object] = js.native
  
  @JSImport("grommet/es6/components", "Drop")
  @js.native
  val Drop: FC[DropExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "DropButton")
  @js.native
  val DropButton: FC[DropButtonExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "FileInput")
  @js.native
  val FileInput: FC[FileInputExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Footer")
  @js.native
  val Footer: FC[BoxExtendedProps] = js.native
  
  inline def Form[T](p: TypedFormProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Form")(p.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FormField[T](p: FormFieldExtendedProps & T): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FormField")(p.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("grommet/es6/components", "Grid")
  @js.native
  val Grid: FC[GridExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Grommet")
  @js.native
  val Grommet: FC[GrommetExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Header")
  @js.native
  val Header: FC[HeaderExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Heading")
  @js.native
  val Heading: FC[HeadingExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Image")
  @js.native
  val Image: FC[ImageExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "InfiniteScroll")
  @js.native
  val InfiniteScroll: FC[InfiniteScrollProps] = js.native
  
  @JSImport("grommet/es6/components", "Keyboard")
  @js.native
  val Keyboard: FC[KeyboardProps] = js.native
  
  @JSImport("grommet/es6/components", "Layer")
  @js.native
  val Layer: FC[LayerExtendedProps] = js.native
  
  inline def List[ListItemType](p: PropsWithChildren[ListExtendedProps[ListItemType]]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("List")(p.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("grommet/es6/components", "Main")
  @js.native
  val Main: FC[BoxExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Markdown")
  @js.native
  val Markdown: FC[MarkdownExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "MaskedInput")
  @js.native
  val MaskedInput: FC[MaskedInputExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Menu")
  @js.native
  val Menu: FC[MenuExtendedProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/es6/components", "Meter")
  @js.native
  open class Meter protected ()
    extends Component[MeterProps, js.Object, Any] {
    def this(props: MeterProps) = this()
    def this(props: MeterProps, context: Any) = this()
  }
  @JSImport("grommet/es6/components", "Meter")
  @js.native
  val Meter: ComponentClassP[MeterProps & js.Object] = js.native
  
  @JSImport("grommet/es6/components", "NameValueList")
  @js.native
  val NameValueList: FC[NameValueListExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "NameValuePair")
  @js.native
  val NameValuePair: FC[NameValuePairProps] = js.native
  
  @JSImport("grommet/es6/components", "Nav")
  @js.native
  val Nav: FC[BoxExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Notification")
  @js.native
  val Notification: FC[NotificationProps] = js.native
  
  @JSImport("grommet/es6/components", "PageHeader")
  @js.native
  val PageHeader: FC[PageHeaderExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Pagination")
  @js.native
  val Pagination: FC[PaginationProps] = js.native
  
  @JSImport("grommet/es6/components", "Paragraph")
  @js.native
  val Paragraph: FC[ParagraphExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "RadioButton")
  @js.native
  val RadioButton: FC[RadioButtonExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "RadioButtonGroup")
  @js.native
  val RadioButtonGroup: FC[RadioButtonGroupExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "RangeInput")
  @js.native
  val RangeInput: FC[RangeInputExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "RangeSelector")
  @js.native
  val RangeSelector: FC[
    RangeSelectorProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/es6/components", "RoutedAnchor")
  @js.native
  open class RoutedAnchor protected ()
    extends Component[RoutedAnchorPropsOmitAnch, js.Object, Any] {
    def this(props: RoutedAnchorPropsOmitAnch) = this()
    def this(props: RoutedAnchorPropsOmitAnch, context: Any) = this()
  }
  @JSImport("grommet/es6/components", "RoutedAnchor")
  @js.native
  val RoutedAnchor: ComponentClassP[RoutedAnchorPropsOmitAnch & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/es6/components", "RoutedButton")
  @js.native
  open class RoutedButton protected ()
    extends Component[RoutedButtonProps & ButtonProps, js.Object, Any] {
    def this(props: RoutedButtonProps & ButtonProps) = this()
    def this(props: RoutedButtonProps & ButtonProps, context: Any) = this()
  }
  @JSImport("grommet/es6/components", "RoutedButton")
  @js.native
  val RoutedButton: ComponentClassP[RoutedButtonProps & ButtonProps & js.Object] = js.native
  
  @JSImport("grommet/es6/components", "Select")
  @js.native
  val Select: FC[SelectExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "SelectMultiple")
  @js.native
  val SelectMultiple: FC[SelectMultipleExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Sidebar")
  @js.native
  val Sidebar: FC[SidebarExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "SkipLink")
  @js.native
  val SkipLink: FC[SkipLinkProps] = js.native
  
  @JSImport("grommet/es6/components", "SkipLinkTarget")
  @js.native
  val SkipLinkTarget: FC[SkipLinkTargetProps] = js.native
  
  @JSImport("grommet/es6/components", "SkipLinks")
  @js.native
  val SkipLinks: FC[SkipLinksProps] = js.native
  
  @JSImport("grommet/es6/components", "Spinner")
  @js.native
  val Spinner: FC[SpinnerExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Stack")
  @js.native
  val Stack: FC[StackExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Tab")
  @js.native
  val Tab: FC[TabExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Table")
  @js.native
  val Table: FC[TableExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "TableBody")
  @js.native
  val TableBody: FC[TableBodyExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "TableCell")
  @js.native
  val TableCell: FC[TableCellExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "TableFooter")
  @js.native
  val TableFooter: FC[TableFooterExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "TableHeader")
  @js.native
  val TableHeader: FC[TableHeaderExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "TableRow")
  @js.native
  val TableRow: FC[TableRowExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Tabs")
  @js.native
  val Tabs: FC[TabsExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Tag")
  @js.native
  val Tag: FC[TagExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "Text")
  @js.native
  val Text: FC[TextExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "TextArea")
  @js.native
  val TextArea: FC[TextAreaExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "TextInput")
  @js.native
  val TextInput: FC[TextInputProps] = js.native
  
  @JSImport("grommet/es6/components", "Tip")
  @js.native
  val Tip: FC[TipProps] = js.native
  
  @JSImport("grommet/es6/components", "Video")
  @js.native
  val Video: FC[VideoExtendedProps] = js.native
  
  @JSImport("grommet/es6/components", "WorldMap")
  @js.native
  val WorldMap: FC[WorldMapExtendedProps] = js.native
  
  inline def calcs(values: js.Array[js.Array[Double] | Double]): CalcsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("calcs")(values.asInstanceOf[js.Any]).asInstanceOf[CalcsResult]
  inline def calcs(values: js.Array[js.Array[Double] | Double], options: CalcsOptions): CalcsResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calcs")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CalcsResult]
}
