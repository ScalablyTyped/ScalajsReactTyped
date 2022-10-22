package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideShowWindow extends StObject {
  
  def Activate(): Unit
  
  val Active: MsoTriState
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  var Height: Double
  
  val IsFullScreen: MsoTriState
  
  var Left: Double
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.SlideShowWindow_typekey")
  var PowerPointDotSlideShowWindow_typekey: SlideShowWindow
  
  val Presentation: typingsJapgolly.activexPowerpoint.PowerPoint.Presentation
  
  var Top: Double
  
  val View: SlideShowView
  
  var Width: Double
}
object SlideShowWindow {
  
  inline def apply(
    Activate: Callback,
    Active: MsoTriState,
    Application: Application,
    Height: Double,
    IsFullScreen: MsoTriState,
    Left: Double,
    Parent: Any,
    PowerPointDotSlideShowWindow_typekey: SlideShowWindow,
    Presentation: Presentation,
    Top: Double,
    View: SlideShowView,
    Width: Double
  ): SlideShowWindow = {
    val __obj = js.Dynamic.literal(Activate = Activate.toJsFn, Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFullScreen = IsFullScreen.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Presentation = Presentation.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowWindow_typekey")(PowerPointDotSlideShowWindow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowWindow]
  }
  
  extension [Self <: SlideShowWindow](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "Activate", value.toJsFn)
    
    inline def setActive(value: MsoTriState): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setIsFullScreen(value: MsoTriState): Self = StObject.set(x, "IsFullScreen", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotSlideShowWindow_typekey(value: SlideShowWindow): Self = StObject.set(x, "PowerPoint.SlideShowWindow_typekey", value.asInstanceOf[js.Any])
    
    inline def setPresentation(value: Presentation): Self = StObject.set(x, "Presentation", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setView(value: SlideShowView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
