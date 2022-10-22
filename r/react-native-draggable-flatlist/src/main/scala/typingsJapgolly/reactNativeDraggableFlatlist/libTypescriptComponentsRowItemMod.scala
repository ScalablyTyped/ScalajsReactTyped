package typingsJapgolly.reactNativeDraggableFlatlist

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptTypesMod.RenderItem
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptTypesMod.RenderItemParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsRowItemMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/components/RowItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof RowItem` */
  inline def default[T](props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props[T] extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    def drag(itemKey: String): Unit
    
    var extraData: js.UndefOr[Any] = js.undefined
    
    var item: T
    
    var itemKey: String
    
    var renderItem: RenderItem[T]
  }
  object Props {
    
    inline def apply[T](
      drag: String => Callback,
      item: T,
      itemKey: String,
      renderItem: /* params */ RenderItemParams[T] => Node
    ): Props[T] = {
      val __obj = js.Dynamic.literal(drag = js.Any.fromFunction1((t0: String) => drag(t0).runNow()), item = item.asInstanceOf[js.Any], itemKey = itemKey.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem))
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T](x: Self & Props[T]) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDrag(value: String => Callback): Self = StObject.set(x, "drag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemKey(value: String): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      inline def setRenderItem(value: /* params */ RenderItemParams[T] => Node): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    }
  }
}
