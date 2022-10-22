package typingsJapgolly.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetEffect extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.SetEffect_typekey")
  var PowerPointDotSetEffect_typekey: SetEffect
  
  var Property: MsoAnimProperty
  
  var To: Any
}
object SetEffect {
  
  inline def apply(
    Application: Application,
    Parent: Any,
    PowerPointDotSetEffect_typekey: SetEffect,
    Property: MsoAnimProperty,
    To: Any
  ): SetEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SetEffect_typekey")(PowerPointDotSetEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEffect]
  }
  
  extension [Self <: SetEffect](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotSetEffect_typekey(value: SetEffect): Self = StObject.set(x, "PowerPoint.SetEffect_typekey", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: MsoAnimProperty): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Any): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
