package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.MFDataFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataFunctionCall extends StObject {
  
  val DataFunction: MFDataFunction
  
  def SetDataDate(): Unit
  
  def SetDataDaysFrom(): Unit
  
  def SetDataDaysTo(): Unit
  
  def SetDataInitialCharGroup(Locale: Double): Unit
  
  def SetDataIntegerSegment(SegmentSize: Double): Unit
  
  def SetDataLeftChars(Characters: Double): Unit
  
  def SetDataMonth(): Unit
  
  def SetDataNoOp(): Unit
  
  def SetDataYear(): Unit
  
  def SetDataYearAndMonth(): Unit
}
object IDataFunctionCall {
  
  inline def apply(
    DataFunction: MFDataFunction,
    SetDataDate: Callback,
    SetDataDaysFrom: Callback,
    SetDataDaysTo: Callback,
    SetDataInitialCharGroup: Double => Callback,
    SetDataIntegerSegment: Double => Callback,
    SetDataLeftChars: Double => Callback,
    SetDataMonth: Callback,
    SetDataNoOp: Callback,
    SetDataYear: Callback,
    SetDataYearAndMonth: Callback
  ): IDataFunctionCall = {
    val __obj = js.Dynamic.literal(DataFunction = DataFunction.asInstanceOf[js.Any], SetDataDate = SetDataDate.toJsFn, SetDataDaysFrom = SetDataDaysFrom.toJsFn, SetDataDaysTo = SetDataDaysTo.toJsFn, SetDataInitialCharGroup = js.Any.fromFunction1((t0: Double) => SetDataInitialCharGroup(t0).runNow()), SetDataIntegerSegment = js.Any.fromFunction1((t0: Double) => SetDataIntegerSegment(t0).runNow()), SetDataLeftChars = js.Any.fromFunction1((t0: Double) => SetDataLeftChars(t0).runNow()), SetDataMonth = SetDataMonth.toJsFn, SetDataNoOp = SetDataNoOp.toJsFn, SetDataYear = SetDataYear.toJsFn, SetDataYearAndMonth = SetDataYearAndMonth.toJsFn)
    __obj.asInstanceOf[IDataFunctionCall]
  }
  
  extension [Self <: IDataFunctionCall](x: Self) {
    
    inline def setDataFunction(value: MFDataFunction): Self = StObject.set(x, "DataFunction", value.asInstanceOf[js.Any])
    
    inline def setSetDataDate(value: Callback): Self = StObject.set(x, "SetDataDate", value.toJsFn)
    
    inline def setSetDataDaysFrom(value: Callback): Self = StObject.set(x, "SetDataDaysFrom", value.toJsFn)
    
    inline def setSetDataDaysTo(value: Callback): Self = StObject.set(x, "SetDataDaysTo", value.toJsFn)
    
    inline def setSetDataInitialCharGroup(value: Double => Callback): Self = StObject.set(x, "SetDataInitialCharGroup", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDataIntegerSegment(value: Double => Callback): Self = StObject.set(x, "SetDataIntegerSegment", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDataLeftChars(value: Double => Callback): Self = StObject.set(x, "SetDataLeftChars", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDataMonth(value: Callback): Self = StObject.set(x, "SetDataMonth", value.toJsFn)
    
    inline def setSetDataNoOp(value: Callback): Self = StObject.set(x, "SetDataNoOp", value.toJsFn)
    
    inline def setSetDataYear(value: Callback): Self = StObject.set(x, "SetDataYear", value.toJsFn)
    
    inline def setSetDataYearAndMonth(value: Callback): Self = StObject.set(x, "SetDataYearAndMonth", value.toJsFn)
  }
}
