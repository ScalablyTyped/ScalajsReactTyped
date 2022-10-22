package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFNamedACLType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INamedACL extends StObject {
  
  var AccessControlList: IAccessControlList
  
  def Clone(): INamedACL
  
  val GUID: String
  
  var ID: Double
  
  var Name: String
  
  val NamedACLType: MFNamedACLType
}
object INamedACL {
  
  inline def apply(
    AccessControlList: IAccessControlList,
    Clone: CallbackTo[INamedACL],
    GUID: String,
    ID: Double,
    Name: String,
    NamedACLType: MFNamedACLType
  ): INamedACL = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = Clone.toJsFn, GUID = GUID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamedACLType = NamedACLType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamedACL]
  }
  
  extension [Self <: INamedACL](x: Self) {
    
    inline def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[INamedACL]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamedACLType(value: MFNamedACLType): Self = StObject.set(x, "NamedACLType", value.asInstanceOf[js.Any])
  }
}
