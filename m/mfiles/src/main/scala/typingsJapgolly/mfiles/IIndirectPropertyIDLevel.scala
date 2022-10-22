package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFIndirectPropertyIDLevelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIndirectPropertyIDLevel extends StObject {
  
  def Clone(): IIndirectPropertyIDLevel
  
  var ID: Double
  
  var LevelType: MFIndirectPropertyIDLevelType
  
  def ToJSON(): String
}
object IIndirectPropertyIDLevel {
  
  inline def apply(
    Clone: CallbackTo[IIndirectPropertyIDLevel],
    ID: Double,
    LevelType: MFIndirectPropertyIDLevelType,
    ToJSON: CallbackTo[String]
  ): IIndirectPropertyIDLevel = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, ID = ID.asInstanceOf[js.Any], LevelType = LevelType.asInstanceOf[js.Any], ToJSON = ToJSON.toJsFn)
    __obj.asInstanceOf[IIndirectPropertyIDLevel]
  }
  
  extension [Self <: IIndirectPropertyIDLevel](x: Self) {
    
    inline def setClone(value: CallbackTo[IIndirectPropertyIDLevel]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setLevelType(value: MFIndirectPropertyIDLevelType): Self = StObject.set(x, "LevelType", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "ToJSON", value.toJsFn)
  }
}
