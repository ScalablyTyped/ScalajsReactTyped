package typingsJapgolly.gridstack

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CSSStyleSheet
import org.scalajs.dom.DragEvent
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import typingsJapgolly.gridstack.anon.Target
import typingsJapgolly.gridstack.anon.TypeofUtils
import typingsJapgolly.gridstack.distEs5GridstackEngineMod.GridStackEngineOptions
import typingsJapgolly.gridstack.distEs5TypesMod.ColumnOptions
import typingsJapgolly.gridstack.distEs5TypesMod.DDDragInOpt
import typingsJapgolly.gridstack.distEs5TypesMod.GridItemHTMLElement
import typingsJapgolly.gridstack.distEs5TypesMod.GridStackElement
import typingsJapgolly.gridstack.distEs5TypesMod.GridStackEventHandlerCallback
import typingsJapgolly.gridstack.distEs5TypesMod.GridStackNode
import typingsJapgolly.gridstack.distEs5TypesMod.GridStackOptions
import typingsJapgolly.gridstack.distEs5TypesMod.GridStackPosition
import typingsJapgolly.gridstack.distEs5TypesMod.GridStackWidget
import typingsJapgolly.gridstack.distEs5TypesMod.numberOrString
import typingsJapgolly.gridstack.distEs5UtilsMod.HeightData
import typingsJapgolly.gridstack.gridstackInts.`-1`
import typingsJapgolly.gridstack.gridstackInts.`1`
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5GridstackMod {
  
  @JSImport("gridstack/dist/es5/gridstack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gridstack/dist/es5/gridstack", "DDGridStack")
  @js.native
  open class DDGridStack ()
    extends typingsJapgolly.gridstack.distEs5DdGridstackMod.DDGridStack
  /* static members */
  object DDGridStack {
    
    @JSImport("gridstack/dist/es5/gridstack", "DDGridStack")
    @js.native
    val ^ : js.Any = js.native
    
    /** get the global (but static to this code) DD implementation */
    inline def get(): typingsJapgolly.gridstack.distEs5DdGridstackMod.DDGridStack = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[typingsJapgolly.gridstack.distEs5DdGridstackMod.DDGridStack]
  }
  
  @JSImport("gridstack/dist/es5/gridstack", "GridStack")
  @js.native
  open class GridStack protected () extends StObject {
    /**
      * Construct a grid item from the given element and options
      * @param el
      * @param opts
      */
    def this(el: GridHTMLElement) = this()
    def this(el: GridHTMLElement, opts: GridStackOptions) = this()
    
    /** add or remove the window size event handler */
    /* protected */ def _updateWindowResizeEvent(): GridStack = js.native
    /* protected */ def _updateWindowResizeEvent(forceRemove: Boolean): GridStack = js.native
    
    /** return our expected width (or parent) for 1 column check */
    /* protected */ def _widthOrContainer(): Double = js.native
    
    /**
      * add a new widget and returns it.
      *
      * Widget will be always placed even if result height is more than actual grid height.
      * You need to use `willItFit()` before calling addWidget for additional check.
      * See also `makeWidget()`.
      *
      * @example
      * let grid = GridStack.init();
      * grid.addWidget({w: 3, content: 'hello'});
      * grid.addWidget('<div class="grid-stack-item"><div class="grid-stack-item-content">hello</div></div>', {w: 3});
      *
      * @param el  GridStackWidget (which can have content string as well), html element, or string definition to add
      * @param options widget position/size options (optional, and ignore if first param is already option) - see GridStackWidget
      */
    def addWidget(): GridItemHTMLElement = js.native
    def addWidget(els: Unit, options: GridStackWidget): GridItemHTMLElement = js.native
    def addWidget(els: GridStackElement): GridItemHTMLElement = js.native
    def addWidget(els: GridStackElement, options: GridStackWidget): GridItemHTMLElement = js.native
    def addWidget(els: GridStackWidget): GridItemHTMLElement = js.native
    def addWidget(els: GridStackWidget, options: GridStackWidget): GridItemHTMLElement = js.native
    
    /**
      * use before calling a bunch of `addWidget()` to prevent un-necessary relayouts in between (more efficient)
      * and get a single event callback. You will see no changes until `batchUpdate(false)` is called.
      */
    def batchUpdate(): GridStack = js.native
    def batchUpdate(flag: Boolean): GridStack = js.native
    
    /**
      * Update current cell height - see `GridStackOptions.cellHeight` for format.
      * This method rebuilds an internal CSS style sheet.
      * Note: You can expect performance issues if call this method too often.
      *
      * @param val the cell height. If not passed (undefined), cells content will be made square (match width minus margin),
      * if pass 0 the CSS will be generated by the application instead.
      * @param update (Optional) if false, styles will not be updated
      *
      * @example
      * grid.cellHeight(100); // same as 100px
      * grid.cellHeight('70px');
      * grid.cellHeight(grid.cellWidth() * 1.2);
      */
    def cellHeight(): GridStack = js.native
    def cellHeight(`val`: Unit, update: Boolean): GridStack = js.native
    def cellHeight(`val`: numberOrString): GridStack = js.native
    def cellHeight(`val`: numberOrString, update: Boolean): GridStack = js.native
    
    /** Gets current cell width. */
    def cellWidth(): Double = js.native
    
    /**
      * set the number of columns in the grid. Will update existing widgets to conform to new number of columns,
      * as well as cache the original layout so you can revert back to previous positions without loss.
      * Requires `gridstack-extra.css` or `gridstack-extra.min.css` for [2-11],
      * else you will need to generate correct CSS (see https://github.com/gridstack/gridstack.js#change-grid-columns)
      * @param column - Integer > 0 (default 12).
      * @param layout specify the type of re-layout that will happen (position, size, etc...).
      * Note: items will never be outside of the current column boundaries. default (moveScale). Ignored for 1 column
      */
    def column(column: Double): GridStack = js.native
    def column(column: Double, layout: ColumnOptions): GridStack = js.native
    
    def commit(): GridStack = js.native
    
    /** re-layout grid items to reclaim any empty space */
    def compact(): GridStack = js.native
    
    /**
      * Destroys a grid instance. DO NOT CALL any methods or access any vars after this as it will free up members.
      * @param removeDOM if `false` grid and items HTML elements will not be removed from the DOM (Optional. Default `true`).
      */
    def destroy(): GridStack = js.native
    def destroy(removeDOM: Boolean): GridStack = js.native
    
    /**
      * Temporarily disables widgets moving/resizing.
      * If you want a more permanent way (which freezes up resources) use `setStatic(true)` instead.
      * Note: no-op for static grid
      * This is a shortcut for:
      * @example
      *  grid.enableMove(false);
      *  grid.enableResize(false);
      */
    def disable(): GridStack = js.native
    
    /** the HTML element tied to this grid after it's been initialized */
    var el: GridHTMLElement = js.native
    
    /**
      * Re-enables widgets moving/resizing - see disable().
      * Note: no-op for static grid.
      * This is a shortcut for:
      * @example
      *  grid.enableMove(true);
      *  grid.enableResize(true);
      */
    def enable(): GridStack = js.native
    
    /**
      * Enables/disables widget moving. No-op for static grids.
      */
    def enableMove(doEnable: Boolean): GridStack = js.native
    
    /**
      * Enables/disables widget resizing. No-op for static grids.
      */
    def enableResize(doEnable: Boolean): GridStack = js.native
    
    /** engine used to implement non DOM grid functionality */
    var engine: typingsJapgolly.gridstack.distEs5GridstackEngineMod.GridStackEngine = js.native
    
    /**
      * enable/disable floating widgets (default: `false`) See [example](http://gridstackjs.com/demo/float.html)
      */
    def float(`val`: Boolean): GridStack = js.native
    
    /**
      * Get the position of the cell under a pixel on screen.
      * @param position the position of the pixel to resolve in
      * absolute coordinates, as an object with top and left properties
      * @param useDocRelative if true, value will be based on document position vs parent position (Optional. Default false).
      * Useful when grid is within `position: relative` element
      *
      * Returns an object with properties `x` and `y` i.e. the column and row in the grid.
      */
    def getCellFromPixel(position: MousePosition): CellPosition = js.native
    def getCellFromPixel(position: MousePosition, useDocRelative: Boolean): CellPosition = js.native
    
    /**
      * Gets current cell height.
      */
    def getCellHeight(): Double = js.native
    def getCellHeight(forcePixel: Boolean): Double = js.native
    
    /**
      * get the number of columns in the grid (default 12)
      */
    def getColumn(): Double = js.native
    
    /**
      * get the current float mode
      */
    def getFloat(): Boolean = js.native
    
    /** returns an array of grid HTML elements (no placeholder) - used to iterate through our children in DOM order */
    def getGridItems(): js.Array[GridItemHTMLElement] = js.native
    
    /** returns current margin number value (undefined if 4 sides don't match) */
    def getMargin(): Double = js.native
    
    /** returns the current number of rows, which will be at least `minRow` if set */
    def getRow(): Double = js.native
    
    /**
      * Checks if specified area is empty.
      * @param x the position x.
      * @param y the position y.
      * @param w the width of to check
      * @param h the height of to check
      */
    def isAreaEmpty(x: Double, y: Double, w: Double, h: Double): Boolean = js.native
    
    /**
      * load the widgets from a list. This will call update() on each (matching by id) or add/remove widgets that are not there.
      *
      * @param layout list of widgets definition to update/create
      * @param addAndRemove boolean (default true) or callback method can be passed to control if and how missing widgets can be added/removed, giving
      * the user control of insertion.
      *
      * @example
      * see http://gridstackjs.com/demo/serialization.html
      **/
    def load(layout: js.Array[GridStackWidget]): GridStack = js.native
    def load(
      layout: js.Array[GridStackWidget],
      addAndRemove: js.Function3[/* g */ this.type, /* w */ GridStackWidget, /* add */ Boolean, GridItemHTMLElement]
    ): GridStack = js.native
    def load(layout: js.Array[GridStackWidget], addAndRemove: Boolean): GridStack = js.native
    
    /**
      * Convert an existing gridItem element into a sub-grid with the given (optional) options, else inherit them
      * from the parent subGrid options.
      * @param el gridItem element to convert
      * @param ops (optional) sub-grid options, else default to node, then parent settings, else defaults
      * @param nodeToAdd (optional) node to add to the newly created sub grid (used when dragging over existing regular item)
      * @returns newly created grid
      */
    def makeSubGrid(el: GridItemHTMLElement): GridStack = js.native
    def makeSubGrid(el: GridItemHTMLElement, ops: Unit, nodeToAdd: Unit, saveContent: Boolean): GridStack = js.native
    def makeSubGrid(el: GridItemHTMLElement, ops: Unit, nodeToAdd: GridStackNode): GridStack = js.native
    def makeSubGrid(el: GridItemHTMLElement, ops: Unit, nodeToAdd: GridStackNode, saveContent: Boolean): GridStack = js.native
    def makeSubGrid(el: GridItemHTMLElement, ops: GridStackOptions): GridStack = js.native
    def makeSubGrid(el: GridItemHTMLElement, ops: GridStackOptions, nodeToAdd: Unit, saveContent: Boolean): GridStack = js.native
    def makeSubGrid(el: GridItemHTMLElement, ops: GridStackOptions, nodeToAdd: GridStackNode): GridStack = js.native
    def makeSubGrid(el: GridItemHTMLElement, ops: GridStackOptions, nodeToAdd: GridStackNode, saveContent: Boolean): GridStack = js.native
    
    /**
      * If you add elements to your grid by hand, you have to tell gridstack afterwards to make them widgets.
      * If you want gridstack to add the elements for you, use `addWidget()` instead.
      * Makes the given element a widget and returns it.
      * @param els widget or single selector to convert.
      *
      * @example
      * let grid = GridStack.init();
      * grid.el.appendChild('<div id="gsi-1" gs-w="3"></div>');
      * grid.makeWidget('#gsi-1');
      */
    def makeWidget(els: GridStackElement): GridItemHTMLElement = js.native
    
    /**
      * Updates the margins which will set all 4 sides at once - see `GridStackOptions.margin` for format options (CSS string format of 1,2,4 values or single number).
      * @param value margin value
      */
    def margin(value: numberOrString): GridStack = js.native
    
    /**
      * Enables/Disables dragging by the user of specific grid element. If you want all items, and have it affect future items, use enableMove() instead. No-op for static grids.
      * IF you are looking to prevent an item from moving (due to being pushed around by another during collision) use locked property instead.
      * @param els widget or selector to modify.
      * @param val if true widget will be draggable.
      */
    def movable(els: GridStackElement, `val`: Boolean): GridStack = js.native
    
    /**
      * unsubscribe from the 'on' event below
      * @param name of the event (see possible values)
      */
    def off(name: GridStackEvent): GridStack = js.native
    
    /**
      * Event handler that extracts our CustomEvent data out automatically for receiving custom
      * notifications (see doc for supported events)
      * @param name of the event (see possible values) or list of names space separated
      * @param callback function called with event and optional second/third param
      * (see README documentation for each signature).
      *
      * @example
      * grid.on('added', function(e, items) { log('added ', items)} );
      * or
      * grid.on('added removed change', function(e, items) { log(e.type, items)} );
      *
      * Note: in some cases it is the same as calling native handler and parsing the event.
      * grid.el.addEventListener('added', function(event) { log('added ', event.detail)} );
      *
      */
    def on(name: GridStackEvent, callback: GridStackEventHandlerCallback): GridStack = js.native
    
    /**
      * called when we are being resized by the window - check if the one Column Mode needs to be turned on/off
      * and remember the prev columns we used, or get our count from parent, as well as check for auto cell height (square)
      */
    def onParentResize(): GridStack = js.native
    
    /** grid options - public for classes to access, but use methods to modify! */
    var opts: GridStackOptions = js.native
    
    /** point to a parent grid item if we're nested (inside a grid-item in between 2 Grids) */
    var parentGridItem: js.UndefOr[GridStackNode] = js.native
    
    /**
      * Removes all widgets from the grid.
      * @param removeDOM if `false` DOM elements won't be removed from the tree (Default? `true`).
      */
    def removeAll(): GridStack = js.native
    def removeAll(removeDOM: Boolean): GridStack = js.native
    
    /**
      * called when an item was converted into a nested grid to accommodate a dragged over item, but then item leaves - return back
      * to the original grid-item. Also called to remove empty sub-grids when last item is dragged out (since re-creating is simple)
      */
    def removeAsSubGrid(): Unit = js.native
    def removeAsSubGrid(nodeThatRemoved: GridStackNode): Unit = js.native
    
    /**
      * Removes widget from the grid.
      * @param el  widget or selector to modify
      * @param removeDOM if `false` DOM element won't be removed from the tree (Default? true).
      * @param triggerEvent if `false` (quiet mode) element will not be added to removed list and no 'removed' callbacks will be called (Default? true).
      */
    def removeWidget(els: GridStackElement): GridStack = js.native
    def removeWidget(els: GridStackElement, removeDOM: Boolean): GridStack = js.native
    def removeWidget(els: GridStackElement, removeDOM: Boolean, triggerEvent: Boolean): GridStack = js.native
    def removeWidget(els: GridStackElement, removeDOM: Unit, triggerEvent: Boolean): GridStack = js.native
    
    /**
      * Enables/Disables user resizing of specific grid element. If you want all items, and have it affect future items, use enableResize() instead. No-op for static grids.
      * @param els  widget or selector to modify
      * @param val  if true widget will be resizable.
      */
    def resizable(els: GridStackElement, `val`: Boolean): GridStack = js.native
    
    /**
      / **
      * saves the current layout returning a list of widgets for serialization which might include any nested grids.
      * @param saveContent if true (default) the latest html inside .grid-stack-content will be saved to GridStackWidget.content field, else it will
      * be removed.
      * @param saveGridOpt if true (default false), save the grid options itself, so you can call the new GridStack.addGrid()
      * to recreate everything from scratch. GridStackOptions.children would then contain the widget list instead.
      * @returns list of widgets or full grid option, including .children list of widgets
      */
    def save(): js.Array[GridStackWidget] | GridStackOptions = js.native
    def save(saveContent: Boolean): js.Array[GridStackWidget] | GridStackOptions = js.native
    def save(saveContent: Boolean, saveGridOpt: Boolean): js.Array[GridStackWidget] | GridStackOptions = js.native
    def save(saveContent: Unit, saveGridOpt: Boolean): js.Array[GridStackWidget] | GridStackOptions = js.native
    
    /**
      * Toggle the grid animation state.  Toggles the `grid-stack-animate` class.
      * @param doAnimate if true the grid will animate.
      */
    def setAnimation(doAnimate: Boolean): GridStack = js.native
    
    /**
      * Toggle the grid static state, which permanently removes/add Drag&Drop support, unlike disable()/enable() that just turns it off/on.
      * Also toggle the grid-stack-static class.
      * @param val if true the grid become static.
      */
    def setStatic(`val`: Boolean): GridStack = js.native
    def setStatic(`val`: Boolean, updateClass: Boolean): GridStack = js.native
    
    /**
      * Updates widget position/size and other info. Note: if you need to call this on all nodes, use load() instead which will update what changed.
      * @param els  widget or selector of objects to modify (note: setting the same x,y for multiple items will be indeterministic and likely unwanted)
      * @param opt new widget options (x,y,w,h, etc..). Only those set will be updated.
      */
    def update(els: GridStackElement, opt: GridStackWidget): GridStack = js.native
    
    /**
      * Returns true if the height of the grid will be less than the vertical
      * constraint. Always returns true if grid doesn't have height constraint.
      * @param node contains x,y,w,h,auto-position options
      *
      * @example
      * if (grid.willItFit(newWidget)) {
      *   grid.addWidget(newWidget);
      * } else {
      *   alert('Not enough free space to place the widget');
      * }
      */
    def willItFit(node: GridStackWidget): Boolean = js.native
  }
  /* static members */
  object GridStack {
    
    @JSImport("gridstack/dist/es5/gridstack", "GridStack")
    @js.native
    val ^ : js.Any = js.native
    
    /** scoping so users can call new GridStack.Engine(12) for example */
    @JSImport("gridstack/dist/es5/gridstack", "GridStack.Engine")
    @js.native
    def Engine: Instantiable1[
        /* opts */ js.UndefOr[GridStackEngineOptions], 
        typingsJapgolly.gridstack.distEs5GridstackEngineMod.GridStackEngine
      ] = js.native
    inline def Engine_=(
      x: Instantiable1[
          /* opts */ js.UndefOr[GridStackEngineOptions], 
          typingsJapgolly.gridstack.distEs5GridstackEngineMod.GridStackEngine
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Engine")(x.asInstanceOf[js.Any])
    
    @JSImport("gridstack/dist/es5/gridstack", "GridStack.GDRev")
    @js.native
    def GDRev: String = js.native
    inline def GDRev_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GDRev")(x.asInstanceOf[js.Any])
    
    /** scoping so users can call GridStack.Utils.sort() for example */
    @JSImport("gridstack/dist/es5/gridstack", "GridStack.Utils")
    @js.native
    def Utils: TypeofUtils = js.native
    inline def Utils_=(x: TypeofUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Utils")(x.asInstanceOf[js.Any])
    
    /**
      * call to create a grid with the given options, including loading any children from JSON structure. This will call GridStack.init(), then
      * grid.load() on any passed children (recursively). Great alternative to calling init() if you want entire grid to come from
      * JSON serialized data, including options.
      * @param parent HTML element parent to the grid
      * @param opt grids options used to initialize the grid, and list of children
      */
    inline def addGrid(parent: HTMLElement): GridStack = ^.asInstanceOf[js.Dynamic].applyDynamic("addGrid")(parent.asInstanceOf[js.Any]).asInstanceOf[GridStack]
    inline def addGrid(parent: HTMLElement, opt: GridStackOptions): GridStack = (^.asInstanceOf[js.Dynamic].applyDynamic("addGrid")(parent.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[GridStack]
    
    @JSImport("gridstack/dist/es5/gridstack", "GridStack.engineClass")
    @js.native
    def engineClass: Instantiable1[
        /* opts */ js.UndefOr[GridStackEngineOptions], 
        typingsJapgolly.gridstack.distEs5GridstackEngineMod.GridStackEngine
      ] = js.native
    inline def engineClass_=(
      x: Instantiable1[
          /* opts */ js.UndefOr[GridStackEngineOptions], 
          typingsJapgolly.gridstack.distEs5GridstackEngineMod.GridStackEngine
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("engineClass")(x.asInstanceOf[js.Any])
    
    /**
      * initializing the HTML element, or selector string, into a grid will return the grid. Calling it again will
      * simply return the existing instance (ignore any passed options). There is also an initAll() version that support
      * multiple grids initialization at once. Or you can use addGrid() to create the entire grid from JSON.
      * @param options grid options (optional)
      * @param elOrString element or CSS selector (first one used) to convert to a grid (default to '.grid-stack' class selector)
      *
      * @example
      * let grid = GridStack.init();
      *
      * Note: the HTMLElement (of type GridHTMLElement) will store a `gridstack: GridStack` value that can be retrieve later
      * let grid = document.querySelector('.grid-stack').gridstack;
      */
    inline def init(): GridStack = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[GridStack]
    inline def init(options: Unit, elOrString: GridStackElement): GridStack = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any], elOrString.asInstanceOf[js.Any])).asInstanceOf[GridStack]
    inline def init(options: GridStackOptions): GridStack = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[GridStack]
    inline def init(options: GridStackOptions, elOrString: GridStackElement): GridStack = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any], elOrString.asInstanceOf[js.Any])).asInstanceOf[GridStack]
    
    /**
      * Will initialize a list of elements (given a selector) and return an array of grids.
      * @param options grid options (optional)
      * @param selector elements selector to convert to grids (default to '.grid-stack' class selector)
      *
      * @example
      * let grids = GridStack.initAll();
      * grids.forEach(...)
      */
    inline def initAll(): js.Array[GridStack] = ^.asInstanceOf[js.Dynamic].applyDynamic("initAll")().asInstanceOf[js.Array[GridStack]]
    inline def initAll(options: Unit, selector: String): js.Array[GridStack] = (^.asInstanceOf[js.Dynamic].applyDynamic("initAll")(options.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStack]]
    inline def initAll(options: GridStackOptions): js.Array[GridStack] = ^.asInstanceOf[js.Dynamic].applyDynamic("initAll")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[GridStack]]
    inline def initAll(options: GridStackOptions, selector: String): js.Array[GridStack] = (^.asInstanceOf[js.Dynamic].applyDynamic("initAll")(options.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStack]]
    
    /** call this method to register your engine instead of the default one.
      * See instead `GridStackOptions.engineClass` if you only need to
      * replace just one instance.
      */
    inline def registerEngine(
      engineClass: Instantiable1[
          /* opts */ js.UndefOr[GridStackEngineOptions], 
          typingsJapgolly.gridstack.distEs5GridstackEngineMod.GridStackEngine
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerEngine")(engineClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * call to setup dragging in from the outside (say toolbar), by specifying the class selection and options.
      * Called during GridStack.init() as options, but can also be called directly (last param are used) in case the toolbar
      * is dynamically create and needs to be set later.
      * @param dragIn string selector (ex: '.sidebar .grid-stack-item')
      * @param dragInOptions options - see DDDragInOpt. (default: {handle: '.grid-stack-item-content', appendTo: 'body'}
      **/
    inline def setupDragIn(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupDragIn")().asInstanceOf[Unit]
    inline def setupDragIn(dragIn: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupDragIn")(dragIn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setupDragIn(dragIn: String, dragInOptions: DDDragInOpt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupDragIn")(dragIn.asInstanceOf[js.Any], dragInOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setupDragIn(dragIn: Unit, dragInOptions: DDDragInOpt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupDragIn")(dragIn.asInstanceOf[js.Any], dragInOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("gridstack/dist/es5/gridstack", "GridStackEngine")
  @js.native
  open class GridStackEngine ()
    extends typingsJapgolly.gridstack.distEs5GridstackEngineMod.GridStackEngine {
    def this(opts: GridStackEngineOptions) = this()
  }
  
  @JSImport("gridstack/dist/es5/gridstack", "Utils")
  @js.native
  open class Utils ()
    extends typingsJapgolly.gridstack.distEs5UtilsMod.Utils
  /* static members */
  object Utils {
    
    @JSImport("gridstack/dist/es5/gridstack", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    /** inserts a CSS rule */
    inline def addCSSRule(sheet: CSSStyleSheet, selector: String, rules: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCSSRule")(sheet.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addElStyles(el: HTMLElement, styles: StringDictionary[String | js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addElStyles")(el.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def appendTo(el: HTMLElement, parent: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTo")(el.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def appendTo(el: HTMLElement, parent: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTo")(el.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def appendTo(el: HTMLElement, parent: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTo")(el.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** returns the area */
    inline def area(a: GridStackPosition): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** returns the area a and b overlap */
    inline def areaIntercept(a: GridStackPosition, b: GridStackPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("areaIntercept")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** single level clone, returning a new object with same top fields. This will share sub objects and arrays */
    inline def clone[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Recursive clone version that returns a full copy, checking for nested objects and arrays ONLY.
      * Note: this will use as-is any key starting with double __ (and not copy inside) some lib have circular dependencies.
      */
    inline def cloneDeep[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDeep")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /** deep clone the given HTML node, removing teh unique id field */
    inline def cloneNode(el: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /** return the closest parent (or itself) matching the given class */
    inline def closestUpByClass(el: HTMLElement, name: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("closestUpByClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /** copies over b size & position (GridStackPosition), and possibly min/max as well */
    inline def copyPos(a: GridStackWidget, b: GridStackWidget): GridStackWidget = (^.asInstanceOf[js.Dynamic].applyDynamic("copyPos")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[GridStackWidget]
    inline def copyPos(a: GridStackWidget, b: GridStackWidget, doMinMax: Boolean): GridStackWidget = (^.asInstanceOf[js.Dynamic].applyDynamic("copyPos")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], doMinMax.asInstanceOf[js.Any])).asInstanceOf[GridStackWidget]
    
    /**
      * creates a style sheet with style id under given parent
      * @param id will set the 'gs-style-id' attribute to that id
      * @param parent to insert the stylesheet as first child,
      * if none supplied it will be appended to the document head instead.
      */
    inline def createStylesheet(id: String): CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("createStylesheet")(id.asInstanceOf[js.Any]).asInstanceOf[CSSStyleSheet]
    inline def createStylesheet(id: String, parent: HTMLElement): CSSStyleSheet = (^.asInstanceOf[js.Dynamic].applyDynamic("createStylesheet")(id.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[CSSStyleSheet]
    
    /** copies unset fields in target to use the given default sources values */
    inline def defaults(target: Any, sources: Any*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
    
    /** convert a potential selector into actual single element */
    inline def getElement(els: GridStackElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(els.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /** convert a potential selector into actual list of html elements */
    inline def getElements(els: GridStackElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
    
    inline def initEvent[T](e: DragEvent, info: Target): T = (^.asInstanceOf[js.Dynamic].applyDynamic("initEvent")(e.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def initEvent[T](e: MouseEvent, info: Target): T = (^.asInstanceOf[js.Dynamic].applyDynamic("initEvent")(e.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /** returns true if a and b overlap */
    inline def isIntercepted(a: GridStackPosition, b: GridStackPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntercepted")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** returns true if a and b touch edges or corners */
    inline def isTouching(a: GridStackPosition, b: GridStackPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTouching")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def parseHeight(`val`: numberOrString): HeightData = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeight")(`val`.asInstanceOf[js.Any]).asInstanceOf[HeightData]
    
    /** removes field from the first object if same as the second objects (like diffing) and internal '_' for saving */
    inline def removeInternalAndSame(a: Any, b: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeInternalAndSame")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** removes internal fields '_' and default values for saving */
    inline def removeInternalForSave(n: GridStackNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInternalForSave")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeInternalForSave(n: GridStackNode, removeEl: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeInternalForSave")(n.asInstanceOf[js.Any], removeEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removePositioningStyles(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePositioningStyles")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** removed the given stylesheet id */
    inline def removeStylesheet(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStylesheet")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** given 2 objects return true if they have the same values. Checks for Object {} having same fields and values (just 1 level down) */
    inline def same(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("same")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** true if a and b has same size & position */
    inline def samePos(a: GridStackPosition, b: GridStackPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("samePos")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** copies the MouseEvent properties and sends it as another event to the given target */
    inline def simulateMouseEvent(e: MouseEvent, simulatedType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("simulateMouseEvent")(e.asInstanceOf[js.Any], simulatedType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def simulateMouseEvent(e: MouseEvent, simulatedType: String, target: EventTarget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("simulateMouseEvent")(e.asInstanceOf[js.Any], simulatedType.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sorts array of nodes
      * @param nodes array to sort
      * @param dir 1 for asc, -1 for desc (optional)
      * @param width width of the grid. If undefined the width will be calculated automatically (optional).
      **/
    inline def sort(nodes: js.Array[GridStackNode]): js.Array[GridStackNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[GridStackNode]]
    inline def sort(nodes: js.Array[GridStackNode], dir: `-1` | `1`): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    inline def sort(nodes: js.Array[GridStackNode], dir: `-1` | `1`, column: Double): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    inline def sort(nodes: js.Array[GridStackNode], dir: Unit, column: Double): js.Array[GridStackNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(nodes.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[js.Array[GridStackNode]]
    
    /** delay calling the given function for given delay, preventing new calls from happening while waiting */
    inline def throttle(func: js.Function0[Unit], delay: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def toBool(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBool")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")().asInstanceOf[Double]
    inline def toNumber(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("gridstack/dist/es5/gridstack", "dragInDefaultOptions")
  @js.native
  val dragInDefaultOptions: DDDragInOpt = js.native
  
  @JSImport("gridstack/dist/es5/gridstack", "gridDefaults")
  @js.native
  val gridDefaults: GridStackOptions = js.native
  
  inline def obsolete(self: Any, f: Any, oldName: String, newName: String, rev: String): js.Function1[/* repeated */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("obsolete")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  inline def obsoleteAttr(el: HTMLElement, oldName: String, newName: String, rev: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteAttr")(el.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def obsoleteOpts(opts: GridStackOptions, oldName: String, newName: String, rev: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteOpts")(opts.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def obsoleteOptsDel(opts: GridStackOptions, oldName: String, rev: String, info: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("obsoleteOptsDel")(opts.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], rev.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CellPosition extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object CellPosition {
    
    inline def apply(x: Double, y: Double): CellPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellPosition]
    }
    
    extension [Self <: CellPosition](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GridHTMLElement
    extends StObject
       with typingsJapgolly.std.HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var gridstack: js.UndefOr[GridStack] = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gridstack.gridstackStrings.added
    - typingsJapgolly.gridstack.gridstackStrings.change
    - typingsJapgolly.gridstack.gridstackStrings.disable
    - typingsJapgolly.gridstack.gridstackStrings.drag
    - typingsJapgolly.gridstack.gridstackStrings.dragstart
    - typingsJapgolly.gridstack.gridstackStrings.dragstop
    - typingsJapgolly.gridstack.gridstackStrings.dropped
    - typingsJapgolly.gridstack.gridstackStrings.enable
    - typingsJapgolly.gridstack.gridstackStrings.removed
    - typingsJapgolly.gridstack.gridstackStrings.resize
    - typingsJapgolly.gridstack.gridstackStrings.resizestart
    - typingsJapgolly.gridstack.gridstackStrings.resizestop
    - java.lang.String
  */
  type GridStackEvent = _GridStackEvent | String
  
  trait MousePosition extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object MousePosition {
    
    inline def apply(left: Double, top: Double): MousePosition = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[MousePosition]
    }
    
    extension [Self <: MousePosition](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait _GridStackEvent extends StObject
}
