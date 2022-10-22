package typingsJapgolly.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyTemplateText")
@js.native
open class SurveyTemplateText () extends StObject {
  
  def addText(newText: String, id: String, name: String): Unit = js.native
  
  /* protected */ def getId(id: String, questionType: String): String = js.native
  
  def replaceText(replaceText: String, id: String): Unit = js.native
  def replaceText(replaceText: String, id: String, questionType: String): Unit = js.native
  
  /* protected */ def text: String = js.native
  /* protected */ def text_=(`val`: String): Unit = js.native
}
