package typingsJapgolly.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideShowWindows extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Item(Index: Double): SlideShowWindow
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.SlideShowWindows_typekey")
  var PowerPointDotSlideShowWindows_typekey: SlideShowWindows
}
object SlideShowWindows {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Item: Double => SlideShowWindow,
    Parent: Any,
    PowerPointDotSlideShowWindows_typekey: SlideShowWindows
  ): SlideShowWindows = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowWindows_typekey")(PowerPointDotSlideShowWindows_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowWindows]
  }
  
  extension [Self <: SlideShowWindows](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => SlideShowWindow): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotSlideShowWindows_typekey(value: SlideShowWindows): Self = StObject.set(x, "PowerPoint.SlideShowWindows_typekey", value.asInstanceOf[js.Any])
  }
}
