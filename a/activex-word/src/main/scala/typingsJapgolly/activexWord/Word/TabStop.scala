package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStop extends StObject {
  
  var Alignment: WdTabAlignment
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  def Clear(): Unit
  
  val Creator: Double
  
  val CustomTab: Boolean
  
  var Leader: WdTabLeader
  
  val Next: TabStop
  
  val Parent: Any
  
  var Position: Double
  
  val Previous: TabStop
  
  /* private */ @JSName("Word.TabStop_typekey")
  var WordDotTabStop_typekey: TabStop
}
object TabStop {
  
  inline def apply(
    Alignment: WdTabAlignment,
    Application: Application,
    Clear: Callback,
    Creator: Double,
    CustomTab: Boolean,
    Leader: WdTabLeader,
    Next: TabStop,
    Parent: Any,
    Position: Double,
    Previous: TabStop,
    WordDotTabStop_typekey: TabStop
  ): TabStop = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Clear = Clear.toJsFn, Creator = Creator.asInstanceOf[js.Any], CustomTab = CustomTab.asInstanceOf[js.Any], Leader = Leader.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TabStop_typekey")(WordDotTabStop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
  
  extension [Self <: TabStop](x: Self) {
    
    inline def setAlignment(value: WdTabAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCustomTab(value: Boolean): Self = StObject.set(x, "CustomTab", value.asInstanceOf[js.Any])
    
    inline def setLeader(value: WdTabLeader): Self = StObject.set(x, "Leader", value.asInstanceOf[js.Any])
    
    inline def setNext(value: TabStop): Self = StObject.set(x, "Next", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: TabStop): Self = StObject.set(x, "Previous", value.asInstanceOf[js.Any])
    
    inline def setWordDotTabStop_typekey(value: TabStop): Self = StObject.set(x, "Word.TabStop_typekey", value.asInstanceOf[js.Any])
  }
}
