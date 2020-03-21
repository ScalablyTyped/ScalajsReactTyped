package typingsJapgolly.mediumEditor.MediumEditor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Range
import typingsJapgolly.mediumEditor.AnonMajor
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediumEditor
  extends // Initialization Functions
Instantiable1[/* elements */ elementType, typingsJapgolly.mediumEditor.MediumEditor.MediumEditor]
     with Instantiable2[
      /* elements */ elementType, 
      /* options */ CoreOptions, 
      typingsJapgolly.mediumEditor.MediumEditor.MediumEditor
    ] {
  // Properties
  var version: AnonMajor = js.native
  def addElements(elements: elementType): Unit = js.native
  // Helper Functions
  def checkContentChanged(): Unit = js.native
  def checkContentChanged(editable: HTMLElement): Unit = js.native
  // Selection Functions
  def checkSelection(): typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = js.native
  // Editor Action Functions
  def cleanPaste(text: String): Unit = js.native
  def createLink(opts: CreateLinkOptions): Unit = js.native
  def delay(fn: js.Function0[_]): Unit = js.native
  def destroy(): Unit = js.native
  def execAction(action: String): Boolean = js.native
  def execAction(action: String, opts: String): Boolean = js.native
  def execAction(action: String, opts: CreateLinkOptions): Boolean = js.native
  def exportSelection(): selectionObject = js.native
  def getContent(): String = js.native
  def getContent(index: Double): String = js.native
  // Static Function
  def getEditorFromElement(element: HTMLElement): typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = js.native
  def getExtensionByName(name: String): js.Any = js.native
  def getFocusedElement(): HTMLElement = js.native
  def getSelectedParentElement(): HTMLElement = js.native
  def getSelectedParentElement(range: Range): HTMLElement = js.native
  def importSelection(selectionState: selectionObject, favorLaterSelectionAnchor: Boolean): Unit = js.native
  def off(
    targets: typingsJapgolly.std.HTMLElement,
    event: String,
    listener: EventListenerOrEventListenerObject,
    useCapture: Boolean
  ): typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = js.native
  def off(
    targets: NodeList,
    event: String,
    listener: EventListenerOrEventListenerObject,
    useCapture: Boolean
  ): typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = js.native
  // Event Functions
  def on(
    targets: typingsJapgolly.std.HTMLElement,
    event: String,
    listener: EventListenerOrEventListenerObject,
    useCapture: Boolean
  ): typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = js.native
  def on(
    targets: NodeList,
    event: String,
    listener: EventListenerOrEventListenerObject,
    useCapture: Boolean
  ): typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = js.native
  def pasteHTML(html: String): Unit = js.native
  def pasteHTML(html: String, options: PasteHTMLOptions): Unit = js.native
  def queryCommandState(action: String): Boolean = js.native
  def removeElements(elements: elementType): Unit = js.native
  def resetContent(element: HTMLElement): Unit = js.native
  def restoreSelection(): Unit = js.native
  def saveSelection(): Unit = js.native
  def selectAllContents(): Unit = js.native
  def selectElement(element: HTMLElement): Unit = js.native
  def serialize(): js.Any = js.native
  def setContent(html: String): Unit = js.native
  def setContent(html: String, index: Double): Unit = js.native
  def setup(): Unit = js.native
  def startSelectionUpdates(): Unit = js.native
  def stopSelectionUpdates(): Unit = js.native
  def subscribe(name: String, listener: js.Function2[/* data */ js.Any, /* editable */ HTMLElement, Unit]): typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = js.native
  def trigger(name: String, data: js.Any, editable: HTMLElement): typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = js.native
  def unsubscribe(name: String, listener: js.Function2[/* data */ js.Any, /* editable */ HTMLElement, Unit]): typingsJapgolly.mediumEditor.MediumEditor.MediumEditor = js.native
}

