package typingsJapgolly.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.surveyKnockout.mod.IShortcutText because Already inherited
- typingsJapgolly.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement
- typingsJapgolly.surveyKnockout.mod.ISurveyElement because Already inherited
- typingsJapgolly.surveyKnockout.mod.IPanel because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name, parent, shortcutText, skeletonComponentName. Inlined getChildrenLayoutType, getQuestionTitleLocation, getQuestionStartIndex, elementWidthChanged, indexOf, elements, ensureRowsVisibility
- typingsJapgolly.surveyKnockout.mod.ILocalizableOwner because Already inherited
- typingsJapgolly.surveyKnockout.mod.IMultipleTextData because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name, parent, shortcutText, skeletonComponentName. Inlined getTextProcessor, getMultipleTextValue, setMultipleTextValue, getItemDefaultValue, getIsRequiredText */ @JSImport("survey-knockout", "QuestionMultipleTextModel")
@js.native
open class QuestionMultipleTextModel protected () extends Question {
  def this(name: String) = this()
  
  def addElement(element: IElement, index: Double): Any = js.native
  @JSName("addElement")
  def addElement_Unit(element: IElement, index: Double): Unit = js.native
  
  /*
    * Add a new text item.
    */
  def addItem(name: String): MultipleTextItemModel = js.native
  def addItem(name: String, title: String): MultipleTextItemModel = js.native
  
  /*
    * The number of columns. Items are rendred in one line if the value is 0.
    */
  def colCount: Double = js.native
  
  var colCountChangedCallback: Any = js.native
  
  def colCount_=(`val`: Double): Unit = js.native
  
  /* protected */ def createTextItem(name: String, title: String): MultipleTextItemModel = js.native
  
  def elementWidthChanged(el: IElement): Any = js.native
  @JSName("elementWidthChanged")
  def elementWidthChanged_Unit(el: IElement): Unit = js.native
  
  def elements: Any = js.native
  @JSName("elements")
  var elements_FQuestionMultipleTextModel: Any = js.native
  
  def ensureRowsVisibility(): Unit = js.native
  
  def getChildrenLayoutType(): String = js.native
  
  def getIsRequiredText(): String = js.native
  
  def getItemByName(name: String): MultipleTextItemModel = js.native
  
  def getItemCss(): String = js.native
  
  def getItemDefaultValue(name: String): Any = js.native
  
  def getItemLabelCss(item: MultipleTextItemModel): String = js.native
  
  def getItemTitleCss(): String = js.native
  
  def getMultipleTextValue(name: String): Any = js.native
  
  def getQuestionStartIndex(): String = js.native
  
  def getQuestionTitleLocation(): String = js.native
  
  /*
    * Returns the list of rendered rows.
    */
  def getRows(): js.Array[Any] = js.native
  
  def getTextProcessor(): ITextProcessor = js.native
  
  def indexOf(el: IElement): Double = js.native
  
  var isMultipleItemValueChanging: Boolean = js.native
  
  /*
    * The default text input size.
    */
  def itemSize: Double = js.native
  def itemSize_=(`val`: Double): Unit = js.native
  
  /*
    * The list of input items.
    */
  def items: Any = js.native
  def items_=(`val`: Any): Unit = js.native
  
  /* protected */ def onItemValueChanged(): Unit = js.native
  
  def setMultipleTextValue(name: String, value: Any): Any = js.native
  @JSName("setMultipleTextValue")
  def setMultipleTextValue_Unit(name: String, value: Any): Unit = js.native
}
/* static members */
object QuestionMultipleTextModel {
  
  @JSImport("survey-knockout", "QuestionMultipleTextModel")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDefaultItems(question: QuestionMultipleTextModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addDefaultItems")(question.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
