package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the text of a component and makes it possible to register event listeners. */
trait XTextComponent
  extends StObject
     with XInterface {
  
  /** returns the currently set maximum text length. */
  var MaxTextLen: Double
  
  /** returns the currently selected text. */
  val SelectedText: String
  
  /** returns the current user selection. */
  var Selection: typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Selection
  
  /** returns the text of the component. */
  var Text: String
  
  /** registers a text event listener. */
  def addTextListener(l: XTextListener): Unit
  
  /** returns the currently set maximum text length. */
  def getMaxTextLen(): Double
  
  /** returns the currently selected text. */
  def getSelectedText(): String
  
  /** returns the current user selection. */
  def getSelection(): Selection
  
  /** returns the text of the component. */
  def getText(): String
  
  /** inserts text at the specified position. */
  def insertText(Sel: Selection, Text: String): Unit
  
  /** returns if the text is editable by the user. */
  def isEditable(): Boolean
  
  /** unregisters a text event listener. */
  def removeTextListener(l: XTextListener): Unit
  
  /** makes the text editable for the user or read-only. */
  def setEditable(bEditable: Boolean): Unit
  
  /** sets the maximum text length. */
  def setMaxTextLen(nLen: Double): Unit
  
  /** sets the user selection. */
  def setSelection(aSelection: Selection): Unit
  
  /** sets the text of the component. */
  def setText(aText: String): Unit
}
object XTextComponent {
  
  inline def apply(
    MaxTextLen: Double,
    SelectedText: String,
    Selection: Selection,
    Text: String,
    acquire: Callback,
    addTextListener: XTextListener => Callback,
    getMaxTextLen: CallbackTo[Double],
    getSelectedText: CallbackTo[String],
    getSelection: CallbackTo[Selection],
    getText: CallbackTo[String],
    insertText: (Selection, String) => Callback,
    isEditable: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeTextListener: XTextListener => Callback,
    setEditable: Boolean => Callback,
    setMaxTextLen: Double => Callback,
    setSelection: Selection => Callback,
    setText: String => Callback
  ): XTextComponent = {
    val __obj = js.Dynamic.literal(MaxTextLen = MaxTextLen.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = acquire.toJsFn, addTextListener = js.Any.fromFunction1((t0: XTextListener) => addTextListener(t0).runNow()), getMaxTextLen = getMaxTextLen.toJsFn, getSelectedText = getSelectedText.toJsFn, getSelection = getSelection.toJsFn, getText = getText.toJsFn, insertText = js.Any.fromFunction2((t0: Selection, t1: String) => (insertText(t0, t1)).runNow()), isEditable = isEditable.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTextListener = js.Any.fromFunction1((t0: XTextListener) => removeTextListener(t0).runNow()), setEditable = js.Any.fromFunction1((t0: Boolean) => setEditable(t0).runNow()), setMaxTextLen = js.Any.fromFunction1((t0: Double) => setMaxTextLen(t0).runNow()), setSelection = js.Any.fromFunction1((t0: Selection) => setSelection(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()))
    __obj.asInstanceOf[XTextComponent]
  }
  
  extension [Self <: XTextComponent](x: Self) {
    
    inline def setAddTextListener(value: XTextListener => Callback): Self = StObject.set(x, "addTextListener", js.Any.fromFunction1((t0: XTextListener) => value(t0).runNow()))
    
    inline def setGetMaxTextLen(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxTextLen", value.toJsFn)
    
    inline def setGetSelectedText(value: CallbackTo[String]): Self = StObject.set(x, "getSelectedText", value.toJsFn)
    
    inline def setGetSelection(value: CallbackTo[Selection]): Self = StObject.set(x, "getSelection", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setInsertText(value: (Selection, String) => Callback): Self = StObject.set(x, "insertText", js.Any.fromFunction2((t0: Selection, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setIsEditable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEditable", value.toJsFn)
    
    inline def setMaxTextLen(value: Double): Self = StObject.set(x, "MaxTextLen", value.asInstanceOf[js.Any])
    
    inline def setRemoveTextListener(value: XTextListener => Callback): Self = StObject.set(x, "removeTextListener", js.Any.fromFunction1((t0: XTextListener) => value(t0).runNow()))
    
    inline def setSelectedText(value: String): Self = StObject.set(x, "SelectedText", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
    
    inline def setSetEditable(value: Boolean => Callback): Self = StObject.set(x, "setEditable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetMaxTextLen(value: Double => Callback): Self = StObject.set(x, "setMaxTextLen", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSelection(value: Selection => Callback): Self = StObject.set(x, "setSelection", js.Any.fromFunction1((t0: Selection) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
