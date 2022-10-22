package typingsJapgolly.sharepoint

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.sharepoint.anon.Left
import typingsJapgolly.sharepoint.anon.LeftTop
import typingsJapgolly.sharepoint.anon.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MQueryResultSetElements
  extends StObject
     with MQueryResultSet[HTMLElement] {
  
  def addClass(classNames: String): MQueryResultSetElements = js.native
  
  def append(node: String): MQueryResultSetElements = js.native
  def append(node: HTMLElement): MQueryResultSetElements = js.native
  def append(node: MQueryResultSetElements): MQueryResultSetElements = js.native
  
  def attr(attributeName: String): String = js.native
  // tslint:disable-next-line: unified-signatures
  def attr(attributeName: String, func: js.Function2[/* index */ Double, /* attr */ Any, Any]): MQueryResultSetElements = js.native
  def attr(attributeName: String, valueOrDelegate: Any): MQueryResultSetElements = js.native
  def attr(map: StringDictionary[Any]): MQueryResultSetElements = js.native
  
  def bind(eventType: String, handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def blur(): MQueryResultSetElements = js.native
  def blur(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def change(): MQueryResultSetElements = js.native
  def change(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def children(): MQueryResultSetElements = js.native
  def children(selector: String): MQueryResultSetElements = js.native
  
  def click(): MQueryResultSetElements = js.native
  def click(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def closest(selector: String): MQueryResultSetElements = js.native
  def closest(selector: String, context: Any): MQueryResultSetElements = js.native
  
  def css(properties: Any): MQueryResultSetElements = js.native
  def css(propertyName: String): String = js.native
  def css(propertyName: String, value: Any): MQueryResultSetElements = js.native
  def css(propertyName: js.Array[String]): String = js.native
  def css(propertyName: Any, value: Any): MQueryResultSetElements = js.native
  
  def data(key: String): Any = js.native
  def data(key: String, value: Any): MQueryResultSetElements = js.native
  def data(obj: StringDictionary[Any]): MQueryResultSetElements = js.native
  
  def dblclick(): MQueryResultSetElements = js.native
  def dblclick(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def detach(): MQueryResultSetElements = js.native
  
  def empty(): MQueryResultSetElements = js.native
  
  def error(): MQueryResultSetElements = js.native
  def error(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def filter(selector: String): MQueryResultSetElements = js.native
  
  def find(selector: String): MQueryResultSetElements = js.native
  
  def first(): MQueryResultSetElements = js.native
  
  def focus(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def focusin(): MQueryResultSetElements = js.native
  def focusin(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def focusout(): MQueryResultSetElements = js.native
  def focusout(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def keydown(): MQueryResultSetElements = js.native
  def keydown(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def keypress(): MQueryResultSetElements = js.native
  def keypress(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def keyup(): MQueryResultSetElements = js.native
  def keyup(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def load(): MQueryResultSetElements = js.native
  def load(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def map(): MQueryResultSetElements = js.native
  
  def mousedown(): MQueryResultSetElements = js.native
  def mousedown(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def mouseenter(): MQueryResultSetElements = js.native
  def mouseenter(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def mouseleave(): MQueryResultSetElements = js.native
  def mouseleave(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def mousemove(): MQueryResultSetElements = js.native
  def mousemove(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def mouseout(): MQueryResultSetElements = js.native
  def mouseout(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def mouseover(): MQueryResultSetElements = js.native
  def mouseover(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def mouseup(): MQueryResultSetElements = js.native
  def mouseup(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def not(selector: String): MQueryResultSetElements = js.native
  
  def offset(): Left = js.native
  def offset(coordinates: Top): MQueryResultSetElements = js.native
  
  def offsetParent(): MQueryResultSetElements = js.native
  def offsetParent(selector: String): MQueryResultSetElements = js.native
  
  def one(eventType: String, handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def parent(): MQueryResultSetElements = js.native
  def parent(selector: String): MQueryResultSetElements = js.native
  
  def parents(): MQueryResultSetElements = js.native
  def parents(selector: String): MQueryResultSetElements = js.native
  
  def parentsUntil(): MQueryResultSetElements = js.native
  def parentsUntil(selectorOrElement: String): MQueryResultSetElements = js.native
  def parentsUntil(selectorOrElement: String, filter: String): MQueryResultSetElements = js.native
  def parentsUntil(selectorOrElement: HTMLElement): MQueryResultSetElements = js.native
  def parentsUntil(selectorOrElement: HTMLElement, filter: String): MQueryResultSetElements = js.native
  def parentsUntil(selectorOrElement: Unit, filter: String): MQueryResultSetElements = js.native
  
  def position(): LeftTop = js.native
  
  def remove(): MQueryResultSetElements = js.native
  def remove(selector: String): MQueryResultSetElements = js.native
  
  def removeClass(classNames: String): MQueryResultSetElements = js.native
  
  def removeData(key: String): MQueryResultSetElements = js.native
  
  def resize(): MQueryResultSetElements = js.native
  def resize(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def scroll(): MQueryResultSetElements = js.native
  def scroll(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def select(): MQueryResultSetElements = js.native
  def select(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def submit(): MQueryResultSetElements = js.native
  def submit(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def trigger(eventType: String): MQueryResultSetElements = js.native
  
  def unbind(eventType: String, handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
  
  def unload(): MQueryResultSetElements = js.native
  def unload(handler: js.Function1[/* eventObject */ MQueryEvent, Any]): MQueryResultSetElements = js.native
}
