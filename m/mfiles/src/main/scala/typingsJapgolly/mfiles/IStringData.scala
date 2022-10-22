package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFStringDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStringData extends StObject {
  
  var AsString: String
  
  def Clone(): IStringData
  
  val StringDataType: MFStringDataType
}
object IStringData {
  
  inline def apply(AsString: String, Clone: CallbackTo[IStringData], StringDataType: MFStringDataType): IStringData = {
    val __obj = js.Dynamic.literal(AsString = AsString.asInstanceOf[js.Any], Clone = Clone.toJsFn, StringDataType = StringDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringData]
  }
  
  extension [Self <: IStringData](x: Self) {
    
    inline def setAsString(value: String): Self = StObject.set(x, "AsString", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IStringData]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setStringDataType(value: MFStringDataType): Self = StObject.set(x, "StringDataType", value.asInstanceOf[js.Any])
  }
}
