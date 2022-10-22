package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pane extends StObject {
  
  def Activate(): Unit
  
  val Active: MsoTriState
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Pane_typekey")
  var PowerPointDotPane_typekey: Pane
  
  val ViewType: PpViewType
}
object Pane {
  
  inline def apply(
    Activate: Callback,
    Active: MsoTriState,
    Application: Application,
    Parent: Any,
    PowerPointDotPane_typekey: Pane,
    ViewType: PpViewType
  ): Pane = {
    val __obj = js.Dynamic.literal(Activate = Activate.toJsFn, Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Pane_typekey")(PowerPointDotPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pane]
  }
  
  extension [Self <: Pane](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "Activate", value.toJsFn)
    
    inline def setActive(value: MsoTriState): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPane_typekey(value: Pane): Self = StObject.set(x, "PowerPoint.Pane_typekey", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: PpViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
  }
}
