package typingsJapgolly.chartJs.mod

import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import typingsJapgolly.chartJs.typesElementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionItem extends StObject {
  
  var datasetIndex: Double
  
  var element: Element[AnyObject, AnyObject]
  
  var index: Double
}
object InteractionItem {
  
  inline def apply(datasetIndex: Double, element: Element[AnyObject, AnyObject], index: Double): InteractionItem = {
    val __obj = js.Dynamic.literal(datasetIndex = datasetIndex.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionItem]
  }
  
  extension [Self <: InteractionItem](x: Self) {
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element[AnyObject, AnyObject]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
