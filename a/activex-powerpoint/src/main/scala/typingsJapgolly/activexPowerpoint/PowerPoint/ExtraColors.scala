package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexOffice.Office.MsoRGBType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraColors extends StObject {
  
  def Add(Type: MsoRGBType): Unit
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  def Clear(): Unit
  
  val Count: Double
  
  def Item(Index: Double): MsoRGBType
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.ExtraColors_typekey")
  var PowerPointDotExtraColors_typekey: ExtraColors
}
object ExtraColors {
  
  inline def apply(
    Add: MsoRGBType => Callback,
    Application: Application,
    Clear: Callback,
    Count: Double,
    Item: Double => MsoRGBType,
    Parent: Any,
    PowerPointDotExtraColors_typekey: ExtraColors
  ): ExtraColors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1((t0: MsoRGBType) => Add(t0).runNow()), Application = Application.asInstanceOf[js.Any], Clear = Clear.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ExtraColors_typekey")(PowerPointDotExtraColors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraColors]
  }
  
  extension [Self <: ExtraColors](x: Self) {
    
    inline def setAdd(value: MsoRGBType => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction1((t0: MsoRGBType) => value(t0).runNow()))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => MsoRGBType): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotExtraColors_typekey(value: ExtraColors): Self = StObject.set(x, "PowerPoint.ExtraColors_typekey", value.asInstanceOf[js.Any])
  }
}
