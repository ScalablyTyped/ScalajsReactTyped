package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexOffice.Office.MsoEditingType
import typingsJapgolly.activexOffice.Office.MsoSegmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeNode extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  val EditingType: MsoEditingType
  
  val Parent: Any
  
  val Points: Any
  
  val SegmentType: MsoSegmentType
  
  /* private */ @JSName("Word.ShapeNode_typekey")
  var WordDotShapeNode_typekey: ShapeNode
}
object ShapeNode {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    EditingType: MsoEditingType,
    Parent: Any,
    Points: Any,
    SegmentType: MsoSegmentType,
    WordDotShapeNode_typekey: ShapeNode
  ): ShapeNode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EditingType = EditingType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ShapeNode_typekey")(WordDotShapeNode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeNode]
  }
  
  extension [Self <: ShapeNode](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEditingType(value: MsoEditingType): Self = StObject.set(x, "EditingType", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: Any): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
    
    inline def setSegmentType(value: MsoSegmentType): Self = StObject.set(x, "SegmentType", value.asInstanceOf[js.Any])
    
    inline def setWordDotShapeNode_typekey(value: ShapeNode): Self = StObject.set(x, "Word.ShapeNode_typekey", value.asInstanceOf[js.Any])
  }
}
