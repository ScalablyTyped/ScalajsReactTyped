package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramNodes extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): DiagramNode
  
  val Parent: Any
  
  def SelectAll(): Unit
  
  /* private */ @JSName("Word.DiagramNodes_typekey")
  var WordDotDiagramNodes_typekey: DiagramNodes
}
object DiagramNodes {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => DiagramNode,
    Parent: Any,
    SelectAll: Callback,
    WordDotDiagramNodes_typekey: DiagramNodes
  ): DiagramNodes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], SelectAll = SelectAll.toJsFn)
    __obj.updateDynamic("Word.DiagramNodes_typekey")(WordDotDiagramNodes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramNodes]
  }
  
  extension [Self <: DiagramNodes](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => DiagramNode): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelectAll(value: Callback): Self = StObject.set(x, "SelectAll", value.toJsFn)
    
    inline def setWordDotDiagramNodes_typekey(value: DiagramNodes): Self = StObject.set(x, "Word.DiagramNodes_typekey", value.asInstanceOf[js.Any])
  }
}
