package typingsJapgolly.interactjsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.interactjsTypes.coreEventsMod.FakeEvent
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.all
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends StObject {
  
  def add(
    eventTarget: org.scalajs.dom.EventTarget,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener
  ): Unit = js.native
  def add(
    eventTarget: org.scalajs.dom.EventTarget,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Any
  ): Unit = js.native
  def add(
    eventTarget: org.scalajs.dom.EventTarget,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Boolean
  ): Unit = js.native
  
  def addDelegate(
    selector: String,
    context: org.scalajs.dom.Node,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener
  ): Unit = js.native
  def addDelegate(
    selector: String,
    context: org.scalajs.dom.Node,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Any
  ): Unit = js.native
  
  def delegateListener(event: org.scalajs.dom.Event): Unit = js.native
  def delegateListener(event: org.scalajs.dom.Event, optionalArg: Any): Unit = js.native
  def delegateListener(event: FakeEvent): Unit = js.native
  def delegateListener(event: FakeEvent, optionalArg: Any): Unit = js.native
  
  def delegateUseCapture(event: org.scalajs.dom.Event): Any = js.native
  def delegateUseCapture(event: FakeEvent): Any = js.native
  
  var delegatedEvents: StringDictionary[js.Array[Context]] = js.native
  
  var documents: js.Array[org.scalajs.dom.Document] = js.native
  
  def remove(eventTarget: org.scalajs.dom.EventTarget, `type`: String): Unit = js.native
  def remove(eventTarget: org.scalajs.dom.EventTarget, `type`: String, listener: Unit, optionalArg: Any): Unit = js.native
  def remove(eventTarget: org.scalajs.dom.EventTarget, `type`: String, listener: Unit, optionalArg: Boolean): Unit = js.native
  def remove(
    eventTarget: org.scalajs.dom.EventTarget,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener
  ): Unit = js.native
  def remove(
    eventTarget: org.scalajs.dom.EventTarget,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Any
  ): Unit = js.native
  def remove(
    eventTarget: org.scalajs.dom.EventTarget,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Boolean
  ): Unit = js.native
  
  def removeDelegate(selector: String, context: org.scalajs.dom.Document, `type`: String): Unit = js.native
  def removeDelegate(
    selector: String,
    context: org.scalajs.dom.Document,
    `type`: String,
    listener: Unit,
    optionalArg: Any
  ): Unit = js.native
  def removeDelegate(
    selector: String,
    context: org.scalajs.dom.Document,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener
  ): Unit = js.native
  def removeDelegate(
    selector: String,
    context: org.scalajs.dom.Document,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Any
  ): Unit = js.native
  def removeDelegate(selector: String, context: typingsJapgolly.interactjsTypes.coreTypesMod.Element, `type`: String): Unit = js.native
  def removeDelegate(
    selector: String,
    context: typingsJapgolly.interactjsTypes.coreTypesMod.Element,
    `type`: String,
    listener: Unit,
    optionalArg: Any
  ): Unit = js.native
  def removeDelegate(
    selector: String,
    context: typingsJapgolly.interactjsTypes.coreTypesMod.Element,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener
  ): Unit = js.native
  def removeDelegate(
    selector: String,
    context: typingsJapgolly.interactjsTypes.coreTypesMod.Element,
    `type`: String,
    listener: typingsJapgolly.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Any
  ): Unit = js.native
  
  @JSName("remove")
  def remove_all(eventTarget: org.scalajs.dom.EventTarget, `type`: String, listener: all): Unit = js.native
  @JSName("remove")
  def remove_all(eventTarget: org.scalajs.dom.EventTarget, `type`: String, listener: all, optionalArg: Any): Unit = js.native
  @JSName("remove")
  def remove_all(eventTarget: org.scalajs.dom.EventTarget, `type`: String, listener: all, optionalArg: Boolean): Unit = js.native
  
  var supportsOptions: Boolean = js.native
  
  var supportsPassive: Boolean = js.native
  
  var targets: js.Array[Events] = js.native
}
