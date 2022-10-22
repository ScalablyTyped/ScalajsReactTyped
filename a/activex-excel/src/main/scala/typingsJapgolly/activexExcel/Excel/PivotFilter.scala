package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotFilter extends StObject {
  
  val Active: Boolean
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  val DataCubeField: CubeField
  
  val DataField: typingsJapgolly.activexExcel.Excel.PivotField
  
  def Delete(): Unit
  
  val Description: String
  
  /* private */ @JSName("Excel.PivotFilter_typekey")
  var ExcelDotPivotFilter_typekey: PivotFilter
  
  val FilterType: XlPivotFilterType
  
  val IsMemberPropertyFilter: Boolean
  
  val MemberPropertyField: typingsJapgolly.activexExcel.Excel.PivotField
  
  val Name: String
  
  var Order: Double
  
  val Parent: Any
  
  val PivotField: typingsJapgolly.activexExcel.Excel.PivotField
  
  val Value1: Any
  
  val Value2: Any
}
object PivotFilter {
  
  inline def apply(
    Active: Boolean,
    Application: Application,
    Creator: XlCreator,
    DataCubeField: CubeField,
    DataField: PivotField,
    Delete: Callback,
    Description: String,
    ExcelDotPivotFilter_typekey: PivotFilter,
    FilterType: XlPivotFilterType,
    IsMemberPropertyFilter: Boolean,
    MemberPropertyField: PivotField,
    Name: String,
    Order: Double,
    Parent: Any,
    PivotField: PivotField,
    Value1: Any,
    Value2: Any
  ): PivotFilter = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DataCubeField = DataCubeField.asInstanceOf[js.Any], DataField = DataField.asInstanceOf[js.Any], Delete = Delete.toJsFn, Description = Description.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any], IsMemberPropertyFilter = IsMemberPropertyFilter.asInstanceOf[js.Any], MemberPropertyField = MemberPropertyField.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PivotField = PivotField.asInstanceOf[js.Any], Value1 = Value1.asInstanceOf[js.Any], Value2 = Value2.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PivotFilter_typekey")(ExcelDotPivotFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotFilter]
  }
  
  extension [Self <: PivotFilter](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDataCubeField(value: CubeField): Self = StObject.set(x, "DataCubeField", value.asInstanceOf[js.Any])
    
    inline def setDataField(value: PivotField): Self = StObject.set(x, "DataField", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setExcelDotPivotFilter_typekey(value: PivotFilter): Self = StObject.set(x, "Excel.PivotFilter_typekey", value.asInstanceOf[js.Any])
    
    inline def setFilterType(value: XlPivotFilterType): Self = StObject.set(x, "FilterType", value.asInstanceOf[js.Any])
    
    inline def setIsMemberPropertyFilter(value: Boolean): Self = StObject.set(x, "IsMemberPropertyFilter", value.asInstanceOf[js.Any])
    
    inline def setMemberPropertyField(value: PivotField): Self = StObject.set(x, "MemberPropertyField", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPivotField(value: PivotField): Self = StObject.set(x, "PivotField", value.asInstanceOf[js.Any])
    
    inline def setValue1(value: Any): Self = StObject.set(x, "Value1", value.asInstanceOf[js.Any])
    
    inline def setValue2(value: Any): Self = StObject.set(x, "Value2", value.asInstanceOf[js.Any])
  }
}
