package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentInspector extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val Description: String
  
  def Fix(Status: MsoDocInspectorStatus, Results: String): Unit
  
  def Inspect(Status: MsoDocInspectorStatus, Results: String): Unit
  
  val Name: String
  
  /* private */ @JSName("Office.DocumentInspector_typekey")
  var OfficeDotDocumentInspector_typekey: DocumentInspector
  
  val Parent: Any
}
object DocumentInspector {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Description: String,
    Fix: (MsoDocInspectorStatus, String) => Callback,
    Inspect: (MsoDocInspectorStatus, String) => Callback,
    Name: String,
    OfficeDotDocumentInspector_typekey: DocumentInspector,
    Parent: Any
  ): DocumentInspector = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Fix = js.Any.fromFunction2((t0: MsoDocInspectorStatus, t1: String) => (Fix(t0, t1)).runNow()), Inspect = js.Any.fromFunction2((t0: MsoDocInspectorStatus, t1: String) => (Inspect(t0, t1)).runNow()), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.DocumentInspector_typekey")(OfficeDotDocumentInspector_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInspector]
  }
  
  extension [Self <: DocumentInspector](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setFix(value: (MsoDocInspectorStatus, String) => Callback): Self = StObject.set(x, "Fix", js.Any.fromFunction2((t0: MsoDocInspectorStatus, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setInspect(value: (MsoDocInspectorStatus, String) => Callback): Self = StObject.set(x, "Inspect", js.Any.fromFunction2((t0: MsoDocInspectorStatus, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotDocumentInspector_typekey(value: DocumentInspector): Self = StObject.set(x, "Office.DocumentInspector_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
