package typingsJapgolly.ckeditor4.CKEDITOR

import typingsJapgolly.ckeditor4.CKEDITOR.dom.element
import typingsJapgolly.ckeditor4.CKEDITOR.dom.range
import typingsJapgolly.ckeditor4.CKEDITOR.dom.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait editable
  extends StObject
     with element {
  
  def attachClass(className: String): Unit = js.native
  
  def attachListener(obj: editable, eventName: String, listenerFunction: js.Function1[/* ei */ eventInfo, Unit]): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object,
    listenerData: Any
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object,
    listenerData: Any,
    priority: Double
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object,
    listenerData: Unit,
    priority: Double
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: Unit,
    listenerData: Any
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: Unit,
    listenerData: Any,
    priority: Double
  ): listenerRegistration = js.native
  def attachListener(
    obj: editable,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: Unit,
    listenerData: Unit,
    priority: Double
  ): listenerRegistration = js.native
  def attachListener(obj: event, eventName: String, listenerFunction: js.Function1[/* ei */ eventInfo, Unit]): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object,
    listenerData: Any
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object,
    listenerData: Any,
    priority: Double
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: js.Object,
    listenerData: Unit,
    priority: Double
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: Unit,
    listenerData: Any
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: Unit,
    listenerData: Any,
    priority: Double
  ): listenerRegistration = js.native
  def attachListener(
    obj: event,
    eventName: String,
    listenerFunction: js.Function1[/* ei */ eventInfo, Unit],
    scopeobj: Unit,
    listenerData: Unit,
    priority: Double
  ): listenerRegistration = js.native
  
  def changeAttr(attr: String, `val`: String): Unit = js.native
  
  def detach(): Unit = js.native
  
  var hasFocus: Boolean = js.native
  
  def insertElement(element: element): Unit = js.native
  def insertElement(element: element, range: range): Unit = js.native
  
  def insertHtml(data: String): Unit = js.native
  def insertHtml(data: String, mode: String): Unit = js.native
  def insertHtml(data: String, mode: String, range: range): Unit = js.native
  def insertHtml(data: String, mode: Unit, range: range): Unit = js.native
  
  def insertText(text: text): Unit = js.native
  
  def isInline(): Boolean = js.native
  
  def setReadOnly(isReadOnly: Boolean): Unit = js.native
  
  val status: String = js.native
}
