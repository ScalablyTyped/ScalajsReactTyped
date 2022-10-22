package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecLayoutMod._LayoutOffset
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFooter
  extends StObject
     with _LayoutOffset {
  
  var columnFooter: js.UndefOr[Double | SignalRef] = js.undefined
  
  var columnHeader: js.UndefOr[Double | SignalRef] = js.undefined
  
  var columnTitle: js.UndefOr[Double | SignalRef] = js.undefined
  
  var rowFooter: js.UndefOr[Double | SignalRef] = js.undefined
  
  var rowHeader: js.UndefOr[Double | SignalRef] = js.undefined
  
  var rowTitle: js.UndefOr[Double | SignalRef] = js.undefined
}
object ColumnFooter {
  
  inline def apply(): ColumnFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFooter]
  }
  
  extension [Self <: ColumnFooter](x: Self) {
    
    inline def setColumnFooter(value: Double | SignalRef): Self = StObject.set(x, "columnFooter", value.asInstanceOf[js.Any])
    
    inline def setColumnFooterUndefined: Self = StObject.set(x, "columnFooter", js.undefined)
    
    inline def setColumnHeader(value: Double | SignalRef): Self = StObject.set(x, "columnHeader", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderUndefined: Self = StObject.set(x, "columnHeader", js.undefined)
    
    inline def setColumnTitle(value: Double | SignalRef): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
    
    inline def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
    
    inline def setRowFooter(value: Double | SignalRef): Self = StObject.set(x, "rowFooter", value.asInstanceOf[js.Any])
    
    inline def setRowFooterUndefined: Self = StObject.set(x, "rowFooter", js.undefined)
    
    inline def setRowHeader(value: Double | SignalRef): Self = StObject.set(x, "rowHeader", value.asInstanceOf[js.Any])
    
    inline def setRowHeaderUndefined: Self = StObject.set(x, "rowHeader", js.undefined)
    
    inline def setRowTitle(value: Double | SignalRef): Self = StObject.set(x, "rowTitle", value.asInstanceOf[js.Any])
    
    inline def setRowTitleUndefined: Self = StObject.set(x, "rowTitle", js.undefined)
  }
}
