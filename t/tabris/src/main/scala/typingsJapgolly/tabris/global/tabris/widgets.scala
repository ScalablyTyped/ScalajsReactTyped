package typingsJapgolly.tabris.global.tabris

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import typingsJapgolly.tabris.anon.OmitActionsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitActivityIndicatorsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitButtonsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitCameraViewsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitCanvassetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitCheckBoxsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitCompositeWidgetanysetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitImageViewsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitNavigationViewPageActAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitOmitVideospeedpositioAppendTo
import typingsJapgolly.tabris.anon.OmitOmitWebViewcanGoBackcAppendTo
import typingsJapgolly.tabris.anon.OmitPagesetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitPdfViewsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitPickersetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitProgressBarsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitRadioButtonsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitRefreshCompositesetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitRowsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitScrollViewsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitSearchActionsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitSlidersetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitStacksetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitSwitchsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitTabFolderTabsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitTabsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitTextInputsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitTextViewsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitToggleButtonsetAbsoluteBounds
import typingsJapgolly.tabris.anon.OmitVideospeedpositiondurAnimate
import typingsJapgolly.tabris.anon.OmitWebViewcanGoBackcanGoAnimate
import typingsJapgolly.tabris.anon.PartialPickPickeritemText
import typingsJapgolly.tabris.mod.Omit
import typingsJapgolly.tabris.mod.Properties
import typingsJapgolly.tabris.tabrisStrings.cellHeight
import typingsJapgolly.tabris.tabrisStrings.cellType
import typingsJapgolly.tabris.tabrisStrings.createCell
import typingsJapgolly.tabris.tabrisStrings.set
import typingsJapgolly.tabris.tabrisStrings.updateCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgets {
  
  @JSGlobal("tabris.widgets.Action")
  @js.native
  /**
    * An executable item that is integrated in the application's navigation menu. Add a *select* listener
    * to react to action taps.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Action ()
    extends typingsJapgolly.tabris.mod.widgets.Action {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.Action, OmitActionsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.ActivityIndicator")
  @js.native
  /**
    * A widget representing a spinning indicator for indeterminate loading / processing time.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class ActivityIndicator ()
    extends typingsJapgolly.tabris.mod.widgets.ActivityIndicator {
    def this(properties: Properties[
            typingsJapgolly.tabris.mod.widgets.ActivityIndicator, 
            OmitActivityIndicatorsetAbsoluteBounds
          ]) = this()
  }
  
  @JSGlobal("tabris.widgets.Button")
  @js.native
  /**
    * A push button. Can contain a text or an image.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Button ()
    extends typingsJapgolly.tabris.mod.widgets.Button {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.Button, OmitButtonsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.CameraView")
  @js.native
  /**
    * A widget to preview a `Camera` feed.
    * In order to show a camera preview image the app has to hold the `'camera'` permission.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class CameraView ()
    extends typingsJapgolly.tabris.mod.widgets.CameraView {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.CameraView, OmitCameraViewsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Canvas")
  @js.native
  /**
    * Canvas is a widget that can be used to draw graphics using a [canvas context](./CanvasContext.md).
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Canvas ()
    extends typingsJapgolly.tabris.mod.widgets.Canvas {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.Canvas, OmitCanvassetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.CheckBox")
  @js.native
  /**
    * A check box widget.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class CheckBox ()
    extends typingsJapgolly.tabris.mod.widgets.CheckBox {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.CheckBox, OmitCheckBoxsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.CollectionView")
  @js.native
  /**
    * A scrollable list that displays data items in cells, one per row. Cells are created on demand by the
    * *createCell* callback and reused on scrolling.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class CollectionView[CellWidgetType /* <: typingsJapgolly.tabris.mod.Widget[Any] */] ()
    extends typingsJapgolly.tabris.mod.widgets.CollectionView[CellWidgetType] {
    def this(properties: (Properties[
            Omit[
              typingsJapgolly.tabris.mod.widgets.CollectionView[CellWidgetType], 
              typingsJapgolly.tabris.tabrisStrings.firstVisibleIndex | typingsJapgolly.tabris.tabrisStrings.lastVisibleIndex
            ], 
            Omit[
              Omit[
                typingsJapgolly.tabris.mod.widgets.CollectionView[CellWidgetType], 
                typingsJapgolly.tabris.tabrisStrings.firstVisibleIndex | typingsJapgolly.tabris.tabrisStrings.lastVisibleIndex
              ], 
              set
            ]
          ]) & (Partial[
            Pick[
              typingsJapgolly.tabris.mod.widgets.CollectionView[CellWidgetType], 
              cellHeight | cellType | createCell | updateCell
            ]
          ])) = this()
  }
  
  @JSGlobal("tabris.widgets.Composite")
  @js.native
  /**
    * An empty widget that can contain other widgets.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Composite[ChildType /* <: typingsJapgolly.tabris.mod.Widget[Any] */] ()
    extends typingsJapgolly.tabris.mod.widgets.Composite[ChildType] {
    def this(properties: Properties[
            typingsJapgolly.tabris.mod.widgets.Composite[typingsJapgolly.tabris.mod.Widget[Any]], 
            OmitCompositeWidgetanysetAbsoluteBounds[ChildType]
          ]) = this()
  }
  
  @JSGlobal("tabris.widgets.ImageView")
  @js.native
  /**
    * A widget to display an image.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class ImageView ()
    extends typingsJapgolly.tabris.mod.widgets.ImageView {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.ImageView, OmitImageViewsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.NavigationView")
  @js.native
  /**
    * A widget that displays a stack of [pages](Page) with a toolbar that allows to navigate back. The
    * toolbar also displays the current page's title and the highest priority [actions](Action) that are
    * added to the NavigationView. Only children of type `Page`, `Action` and `SearchAction` are supported.
    * Since the NavigationView does not compute its own size, the width and height must be defined by the
    * respective layout properties (e.g. either `width` or `left` and `right` must be specified).
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class NavigationView[PageType /* <: typingsJapgolly.tabris.mod.Page */, ActionType /* <: typingsJapgolly.tabris.mod.Action */] ()
    extends typingsJapgolly.tabris.mod.widgets.NavigationView[PageType, ActionType] {
    def this(properties: Properties[
            typingsJapgolly.tabris.mod.widgets.NavigationView[typingsJapgolly.tabris.mod.Page, typingsJapgolly.tabris.mod.Action], 
            OmitNavigationViewPageActAbsoluteBounds[PageType, ActionType]
          ]) = this()
  }
  
  @JSGlobal("tabris.widgets.ObservableData")
  @js.native
  open class ObservableData ()
    extends typingsJapgolly.tabris.mod.widgets.ObservableData {
    def this(properties: Record[String, Any]) = this()
  }
  
  @JSGlobal("tabris.widgets.Page")
  @js.native
  /**
    * A container representing a single page of a NavigationView widget.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Page ()
    extends typingsJapgolly.tabris.mod.widgets.Page {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.Page, OmitPagesetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.PdfView")
  @js.native
  /**
    * A widget to display PDF documents.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class PdfView ()
    extends typingsJapgolly.tabris.mod.widgets.PdfView {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.PdfView, OmitPdfViewsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Picker")
  @js.native
  /**
    * A widget with a drop-down list of items to choose from.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Picker ()
    extends typingsJapgolly.tabris.mod.widgets.Picker {
    def this(properties: (Properties[typingsJapgolly.tabris.mod.widgets.Picker, OmitPickersetAbsoluteBounds]) & PartialPickPickeritemText) = this()
  }
  
  @JSGlobal("tabris.widgets.ProgressBar")
  @js.native
  /**
    * A widget representing a numeric value as a horizontal bar with a growing indicator.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class ProgressBar ()
    extends typingsJapgolly.tabris.mod.widgets.ProgressBar {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.ProgressBar, OmitProgressBarsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.RadioButton")
  @js.native
  /**
    * A radio button. Selecting a radio button de-selects all its siblings (i.e. all radio buttons within
    * the same parent).
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class RadioButton ()
    extends typingsJapgolly.tabris.mod.widgets.RadioButton {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.RadioButton, OmitRadioButtonsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.RefreshComposite")
  @js.native
  /**
    * A composite allowing to use a pull-to-refresh gesture to trigger and visualize a long running
    * operation.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class RefreshComposite ()
    extends typingsJapgolly.tabris.mod.widgets.RefreshComposite {
    def this(properties: Properties[
            typingsJapgolly.tabris.mod.widgets.RefreshComposite, 
            OmitRefreshCompositesetAbsoluteBounds
          ]) = this()
  }
  
  @JSGlobal("tabris.widgets.Row")
  @js.native
  /**
    * A composite with the `layout` property initialized with a `RowLayout`. All children are automatically
    * arranged in one horizontal row, starting from the left.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Row ()
    extends typingsJapgolly.tabris.mod.widgets.Row {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.Row, OmitRowsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.ScrollView")
  @js.native
  /**
    * A composite that allows its content to overflow either vertically (default) or horizontally. Since
    * the ScrollView does not compute its own size, the width and height must be defined by the respective
    * layout properties (e.g. either `width` or `left` and `right` must be specified).
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class ScrollView ()
    extends typingsJapgolly.tabris.mod.widgets.ScrollView {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.ScrollView, OmitScrollViewsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.SearchAction")
  @js.native
  /**
    * An action that displays a search text field with dynamic proposals when selected. Add a listener on
    * *select* to implement the action. On *input*, you may set a list of *proposals*.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class SearchAction ()
    extends typingsJapgolly.tabris.mod.widgets.SearchAction {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.SearchAction, OmitSearchActionsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Slider")
  @js.native
  /**
    * A widget representing a numeric value as an movable indicator on a horizontal line.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Slider ()
    extends typingsJapgolly.tabris.mod.widgets.Slider {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.Slider, OmitSlidersetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Stack")
  @js.native
  /**
    * A composite with the `layout` property initialized with a `StackLayout`. All children are
    * automatically arranged in one vertical stack, starting from the top. The `layoutData` on the children
    * is ignored.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Stack ()
    extends typingsJapgolly.tabris.mod.widgets.Stack {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.Stack, OmitStacksetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Switch")
  @js.native
  /**
    * A switch widget that can be toggled.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Switch ()
    extends typingsJapgolly.tabris.mod.widgets.Switch {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.Switch, OmitSwitchsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Tab")
  @js.native
  /**
    * A container representing a single tab of a TabFolder widget.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Tab ()
    extends typingsJapgolly.tabris.mod.widgets.Tab {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.Tab, OmitTabsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.TabFolder")
  @js.native
  /**
    * A widget that can switch between [tabs](Tab). Only children of type `Tab` are supported. Since the
    * TabFolder does not compute its own size, the width and height must be defined by the respective
    * layout properties (e.g. either `width` or `left` and `right` must be specified).
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class TabFolder[TabType /* <: typingsJapgolly.tabris.mod.Tab */] ()
    extends typingsJapgolly.tabris.mod.widgets.TabFolder[TabType] {
    def this(properties: Properties[
            typingsJapgolly.tabris.mod.widgets.TabFolder[typingsJapgolly.tabris.mod.Tab], 
            OmitTabFolderTabsetAbsoluteBounds[TabType]
          ]) = this()
  }
  
  @JSGlobal("tabris.widgets.TextInput")
  @js.native
  /**
    * A widget that allows to enter text.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class TextInput ()
    extends typingsJapgolly.tabris.mod.widgets.TextInput {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.TextInput, OmitTextInputsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.TextView")
  @js.native
  /**
    * A widget to display a text. For images, use ImageView.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class TextView ()
    extends typingsJapgolly.tabris.mod.widgets.TextView {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.TextView, OmitTextViewsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.ToggleButton")
  @js.native
  /**
    * A push button that "snaps in", i.e. it is selected when pressed and deselected when pressed again.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class ToggleButton ()
    extends typingsJapgolly.tabris.mod.widgets.ToggleButton {
    def this(properties: Properties[typingsJapgolly.tabris.mod.widgets.ToggleButton, OmitToggleButtonsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Video")
  @js.native
  /**
    * A widget that plays a video from an URL.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Video ()
    extends typingsJapgolly.tabris.mod.widgets.Video {
    def this(properties: Properties[OmitVideospeedpositiondurAnimate, OmitOmitVideospeedpositioAppendTo]) = this()
  }
  
  @JSGlobal("tabris.widgets.WebView")
  @js.native
  /**
    * A widget that can display a web page. Since this widget requires a lot of resources it's recommended
    * to have no more than one instance at a time.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class WebView ()
    extends typingsJapgolly.tabris.mod.widgets.WebView {
    def this(properties: Properties[OmitWebViewcanGoBackcanGoAnimate, OmitOmitWebViewcanGoBackcAppendTo]) = this()
  }
}
