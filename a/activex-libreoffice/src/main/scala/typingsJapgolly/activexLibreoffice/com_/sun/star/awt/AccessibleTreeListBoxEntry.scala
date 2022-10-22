package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.AccessibleContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.TextSegment
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleAction
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleKeyBinding
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleRelationSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleSelection
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleStateSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleText
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies accessibility support for a treelistbox entry.
  * @see com.sun.star.accessibility.AccessibleContext
  * @see com.sun.star.accessibility.XAccessibleAction
  * @see com.sun.star.accessibility.XAccessibleSelection
  * @see com.sun.star.accessibility.XAccessibleText
  * @since OOo 1.1.2
  */
trait AccessibleTreeListBoxEntry
  extends StObject
     with AccessibleContext
     with XAccessibleComponent
     with XAccessibleAction
     with XAccessibleSelection
     with XAccessibleText
object AccessibleTreeListBoxEntry {
  
  inline def apply(
    AccessibleActionCount: Double,
    AccessibleChildCount: Double,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleStateSet: XAccessibleStateSet,
    Background: Color,
    Bounds: Rectangle,
    CaretPosition: Double,
    CharacterCount: Double,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    SelectedAccessibleChildCount: Double,
    SelectedText: String,
    SelectionEnd: Double,
    SelectionStart: Double,
    Size: Size,
    Text: String,
    acquire: Callback,
    addAccessibleEventListener: XAccessibleEventListener => Callback,
    clearAccessibleSelection: Callback,
    containsPoint: Point => Boolean,
    copyText: (Double, Double) => Boolean,
    deselectAccessibleChild: Double => Callback,
    doAccessibleAction: Double => Boolean,
    getAccessibleActionCount: CallbackTo[Double],
    getAccessibleActionDescription: Double => String,
    getAccessibleActionKeyBinding: Double => XAccessibleKeyBinding,
    getAccessibleAtPoint: Point => XAccessible,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: CallbackTo[Double],
    getAccessibleDescription: CallbackTo[String],
    getAccessibleIndexInParent: CallbackTo[Double],
    getAccessibleName: CallbackTo[String],
    getAccessibleParent: CallbackTo[XAccessible],
    getAccessibleRelationSet: CallbackTo[XAccessibleRelationSet],
    getAccessibleRole: CallbackTo[Double],
    getAccessibleStateSet: CallbackTo[XAccessibleStateSet],
    getBackground: CallbackTo[Color],
    getBounds: CallbackTo[Rectangle],
    getCaretPosition: CallbackTo[Double],
    getCharacter: Double => String,
    getCharacterAttributes: (Double, SeqEquiv[String]) => SafeArray[PropertyValue],
    getCharacterBounds: Double => Rectangle,
    getCharacterCount: CallbackTo[Double],
    getForeground: CallbackTo[Color],
    getIndexAtPoint: Point => Double,
    getLocale: CallbackTo[Locale],
    getLocation: CallbackTo[Point],
    getLocationOnScreen: CallbackTo[Point],
    getSelectedAccessibleChild: Double => XAccessible,
    getSelectedAccessibleChildCount: CallbackTo[Double],
    getSelectedText: CallbackTo[String],
    getSelectionEnd: CallbackTo[Double],
    getSelectionStart: CallbackTo[Double],
    getSize: CallbackTo[Size],
    getText: CallbackTo[String],
    getTextAtIndex: (Double, Double) => TextSegment,
    getTextBeforeIndex: (Double, Double) => TextSegment,
    getTextBehindIndex: (Double, Double) => TextSegment,
    getTextRange: (Double, Double) => String,
    grabFocus: Callback,
    isAccessibleChildSelected: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeAccessibleEventListener: XAccessibleEventListener => Callback,
    selectAccessibleChild: Double => Callback,
    selectAllAccessibleChildren: Callback,
    setCaretPosition: Double => Boolean,
    setSelection: (Double, Double) => Boolean
  ): AccessibleTreeListBoxEntry = {
    val __obj = js.Dynamic.literal(AccessibleActionCount = AccessibleActionCount.asInstanceOf[js.Any], AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], CaretPosition = CaretPosition.asInstanceOf[js.Any], CharacterCount = CharacterCount.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], SelectedAccessibleChildCount = SelectedAccessibleChildCount.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], SelectionEnd = SelectionEnd.asInstanceOf[js.Any], SelectionStart = SelectionStart.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = acquire.toJsFn, addAccessibleEventListener = js.Any.fromFunction1((t0: XAccessibleEventListener) => addAccessibleEventListener(t0).runNow()), clearAccessibleSelection = clearAccessibleSelection.toJsFn, containsPoint = js.Any.fromFunction1(containsPoint), copyText = js.Any.fromFunction2(copyText), deselectAccessibleChild = js.Any.fromFunction1((t0: Double) => deselectAccessibleChild(t0).runNow()), doAccessibleAction = js.Any.fromFunction1(doAccessibleAction), getAccessibleActionCount = getAccessibleActionCount.toJsFn, getAccessibleActionDescription = js.Any.fromFunction1(getAccessibleActionDescription), getAccessibleActionKeyBinding = js.Any.fromFunction1(getAccessibleActionKeyBinding), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = getAccessibleChildCount.toJsFn, getAccessibleDescription = getAccessibleDescription.toJsFn, getAccessibleIndexInParent = getAccessibleIndexInParent.toJsFn, getAccessibleName = getAccessibleName.toJsFn, getAccessibleParent = getAccessibleParent.toJsFn, getAccessibleRelationSet = getAccessibleRelationSet.toJsFn, getAccessibleRole = getAccessibleRole.toJsFn, getAccessibleStateSet = getAccessibleStateSet.toJsFn, getBackground = getBackground.toJsFn, getBounds = getBounds.toJsFn, getCaretPosition = getCaretPosition.toJsFn, getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = getCharacterCount.toJsFn, getForeground = getForeground.toJsFn, getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getLocale = getLocale.toJsFn, getLocation = getLocation.toJsFn, getLocationOnScreen = getLocationOnScreen.toJsFn, getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = getSelectedAccessibleChildCount.toJsFn, getSelectedText = getSelectedText.toJsFn, getSelectionEnd = getSelectionEnd.toJsFn, getSelectionStart = getSelectionStart.toJsFn, getSize = getSize.toJsFn, getText = getText.toJsFn, getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), grabFocus = grabFocus.toJsFn, isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAccessibleEventListener = js.Any.fromFunction1((t0: XAccessibleEventListener) => removeAccessibleEventListener(t0).runNow()), selectAccessibleChild = js.Any.fromFunction1((t0: Double) => selectAccessibleChild(t0).runNow()), selectAllAccessibleChildren = selectAllAccessibleChildren.toJsFn, setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection))
    __obj.asInstanceOf[AccessibleTreeListBoxEntry]
  }
}
