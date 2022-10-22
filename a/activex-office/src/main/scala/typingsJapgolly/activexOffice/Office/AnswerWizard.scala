package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerWizard extends StObject {
  
  val Application: Any
  
  def ClearFileList(): Unit
  
  val Creator: Double
  
  def Files(Index: Double): String
  @JSName("Files")
  val Files_Original: AnswerWizardFiles
  
  /* private */ @JSName("Office.AnswerWizard_typekey")
  var OfficeDotAnswerWizard_typekey: AnswerWizard
  
  val Parent: Any
  
  def ResetFileList(): Unit
}
object AnswerWizard {
  
  inline def apply(
    Application: Any,
    ClearFileList: Callback,
    Creator: Double,
    Files: AnswerWizardFiles,
    OfficeDotAnswerWizard_typekey: AnswerWizard,
    Parent: Any,
    ResetFileList: Callback
  ): AnswerWizard = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearFileList = ClearFileList.toJsFn, Creator = Creator.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ResetFileList = ResetFileList.toJsFn)
    __obj.updateDynamic("Office.AnswerWizard_typekey")(OfficeDotAnswerWizard_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerWizard]
  }
  
  extension [Self <: AnswerWizard](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClearFileList(value: Callback): Self = StObject.set(x, "ClearFileList", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: AnswerWizardFiles): Self = StObject.set(x, "Files", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotAnswerWizard_typekey(value: AnswerWizard): Self = StObject.set(x, "Office.AnswerWizard_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setResetFileList(value: Callback): Self = StObject.set(x, "ResetFileList", value.toJsFn)
  }
}
