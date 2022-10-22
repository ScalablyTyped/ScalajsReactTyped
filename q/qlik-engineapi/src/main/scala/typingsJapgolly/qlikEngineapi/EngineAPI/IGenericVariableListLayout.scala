package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericVariableLayout width extend GenericObjectLayout
  */
trait IGenericVariableListLayout
  extends StObject
     with IGenericBaseLayout {
  
  var qVariableListObject: IVariableList
}
object IGenericVariableListLayout {
  
  inline def apply(qInfo: INxInfo, qMeta: INxMeta, qVariableListObject: IVariableList): IGenericVariableListLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qVariableListObject = qVariableListObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableListLayout]
  }
  
  extension [Self <: IGenericVariableListLayout](x: Self) {
    
    inline def setQVariableListObject(value: IVariableList): Self = StObject.set(x, "qVariableListObject", value.asInstanceOf[js.Any])
  }
}
