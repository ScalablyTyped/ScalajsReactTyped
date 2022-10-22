package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to text blocks in a group.
  * @see com.sun.star.text.AutoTextContainer
  */
trait AutoTextGroup
  extends StObject
     with XAutoTextGroup
     with XIndexAccess
     with XNamed {
  
  /** The path to the file containing the {@link AutoTextEntry} 's in this group */
  var FilePath: String
  
  /** The title of this {@link AutoTextGroup} */
  var Title: String
}
object AutoTextGroup {
  
  inline def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    FilePath: String,
    Name: String,
    Title: String,
    Titles: SafeArray[String],
    acquire: Callback,
    getByIndex: Double => Any,
    getByName: String => Any,
    getCount: CallbackTo[Double],
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    getName: CallbackTo[String],
    getTitles: CallbackTo[SafeArray[String]],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    insertNewByName: (String, String, XTextRange) => XAutoTextEntry,
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback,
    renameByName: (String, String, String) => Callback,
    setName: String => Callback
  ): AutoTextGroup = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FilePath = FilePath.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Titles = Titles.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = getCount.toJsFn, getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getName = getName.toJsFn, getTitles = getTitles.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertNewByName = js.Any.fromFunction3(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), renameByName = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (renameByName(t0, t1, t2)).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[AutoTextGroup]
  }
  
  extension [Self <: AutoTextGroup](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "FilePath", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
