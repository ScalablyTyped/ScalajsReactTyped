package typingsJapgolly.extjs.Ext.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.grid.header.IContainer
import typingsJapgolly.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locking {
  
  trait IHeaderContainer
    extends StObject
       with IContainer {
    
    /** [Method] This is the function which all other column access methods are based upon Return the full column set for the whole Lo
      * @returns Array
      */
    @JSName("getGridColumns")
    var getGridColumns_IHeaderContainer: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th  */
    @JSName("getRefItems")
    var getRefItems_IHeaderContainer: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IHeaderContainer {
    
    inline def apply(): IHeaderContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHeaderContainer]
    }
    
    extension [Self <: IHeaderContainer](x: Self) {
      
      inline def setGetGridColumns(value: CallbackTo[Array]): Self = StObject.set(x, "getGridColumns", value.toJsFn)
      
      inline def setGetGridColumnsUndefined: Self = StObject.set(x, "getGridColumns", js.undefined)
      
      inline def setGetRefItems(value: Callback): Self = StObject.set(x, "getRefItems", value.toJsFn)
      
      inline def setGetRefItemsUndefined: Self = StObject.set(x, "getRefItems", js.undefined)
    }
  }
  
  trait ILockable
    extends StObject
       with IBase {
    
    /** [Config Option] (Object) */
    var lockedGridConfig: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var lockedViewConfig: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var normalGridConfig: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var normalViewConfig: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number) */
    var scrollDelta: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var subGridXType: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var syncRowHeight: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
    var syncRowHeights: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ILockable {
    
    inline def apply(): typingsJapgolly.extjs.Ext.grid.locking.ILockable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.extjs.Ext.grid.locking.ILockable]
    }
    
    extension [Self <: typingsJapgolly.extjs.Ext.grid.locking.ILockable](x: Self) {
      
      inline def setLockedGridConfig(value: Any): Self = StObject.set(x, "lockedGridConfig", value.asInstanceOf[js.Any])
      
      inline def setLockedGridConfigUndefined: Self = StObject.set(x, "lockedGridConfig", js.undefined)
      
      inline def setLockedViewConfig(value: Any): Self = StObject.set(x, "lockedViewConfig", value.asInstanceOf[js.Any])
      
      inline def setLockedViewConfigUndefined: Self = StObject.set(x, "lockedViewConfig", js.undefined)
      
      inline def setNormalGridConfig(value: Any): Self = StObject.set(x, "normalGridConfig", value.asInstanceOf[js.Any])
      
      inline def setNormalGridConfigUndefined: Self = StObject.set(x, "normalGridConfig", js.undefined)
      
      inline def setNormalViewConfig(value: Any): Self = StObject.set(x, "normalViewConfig", value.asInstanceOf[js.Any])
      
      inline def setNormalViewConfigUndefined: Self = StObject.set(x, "normalViewConfig", js.undefined)
      
      inline def setScrollDelta(value: Double): Self = StObject.set(x, "scrollDelta", value.asInstanceOf[js.Any])
      
      inline def setScrollDeltaUndefined: Self = StObject.set(x, "scrollDelta", js.undefined)
      
      inline def setSubGridXType(value: String): Self = StObject.set(x, "subGridXType", value.asInstanceOf[js.Any])
      
      inline def setSubGridXTypeUndefined: Self = StObject.set(x, "subGridXType", js.undefined)
      
      inline def setSyncRowHeight(value: Boolean): Self = StObject.set(x, "syncRowHeight", value.asInstanceOf[js.Any])
      
      inline def setSyncRowHeightUndefined: Self = StObject.set(x, "syncRowHeight", js.undefined)
      
      inline def setSyncRowHeights(value: Callback): Self = StObject.set(x, "syncRowHeights", value.toJsFn)
      
      inline def setSyncRowHeightsUndefined: Self = StObject.set(x, "syncRowHeights", js.undefined)
    }
  }
  
  trait IView
    extends StObject
       with IObservable {
    
    /** [Property] (Boolean) */
    var isLockingView: js.UndefOr[Boolean] = js.undefined
  }
  object IView {
    
    inline def apply(): typingsJapgolly.extjs.Ext.grid.locking.IView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.extjs.Ext.grid.locking.IView]
    }
    
    extension [Self <: typingsJapgolly.extjs.Ext.grid.locking.IView](x: Self) {
      
      inline def setIsLockingView(value: Boolean): Self = StObject.set(x, "isLockingView", value.asInstanceOf[js.Any])
      
      inline def setIsLockingViewUndefined: Self = StObject.set(x, "isLockingView", js.undefined)
    }
  }
}
