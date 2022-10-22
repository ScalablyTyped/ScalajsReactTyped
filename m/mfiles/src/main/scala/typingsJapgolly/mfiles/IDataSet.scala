package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataSet extends StObject {
  
  def Clone(): IDataSet
  
  val ID: Double
  
  val Name: String
}
object IDataSet {
  
  inline def apply(Clone: CallbackTo[IDataSet], ID: Double, Name: String): IDataSet = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataSet]
  }
  
  extension [Self <: IDataSet](x: Self) {
    
    inline def setClone(value: CallbackTo[IDataSet]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
