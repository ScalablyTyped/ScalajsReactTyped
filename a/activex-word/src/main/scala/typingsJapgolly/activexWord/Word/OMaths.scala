package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMaths extends StObject {
  
  def Add(Range: Range): Range
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  def BuildUp(): Unit
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): OMath
  
  def Linearize(): Unit
  
  val Parent: Any
  
  /* private */ @JSName("Word.OMaths_typekey")
  var WordDotOMaths_typekey: OMaths
}
object OMaths {
  
  inline def apply(
    Add: Range => Range,
    Application: Application,
    BuildUp: Callback,
    Count: Double,
    Creator: Double,
    Item: Double => OMath,
    Linearize: Callback,
    Parent: Any,
    WordDotOMaths_typekey: OMaths
  ): OMaths = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], BuildUp = BuildUp.toJsFn, Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Linearize = Linearize.toJsFn, Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMaths_typekey")(WordDotOMaths_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMaths]
  }
  
  extension [Self <: OMaths](x: Self) {
    
    inline def setAdd(value: Range => Range): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBuildUp(value: Callback): Self = StObject.set(x, "BuildUp", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => OMath): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setLinearize(value: Callback): Self = StObject.set(x, "Linearize", value.toJsFn)
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMaths_typekey(value: OMaths): Self = StObject.set(x, "Word.OMaths_typekey", value.asInstanceOf[js.Any])
  }
}
