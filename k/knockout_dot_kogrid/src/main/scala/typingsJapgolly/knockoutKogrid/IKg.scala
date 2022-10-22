package typingsJapgolly.knockoutKogrid

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.knockoutKogrid.kg.DomUtilityService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKg extends StObject {
  
  /** Default aggregate template */
  def aggregateTemplate(): String
  
  /** Default cell template. Can be overriden in GridOptions.cellTemplate */
  def defaultCellTemplate(): String
  
  /** Default grid template */
  def defaultGridTemplate(): String
  
  /** Default headercell template. Can be overriden in GridOptions.headerCellTemplate */
  def defaultHeaderCellTemplate(): String
  
  /** Default headerrow template. Can be overriden in GridOptions.headerRowTemplate */
  def defaultHeaderRowTemplate(): String
  
  /** Default row template. Can be overriden in GridOptions.rowTemplate */
  def defaultRowTemplate(): String
  
  var domUtilityService: DomUtilityService
}
object IKg {
  
  inline def apply(
    aggregateTemplate: CallbackTo[String],
    defaultCellTemplate: CallbackTo[String],
    defaultGridTemplate: CallbackTo[String],
    defaultHeaderCellTemplate: CallbackTo[String],
    defaultHeaderRowTemplate: CallbackTo[String],
    defaultRowTemplate: CallbackTo[String],
    domUtilityService: DomUtilityService
  ): IKg = {
    val __obj = js.Dynamic.literal(aggregateTemplate = aggregateTemplate.toJsFn, defaultCellTemplate = defaultCellTemplate.toJsFn, defaultGridTemplate = defaultGridTemplate.toJsFn, defaultHeaderCellTemplate = defaultHeaderCellTemplate.toJsFn, defaultHeaderRowTemplate = defaultHeaderRowTemplate.toJsFn, defaultRowTemplate = defaultRowTemplate.toJsFn, domUtilityService = domUtilityService.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKg]
  }
  
  extension [Self <: IKg](x: Self) {
    
    inline def setAggregateTemplate(value: CallbackTo[String]): Self = StObject.set(x, "aggregateTemplate", value.toJsFn)
    
    inline def setDefaultCellTemplate(value: CallbackTo[String]): Self = StObject.set(x, "defaultCellTemplate", value.toJsFn)
    
    inline def setDefaultGridTemplate(value: CallbackTo[String]): Self = StObject.set(x, "defaultGridTemplate", value.toJsFn)
    
    inline def setDefaultHeaderCellTemplate(value: CallbackTo[String]): Self = StObject.set(x, "defaultHeaderCellTemplate", value.toJsFn)
    
    inline def setDefaultHeaderRowTemplate(value: CallbackTo[String]): Self = StObject.set(x, "defaultHeaderRowTemplate", value.toJsFn)
    
    inline def setDefaultRowTemplate(value: CallbackTo[String]): Self = StObject.set(x, "defaultRowTemplate", value.toJsFn)
    
    inline def setDomUtilityService(value: DomUtilityService): Self = StObject.set(x, "domUtilityService", value.asInstanceOf[js.Any])
  }
}
