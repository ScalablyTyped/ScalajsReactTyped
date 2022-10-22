package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface provide methods to insert, rename and delete autotext entries from the current autotext group. */
trait XAutoTextGroup
  extends StObject
     with XNameAccess {
  
  /** returns the titles of all autotext entries. The order of the entries corresponds to the output of the function {@link getElementNames()} . */
  val Titles: SafeArray[String]
  
  /** returns the titles of all autotext entries. The order of the entries corresponds to the output of the function {@link getElementNames()} . */
  def getTitles(): SafeArray[String]
  
  /** creates a new {@link AutoTextEntry} entry. */
  def insertNewByName(aName: String, aTitle: String, xTextRange: XTextRange): XAutoTextEntry
  
  /** removes the specified autotext entry. */
  def removeByName(aEntryName: String): Unit
  
  /**
    * renames an entry in the autotext group.
    *
    * The position of the autotext entry is not changed.
    */
  def renameByName(aElementName: String, aNewElementName: String, aNewElementTitle: String): Unit
}
object XAutoTextGroup {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    Titles: SafeArray[String],
    acquire: Callback,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    getTitles: CallbackTo[SafeArray[String]],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    insertNewByName: (String, String, XTextRange) => XAutoTextEntry,
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback,
    renameByName: (String, String, String) => Callback
  ): XAutoTextGroup = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Titles = Titles.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getTitles = getTitles.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertNewByName = js.Any.fromFunction3(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), renameByName = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (renameByName(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XAutoTextGroup]
  }
  
  extension [Self <: XAutoTextGroup](x: Self) {
    
    inline def setGetTitles(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getTitles", value.toJsFn)
    
    inline def setInsertNewByName(value: (String, String, XTextRange) => XAutoTextEntry): Self = StObject.set(x, "insertNewByName", js.Any.fromFunction3(value))
    
    inline def setRemoveByName(value: String => Callback): Self = StObject.set(x, "removeByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRenameByName(value: (String, String, String) => Callback): Self = StObject.set(x, "renameByName", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setTitles(value: SafeArray[String]): Self = StObject.set(x, "Titles", value.asInstanceOf[js.Any])
  }
}
