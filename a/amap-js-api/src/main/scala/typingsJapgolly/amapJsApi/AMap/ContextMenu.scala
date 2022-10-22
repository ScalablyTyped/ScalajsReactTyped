package typingsJapgolly.amapJsApi.AMap

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.amapJsApi.amapJsApiStrings.close
import typingsJapgolly.amapJsApi.amapJsApiStrings.items
import typingsJapgolly.amapJsApi.amapJsApiStrings.open
import typingsJapgolly.amapJsApi.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenu[ExtraData]
  extends StObject
     with Overlay[ExtraData] {
  
  /**
    * 右键菜单中添加菜单项
    * @param text 菜单显示内容
    * @param fn 该菜单下需进行的操作
    * @param num 当前菜单项在右键菜单中的排序位置，以0开始
    */
  def addItem(text: String, fn: js.ThisFunction0[/* this */ HTMLLIElement, Unit]): Unit = js.native
  def addItem(text: String, fn: js.ThisFunction0[/* this */ HTMLLIElement, Unit], num: Double): Unit = js.native
  
  /**
    * 关闭右键菜单
    */
  def close(): Unit = js.native
  
  /**
    * 在地图的指定位置打开右键菜单。
    * @param map 目标地图
    * @param position 打开位置经纬度
    */
  def open(map: Map, position: LocationValue): Unit = js.native
  
  /**
    * 删除一个菜单项
    * @param text 菜单显示内容
    * @param fn 该菜单下需进行的操作
    */
  def removeItem(text: String, fn: js.ThisFunction0[/* this */ HTMLLIElement, Unit]): Unit = js.native
}
object ContextMenu {
  
  trait EventMap[I] extends StObject {
    
    var close: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.close, Target[I]]
    
    var items: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.items, Unit]
    
    var open: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.open, Target[I]]
  }
  object EventMap {
    
    inline def apply[I](close: Event_[close, Target[I]], items: Event_[items, Unit], open: Event_[open, Target[I]]): EventMap[I] = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    extension [Self <: EventMap[?], I](x: Self & EventMap[I]) {
      
      inline def setClose(value: Event_[close, Target[I]]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setItems(value: Event_[items, Unit]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Event_[open, Target[I]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * 右键菜单内容
      */
    var content: js.UndefOr[String | HTMLElement] = js.undefined
    
    // internal
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
