package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.data.IStore
import typingsJapgolly.extjs.Ext.panel.ITable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object list {
  
  trait IListView
    extends StObject
       with ITable {
    
    /** [Method] Reconfigures the grid with a new store columns
      * @param store Ext.data.Store The new store.
      * @param columns Object[] An array of column configs
      */
    var reconfigure: js.UndefOr[
        js.Function2[/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array], Unit]
      ] = js.undefined
  }
  object IListView {
    
    inline def apply(): typingsJapgolly.extjs.Ext.list.IListView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.extjs.Ext.list.IListView]
    }
    
    extension [Self <: typingsJapgolly.extjs.Ext.list.IListView](x: Self) {
      
      inline def setReconfigure(value: (/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array]) => Callback): Self = StObject.set(x, "reconfigure", js.Any.fromFunction2((t0: /* store */ js.UndefOr[IStore], t1: /* columns */ js.UndefOr[Array]) => (value(t0, t1)).runNow()))
      
      inline def setReconfigureUndefined: Self = StObject.set(x, "reconfigure", js.undefined)
    }
  }
}
