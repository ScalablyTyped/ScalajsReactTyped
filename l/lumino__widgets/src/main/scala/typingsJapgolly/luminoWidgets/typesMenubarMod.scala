package typingsJapgolly.luminoWidgets

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.luminoVirtualdom.mod.ElementARIAAttrs
import typingsJapgolly.luminoVirtualdom.mod.ElementDataset
import typingsJapgolly.luminoVirtualdom.mod.VirtualElement
import typingsJapgolly.luminoVirtualdom.mod.h.Child
import typingsJapgolly.luminoWidgets.typesMenuMod.Menu
import typingsJapgolly.luminoWidgets.typesMenuMod.Menu.IOpenOptions
import typingsJapgolly.luminoWidgets.typesMenubarMod.MenuBar.IOptions
import typingsJapgolly.luminoWidgets.typesMenubarMod.MenuBar.IRenderer
import typingsJapgolly.luminoWidgets.typesTitleMod.Title
import typingsJapgolly.luminoWidgets.typesWidgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenubarMod {
  
  @JSImport("@lumino/widgets/types/menubar", "MenuBar")
  @js.native
  /**
    * Construct a new menu bar.
    *
    * @param options - The options for initializing the menu bar.
    */
  open class MenuBar () extends Widget {
    def this(options: IOptions) = this()
    
    /* private */ var _activeIndex: Any = js.native
    
    /* private */ var _childMenu: Any = js.native
    
    /**
      * Close the child menu immediately.
      *
      * This is a no-op if a child menu is not open.
      */
    /* private */ var _closeChildMenu: Any = js.native
    
    /**
      * Handle the `'keydown'` event for the menu bar.
      */
    /* private */ var _evtKeyDown: Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the menu bar.
      */
    /* private */ var _evtMouseDown: Any = js.native
    
    /**
      * Handle the `'mouseleave'` event for the menu bar.
      */
    /* private */ var _evtMouseLeave: Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the menu bar.
      */
    /* private */ var _evtMouseMove: Any = js.native
    
    /* private */ var _forceItemsPosition: Any = js.native
    
    /* private */ var _menus: Any = js.native
    
    /**
      * Handle the `aboutToClose` signal of a menu.
      */
    /* private */ var _onMenuAboutToClose: Any = js.native
    
    /**
      * Handle the `menuRequested` signal of a child menu.
      */
    /* private */ var _onMenuMenuRequested: Any = js.native
    
    /**
      * Handle the `changed` signal of a title object.
      */
    /* private */ var _onTitleChanged: Any = js.native
    
    /**
      * Open the child menu at the active index immediately.
      *
      * If a different child menu is already open, it will be closed,
      * even if there is no active menu.
      */
    /* private */ var _openChildMenu: Any = js.native
    
    /**
      * Get the index of the currently active menu.
      *
      * #### Notes
      * This will be `-1` if no menu is active.
      */
    /**
      * Set the index of the currently active menu.
      *
      * #### Notes
      * If the menu cannot be activated, the index will be set to `-1`.
      */
    var activeIndex: Double = js.native
    
    /**
      * Get the currently active menu.
      */
    /**
      * Set the currently active menu.
      *
      * #### Notes
      * If the menu does not exist, the menu will be set to `null`.
      */
    var activeMenu: Menu | Null = js.native
    
    /**
      * Add a menu to the end of the menu bar.
      *
      * @param menu - The menu to add to the menu bar.
      *
      * #### Notes
      * If the menu is already added to the menu bar, it will be moved.
      */
    def addMenu(menu: Menu): Unit = js.native
    
    /**
      * The child menu of the menu bar.
      *
      * #### Notes
      * This will be `null` if the menu bar does not have an open menu.
      */
    val childMenu: Menu | Null = js.native
    
    /**
      * Remove all menus from the menu bar.
      */
    def clearMenus(): Unit = js.native
    
    /**
      * Get the menu bar content node.
      *
      * #### Notes
      * This is the node which holds the menu title nodes.
      *
      * Modifying this node directly can lead to undefined behavior.
      */
    val contentNode: HTMLUListElement = js.native
    
    /**
      * Handle the DOM events for the menu bar.
      *
      * @param event - The DOM event sent to the menu bar.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the menu bar's DOM nodes. It
      * should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Insert a menu into the menu bar at the specified index.
      *
      * @param index - The index at which to insert the menu.
      *
      * @param menu - The menu to insert into the menu bar.
      *
      * #### Notes
      * The index will be clamped to the bounds of the menus.
      *
      * If the menu is already added to the menu bar, it will be moved.
      */
    def insertMenu(index: Double, menu: Menu): Unit = js.native
    
    /**
      * A read-only array of the menus in the menu bar.
      */
    val menus: js.Array[Menu] = js.native
    
    /**
      * Open the active menu and activate its first menu item.
      *
      * #### Notes
      * If there is no active menu, this is a no-op.
      */
    def openActiveMenu(): Unit = js.native
    
    /**
      * Remove a menu from the menu bar.
      *
      * @param menu - The menu to remove from the menu bar.
      *
      * #### Notes
      * This is a no-op if the menu is not in the menu bar.
      */
    def removeMenu(menu: Menu): Unit = js.native
    
    /**
      * Remove the menu at a given index from the menu bar.
      *
      * @param index - The index of the menu to remove.
      *
      * #### Notes
      * This is a no-op if the index is out of range.
      */
    def removeMenuAt(index: Double): Unit = js.native
    
    /**
      * The renderer used by the menu bar.
      */
    val renderer: IRenderer = js.native
  }
  object MenuBar {
    
    /**
      * The default implementation of `IRenderer`.
      *
      * #### Notes
      * Subclasses are free to reimplement rendering methods as needed.
      */
    @JSImport("@lumino/widgets/types/menubar", "MenuBar.Renderer")
    @js.native
    open class Renderer ()
      extends StObject
         with IRenderer {
      
      /**
        * Create the class name for the menu bar item icon.
        *
        * @param data - The data to use for the class name.
        *
        * @returns The full class name for the item icon.
        */
      def createIconClass(data: IRenderData): String = js.native
      
      /**
        * Create the aria attributes for menu bar item.
        *
        * @param data - The data to use for the aria attributes.
        *
        * @returns The aria attributes object for the item.
        */
      def createItemARIA(data: IRenderData): ElementARIAAttrs = js.native
      
      /**
        * Create the class name for the menu bar item.
        *
        * @param data - The data to use for the class name.
        *
        * @returns The full class name for the menu item.
        */
      def createItemClass(data: IRenderData): String = js.native
      
      /**
        * Create the dataset for a menu bar item.
        *
        * @param data - The data to use for the item.
        *
        * @returns The dataset for the menu bar item.
        */
      def createItemDataset(data: IRenderData): ElementDataset = js.native
      
      /**
        * Create the render content for the label node.
        *
        * @param data - The data to use for the label content.
        *
        * @returns The content to add to the label node.
        */
      def formatLabel(data: IRenderData): Child = js.native
      
      /**
        * Render the icon element for a menu bar item.
        *
        * @param data - The data to use for rendering the icon.
        *
        * @returns A virtual element representing the item icon.
        */
      def renderIcon(data: IRenderData): VirtualElement = js.native
      
      /**
        * Render the virtual element for a menu bar item.
        *
        * @param data - The data to use for rendering the item.
        *
        * @returns A virtual element representing the item.
        */
      /* CompleteClass */
      override def renderItem(data: IRenderData): VirtualElement = js.native
      
      /**
        * Render the label element for a menu item.
        *
        * @param data - The data to use for rendering the label.
        *
        * @returns A virtual element representing the item label.
        */
      def renderLabel(data: IRenderData): VirtualElement = js.native
    }
    
    /**
      * The default `Renderer` instance.
      */
    @JSImport("@lumino/widgets/types/menubar", "MenuBar.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * An options object for creating a menu bar.
      */
    trait IOptions extends StObject {
      
      /**
        * Whether to force the position of the menu. The MenuBar forces the
        * coordinates of its menus by default. With this option you can disable it.
        *
        * Setting to `false` will enable the logic which repositions the
        * coordinates of the menu if it will not fit entirely on screen.
        *
        * The default is `true`.
        */
      var forceItemsPosition: js.UndefOr[IOpenOptions] = js.undefined
      
      /**
        * A custom renderer for creating menu bar content.
        *
        * The default is a shared renderer instance.
        */
      var renderer: js.UndefOr[IRenderer] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setForceItemsPosition(value: IOpenOptions): Self = StObject.set(x, "forceItemsPosition", value.asInstanceOf[js.Any])
        
        inline def setForceItemsPositionUndefined: Self = StObject.set(x, "forceItemsPosition", js.undefined)
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      }
    }
    
    /**
      * An object which holds the data to render a menu bar item.
      */
    trait IRenderData extends StObject {
      
      /**
        * Whether the item is the active item.
        */
      val active: Boolean
      
      val onfocus: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.undefined
      
      /**
        * The title to be rendered.
        */
      val title: Title[Widget]
    }
    object IRenderData {
      
      inline def apply(active: Boolean, title: Title[Widget]): IRenderData = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderData]
      }
      
      extension [Self <: IRenderData](x: Self) {
        
        inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setOnfocus(value: /* event */ FocusEvent => Callback): Self = StObject.set(x, "onfocus", js.Any.fromFunction1((t0: /* event */ FocusEvent) => value(t0).runNow()))
        
        inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
        
        inline def setTitle(value: Title[Widget]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A renderer for use with a menu bar.
      */
    trait IRenderer extends StObject {
      
      /**
        * Render the virtual element for a menu bar item.
        *
        * @param data - The data to use for rendering the item.
        *
        * @returns A virtual element representing the item.
        */
      def renderItem(data: IRenderData): VirtualElement
    }
    object IRenderer {
      
      inline def apply(renderItem: IRenderData => VirtualElement): IRenderer = {
        val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction1(renderItem))
        __obj.asInstanceOf[IRenderer]
      }
      
      extension [Self <: IRenderer](x: Self) {
        
        inline def setRenderItem(value: IRenderData => VirtualElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      }
    }
  }
}
