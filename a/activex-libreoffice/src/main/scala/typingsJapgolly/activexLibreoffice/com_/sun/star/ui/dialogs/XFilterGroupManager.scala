package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.StringPair
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies an interface which allows manipulation of groups of filters for the {@link FilePicker} service. */
trait XFilterGroupManager
  extends StObject
     with XInterface {
  
  /**
    * Appends a group of filters to the current filter list.
    *
    * It is implementation dependent how the filter groups are presented to the user. ;  It is not even guaranteed that the groups are visualized:
    * implementations are free to simply append all the filters separately, with ignoring the group title.
    * @param sGroupTitle The title of the filter group. Usually, the caller should localize this title, as it is to be presented to the user.
    * @param aFilters The filters which form a group. Every filter consists of two strings, where the first one is a display name (as for sGroupTitle, it hold
    * @see com.sun.star.ui.dialogs.XFilterManager
    * @see com.sun.star.ui.dialogs.FilePicker
    * @throws com::sun::star::lang::IllegalArgumentException if one or more filters in the given filter list already exist.
    */
  def appendFilterGroup(sGroupTitle: String, aFilters: SeqEquiv[StringPair]): Unit
}
object XFilterGroupManager {
  
  inline def apply(
    acquire: Callback,
    appendFilterGroup: (String, SeqEquiv[StringPair]) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XFilterGroupManager = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, appendFilterGroup = js.Any.fromFunction2((t0: String, t1: SeqEquiv[StringPair]) => (appendFilterGroup(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFilterGroupManager]
  }
  
  extension [Self <: XFilterGroupManager](x: Self) {
    
    inline def setAppendFilterGroup(value: (String, SeqEquiv[StringPair]) => Callback): Self = StObject.set(x, "appendFilterGroup", js.Any.fromFunction2((t0: String, t1: SeqEquiv[StringPair]) => (value(t0, t1)).runNow()))
  }
}
