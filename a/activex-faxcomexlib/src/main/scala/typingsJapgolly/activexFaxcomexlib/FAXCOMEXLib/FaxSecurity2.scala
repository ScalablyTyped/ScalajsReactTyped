package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxSecurity2 Class */
trait FaxSecurity2 extends StObject {
  
  /** Security descriptor */
  var Descriptor: Any
  
  /* private */ @JSName("FAXCOMEXLib.FaxSecurity2_typekey")
  var FAXCOMEXLibDotFaxSecurity2_typekey: FaxSecurity2
  
  /** Granted rights, a bit-wise combination */
  val GrantedRights: FAX_ACCESS_RIGHTS_ENUM_2
  
  /** Security Information Type */
  var InformationType: Double
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Save the object */
  def Save(): Unit
}
object FaxSecurity2 {
  
  inline def apply(
    Descriptor: Any,
    FAXCOMEXLibDotFaxSecurity2_typekey: FaxSecurity2,
    GrantedRights: FAX_ACCESS_RIGHTS_ENUM_2,
    InformationType: Double,
    Refresh: Callback,
    Save: Callback
  ): FaxSecurity2 = {
    val __obj = js.Dynamic.literal(Descriptor = Descriptor.asInstanceOf[js.Any], GrantedRights = GrantedRights.asInstanceOf[js.Any], InformationType = InformationType.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, Save = Save.toJsFn)
    __obj.updateDynamic("FAXCOMEXLib.FaxSecurity2_typekey")(FAXCOMEXLibDotFaxSecurity2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxSecurity2]
  }
  
  extension [Self <: FaxSecurity2](x: Self) {
    
    inline def setDescriptor(value: Any): Self = StObject.set(x, "Descriptor", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxSecurity2_typekey(value: FaxSecurity2): Self = StObject.set(x, "FAXCOMEXLib.FaxSecurity2_typekey", value.asInstanceOf[js.Any])
    
    inline def setGrantedRights(value: FAX_ACCESS_RIGHTS_ENUM_2): Self = StObject.set(x, "GrantedRights", value.asInstanceOf[js.Any])
    
    inline def setInformationType(value: Double): Self = StObject.set(x, "InformationType", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
  }
}
