package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxActivityLogging Class */
trait FaxActivityLogging extends StObject {
  
  /** Activity log database files path */
  var DatabasePath: String
  
  /* private */ @JSName("FAXCOMEXLib.FaxActivityLogging_typekey")
  var FAXCOMEXLibDotFaxActivityLogging_typekey: FaxActivityLogging
  
  /** Does the server log incoming fax activity */
  var LogIncoming: Boolean
  
  /** Does the server log outgoing fax activity */
  var LogOutgoing: Boolean
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Save the object */
  def Save(): Unit
}
object FaxActivityLogging {
  
  inline def apply(
    DatabasePath: String,
    FAXCOMEXLibDotFaxActivityLogging_typekey: FaxActivityLogging,
    LogIncoming: Boolean,
    LogOutgoing: Boolean,
    Refresh: Callback,
    Save: Callback
  ): FaxActivityLogging = {
    val __obj = js.Dynamic.literal(DatabasePath = DatabasePath.asInstanceOf[js.Any], LogIncoming = LogIncoming.asInstanceOf[js.Any], LogOutgoing = LogOutgoing.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, Save = Save.toJsFn)
    __obj.updateDynamic("FAXCOMEXLib.FaxActivityLogging_typekey")(FAXCOMEXLibDotFaxActivityLogging_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxActivityLogging]
  }
  
  extension [Self <: FaxActivityLogging](x: Self) {
    
    inline def setDatabasePath(value: String): Self = StObject.set(x, "DatabasePath", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxActivityLogging_typekey(value: FaxActivityLogging): Self = StObject.set(x, "FAXCOMEXLib.FaxActivityLogging_typekey", value.asInstanceOf[js.Any])
    
    inline def setLogIncoming(value: Boolean): Self = StObject.set(x, "LogIncoming", value.asInstanceOf[js.Any])
    
    inline def setLogOutgoing(value: Boolean): Self = StObject.set(x, "LogOutgoing", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
  }
}
