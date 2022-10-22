package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedLinkInfo extends StObject {
  
  val AccessKey: String
  
  def Clone(): ISharedLinkInfo
  
  val CreatedByUser: Double
  
  val CreationTime: ITimestamp
  
  var Description: String
  
  var ExpirationTime: ITimestamp
  
  var FileVer: IFileVer
  
  var ObjVer: IObjVer
  
  def Set(ObjVer: IObjVer, FileVer: IFileVer): Unit
}
object ISharedLinkInfo {
  
  inline def apply(
    AccessKey: String,
    Clone: CallbackTo[ISharedLinkInfo],
    CreatedByUser: Double,
    CreationTime: ITimestamp,
    Description: String,
    ExpirationTime: ITimestamp,
    FileVer: IFileVer,
    ObjVer: IObjVer,
    Set: (IObjVer, IFileVer) => Callback
  ): ISharedLinkInfo = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey.asInstanceOf[js.Any], Clone = Clone.toJsFn, CreatedByUser = CreatedByUser.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], ExpirationTime = ExpirationTime.asInstanceOf[js.Any], FileVer = FileVer.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], Set = js.Any.fromFunction2((t0: IObjVer, t1: IFileVer) => (Set(t0, t1)).runNow()))
    __obj.asInstanceOf[ISharedLinkInfo]
  }
  
  extension [Self <: ISharedLinkInfo](x: Self) {
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[ISharedLinkInfo]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCreatedByUser(value: Double): Self = StObject.set(x, "CreatedByUser", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: ITimestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: ITimestamp): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setFileVer(value: IFileVer): Self = StObject.set(x, "FileVer", value.asInstanceOf[js.Any])
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (IObjVer, IFileVer) => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction2((t0: IObjVer, t1: IFileVer) => (value(t0, t1)).runNow()))
  }
}
