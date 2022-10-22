package typingsJapgolly.isotopeLayout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.addItems
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.appended
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.destroy
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.getFilteredItemElements
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.getItemElements
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.hideItemElements
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.insert
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.isotope
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.layout
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.layoutItems
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.prepended
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.reloadItems
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.remove
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.revealItemElements
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.shuffle
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.stamp
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.unstamp
import typingsJapgolly.isotopeLayout.isotopeLayoutStrings.updateSortData
import typingsJapgolly.isotopeLayout.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("isotope-layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("isotope-layout", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Isotope {
    def this(elementOrSelector: String, options: IsotopeOptions) = this()
    def this(elementOrSelector: HTMLElement, options: IsotopeOptions) = this()
    
    /**
      * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    /* CompleteClass */
    override def addItems(elements: Elements): Unit = js.native
    
    /**
      * Adds and lays out newly appended item elements to the end of the layout.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    /* CompleteClass */
    override def appended(elements: Elements): Unit = js.native
    
    /**
      * Filters, sorts, and lays out items. arrange is the principle method of Isotope. It is the default method with jQuery .isotope(). Pass in options to apply filtering and sorting.
      * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
      */
    /* CompleteClass */
    override def arrange(options: IsotopeOptions): Unit = js.native
    
    /**
      * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Returns an array of filtered item elements in current sorted order.
      */
    /* CompleteClass */
    override def getFilteredItemElements(): js.Array[Element] = js.native
    
    /**
      * Returns an array of all item elements in the Isotope instance.
      */
    /* CompleteClass */
    override def getItemElements(): js.Array[Element] = js.native
    
    /**
      * Hide items.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    /* CompleteClass */
    override def hideItemElements(elements: Elements): Unit = js.native
    
    /**
      * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    /* CompleteClass */
    override def insert(elements: Elements): Unit = js.native
    
    /**
      * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
      */
    /* CompleteClass */
    override def layout(): Unit = js.native
    
    /**
      * Lays out specified items.
      * @param elements Array of Isotope.Items
      * @param isStill Disables transitions
      */
    /* CompleteClass */
    override def layoutItems(elements: js.Array[HTMLElement], isStill: Boolean): Unit = js.native
    
    /**
      * Adds and lays out newly prepended item elements at the beginning of layout.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    /* CompleteClass */
    override def prepended(elements: Elements): Unit = js.native
    
    /**
      * Recollects all item elements.
      * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
      */
    /* CompleteClass */
    override def reloadItems(): Unit = js.native
    
    /**
      * Removes elements from the Isotope instance and DOM.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    /* CompleteClass */
    override def remove(elements: Elements): Unit = js.native
    
    /**
      * Reveals hidden items.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    /* CompleteClass */
    override def revealItemElements(elements: Elements): Unit = js.native
    
    /**
      * Shuffles items in a random order.
      */
    /* CompleteClass */
    override def shuffle(): Unit = js.native
    
    /**
      * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
      * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    /* CompleteClass */
    override def stamp(elements: Elements): Unit = js.native
    
    /**
      * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    /* CompleteClass */
    override def unstamp(elements: Elements): Unit = js.native
    
    /**
      * Updates sort data
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    /* CompleteClass */
    override def updateSortData(elements: Elements): Unit = js.native
  }
  
  inline def data(element: String): Isotope = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[Isotope]
  /**
    * Get the Isotope instance via its element. Isotope.data() is useful for getting the Isotope instance in JavaScript, after it has been initalized in HTML.
    */
  inline def data(element: HTMLElement): Isotope = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[Isotope]
  
  trait CellsByColumn extends StObject {
    
    var columnWidth: js.UndefOr[Double | String] = js.undefined
    
    var rowHeight: js.UndefOr[Double | String] = js.undefined
  }
  object CellsByColumn {
    
    inline def apply(): CellsByColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellsByColumn]
    }
    
    extension [Self <: CellsByColumn](x: Self) {
      
      inline def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    }
  }
  
  trait CellsByRow extends StObject {
    
    var columnWidth: js.UndefOr[Double | String] = js.undefined
    
    var rowHeight: js.UndefOr[Double | String] = js.undefined
  }
  object CellsByRow {
    
    inline def apply(): CellsByRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellsByRow]
    }
    
    extension [Self <: CellsByRow](x: Self) {
      
      inline def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    }
  }
  
  type Elements = js.Array[HTMLElement] | HTMLElement | JQuery | NodeList[Node]
  
  trait FitRows extends StObject {
    
    var gutter: js.UndefOr[Double | String] = js.undefined
  }
  object FitRows {
    
    inline def apply(): FitRows = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitRows]
    }
    
    extension [Self <: FitRows](x: Self) {
      
      inline def setGutter(value: Double | String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    }
  }
  
  trait Horizontal extends StObject {
    
    var verticalAligment: js.UndefOr[Double] = js.undefined
  }
  object Horizontal {
    
    inline def apply(): Horizontal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Horizontal]
    }
    
    extension [Self <: Horizontal](x: Self) {
      
      inline def setVerticalAligment(value: Double): Self = StObject.set(x, "verticalAligment", value.asInstanceOf[js.Any])
      
      inline def setVerticalAligmentUndefined: Self = StObject.set(x, "verticalAligment", js.undefined)
    }
  }
  
  trait Isotope extends StObject {
    
    /**
      * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def addItems(elements: Elements): Unit
    
    /**
      * Adds and lays out newly appended item elements to the end of the layout.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def appended(elements: Elements): Unit
    
    /**
      * Filters, sorts, and lays out items. arrange is the principle method of Isotope. It is the default method with jQuery .isotope(). Pass in options to apply filtering and sorting.
      * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
      */
    def arrange(options: IsotopeOptions): Unit
    
    /**
      * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
      */
    def destroy(): Unit
    
    /**
      * Returns an array of filtered item elements in current sorted order.
      */
    def getFilteredItemElements(): js.Array[Element]
    
    /**
      * Returns an array of all item elements in the Isotope instance.
      */
    def getItemElements(): js.Array[Element]
    
    /**
      * Hide items.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def hideItemElements(elements: Elements): Unit
    
    /**
      * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def insert(elements: Elements): Unit
    
    /**
      * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
      */
    def layout(): Unit
    
    /**
      * Lays out specified items.
      * @param elements Array of Isotope.Items
      * @param isStill Disables transitions
      */
    def layoutItems(elements: js.Array[HTMLElement], isStill: Boolean): Unit
    
    /**
      * Adds and lays out newly prepended item elements at the beginning of layout.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def prepended(elements: Elements): Unit
    
    /**
      * Recollects all item elements.
      * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
      */
    def reloadItems(): Unit
    
    /**
      * Removes elements from the Isotope instance and DOM.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def remove(elements: Elements): Unit
    
    /**
      * Reveals hidden items.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def revealItemElements(elements: Elements): Unit
    
    /**
      * Shuffles items in a random order.
      */
    def shuffle(): Unit
    
    /**
      * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
      * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def stamp(elements: Elements): Unit
    
    /**
      * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def unstamp(elements: Elements): Unit
    
    /**
      * Updates sort data
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def updateSortData(elements: Elements): Unit
  }
  object Isotope {
    
    inline def apply(
      addItems: Elements => Callback,
      appended: Elements => Callback,
      arrange: IsotopeOptions => Callback,
      destroy: Callback,
      getFilteredItemElements: CallbackTo[js.Array[Element]],
      getItemElements: CallbackTo[js.Array[Element]],
      hideItemElements: Elements => Callback,
      insert: Elements => Callback,
      layout: Callback,
      layoutItems: (js.Array[HTMLElement], Boolean) => Callback,
      prepended: Elements => Callback,
      reloadItems: Callback,
      remove: Elements => Callback,
      revealItemElements: Elements => Callback,
      shuffle: Callback,
      stamp: Elements => Callback,
      unstamp: Elements => Callback,
      updateSortData: Elements => Callback
    ): Isotope = {
      val __obj = js.Dynamic.literal(addItems = js.Any.fromFunction1((t0: Elements) => addItems(t0).runNow()), appended = js.Any.fromFunction1((t0: Elements) => appended(t0).runNow()), arrange = js.Any.fromFunction1((t0: IsotopeOptions) => arrange(t0).runNow()), destroy = destroy.toJsFn, getFilteredItemElements = getFilteredItemElements.toJsFn, getItemElements = getItemElements.toJsFn, hideItemElements = js.Any.fromFunction1((t0: Elements) => hideItemElements(t0).runNow()), insert = js.Any.fromFunction1((t0: Elements) => insert(t0).runNow()), layout = layout.toJsFn, layoutItems = js.Any.fromFunction2((t0: js.Array[HTMLElement], t1: Boolean) => (layoutItems(t0, t1)).runNow()), prepended = js.Any.fromFunction1((t0: Elements) => prepended(t0).runNow()), reloadItems = reloadItems.toJsFn, remove = js.Any.fromFunction1((t0: Elements) => remove(t0).runNow()), revealItemElements = js.Any.fromFunction1((t0: Elements) => revealItemElements(t0).runNow()), shuffle = shuffle.toJsFn, stamp = js.Any.fromFunction1((t0: Elements) => stamp(t0).runNow()), unstamp = js.Any.fromFunction1((t0: Elements) => unstamp(t0).runNow()), updateSortData = js.Any.fromFunction1((t0: Elements) => updateSortData(t0).runNow()))
      __obj.asInstanceOf[Isotope]
    }
    
    extension [Self <: Isotope](x: Self) {
      
      inline def setAddItems(value: Elements => Callback): Self = StObject.set(x, "addItems", js.Any.fromFunction1((t0: Elements) => value(t0).runNow()))
      
      inline def setAppended(value: Elements => Callback): Self = StObject.set(x, "appended", js.Any.fromFunction1((t0: Elements) => value(t0).runNow()))
      
      inline def setArrange(value: IsotopeOptions => Callback): Self = StObject.set(x, "arrange", js.Any.fromFunction1((t0: IsotopeOptions) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetFilteredItemElements(value: CallbackTo[js.Array[Element]]): Self = StObject.set(x, "getFilteredItemElements", value.toJsFn)
      
      inline def setGetItemElements(value: CallbackTo[js.Array[Element]]): Self = StObject.set(x, "getItemElements", value.toJsFn)
      
      inline def setHideItemElements(value: Elements => Callback): Self = StObject.set(x, "hideItemElements", js.Any.fromFunction1((t0: Elements) => value(t0).runNow()))
      
      inline def setInsert(value: Elements => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: Elements) => value(t0).runNow()))
      
      inline def setLayout(value: Callback): Self = StObject.set(x, "layout", value.toJsFn)
      
      inline def setLayoutItems(value: (js.Array[HTMLElement], Boolean) => Callback): Self = StObject.set(x, "layoutItems", js.Any.fromFunction2((t0: js.Array[HTMLElement], t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setPrepended(value: Elements => Callback): Self = StObject.set(x, "prepended", js.Any.fromFunction1((t0: Elements) => value(t0).runNow()))
      
      inline def setReloadItems(value: Callback): Self = StObject.set(x, "reloadItems", value.toJsFn)
      
      inline def setRemove(value: Elements => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Elements) => value(t0).runNow()))
      
      inline def setRevealItemElements(value: Elements => Callback): Self = StObject.set(x, "revealItemElements", js.Any.fromFunction1((t0: Elements) => value(t0).runNow()))
      
      inline def setShuffle(value: Callback): Self = StObject.set(x, "shuffle", value.toJsFn)
      
      inline def setStamp(value: Elements => Callback): Self = StObject.set(x, "stamp", js.Any.fromFunction1((t0: Elements) => value(t0).runNow()))
      
      inline def setUnstamp(value: Elements => Callback): Self = StObject.set(x, "unstamp", js.Any.fromFunction1((t0: Elements) => value(t0).runNow()))
      
      inline def setUpdateSortData(value: Elements => Callback): Self = StObject.set(x, "updateSortData", js.Any.fromFunction1((t0: Elements) => value(t0).runNow()))
    }
  }
  
  trait IsotopeOptions extends StObject {
    
    /**
      * A horizontal grid layout where items are centered inside each cell. The grid is defined by columnWidth and rowHeight options.
      */
    var cellsByColumn: js.UndefOr[CellsByColumn] = js.undefined
    
    /**
      * A vertical grid layout where items are centered inside each cell. The grid is defined by columnWidth and rowHeight options.
      */
    var cellsByRow: js.UndefOr[CellsByRow] = js.undefined
    
    /**
      * CSS styles that are applied to the container element.
      */
    var containerStyle: js.UndefOr[Style] = js.undefined
    
    /**
      * Shows items that match the filter and hides items that do not match.
      * If set to a string, that value is used as a selector.
      * If filter is set to a function, that function checks each item and returns true or false if the item should be shown or hidden.
      */
    var filter: js.UndefOr[String | (js.Function1[/* itemElement */ HTMLElement, Boolean])] = js.undefined
    
    /**
      * Items are arranged into rows. Rows progress vertically. Similar to what you would expect from a layout that uses CSS floats. fitRows works well for items that have the same height.
      */
    var fitRows: js.UndefOr[FitRows] = js.undefined
    
    /**
      * Isotope reads data from HTML with the getSortData option.
      * getSortData is set with an object. The object’s keys are keywords used to sort by. Object values are either a shortcut string or function to retrieve the data.
      */
    var getSortData: js.UndefOr[Sorter] = js.undefined
    
    /**
      * The styles applied to hide items when filtering.
      */
    var hiddenStyle: js.UndefOr[Style] = js.undefined
    
    /**
      * Items are arranged horizontally.
      */
    var horiz: js.UndefOr[Horizontal] = js.undefined
    
    /**
      * Enables layout on initialization. Enabled by default initLayout: true.
      * Set initLayout: false to disable layout on initialization, so you can use methods or add events before the initial layout.
      * initLayout was previously isInitLayout in Isotope v2. isInitLayout will still work in Isotope v3
      */
    var initLayout: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies which child elements will be used as item elements in the layout.
      * We recommend always setting itemSelector. itemSelector is useful to exclude sizing elements or other elements that are not part of the layout.
      */
    var itemSelector: js.UndefOr[String] = js.undefined
    
    /**
      * Layout modes can have their own separate options. These are set in a corresponding object within the options.
      * masonry, fitRows, and vertical are included in Isotope by default. All other layout modes need to installed separately.
      */
    var layoutMode: js.UndefOr[LayoutModes] = js.undefined
    
    /**
      * The default layout mode. Items are arranged in a vertically cascading grid.
      */
    var masonry: js.UndefOr[Masonry] = js.undefined
    
    /**
      * Horizontal version of masonry. Items are arranged in a horizontally cascading grid.
      */
    var masontryHorizontal: js.UndefOr[MasonryHorizontal] = js.undefined
    
    /**
      * Controls the horizontal flow of the layout. By default, item elements start positioning at the left, with originLeft: true. Set originLeft: false for right-to-left layouts.
      */
    var originLeft: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the vertical flow of the layout. By default, item elements start positioning at the top. Set to false for bottom-up layouts. It’s like Tetris!
      */
    var originTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The packery layout mode uses a bin-packing algorithm. This is a fancy way of saying “it fills empty gaps.” It works similarly to masonry, except gaps will be filled.
      */
    var packery: js.UndefOr[Packery] = js.undefined
    
    /**
      * Sets item positions in percent values, rather than pixel values. percentPosition: true works well with percent-width items, as items will not transition their position on resize.
      */
    var percentPosition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adjusts sizes and positions when window is resized. Enabled by default resize: true.
      */
    var resize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sorts items ascendingly if sortAscending: true “A, B, C…”, “1, 2, 3…”, or descendingly if sortAscending: false, “Z, Y, X…”, “9, 8, 7…”.
      * You can set ascending order for each sortBy value by setting sortAscending to an object.
      */
    var sortAscending: js.UndefOr[Boolean | SortOrder] = js.undefined
    
    /**
      * Sorts items according to which property of getSortData. The value of sortBy needs to match a key name in getSortData.
      */
    var sortBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Staggers item transitions, so items transition incrementally after one another. Set as a CSS time format, '0.03s', or as a number in milliseconds, 30.
      */
    var stagger: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Specifies which elements are stamped within the layout. Isotope will layout items around stamped elements.
      * The masonry, packery, and masonryHorizontal layout modes support stamping.
      * The stamp option stamps elements only when the Isotope instance is first initialized. You can stamp additional elements afterwards with the stamp method.
      */
    var stamp: js.UndefOr[String] = js.undefined
    
    /**
      * Duration of the transition when items change position or appearance, set in a CSS time format, or as a number in milliseconds. Default: transitionDuration: '0.4s'
      */
    var transitionDuration: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Items are stacked vertically.
      */
    var vertical: js.UndefOr[Vertical] = js.undefined
    
    /**
      * The styles applied to reveal items when filtering.
      */
    var visibleStyle: js.UndefOr[Style] = js.undefined
  }
  object IsotopeOptions {
    
    inline def apply(): IsotopeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsotopeOptions]
    }
    
    extension [Self <: IsotopeOptions](x: Self) {
      
      inline def setCellsByColumn(value: CellsByColumn): Self = StObject.set(x, "cellsByColumn", value.asInstanceOf[js.Any])
      
      inline def setCellsByColumnUndefined: Self = StObject.set(x, "cellsByColumn", js.undefined)
      
      inline def setCellsByRow(value: CellsByRow): Self = StObject.set(x, "cellsByRow", value.asInstanceOf[js.Any])
      
      inline def setCellsByRowUndefined: Self = StObject.set(x, "cellsByRow", js.undefined)
      
      inline def setContainerStyle(value: Style): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setFilter(value: String | (js.Function1[/* itemElement */ HTMLElement, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* itemElement */ HTMLElement => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFitRows(value: FitRows): Self = StObject.set(x, "fitRows", value.asInstanceOf[js.Any])
      
      inline def setFitRowsUndefined: Self = StObject.set(x, "fitRows", js.undefined)
      
      inline def setGetSortData(value: Sorter): Self = StObject.set(x, "getSortData", value.asInstanceOf[js.Any])
      
      inline def setGetSortDataUndefined: Self = StObject.set(x, "getSortData", js.undefined)
      
      inline def setHiddenStyle(value: Style): Self = StObject.set(x, "hiddenStyle", value.asInstanceOf[js.Any])
      
      inline def setHiddenStyleUndefined: Self = StObject.set(x, "hiddenStyle", js.undefined)
      
      inline def setHoriz(value: Horizontal): Self = StObject.set(x, "horiz", value.asInstanceOf[js.Any])
      
      inline def setHorizUndefined: Self = StObject.set(x, "horiz", js.undefined)
      
      inline def setInitLayout(value: Boolean): Self = StObject.set(x, "initLayout", value.asInstanceOf[js.Any])
      
      inline def setInitLayoutUndefined: Self = StObject.set(x, "initLayout", js.undefined)
      
      inline def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
      
      inline def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
      
      inline def setLayoutMode(value: LayoutModes): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
      
      inline def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
      
      inline def setMasonry(value: Masonry): Self = StObject.set(x, "masonry", value.asInstanceOf[js.Any])
      
      inline def setMasonryUndefined: Self = StObject.set(x, "masonry", js.undefined)
      
      inline def setMasontryHorizontal(value: MasonryHorizontal): Self = StObject.set(x, "masontryHorizontal", value.asInstanceOf[js.Any])
      
      inline def setMasontryHorizontalUndefined: Self = StObject.set(x, "masontryHorizontal", js.undefined)
      
      inline def setOriginLeft(value: Boolean): Self = StObject.set(x, "originLeft", value.asInstanceOf[js.Any])
      
      inline def setOriginLeftUndefined: Self = StObject.set(x, "originLeft", js.undefined)
      
      inline def setOriginTop(value: Boolean): Self = StObject.set(x, "originTop", value.asInstanceOf[js.Any])
      
      inline def setOriginTopUndefined: Self = StObject.set(x, "originTop", js.undefined)
      
      inline def setPackery(value: Packery): Self = StObject.set(x, "packery", value.asInstanceOf[js.Any])
      
      inline def setPackeryUndefined: Self = StObject.set(x, "packery", js.undefined)
      
      inline def setPercentPosition(value: Boolean): Self = StObject.set(x, "percentPosition", value.asInstanceOf[js.Any])
      
      inline def setPercentPositionUndefined: Self = StObject.set(x, "percentPosition", js.undefined)
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setSortAscending(value: Boolean | SortOrder): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
      
      inline def setSortAscendingUndefined: Self = StObject.set(x, "sortAscending", js.undefined)
      
      inline def setSortBy(value: String | js.Array[String]): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      inline def setSortByVarargs(value: String*): Self = StObject.set(x, "sortBy", js.Array(value*))
      
      inline def setStagger(value: Double | String): Self = StObject.set(x, "stagger", value.asInstanceOf[js.Any])
      
      inline def setStaggerUndefined: Self = StObject.set(x, "stagger", js.undefined)
      
      inline def setStamp(value: String): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      
      inline def setStampUndefined: Self = StObject.set(x, "stamp", js.undefined)
      
      inline def setTransitionDuration(value: Double | String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setVertical(value: Vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setVisibleStyle(value: Style): Self = StObject.set(x, "visibleStyle", value.asInstanceOf[js.Any])
      
      inline def setVisibleStyleUndefined: Self = StObject.set(x, "visibleStyle", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.isotopeLayout.isotopeLayoutStrings.masonry
    - typingsJapgolly.isotopeLayout.isotopeLayoutStrings.fitRows
    - typingsJapgolly.isotopeLayout.isotopeLayoutStrings.cellsByRow
    - typingsJapgolly.isotopeLayout.isotopeLayoutStrings.vertical
    - typingsJapgolly.isotopeLayout.isotopeLayoutStrings.packery
    - typingsJapgolly.isotopeLayout.isotopeLayoutStrings.masonryHorizontal
    - typingsJapgolly.isotopeLayout.isotopeLayoutStrings.fitColumns
    - typingsJapgolly.isotopeLayout.isotopeLayoutStrings.cellsByColumn
    - typingsJapgolly.isotopeLayout.isotopeLayoutStrings.horiz
  */
  trait LayoutModes extends StObject
  object LayoutModes {
    
    inline def cellsByColumn: typingsJapgolly.isotopeLayout.isotopeLayoutStrings.cellsByColumn = "cellsByColumn".asInstanceOf[typingsJapgolly.isotopeLayout.isotopeLayoutStrings.cellsByColumn]
    
    inline def cellsByRow: typingsJapgolly.isotopeLayout.isotopeLayoutStrings.cellsByRow = "cellsByRow".asInstanceOf[typingsJapgolly.isotopeLayout.isotopeLayoutStrings.cellsByRow]
    
    inline def fitColumns: typingsJapgolly.isotopeLayout.isotopeLayoutStrings.fitColumns = "fitColumns".asInstanceOf[typingsJapgolly.isotopeLayout.isotopeLayoutStrings.fitColumns]
    
    inline def fitRows: typingsJapgolly.isotopeLayout.isotopeLayoutStrings.fitRows = "fitRows".asInstanceOf[typingsJapgolly.isotopeLayout.isotopeLayoutStrings.fitRows]
    
    inline def horiz: typingsJapgolly.isotopeLayout.isotopeLayoutStrings.horiz = "horiz".asInstanceOf[typingsJapgolly.isotopeLayout.isotopeLayoutStrings.horiz]
    
    inline def masonry: typingsJapgolly.isotopeLayout.isotopeLayoutStrings.masonry = "masonry".asInstanceOf[typingsJapgolly.isotopeLayout.isotopeLayoutStrings.masonry]
    
    inline def masonryHorizontal: typingsJapgolly.isotopeLayout.isotopeLayoutStrings.masonryHorizontal = "masonryHorizontal".asInstanceOf[typingsJapgolly.isotopeLayout.isotopeLayoutStrings.masonryHorizontal]
    
    inline def packery: typingsJapgolly.isotopeLayout.isotopeLayoutStrings.packery = "packery".asInstanceOf[typingsJapgolly.isotopeLayout.isotopeLayoutStrings.packery]
    
    inline def vertical: typingsJapgolly.isotopeLayout.isotopeLayoutStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.isotopeLayout.isotopeLayoutStrings.vertical]
  }
  
  trait Masonry extends StObject {
    
    var columnWidth: js.UndefOr[Double | String] = js.undefined
    
    var fitWidth: js.UndefOr[Boolean] = js.undefined
    
    var gutter: js.UndefOr[Double | String] = js.undefined
  }
  object Masonry {
    
    inline def apply(): Masonry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Masonry]
    }
    
    extension [Self <: Masonry](x: Self) {
      
      inline def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setFitWidth(value: Boolean): Self = StObject.set(x, "fitWidth", value.asInstanceOf[js.Any])
      
      inline def setFitWidthUndefined: Self = StObject.set(x, "fitWidth", js.undefined)
      
      inline def setGutter(value: Double | String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    }
  }
  
  trait MasonryHorizontal extends StObject {
    
    var gutter: js.UndefOr[Double | String] = js.undefined
    
    var rowHeight: js.UndefOr[Double | String] = js.undefined
  }
  object MasonryHorizontal {
    
    inline def apply(): MasonryHorizontal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MasonryHorizontal]
    }
    
    extension [Self <: MasonryHorizontal](x: Self) {
      
      inline def setGutter(value: Double | String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    }
  }
  
  trait Packery extends StObject {
    
    var columnWidth: js.UndefOr[Double | String] = js.undefined
    
    var gutter: js.UndefOr[Double | String] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var rowHeight: js.UndefOr[Double] = js.undefined
  }
  object Packery {
    
    inline def apply(): Packery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Packery]
    }
    
    extension [Self <: Packery](x: Self) {
      
      inline def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setGutter(value: Double | String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    }
  }
  
  type SortOrder = StringDictionary[Boolean]
  
  type Sorter = StringDictionary[(js.Function1[/* itemElm */ JQuery, Double | String]) | String]
  
  type Style = StringDictionary[Double | String]
  
  trait Vertical extends StObject {
    
    var horizontalAlignment: js.UndefOr[Double] = js.undefined
  }
  object Vertical {
    
    inline def apply(): Vertical = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Vertical]
    }
    
    extension [Self <: Vertical](x: Self) {
      
      inline def setHorizontalAlignment(value: Double): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      /**
        * Get the Isotope instance from a jQuery object. Isotope instances are useful to access Isotope properties.
        */
      @JSName("data")
      def data_isotope(methodName: isotope): Isotope = js.native
      
      /**
        * Filters, sorts, and lays out items.
        */
      def isotope(): JQuery = js.native
      /**
        * Filters, sorts, and lays out items. Pass in options to apply filtering and sorting.
        * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
        */
      def isotope(options: IsotopeOptions): JQuery = js.native
      /**
        * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_addItems(methodName: addItems, elements: Elements): JQuery = js.native
      /**
        * Adds and lays out newly appended item elements to the end of the layout.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_appended(methodName: appended, elements: Elements): JQuery = js.native
      /**
        * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
        */
      @JSName("isotope")
      def isotope_destroy(methodName: destroy): Unit = js.native
      /**
        * Returns an array of filtered item elements in current sorted order.
        */
      @JSName("isotope")
      def isotope_getFilteredItemElements(methodName: getFilteredItemElements): js.Array[Element] = js.native
      /**
        * Returns an array of all item elements in the Isotope instance.
        */
      @JSName("isotope")
      def isotope_getItemElements(methodName: getItemElements): js.Array[Element] = js.native
      /**
        * Hide items.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_hideItemElements(methodName: hideItemElements, elements: Elements): JQuery = js.native
      /**
        * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_insert(methodName: insert, elements: Elements): JQuery = js.native
      /**
        * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
        */
      @JSName("isotope")
      def isotope_layout(methodName: layout): JQuery = js.native
      /**
        * Lays out specified items.
        * @param elements Array of Isotope.Items
        * @param isStill Disables transitions
        */
      @JSName("isotope")
      def isotope_layoutItems(methodName: layoutItems, elements: js.Array[HTMLElement], isStill: Boolean): JQuery = js.native
      /**
        * Adds and lays out newly prepended item elements at the beginning of layout.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_prepended(methodName: prepended, elements: Elements): JQuery = js.native
      /**
        * Recollects all item elements.
        * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
        */
      @JSName("isotope")
      def isotope_reloadItems(methodName: reloadItems): JQuery = js.native
      /**
        * Removes elements from the Isotope instance and DOM.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_remove(methodName: remove, elements: Elements): JQuery = js.native
      /**
        * Reveals hidden items.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_revealItemElements(methodName: revealItemElements, elements: Elements): JQuery = js.native
      /**
        * Shuffles items in a random order.
        */
      @JSName("isotope")
      def isotope_shuffle(methodName: shuffle): JQuery = js.native
      /**
        * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
        * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_stamp(methodName: stamp, elements: Elements): JQuery = js.native
      /**
        * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_unstamp(methodName: unstamp, elements: Elements): JQuery = js.native
      /**
        * Updates sort data
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_updateSortData(methodName: updateSortData, elements: Elements): JQuery = js.native
    }
  }
}
