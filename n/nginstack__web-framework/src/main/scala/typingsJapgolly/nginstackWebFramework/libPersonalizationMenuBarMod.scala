package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersonalizationMenuBarMod {
  
  inline def apply(iTheme: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(iTheme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuBar", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MenuBar {
    def this(iTheme: Any) = this()
    
    /* private */ /* CompleteClass */
    var _loadFromDataset: Any = js.native
    
    /* CompleteClass */
    var iTheme: Any = js.native
    
    /* CompleteClass */
    var items: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def sortItems(): Unit = js.native
    
    /* CompleteClass */
    override def toHtml(): String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/personalization/MenuBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(themeKey: Any, basedTheme: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(themeKey.asInstanceOf[js.Any], basedTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait MenuBar extends StObject {
    
    /* private */ var _loadFromDataset: Any
    
    var iTheme: Any
    
    var items: js.Array[Any]
    
    def sortItems(): Unit
    
    def toHtml(): String
  }
  object MenuBar {
    
    inline def apply(
      _loadFromDataset: Any,
      iTheme: Any,
      items: js.Array[Any],
      sortItems: Callback,
      toHtml: CallbackTo[String]
    ): MenuBar = {
      val __obj = js.Dynamic.literal(_loadFromDataset = _loadFromDataset.asInstanceOf[js.Any], iTheme = iTheme.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], sortItems = sortItems.toJsFn, toHtml = toHtml.toJsFn)
      __obj.asInstanceOf[MenuBar]
    }
    
    extension [Self <: MenuBar](x: Self) {
      
      inline def setITheme(value: Any): Self = StObject.set(x, "iTheme", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSortItems(value: Callback): Self = StObject.set(x, "sortItems", value.toJsFn)
      
      inline def setToHtml(value: CallbackTo[String]): Self = StObject.set(x, "toHtml", value.toJsFn)
      
      inline def set_loadFromDataset(value: Any): Self = StObject.set(x, "_loadFromDataset", value.asInstanceOf[js.Any])
    }
  }
}
