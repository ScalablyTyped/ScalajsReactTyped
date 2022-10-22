package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugin {
  
  trait IBuffered
    extends StObject
       with IEvented {
    
    /** [Method] Returns the value of bufferedCollection
      * @returns Object
      */
    var getBufferedCollection: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of leadingBufferZone
      * @returns Number
      */
    var getLeadingBufferZone: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Determines the page from a record index
      * @param index Number The record index
      * @returns Number The page the record belongs to
      */
    var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Double]] = js.undefined
    
    /** [Method] Returns the value of purgePageCount
      * @returns Number
      */
    var getPurgePageCount: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of store
      * @returns Object
      */
    var getStore: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of trailingBufferZone
      * @returns Number
      */
    var getTrailingBufferZone: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of viewSize
      * @returns Number
      */
    var getViewSize: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Config Option] (Number) */
    var leadingBufferZone: js.UndefOr[Double] = js.undefined
    
    /** [Method] Prefetches data into the store using its configured proxy
      * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
      */
    var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Prefetches a page of data
      * @param page Number The page to prefetch
      * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
      */
    var prefetchPage: js.UndefOr[js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var purgePageCount: js.UndefOr[Double] = js.undefined
    
    /** [Method] Sets the value of bufferedCollection
      * @param bufferedCollection Object The new value.
      */
    var setBufferedCollection: js.UndefOr[js.Function1[/* bufferedCollection */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of leadingBufferZone
      * @param leadingBufferZone Number The new value.
      */
    var setLeadingBufferZone: js.UndefOr[js.Function1[/* leadingBufferZone */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of purgePageCount
      * @param purgePageCount Number The new value.
      */
    var setPurgePageCount: js.UndefOr[js.Function1[/* purgePageCount */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of store
      * @param store Object The new value.
      */
    var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of trailingBufferZone
      * @param trailingBufferZone Number The new value.
      */
    var setTrailingBufferZone: js.UndefOr[js.Function1[/* trailingBufferZone */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of viewSize
      * @param viewSize Number The new value.
      */
    var setViewSize: js.UndefOr[js.Function1[/* viewSize */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var trailingBufferZone: js.UndefOr[Double] = js.undefined
  }
  object IBuffered {
    
    inline def apply(): IBuffered = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBuffered]
    }
    
    extension [Self <: IBuffered](x: Self) {
      
      inline def setGetBufferedCollection(value: CallbackTo[Any]): Self = StObject.set(x, "getBufferedCollection", value.toJsFn)
      
      inline def setGetBufferedCollectionUndefined: Self = StObject.set(x, "getBufferedCollection", js.undefined)
      
      inline def setGetLeadingBufferZone(value: CallbackTo[Double]): Self = StObject.set(x, "getLeadingBufferZone", value.toJsFn)
      
      inline def setGetLeadingBufferZoneUndefined: Self = StObject.set(x, "getLeadingBufferZone", js.undefined)
      
      inline def setGetPageFromRecordIndex(value: /* index */ js.UndefOr[Double] => Double): Self = StObject.set(x, "getPageFromRecordIndex", js.Any.fromFunction1(value))
      
      inline def setGetPageFromRecordIndexUndefined: Self = StObject.set(x, "getPageFromRecordIndex", js.undefined)
      
      inline def setGetPurgePageCount(value: CallbackTo[Double]): Self = StObject.set(x, "getPurgePageCount", value.toJsFn)
      
      inline def setGetPurgePageCountUndefined: Self = StObject.set(x, "getPurgePageCount", js.undefined)
      
      inline def setGetStore(value: CallbackTo[Any]): Self = StObject.set(x, "getStore", value.toJsFn)
      
      inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
      
      inline def setGetTrailingBufferZone(value: CallbackTo[Double]): Self = StObject.set(x, "getTrailingBufferZone", value.toJsFn)
      
      inline def setGetTrailingBufferZoneUndefined: Self = StObject.set(x, "getTrailingBufferZone", js.undefined)
      
      inline def setGetViewSize(value: CallbackTo[Double]): Self = StObject.set(x, "getViewSize", value.toJsFn)
      
      inline def setGetViewSizeUndefined: Self = StObject.set(x, "getViewSize", js.undefined)
      
      inline def setLeadingBufferZone(value: Double): Self = StObject.set(x, "leadingBufferZone", value.asInstanceOf[js.Any])
      
      inline def setLeadingBufferZoneUndefined: Self = StObject.set(x, "leadingBufferZone", js.undefined)
      
      inline def setPrefetch(value: /* options */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "prefetch", js.Any.fromFunction1((t0: /* options */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setPrefetchPage(value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "prefetchPage", js.Any.fromFunction2((t0: /* page */ js.UndefOr[Double], t1: /* options */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setPrefetchPageUndefined: Self = StObject.set(x, "prefetchPage", js.undefined)
      
      inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      
      inline def setPurgePageCount(value: Double): Self = StObject.set(x, "purgePageCount", value.asInstanceOf[js.Any])
      
      inline def setPurgePageCountUndefined: Self = StObject.set(x, "purgePageCount", js.undefined)
      
      inline def setSetBufferedCollection(value: /* bufferedCollection */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setBufferedCollection", js.Any.fromFunction1((t0: /* bufferedCollection */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetBufferedCollectionUndefined: Self = StObject.set(x, "setBufferedCollection", js.undefined)
      
      inline def setSetLeadingBufferZone(value: /* leadingBufferZone */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setLeadingBufferZone", js.Any.fromFunction1((t0: /* leadingBufferZone */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetLeadingBufferZoneUndefined: Self = StObject.set(x, "setLeadingBufferZone", js.undefined)
      
      inline def setSetPurgePageCount(value: /* purgePageCount */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setPurgePageCount", js.Any.fromFunction1((t0: /* purgePageCount */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetPurgePageCountUndefined: Self = StObject.set(x, "setPurgePageCount", js.undefined)
      
      inline def setSetStore(value: /* store */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setStore", js.Any.fromFunction1((t0: /* store */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
      
      inline def setSetTrailingBufferZone(value: /* trailingBufferZone */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setTrailingBufferZone", js.Any.fromFunction1((t0: /* trailingBufferZone */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetTrailingBufferZoneUndefined: Self = StObject.set(x, "setTrailingBufferZone", js.undefined)
      
      inline def setSetViewSize(value: /* viewSize */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setViewSize", js.Any.fromFunction1((t0: /* viewSize */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetViewSizeUndefined: Self = StObject.set(x, "setViewSize", js.undefined)
      
      inline def setTrailingBufferZone(value: Double): Self = StObject.set(x, "trailingBufferZone", value.asInstanceOf[js.Any])
      
      inline def setTrailingBufferZoneUndefined: Self = StObject.set(x, "trailingBufferZone", js.undefined)
    }
  }
}
