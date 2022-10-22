package typingsJapgolly.antvComponent

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antvComponent.libTypesMod.ListItem
import typingsJapgolly.antvComponent.libTypesMod.LocationCfg
import typingsJapgolly.antvComponent.libTypesMod.LocationType
import typingsJapgolly.antvComponent.libTypesMod.OffsetPoint
import typingsJapgolly.antvComponent.libTypesMod.Range
import typingsJapgolly.antvGBase.libInterfacesMod.IBase
import typingsJapgolly.antvGBase.libTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfacesMod {
  
  @js.native
  trait IComponent
    extends StObject
       with IBase {
    
    /**
      * 清空组件
      */
    def clear(): Any = js.native
    
    /**
      * 组件在画布上的包围盒
      * @return {BBox} 包围盒
      */
    def getBBox(): BBox = js.native
    
    /**
      * 组件布局要求的包围盒，不一定等于 getBBox
      * @return {BBox} 包围盒
      */
    def getLayoutBBox(): BBox = js.native
    
    /**
      * 隐藏
      */
    def hide(): Any = js.native
    
    /**
      * 初始化组件
      */
    def init(): Unit = js.native
    
    /**
      * 是否是列表
      */
    def isList(): Boolean = js.native
    
    /**
      * 是否是 slider
      */
    def isSlider(): Boolean = js.native
    
    /**
      * 渲染组件
      */
    def render(): Any = js.native
    
    /**
      * 是否可以响应事件
      * @param capture 是否可以响应事件
      */
    def setCapture(capture: Boolean): Unit = js.native
    
    /**
      * 显示
      */
    def show(): Any = js.native
    
    /**
      * 更新组件
      * @param {object} cfg 更新的配置项
      */
    def update(cfg: js.Object): Any = js.native
  }
  
  trait IList extends StObject {
    
    /**
      * 清空列表
      */
    def clearItems(): Any
    
    /**
      * 清楚所有列表项的状态
      * @param {string} state 状态值
      */
    def clearItemsState(state: String): Any
    
    /**
      * 获取列表项
      * @return {ListItem[]} 列表项集合
      */
    def getItems(): js.Array[ListItem]
    
    /**
      * 根据状态获取
      * @param  {state}     state 状态名
      * @return {ListItem[]} 列表项
      */
    def getItemsByState(state: Any): js.Array[ListItem]
    
    /**
      * 是否存在指定的状态
      * @param {ListItem} item  列表项
      * @param {string} state 状态名
      */
    def hasState(item: ListItem, state: String): Boolean
    
    /**
      * 设置列表项的状态
      * @param {ListItem} item  列表项
      * @param {string}   state 状态名
      * @param {boolean}  value 状态值, true, false
      */
    def setItemState(item: ListItem, state: String, value: Boolean): Any
    
    /**
      * 设置列表项
      * @param {ListItem[]} items 列表项集合
      */
    def setItems(items: js.Array[ListItem]): Any
    
    /**
      * 更新列表项
      * @param {ListItem} item 列表项
      * @param {object}   cfg  列表项
      */
    def updateItem(item: ListItem, cfg: js.Object): Any
  }
  object IList {
    
    inline def apply(
      clearItems: CallbackTo[Any],
      clearItemsState: String => Any,
      getItems: CallbackTo[js.Array[ListItem]],
      getItemsByState: Any => js.Array[ListItem],
      hasState: (ListItem, String) => Boolean,
      setItemState: (ListItem, String, Boolean) => Any,
      setItems: js.Array[ListItem] => Any,
      updateItem: (ListItem, js.Object) => Any
    ): IList = {
      val __obj = js.Dynamic.literal(clearItems = clearItems.toJsFn, clearItemsState = js.Any.fromFunction1(clearItemsState), getItems = getItems.toJsFn, getItemsByState = js.Any.fromFunction1(getItemsByState), hasState = js.Any.fromFunction2(hasState), setItemState = js.Any.fromFunction3(setItemState), setItems = js.Any.fromFunction1(setItems), updateItem = js.Any.fromFunction2(updateItem))
      __obj.asInstanceOf[IList]
    }
    
    extension [Self <: IList](x: Self) {
      
      inline def setClearItems(value: CallbackTo[Any]): Self = StObject.set(x, "clearItems", value.toJsFn)
      
      inline def setClearItemsState(value: String => Any): Self = StObject.set(x, "clearItemsState", js.Any.fromFunction1(value))
      
      inline def setGetItems(value: CallbackTo[js.Array[ListItem]]): Self = StObject.set(x, "getItems", value.toJsFn)
      
      inline def setGetItemsByState(value: Any => js.Array[ListItem]): Self = StObject.set(x, "getItemsByState", js.Any.fromFunction1(value))
      
      inline def setHasState(value: (ListItem, String) => Boolean): Self = StObject.set(x, "hasState", js.Any.fromFunction2(value))
      
      inline def setSetItemState(value: (ListItem, String, Boolean) => Any): Self = StObject.set(x, "setItemState", js.Any.fromFunction3(value))
      
      inline def setSetItems(value: js.Array[ListItem] => Any): Self = StObject.set(x, "setItems", js.Any.fromFunction1(value))
      
      inline def setUpdateItem(value: (ListItem, js.Object) => Any): Self = StObject.set(x, "updateItem", js.Any.fromFunction2(value))
    }
  }
  
  trait ILocation[T /* <: LocationCfg */] extends StObject {
    
    /**
      * 获取定位信息
      * @return {T} 定位信息
      */
    def getLocation(): T
    
    /**
      * 获取定位方式，point，points，region，circle，'none' 五种值
      * @return {LocationType} 定位方式
      */
    def getLocationType(): LocationType
    
    /**
      * 获取偏移信息
      * @return {OffsetPoint} 偏移信息
      */
    def getOffset(): OffsetPoint
    
    /**
      * 设置定位信息
      * @param {T} cfg 定位信息
      */
    def setLocation(cfg: T): Any
    
    /**
      * 设置偏移量
      * @param {number} offsetX 偏移 x
      * @param {number} offsetY 偏移 y
      */
    def setOffset(offsetX: Double, offsetY: Double): Any
  }
  object ILocation {
    
    inline def apply[T /* <: LocationCfg */](
      getLocation: CallbackTo[T],
      getLocationType: CallbackTo[LocationType],
      getOffset: CallbackTo[OffsetPoint],
      setLocation: T => Any,
      setOffset: (Double, Double) => Any
    ): ILocation[T] = {
      val __obj = js.Dynamic.literal(getLocation = getLocation.toJsFn, getLocationType = getLocationType.toJsFn, getOffset = getOffset.toJsFn, setLocation = js.Any.fromFunction1(setLocation), setOffset = js.Any.fromFunction2(setOffset))
      __obj.asInstanceOf[ILocation[T]]
    }
    
    extension [Self <: ILocation[?], T /* <: LocationCfg */](x: Self & ILocation[T]) {
      
      inline def setGetLocation(value: CallbackTo[T]): Self = StObject.set(x, "getLocation", value.toJsFn)
      
      inline def setGetLocationType(value: CallbackTo[LocationType]): Self = StObject.set(x, "getLocationType", value.toJsFn)
      
      inline def setGetOffset(value: CallbackTo[OffsetPoint]): Self = StObject.set(x, "getOffset", value.toJsFn)
      
      inline def setSetLocation(value: T => Any): Self = StObject.set(x, "setLocation", js.Any.fromFunction1(value))
      
      inline def setSetOffset(value: (Double, Double) => Any): Self = StObject.set(x, "setOffset", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ISlider extends StObject {
    
    /**
      * 获取滑动的范围
      * @return {Range} 滑动范围
      */
    def getRange(): Range = js.native
    
    /**
      * 获取当前值
      * @return {number|number[]} 当前值
      */
    def getValue(): Double | js.Array[Double] = js.native
    
    /**
      * 设置可滑动范围
      * @param {number} min 最小值
      * @param {number} max 最大值
      */
    def setRange(min: Double, max: Double): Any = js.native
    
    def setValue(value: js.Array[Double]): Any = js.native
    /**
      * 设置当前值，单值或者两个值
      * @param {number | number[]} value 值
      */
    def setValue(value: Double): Any = js.native
  }
}
