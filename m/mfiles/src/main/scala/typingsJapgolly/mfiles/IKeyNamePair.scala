package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyNamePair extends StObject {
  
  def Clone(): IKeyNamePair
  
  val Key: Double
  
  val Name: String
}
object IKeyNamePair {
  
  inline def apply(Clone: CallbackTo[IKeyNamePair], Key: Double, Name: String): IKeyNamePair = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Key = Key.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyNamePair]
  }
  
  extension [Self <: IKeyNamePair](x: Self) {
    
    inline def setClone(value: CallbackTo[IKeyNamePair]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setKey(value: Double): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
