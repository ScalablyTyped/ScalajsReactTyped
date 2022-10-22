package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleRelationSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleSelection
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleStateSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleTable
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The accessible view of a spreadsheet document
  * @since OOo 1.1.2
  */
trait AccessibleSpreadsheet
  extends StObject
     with XAccessibleContext
     with XAccessibleComponent
     with XAccessibleTable
     with XAccessibleSelection
     with XAccessibleEventBroadcaster
object AccessibleSpreadsheet {
  
  inline def apply(
    AccessibleCaption: XAccessible,
    AccessibleChildCount: Double,
    AccessibleColumnCount: Double,
    AccessibleColumnHeaders: XAccessibleTable,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleRowCount: Double,
    AccessibleRowHeaders: XAccessibleTable,
    AccessibleStateSet: XAccessibleStateSet,
    AccessibleSummary: XAccessible,
    Background: Color,
    Bounds: Rectangle,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    SelectedAccessibleChildCount: Double,
    SelectedAccessibleColumns: SafeArray[Double],
    SelectedAccessibleRows: SafeArray[Double],
    Size: Size,
    acquire: Callback,
    addAccessibleEventListener: XAccessibleEventListener => Callback,
    clearAccessibleSelection: Callback,
    containsPoint: Point => Boolean,
    deselectAccessibleChild: Double => Callback,
    getAccessibleAtPoint: Point => XAccessible,
    getAccessibleCaption: CallbackTo[XAccessible],
    getAccessibleCellAt: (Double, Double) => XAccessible,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: CallbackTo[Double],
    getAccessibleColumn: Double => Double,
    getAccessibleColumnCount: CallbackTo[Double],
    getAccessibleColumnDescription: Double => String,
    getAccessibleColumnExtentAt: (Double, Double) => Double,
    getAccessibleColumnHeaders: CallbackTo[XAccessibleTable],
    getAccessibleDescription: CallbackTo[String],
    getAccessibleIndex: (Double, Double) => Double,
    getAccessibleIndexInParent: CallbackTo[Double],
    getAccessibleName: CallbackTo[String],
    getAccessibleParent: CallbackTo[XAccessible],
    getAccessibleRelationSet: CallbackTo[XAccessibleRelationSet],
    getAccessibleRole: CallbackTo[Double],
    getAccessibleRow: Double => Double,
    getAccessibleRowCount: CallbackTo[Double],
    getAccessibleRowDescription: Double => String,
    getAccessibleRowExtentAt: (Double, Double) => Double,
    getAccessibleRowHeaders: CallbackTo[XAccessibleTable],
    getAccessibleStateSet: CallbackTo[XAccessibleStateSet],
    getAccessibleSummary: CallbackTo[XAccessible],
    getBackground: CallbackTo[Color],
    getBounds: CallbackTo[Rectangle],
    getForeground: CallbackTo[Color],
    getLocale: CallbackTo[Locale],
    getLocation: CallbackTo[Point],
    getLocationOnScreen: CallbackTo[Point],
    getSelectedAccessibleChild: Double => XAccessible,
    getSelectedAccessibleChildCount: CallbackTo[Double],
    getSelectedAccessibleColumns: CallbackTo[SafeArray[Double]],
    getSelectedAccessibleRows: CallbackTo[SafeArray[Double]],
    getSize: CallbackTo[Size],
    grabFocus: Callback,
    isAccessibleChildSelected: Double => Boolean,
    isAccessibleColumnSelected: Double => Boolean,
    isAccessibleRowSelected: Double => Boolean,
    isAccessibleSelected: (Double, Double) => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeAccessibleEventListener: XAccessibleEventListener => Callback,
    selectAccessibleChild: Double => Callback,
    selectAllAccessibleChildren: Callback
  ): AccessibleSpreadsheet = {
    val __obj = js.Dynamic.literal(AccessibleCaption = AccessibleCaption.asInstanceOf[js.Any], AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleColumnCount = AccessibleColumnCount.asInstanceOf[js.Any], AccessibleColumnHeaders = AccessibleColumnHeaders.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleRowCount = AccessibleRowCount.asInstanceOf[js.Any], AccessibleRowHeaders = AccessibleRowHeaders.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], AccessibleSummary = AccessibleSummary.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], SelectedAccessibleChildCount = SelectedAccessibleChildCount.asInstanceOf[js.Any], SelectedAccessibleColumns = SelectedAccessibleColumns.asInstanceOf[js.Any], SelectedAccessibleRows = SelectedAccessibleRows.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, addAccessibleEventListener = js.Any.fromFunction1((t0: XAccessibleEventListener) => addAccessibleEventListener(t0).runNow()), clearAccessibleSelection = clearAccessibleSelection.toJsFn, containsPoint = js.Any.fromFunction1(containsPoint), deselectAccessibleChild = js.Any.fromFunction1((t0: Double) => deselectAccessibleChild(t0).runNow()), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleCaption = getAccessibleCaption.toJsFn, getAccessibleCellAt = js.Any.fromFunction2(getAccessibleCellAt), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = getAccessibleChildCount.toJsFn, getAccessibleColumn = js.Any.fromFunction1(getAccessibleColumn), getAccessibleColumnCount = getAccessibleColumnCount.toJsFn, getAccessibleColumnDescription = js.Any.fromFunction1(getAccessibleColumnDescription), getAccessibleColumnExtentAt = js.Any.fromFunction2(getAccessibleColumnExtentAt), getAccessibleColumnHeaders = getAccessibleColumnHeaders.toJsFn, getAccessibleDescription = getAccessibleDescription.toJsFn, getAccessibleIndex = js.Any.fromFunction2(getAccessibleIndex), getAccessibleIndexInParent = getAccessibleIndexInParent.toJsFn, getAccessibleName = getAccessibleName.toJsFn, getAccessibleParent = getAccessibleParent.toJsFn, getAccessibleRelationSet = getAccessibleRelationSet.toJsFn, getAccessibleRole = getAccessibleRole.toJsFn, getAccessibleRow = js.Any.fromFunction1(getAccessibleRow), getAccessibleRowCount = getAccessibleRowCount.toJsFn, getAccessibleRowDescription = js.Any.fromFunction1(getAccessibleRowDescription), getAccessibleRowExtentAt = js.Any.fromFunction2(getAccessibleRowExtentAt), getAccessibleRowHeaders = getAccessibleRowHeaders.toJsFn, getAccessibleStateSet = getAccessibleStateSet.toJsFn, getAccessibleSummary = getAccessibleSummary.toJsFn, getBackground = getBackground.toJsFn, getBounds = getBounds.toJsFn, getForeground = getForeground.toJsFn, getLocale = getLocale.toJsFn, getLocation = getLocation.toJsFn, getLocationOnScreen = getLocationOnScreen.toJsFn, getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = getSelectedAccessibleChildCount.toJsFn, getSelectedAccessibleColumns = getSelectedAccessibleColumns.toJsFn, getSelectedAccessibleRows = getSelectedAccessibleRows.toJsFn, getSize = getSize.toJsFn, grabFocus = grabFocus.toJsFn, isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), isAccessibleColumnSelected = js.Any.fromFunction1(isAccessibleColumnSelected), isAccessibleRowSelected = js.Any.fromFunction1(isAccessibleRowSelected), isAccessibleSelected = js.Any.fromFunction2(isAccessibleSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAccessibleEventListener = js.Any.fromFunction1((t0: XAccessibleEventListener) => removeAccessibleEventListener(t0).runNow()), selectAccessibleChild = js.Any.fromFunction1((t0: Double) => selectAccessibleChild(t0).runNow()), selectAllAccessibleChildren = selectAllAccessibleChildren.toJsFn)
    __obj.asInstanceOf[AccessibleSpreadsheet]
  }
}
