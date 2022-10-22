package typingsJapgolly.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeData extends StObject {
  
  /* private */ @JSName("Access.CodeData_typekey")
  var AccessDotCodeData_typekey: CodeData
  
  def AllDatabaseDiagrams(var_0: String): AccessObject
  def AllDatabaseDiagrams(var_0: Double): AccessObject
  @JSName("AllDatabaseDiagrams")
  val AllDatabaseDiagrams_Original: AccessObjects
  
  def AllFunctions(var_0: String): AccessObject
  def AllFunctions(var_0: Double): AccessObject
  @JSName("AllFunctions")
  val AllFunctions_Original: AccessObjects
  
  def AllQueries(var_0: String): AccessObject
  def AllQueries(var_0: Double): AccessObject
  @JSName("AllQueries")
  val AllQueries_Original: AccessObjects
  
  def AllStoredProcedures(var_0: String): AccessObject
  def AllStoredProcedures(var_0: Double): AccessObject
  @JSName("AllStoredProcedures")
  val AllStoredProcedures_Original: AccessObjects
  
  def AllTables(var_0: String): AccessObject
  def AllTables(var_0: Double): AccessObject
  @JSName("AllTables")
  val AllTables_Original: AccessObjects
  
  def AllViews(var_0: String): AccessObject
  def AllViews(var_0: Double): AccessObject
  @JSName("AllViews")
  val AllViews_Original: AccessObjects
  
  def IsMemberSafe(dispid: Double): Boolean
}
object CodeData {
  
  inline def apply(
    AccessDotCodeData_typekey: CodeData,
    AllDatabaseDiagrams: AccessObjects,
    AllFunctions: AccessObjects,
    AllQueries: AccessObjects,
    AllStoredProcedures: AccessObjects,
    AllTables: AccessObjects,
    AllViews: AccessObjects,
    IsMemberSafe: Double => Boolean
  ): CodeData = {
    val __obj = js.Dynamic.literal(AllDatabaseDiagrams = AllDatabaseDiagrams.asInstanceOf[js.Any], AllFunctions = AllFunctions.asInstanceOf[js.Any], AllQueries = AllQueries.asInstanceOf[js.Any], AllStoredProcedures = AllStoredProcedures.asInstanceOf[js.Any], AllTables = AllTables.asInstanceOf[js.Any], AllViews = AllViews.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe))
    __obj.updateDynamic("Access.CodeData_typekey")(AccessDotCodeData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeData]
  }
  
  extension [Self <: CodeData](x: Self) {
    
    inline def setAccessDotCodeData_typekey(value: CodeData): Self = StObject.set(x, "Access.CodeData_typekey", value.asInstanceOf[js.Any])
    
    inline def setAllDatabaseDiagrams(value: AccessObjects): Self = StObject.set(x, "AllDatabaseDiagrams", value.asInstanceOf[js.Any])
    
    inline def setAllFunctions(value: AccessObjects): Self = StObject.set(x, "AllFunctions", value.asInstanceOf[js.Any])
    
    inline def setAllQueries(value: AccessObjects): Self = StObject.set(x, "AllQueries", value.asInstanceOf[js.Any])
    
    inline def setAllStoredProcedures(value: AccessObjects): Self = StObject.set(x, "AllStoredProcedures", value.asInstanceOf[js.Any])
    
    inline def setAllTables(value: AccessObjects): Self = StObject.set(x, "AllTables", value.asInstanceOf[js.Any])
    
    inline def setAllViews(value: AccessObjects): Self = StObject.set(x, "AllViews", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
  }
}
