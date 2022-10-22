package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexOffice.Office.TextRange2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val ChildShapeRange: typingsJapgolly.activexPowerpoint.PowerPoint.ShapeRange
  
  def Copy(): Unit
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  val HasChildShapeRange: Boolean
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Selection_typekey")
  var PowerPointDotSelection_typekey: Selection
  
  val ShapeRange: typingsJapgolly.activexPowerpoint.PowerPoint.ShapeRange
  
  val SlideRange: typingsJapgolly.activexPowerpoint.PowerPoint.SlideRange
  
  val TextRange: typingsJapgolly.activexPowerpoint.PowerPoint.TextRange
  
  val TextRange2: typingsJapgolly.activexOffice.Office.TextRange2
  
  val Type: PpSelectionType
  
  def Unselect(): Unit
}
object Selection {
  
  inline def apply(
    Application: Application,
    ChildShapeRange: ShapeRange,
    Copy: Callback,
    Cut: Callback,
    Delete: Callback,
    HasChildShapeRange: Boolean,
    Parent: Any,
    PowerPointDotSelection_typekey: Selection,
    ShapeRange: ShapeRange,
    SlideRange: SlideRange,
    TextRange: TextRange,
    TextRange2: TextRange2,
    Type: PpSelectionType,
    Unselect: Callback
  ): Selection = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ChildShapeRange = ChildShapeRange.asInstanceOf[js.Any], Copy = Copy.toJsFn, Cut = Cut.toJsFn, Delete = Delete.toJsFn, HasChildShapeRange = HasChildShapeRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ShapeRange = ShapeRange.asInstanceOf[js.Any], SlideRange = SlideRange.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], TextRange2 = TextRange2.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unselect = Unselect.toJsFn)
    __obj.updateDynamic("PowerPoint.Selection_typekey")(PowerPointDotSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  extension [Self <: Selection](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setChildShapeRange(value: ShapeRange): Self = StObject.set(x, "ChildShapeRange", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: Callback): Self = StObject.set(x, "Copy", value.toJsFn)
    
    inline def setCut(value: Callback): Self = StObject.set(x, "Cut", value.toJsFn)
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setHasChildShapeRange(value: Boolean): Self = StObject.set(x, "HasChildShapeRange", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotSelection_typekey(value: Selection): Self = StObject.set(x, "PowerPoint.Selection_typekey", value.asInstanceOf[js.Any])
    
    inline def setShapeRange(value: ShapeRange): Self = StObject.set(x, "ShapeRange", value.asInstanceOf[js.Any])
    
    inline def setSlideRange(value: SlideRange): Self = StObject.set(x, "SlideRange", value.asInstanceOf[js.Any])
    
    inline def setTextRange(value: TextRange): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    
    inline def setTextRange2(value: TextRange2): Self = StObject.set(x, "TextRange2", value.asInstanceOf[js.Any])
    
    inline def setType(value: PpSelectionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUnselect(value: Callback): Self = StObject.set(x, "Unselect", value.toJsFn)
  }
}
