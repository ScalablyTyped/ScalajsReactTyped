package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a single line for a {@link HomogenMatrix} . */
trait HomogenMatrixLine extends StObject {
  
  var Column1: Double
  
  var Column2: Double
  
  var Column3: Double
  
  var Column4: Double
}
object HomogenMatrixLine {
  
  inline def apply(Column1: Double, Column2: Double, Column3: Double, Column4: Double): HomogenMatrixLine = {
    val __obj = js.Dynamic.literal(Column1 = Column1.asInstanceOf[js.Any], Column2 = Column2.asInstanceOf[js.Any], Column3 = Column3.asInstanceOf[js.Any], Column4 = Column4.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrixLine]
  }
  
  extension [Self <: HomogenMatrixLine](x: Self) {
    
    inline def setColumn1(value: Double): Self = StObject.set(x, "Column1", value.asInstanceOf[js.Any])
    
    inline def setColumn2(value: Double): Self = StObject.set(x, "Column2", value.asInstanceOf[js.Any])
    
    inline def setColumn3(value: Double): Self = StObject.set(x, "Column3", value.asInstanceOf[js.Any])
    
    inline def setColumn4(value: Double): Self = StObject.set(x, "Column4", value.asInstanceOf[js.Any])
  }
}
