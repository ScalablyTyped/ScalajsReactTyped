package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStop extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  def Clear(): Unit
  
  val Parent: Any
  
  var Position: Double
  
  /* private */ @JSName("PowerPoint.TabStop_typekey")
  var PowerPointDotTabStop_typekey: TabStop
  
  var Type: PpTabStopType
}
object TabStop {
  
  inline def apply(
    Application: Application,
    Clear: Callback,
    Parent: Any,
    Position: Double,
    PowerPointDotTabStop_typekey: TabStop,
    Type: PpTabStopType
  ): TabStop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = Clear.toJsFn, Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TabStop_typekey")(PowerPointDotTabStop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
  
  extension [Self <: TabStop](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTabStop_typekey(value: TabStop): Self = StObject.set(x, "PowerPoint.TabStop_typekey", value.asInstanceOf[js.Any])
    
    inline def setType(value: PpTabStopType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
