package typingsJapgolly.jqueryTagsmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITagsManager extends StObject {
  
  def ajaxPolling(query: String, process: js.Function): Unit = js.native
  
  var backspace: js.Array[Double] = js.native
  
  var delimeters: js.Array[Double] = js.native
  
  def empty(): Unit = js.native
  
  def initialize(context: JQuery): Unit = js.native
  def initialize(context: JQuery, options: Unit, tagToManipulate: String): Unit = js.native
  def initialize(context: JQuery, options: ITagsManagerOptions): Unit = js.native
  def initialize(context: JQuery, options: ITagsManagerOptions, tagToManipulate: String): Unit = js.native
  
  var obj: JQuery = js.native
  
  var objName: String = js.native
  
  def onTypeaheadAjaxSuccess(data: Any, isSetTypeaheadSource: Boolean): Unit = js.native
  def onTypeaheadAjaxSuccess(data: Any, isSetTypeaheadSource: Boolean, process: js.Function): Unit = js.native
  
  def popTag(): Unit = js.native
  
  def processCommand(context: JQuery, command: String): JQuery = js.native
  def processCommand(context: JQuery, command: String, tagToManipulate: String): JQuery = js.native
  
  def processTags(): JQuery = js.native
  def processTags(command: String): JQuery = js.native
  def processTags(command: String, context: Unit, tagToManipulate: String): JQuery = js.native
  def processTags(command: String, context: JQuery): JQuery = js.native
  def processTags(command: String, context: JQuery, tagToManipulate: String): JQuery = js.native
  def processTags(command: Unit, context: Unit, tagToManipulate: String): JQuery = js.native
  def processTags(command: Unit, context: JQuery): JQuery = js.native
  def processTags(command: Unit, context: JQuery, tagToManipulate: String): JQuery = js.native
  
  def pushTag(tag: String, objToPush: Any, isValid: Boolean): Unit = js.native
  
  var queuedTag: String = js.native
  
  def refreshHiddenTagList(): Unit = js.native
  
  def setContext(context: JQuery): Unit = js.native
  def setContext(context: JQuery, tagToManipulate: String): Unit = js.native
  
  def setOptions(options: ITagsManagerOptions): Unit = js.native
  
  def setTypeaheadSource(source: Any): Unit = js.native
  
  def setupTypeahead(): Unit = js.native
  
  def spliceTag(tagId: Double, eventData: Any): Unit = js.native
  
  var tagManagerOptions: ITagsManagerOptions = js.native
  
  var tagToManipulate: String = js.native
  
  def trimTag(tag: String): String = js.native
}
