package typingsJapgolly.jpm

import japgolly.scalajs.react.Callback
import org.scalajs.dom.URL
import typingsJapgolly.jpm.anon.AccessKey
import typingsJapgolly.jpm.anon.ContentScript
import typingsJapgolly.jpm.anon.DocumentType
import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkContextMenuMod {
  
  @JSImport("sdk/context-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Item
    extends StObject
       with ItemMenuSeparator {
    
    var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var context: ItemContext
    
    var data: Any
    
    def destroy(): Unit
    
    var image: String | URL
    
    var label: String
    
    var parentMenu: js.UndefOr[Menu] = js.undefined
  }
  object Item {
    
    @JSImport("sdk/context-menu", "Item")
    @js.native
    def apply(options: AccessKey): Item = js.native
    
    extension [Self <: Item](x: Self) {
      
      inline def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
      
      inline def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
      
      inline def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
      
      inline def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value*))
      
      inline def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
      
      inline def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value*))
      
      inline def setContext(value: ItemContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setImage(value: String | URL): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setParentMenu(value: Menu): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
      
      inline def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
    }
  }
  
  trait Menu
    extends StObject
       with ItemMenuSeparator {
    
    def addItem(item: ItemMenuSeparator): Unit
    
    var contentScript: String | js.Array[String]
    
    var contentScriptFile: String | js.Array[String]
    
    var context: ItemContext
    
    def destroy(): Unit
    
    var image: String | URL
    
    var items: js.Array[ItemMenuSeparator]
    
    var label: String
    
    var parentMenu: js.UndefOr[Menu] = js.undefined
    
    def removeItem(item: ItemMenuSeparator): Unit
  }
  object Menu {
    
    @JSImport("sdk/context-menu", "Menu")
    @js.native
    def apply(options: ContentScript): Menu = js.native
    
    extension [Self <: Menu](x: Self) {
      
      inline def setAddItem(value: ItemMenuSeparator => Callback): Self = StObject.set(x, "addItem", js.Any.fromFunction1((t0: ItemMenuSeparator) => value(t0).runNow()))
      
      inline def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
      
      inline def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
      
      inline def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value*))
      
      inline def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value*))
      
      inline def setContext(value: ItemContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setImage(value: String | URL): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[ItemMenuSeparator]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ItemMenuSeparator*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setParentMenu(value: Menu): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
      
      inline def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
      
      inline def setRemoveItem(value: ItemMenuSeparator => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: ItemMenuSeparator) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait PageContext
    extends StObject
       with Context {
    
    def apply(): js.Object = js.native
  }
  @JSImport("sdk/context-menu", "PageContext")
  @js.native
  def PageContext: PageContext = js.native
  inline def PageContext_=(x: PageContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageContext")(x.asInstanceOf[js.Any])
  
  @js.native
  trait PredicateContext
    extends StObject
       with Context {
    
    def apply(predicateFunction: js.Function1[/* context */ DocumentType, Boolean]): js.Object = js.native
  }
  @JSImport("sdk/context-menu", "PredicateContext")
  @js.native
  def PredicateContext: PredicateContext = js.native
  inline def PredicateContext_=(x: PredicateContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PredicateContext")(x.asInstanceOf[js.Any])
  
  @js.native
  trait SelectionContext
    extends StObject
       with Context {
    
    def apply(): js.Object = js.native
  }
  @JSImport("sdk/context-menu", "SelectionContext")
  @js.native
  def SelectionContext: SelectionContext = js.native
  inline def SelectionContext_=(x: SelectionContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectionContext")(x.asInstanceOf[js.Any])
  
  @js.native
  trait SelectorContext
    extends StObject
       with Context {
    
    def apply(selector: String): js.Object = js.native
  }
  @JSImport("sdk/context-menu", "SelectorContext")
  @js.native
  def SelectorContext: SelectorContext = js.native
  inline def SelectorContext_=(x: SelectorContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectorContext")(x.asInstanceOf[js.Any])
  
  trait Separator
    extends StObject
       with ItemMenuSeparator {
    
    def destroy(): Unit
    
    var parentMenu: Menu
  }
  object Separator {
    
    @JSImport("sdk/context-menu", "Separator")
    @js.native
    def apply(): Separator = js.native
    
    extension [Self <: Separator](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setParentMenu(value: Menu): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait URLContext
    extends StObject
       with Context {
    
    def apply(matchPattern: String): js.Object = js.native
  }
  @JSImport("sdk/context-menu", "URLContext")
  @js.native
  def URLContext: URLContext = js.native
  inline def URLContext_=(x: URLContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URLContext")(x.asInstanceOf[js.Any])
  
  /**
    * The context determines when the menu item will be visible
    */
  trait Context extends StObject
  
  @js.native
  trait ItemContext
    extends StObject
       with Array[Context] {
    
    // a list of Context that also has add, remove methods
    def add(context: Context): Unit = js.native
    
    def remove(context: Context): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jpm.sdkContextMenuMod.Item
    - typingsJapgolly.jpm.sdkContextMenuMod.Menu
    - typingsJapgolly.jpm.sdkContextMenuMod.Separator
  */
  trait ItemMenuSeparator extends StObject
  object ItemMenuSeparator {
    
    inline def Item(context: ItemContext, data: Any, destroy: Callback, image: String | URL, label: String): typingsJapgolly.jpm.sdkContextMenuMod.Item = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = destroy.toJsFn, image = image.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.jpm.sdkContextMenuMod.Item]
    }
    
    inline def Menu(
      addItem: ItemMenuSeparator => Callback,
      contentScript: String | js.Array[String],
      contentScriptFile: String | js.Array[String],
      context: ItemContext,
      destroy: Callback,
      image: String | URL,
      items: js.Array[ItemMenuSeparator],
      label: String,
      removeItem: ItemMenuSeparator => Callback
    ): typingsJapgolly.jpm.sdkContextMenuMod.Menu = {
      val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1((t0: ItemMenuSeparator) => addItem(t0).runNow()), contentScript = contentScript.asInstanceOf[js.Any], contentScriptFile = contentScriptFile.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = destroy.toJsFn, image = image.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1((t0: ItemMenuSeparator) => removeItem(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.jpm.sdkContextMenuMod.Menu]
    }
    
    inline def Separator(destroy: Callback, parentMenu: Menu): typingsJapgolly.jpm.sdkContextMenuMod.Separator = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, parentMenu = parentMenu.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.jpm.sdkContextMenuMod.Separator]
    }
  }
}
