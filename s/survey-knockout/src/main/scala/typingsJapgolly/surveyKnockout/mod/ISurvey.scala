package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.File
import typingsJapgolly.surveyKnockout.AnonCanAddRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurvey
  extends ISurveyErrorOwner
     with ITextProcessor {
  var areInvisibleElementsShowing: Boolean
  var clearValueOnDisableItems: Boolean
  var currentPage: IPage
  var isDesignMode: Boolean
  var isDisplayMode: Boolean
  var isLoadingFromJson: Boolean
  var isUpdateValueTextOnTyping: Boolean
  var maxOthersLength: Double
  var maxTextLength: Double
  var pages: js.Array[IPage]
  var questionDescriptionLocation: String
  var questionErrorLocation: String
  var questionStartIndex: String
  var questionTitleLocation: String
  var questionsOrder: String
  var requiredText: String
  var storeOthersAsComment: Boolean
  def afterRenderPage(htmlElement: js.Any): js.Any
  def afterRenderPanel(panel: IElement, htmlElement: js.Any): js.Any
  def afterRenderQuestion(question: IQuestion, htmlElement: js.Any): js.Any
  def beforeSettingQuestionErrors(question: IQuestion, errors: js.Array[SurveyError]): Unit
  def clearFiles(
    name: String,
    value: js.Any,
    fileName: String,
    clearCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): js.Any
  def downloadFile(name: String, content: String, callback: js.Function2[/* status */ String, /* data */ js.Any, _]): js.Any
  def dragAndDropAllow(options: js.Any): Boolean
  def dynamicPanelAdded(question: IQuestion): js.Any
  def dynamicPanelItemValueChanged(question: IQuestion, options: js.Any): js.Any
  def dynamicPanelRemoved(question: IQuestion, panelIndex: Double, panel: IPanel): js.Any
  def getCss(): js.Any
  def getQuestionByValueNameFromArray(valueName: String, name: String, index: Double): IQuestion
  def getQuestionTitleTemplate(): String
  def getSurveyMarkdownHtml(element: Base, text: String): String
  def getUpdatedQuestionTitle(question: IQuestion, title: String): String
  def hasVisibleQuestionByValueName(valueName: String): Boolean
  def isPageStarted(page: IPage): Boolean
  def matrixAfterCellRender(question: IQuestion, options: js.Any): js.Any
  def matrixAllowRemoveRow(question: IQuestion, rowIndex: Double, row: js.Any): Boolean
  def matrixBeforeRowAdded(options: AnonCanAddRow): js.Any
  def matrixCellCreated(question: IQuestion, options: js.Any): js.Any
  def matrixCellValidate(question: IQuestion, options: js.Any): SurveyError
  def matrixCellValueChanged(question: IQuestion, options: js.Any): js.Any
  def matrixCellValueChanging(question: IQuestion, options: js.Any): js.Any
  def matrixRowAdded(question: IQuestion): js.Any
  def matrixRowRemoved(question: IQuestion, rowIndex: Double, row: js.Any): js.Any
  def pageVisibilityChanged(page: IPage, newValue: Boolean): js.Any
  def panelAdded(panel: IElement, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any
  def panelRemoved(panel: IElement): js.Any
  def panelVisibilityChanged(panel: IPanel, newValue: Boolean): js.Any
  def processHtml(html: String): String
  def questionAdded(question: IQuestion, index: Double, parentPanel: js.Any, rootPanel: js.Any): js.Any
  def questionCountByValueName(valueName: String): Double
  def questionRemoved(question: IQuestion): js.Any
  def questionRenamed(question: IQuestion, oldName: String, oldValueName: String): js.Any
  def questionVisibilityChanged(question: IQuestion, newValue: Boolean): js.Any
  def updateChoicesFromServer(question: IQuestion, choices: js.Array[_], serverResult: js.Any): js.Array[_]
  def updatePageCssClasses(panel: IPanel, cssClasses: js.Any): js.Any
  def updatePanelCssClasses(panel: IPanel, cssClasses: js.Any): js.Any
  def updateQuestionCssClasses(question: IQuestion, cssClasses: js.Any): js.Any
  def uploadFiles(
    name: String,
    files: js.Array[File],
    uploadingCallback: js.Function2[/* status */ String, /* data */ js.Any, _]
  ): js.Any
  def validatePanel(panel: IPanel): SurveyError
  def validateQuestion(question: IQuestion): SurveyError
}

object ISurvey {
  @scala.inline
  def apply(
    afterRenderPage: js.Any => CallbackTo[js.Any],
    afterRenderPanel: (IElement, js.Any) => CallbackTo[js.Any],
    afterRenderQuestion: (IQuestion, js.Any) => CallbackTo[js.Any],
    areInvisibleElementsShowing: Boolean,
    beforeSettingQuestionErrors: (IQuestion, js.Array[SurveyError]) => Callback,
    clearFiles: (String, js.Any, String, js.Function2[/* status */ String, /* data */ js.Any, js.Any]) => CallbackTo[js.Any],
    clearValueOnDisableItems: Boolean,
    currentPage: IPage,
    downloadFile: (String, String, js.Function2[/* status */ String, /* data */ js.Any, js.Any]) => CallbackTo[js.Any],
    dragAndDropAllow: js.Any => CallbackTo[Boolean],
    dynamicPanelAdded: IQuestion => CallbackTo[js.Any],
    dynamicPanelItemValueChanged: (IQuestion, js.Any) => CallbackTo[js.Any],
    dynamicPanelRemoved: (IQuestion, Double, IPanel) => CallbackTo[js.Any],
    getCss: CallbackTo[js.Any],
    getErrorCustomText: (String, SurveyError) => CallbackTo[String],
    getLocale: CallbackTo[String],
    getMarkdownHtml: String => CallbackTo[String],
    getProcessedText: String => CallbackTo[String],
    getQuestionByValueNameFromArray: (String, String, Double) => CallbackTo[IQuestion],
    getQuestionTitleTemplate: CallbackTo[String],
    getSurveyMarkdownHtml: (Base, String) => CallbackTo[String],
    getUpdatedQuestionTitle: (IQuestion, String) => CallbackTo[String],
    hasVisibleQuestionByValueName: String => CallbackTo[Boolean],
    isDesignMode: Boolean,
    isDisplayMode: Boolean,
    isLoadingFromJson: Boolean,
    isPageStarted: IPage => CallbackTo[Boolean],
    isUpdateValueTextOnTyping: Boolean,
    matrixAfterCellRender: (IQuestion, js.Any) => CallbackTo[js.Any],
    matrixAllowRemoveRow: (IQuestion, Double, js.Any) => CallbackTo[Boolean],
    matrixBeforeRowAdded: AnonCanAddRow => CallbackTo[js.Any],
    matrixCellCreated: (IQuestion, js.Any) => CallbackTo[js.Any],
    matrixCellValidate: (IQuestion, js.Any) => CallbackTo[SurveyError],
    matrixCellValueChanged: (IQuestion, js.Any) => CallbackTo[js.Any],
    matrixCellValueChanging: (IQuestion, js.Any) => CallbackTo[js.Any],
    matrixRowAdded: IQuestion => CallbackTo[js.Any],
    matrixRowRemoved: (IQuestion, Double, js.Any) => CallbackTo[js.Any],
    maxOthersLength: Double,
    maxTextLength: Double,
    pageVisibilityChanged: (IPage, Boolean) => CallbackTo[js.Any],
    pages: js.Array[IPage],
    panelAdded: (IElement, Double, js.Any, js.Any) => CallbackTo[js.Any],
    panelRemoved: IElement => CallbackTo[js.Any],
    panelVisibilityChanged: (IPanel, Boolean) => CallbackTo[js.Any],
    processHtml: String => CallbackTo[String],
    processText: (String, Boolean) => CallbackTo[String],
    processTextEx: (String, Boolean, Boolean) => CallbackTo[js.Any],
    questionAdded: (IQuestion, Double, js.Any, js.Any) => CallbackTo[js.Any],
    questionCountByValueName: String => CallbackTo[Double],
    questionDescriptionLocation: String,
    questionErrorLocation: String,
    questionRemoved: IQuestion => CallbackTo[js.Any],
    questionRenamed: (IQuestion, String, String) => CallbackTo[js.Any],
    questionStartIndex: String,
    questionTitleLocation: String,
    questionVisibilityChanged: (IQuestion, Boolean) => CallbackTo[js.Any],
    questionsOrder: String,
    requiredText: String,
    storeOthersAsComment: Boolean,
    updateChoicesFromServer: (IQuestion, js.Array[js.Any], js.Any) => CallbackTo[js.Array[js.Any]],
    updatePageCssClasses: (IPanel, js.Any) => CallbackTo[js.Any],
    updatePanelCssClasses: (IPanel, js.Any) => CallbackTo[js.Any],
    updateQuestionCssClasses: (IQuestion, js.Any) => CallbackTo[js.Any],
    uploadFiles: (String, js.Array[File], js.Function2[/* status */ String, /* data */ js.Any, js.Any]) => CallbackTo[js.Any],
    validatePanel: IPanel => CallbackTo[SurveyError],
    validateQuestion: IQuestion => CallbackTo[SurveyError]
  ): ISurvey = {
    val __obj = js.Dynamic.literal(areInvisibleElementsShowing = areInvisibleElementsShowing.asInstanceOf[js.Any], clearValueOnDisableItems = clearValueOnDisableItems.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], isDesignMode = isDesignMode.asInstanceOf[js.Any], isDisplayMode = isDisplayMode.asInstanceOf[js.Any], isLoadingFromJson = isLoadingFromJson.asInstanceOf[js.Any], isUpdateValueTextOnTyping = isUpdateValueTextOnTyping.asInstanceOf[js.Any], maxOthersLength = maxOthersLength.asInstanceOf[js.Any], maxTextLength = maxTextLength.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], questionDescriptionLocation = questionDescriptionLocation.asInstanceOf[js.Any], questionErrorLocation = questionErrorLocation.asInstanceOf[js.Any], questionStartIndex = questionStartIndex.asInstanceOf[js.Any], questionTitleLocation = questionTitleLocation.asInstanceOf[js.Any], questionsOrder = questionsOrder.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], storeOthersAsComment = storeOthersAsComment.asInstanceOf[js.Any])
    __obj.updateDynamic("afterRenderPage")(js.Any.fromFunction1((t0: js.Any) => afterRenderPage(t0).runNow()))
    __obj.updateDynamic("afterRenderPanel")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IElement, t1: js.Any) => afterRenderPanel(t0, t1).runNow()))
    __obj.updateDynamic("afterRenderQuestion")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: js.Any) => afterRenderQuestion(t0, t1).runNow()))
    __obj.updateDynamic("beforeSettingQuestionErrors")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: js.Array[typingsJapgolly.surveyKnockout.mod.SurveyError]) => beforeSettingQuestionErrors(t0, t1).runNow()))
    __obj.updateDynamic("clearFiles")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Any, t2: java.lang.String, t3: js.Function2[/* status */ java.lang.String, /* data */ js.Any, js.Any]) => clearFiles(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("downloadFile")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function2[/* status */ java.lang.String, /* data */ js.Any, js.Any]) => downloadFile(t0, t1, t2).runNow()))
    __obj.updateDynamic("dragAndDropAllow")(js.Any.fromFunction1((t0: js.Any) => dragAndDropAllow(t0).runNow()))
    __obj.updateDynamic("dynamicPanelAdded")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IQuestion) => dynamicPanelAdded(t0).runNow()))
    __obj.updateDynamic("dynamicPanelItemValueChanged")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: js.Any) => dynamicPanelItemValueChanged(t0, t1).runNow()))
    __obj.updateDynamic("dynamicPanelRemoved")(js.Any.fromFunction3((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: scala.Double, t2: typingsJapgolly.surveyKnockout.mod.IPanel) => dynamicPanelRemoved(t0, t1, t2).runNow()))
    __obj.updateDynamic("getCss")(getCss.toJsFn)
    __obj.updateDynamic("getErrorCustomText")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.surveyKnockout.mod.SurveyError) => getErrorCustomText(t0, t1).runNow()))
    __obj.updateDynamic("getLocale")(getLocale.toJsFn)
    __obj.updateDynamic("getMarkdownHtml")(js.Any.fromFunction1((t0: java.lang.String) => getMarkdownHtml(t0).runNow()))
    __obj.updateDynamic("getProcessedText")(js.Any.fromFunction1((t0: java.lang.String) => getProcessedText(t0).runNow()))
    __obj.updateDynamic("getQuestionByValueNameFromArray")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => getQuestionByValueNameFromArray(t0, t1, t2).runNow()))
    __obj.updateDynamic("getQuestionTitleTemplate")(getQuestionTitleTemplate.toJsFn)
    __obj.updateDynamic("getSurveyMarkdownHtml")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.Base, t1: java.lang.String) => getSurveyMarkdownHtml(t0, t1).runNow()))
    __obj.updateDynamic("getUpdatedQuestionTitle")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: java.lang.String) => getUpdatedQuestionTitle(t0, t1).runNow()))
    __obj.updateDynamic("hasVisibleQuestionByValueName")(js.Any.fromFunction1((t0: java.lang.String) => hasVisibleQuestionByValueName(t0).runNow()))
    __obj.updateDynamic("isPageStarted")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IPage) => isPageStarted(t0).runNow()))
    __obj.updateDynamic("matrixAfterCellRender")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: js.Any) => matrixAfterCellRender(t0, t1).runNow()))
    __obj.updateDynamic("matrixAllowRemoveRow")(js.Any.fromFunction3((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: scala.Double, t2: js.Any) => matrixAllowRemoveRow(t0, t1, t2).runNow()))
    __obj.updateDynamic("matrixBeforeRowAdded")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.AnonCanAddRow) => matrixBeforeRowAdded(t0).runNow()))
    __obj.updateDynamic("matrixCellCreated")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: js.Any) => matrixCellCreated(t0, t1).runNow()))
    __obj.updateDynamic("matrixCellValidate")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: js.Any) => matrixCellValidate(t0, t1).runNow()))
    __obj.updateDynamic("matrixCellValueChanged")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: js.Any) => matrixCellValueChanged(t0, t1).runNow()))
    __obj.updateDynamic("matrixCellValueChanging")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: js.Any) => matrixCellValueChanging(t0, t1).runNow()))
    __obj.updateDynamic("matrixRowAdded")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IQuestion) => matrixRowAdded(t0).runNow()))
    __obj.updateDynamic("matrixRowRemoved")(js.Any.fromFunction3((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: scala.Double, t2: js.Any) => matrixRowRemoved(t0, t1, t2).runNow()))
    __obj.updateDynamic("pageVisibilityChanged")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IPage, t1: scala.Boolean) => pageVisibilityChanged(t0, t1).runNow()))
    __obj.updateDynamic("panelAdded")(js.Any.fromFunction4((t0: typingsJapgolly.surveyKnockout.mod.IElement, t1: scala.Double, t2: js.Any, t3: js.Any) => panelAdded(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("panelRemoved")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IElement) => panelRemoved(t0).runNow()))
    __obj.updateDynamic("panelVisibilityChanged")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IPanel, t1: scala.Boolean) => panelVisibilityChanged(t0, t1).runNow()))
    __obj.updateDynamic("processHtml")(js.Any.fromFunction1((t0: java.lang.String) => processHtml(t0).runNow()))
    __obj.updateDynamic("processText")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => processText(t0, t1).runNow()))
    __obj.updateDynamic("processTextEx")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Boolean, t2: scala.Boolean) => processTextEx(t0, t1, t2).runNow()))
    __obj.updateDynamic("questionAdded")(js.Any.fromFunction4((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: scala.Double, t2: js.Any, t3: js.Any) => questionAdded(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("questionCountByValueName")(js.Any.fromFunction1((t0: java.lang.String) => questionCountByValueName(t0).runNow()))
    __obj.updateDynamic("questionRemoved")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IQuestion) => questionRemoved(t0).runNow()))
    __obj.updateDynamic("questionRenamed")(js.Any.fromFunction3((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: java.lang.String, t2: java.lang.String) => questionRenamed(t0, t1, t2).runNow()))
    __obj.updateDynamic("questionVisibilityChanged")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: scala.Boolean) => questionVisibilityChanged(t0, t1).runNow()))
    __obj.updateDynamic("updateChoicesFromServer")(js.Any.fromFunction3((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: js.Array[js.Any], t2: js.Any) => updateChoicesFromServer(t0, t1, t2).runNow()))
    __obj.updateDynamic("updatePageCssClasses")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IPanel, t1: js.Any) => updatePageCssClasses(t0, t1).runNow()))
    __obj.updateDynamic("updatePanelCssClasses")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IPanel, t1: js.Any) => updatePanelCssClasses(t0, t1).runNow()))
    __obj.updateDynamic("updateQuestionCssClasses")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IQuestion, t1: js.Any) => updateQuestionCssClasses(t0, t1).runNow()))
    __obj.updateDynamic("uploadFiles")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Array[org.scalajs.dom.raw.File], t2: js.Function2[/* status */ java.lang.String, /* data */ js.Any, js.Any]) => uploadFiles(t0, t1, t2).runNow()))
    __obj.updateDynamic("validatePanel")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IPanel) => validatePanel(t0).runNow()))
    __obj.updateDynamic("validateQuestion")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IQuestion) => validateQuestion(t0).runNow()))
    __obj.asInstanceOf[ISurvey]
  }
}

