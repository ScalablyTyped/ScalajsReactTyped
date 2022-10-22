package typingsJapgolly.materialGridList

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialGridList.materialGridListStrings.length
import typingsJapgolly.materialGridList.materialGridListStrings.parentRule
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@material/grid-list.@material/grid-list/adapter.MDCGridListAdapter> */
  trait PartialMDCGridListAdapter extends StObject {
    
    var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ EventListener, Unit]] = js.undefined
    
    var getNumberOfTiles: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetWidthForTileAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ EventListener, Unit]] = js.undefined
    
    var setStyleForTilesElement: js.UndefOr[
        js.Function2[
          /* property */ Exclude[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 458, starting with typingsJapgolly.materialGridList.materialGridListStrings.accentColor, typingsJapgolly.materialGridList.materialGridListStrings.alignContent, typingsJapgolly.materialGridList.materialGridListStrings.alignItems */ Any, 
            length | parentRule
          ], 
          /* value */ String | Null, 
          Unit
        ]
      ] = js.undefined
  }
  object PartialMDCGridListAdapter {
    
    inline def apply(): PartialMDCGridListAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCGridListAdapter]
    }
    
    extension [Self <: PartialMDCGridListAdapter](x: Self) {
      
      inline def setDeregisterResizeHandler(value: /* handler */ EventListener => Callback): Self = StObject.set(x, "deregisterResizeHandler", js.Any.fromFunction1((t0: /* handler */ EventListener) => value(t0).runNow()))
      
      inline def setDeregisterResizeHandlerUndefined: Self = StObject.set(x, "deregisterResizeHandler", js.undefined)
      
      inline def setGetNumberOfTiles(value: CallbackTo[Double]): Self = StObject.set(x, "getNumberOfTiles", value.toJsFn)
      
      inline def setGetNumberOfTilesUndefined: Self = StObject.set(x, "getNumberOfTiles", js.undefined)
      
      inline def setGetOffsetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetWidth", value.toJsFn)
      
      inline def setGetOffsetWidthForTileAtIndex(value: /* index */ Double => Double): Self = StObject.set(x, "getOffsetWidthForTileAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetOffsetWidthForTileAtIndexUndefined: Self = StObject.set(x, "getOffsetWidthForTileAtIndex", js.undefined)
      
      inline def setGetOffsetWidthUndefined: Self = StObject.set(x, "getOffsetWidth", js.undefined)
      
      inline def setRegisterResizeHandler(value: /* handler */ EventListener => Callback): Self = StObject.set(x, "registerResizeHandler", js.Any.fromFunction1((t0: /* handler */ EventListener) => value(t0).runNow()))
      
      inline def setRegisterResizeHandlerUndefined: Self = StObject.set(x, "registerResizeHandler", js.undefined)
      
      inline def setSetStyleForTilesElement(
        value: (/* property */ Exclude[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 458, starting with typingsJapgolly.materialGridList.materialGridListStrings.accentColor, typingsJapgolly.materialGridList.materialGridListStrings.alignContent, typingsJapgolly.materialGridList.materialGridListStrings.alignItems */ Any, 
              length | parentRule
            ], /* value */ String | Null) => Callback
      ): Self = StObject.set(x, "setStyleForTilesElement", js.Any.fromFunction2((t0: /* property */ Exclude[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 458, starting with typingsJapgolly.materialGridList.materialGridListStrings.accentColor, typingsJapgolly.materialGridList.materialGridListStrings.alignContent, typingsJapgolly.materialGridList.materialGridListStrings.alignItems */ Any, 
              length | parentRule
            ], t1: /* value */ String | Null) => (value(t0, t1)).runNow()))
      
      inline def setSetStyleForTilesElementUndefined: Self = StObject.set(x, "setStyleForTilesElement", js.undefined)
    }
  }
  
  trait TILESELECTOR extends StObject {
    
    var TILES_SELECTOR: String
    
    var TILE_SELECTOR: String
  }
  object TILESELECTOR {
    
    inline def apply(TILES_SELECTOR: String, TILE_SELECTOR: String): TILESELECTOR = {
      val __obj = js.Dynamic.literal(TILES_SELECTOR = TILES_SELECTOR.asInstanceOf[js.Any], TILE_SELECTOR = TILE_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[TILESELECTOR]
    }
    
    extension [Self <: TILESELECTOR](x: Self) {
      
      inline def setTILES_SELECTOR(value: String): Self = StObject.set(x, "TILES_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setTILE_SELECTOR(value: String): Self = StObject.set(x, "TILE_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
}
