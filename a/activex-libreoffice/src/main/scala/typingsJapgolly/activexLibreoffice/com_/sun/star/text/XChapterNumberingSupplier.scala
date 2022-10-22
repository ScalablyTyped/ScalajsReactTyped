package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains the settings of the chapter numbering in a text document. */
trait XChapterNumberingSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of numbering rules for this document.  This interface allows access to the properties of the numbering level via a sequence of {@l */
  val ChapterNumberingRules: XIndexReplace
  
  /** @returns the collection of numbering rules for this document.  This interface allows access to the properties of the numbering level via a sequence of {@l */
  def getChapterNumberingRules(): XIndexReplace
}
object XChapterNumberingSupplier {
  
  inline def apply(
    ChapterNumberingRules: XIndexReplace,
    acquire: Callback,
    getChapterNumberingRules: CallbackTo[XIndexReplace],
    queryInterface: `type` => Any,
    release: Callback
  ): XChapterNumberingSupplier = {
    val __obj = js.Dynamic.literal(ChapterNumberingRules = ChapterNumberingRules.asInstanceOf[js.Any], acquire = acquire.toJsFn, getChapterNumberingRules = getChapterNumberingRules.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XChapterNumberingSupplier]
  }
  
  extension [Self <: XChapterNumberingSupplier](x: Self) {
    
    inline def setChapterNumberingRules(value: XIndexReplace): Self = StObject.set(x, "ChapterNumberingRules", value.asInstanceOf[js.Any])
    
    inline def setGetChapterNumberingRules(value: CallbackTo[XIndexReplace]): Self = StObject.set(x, "getChapterNumberingRules", value.toJsFn)
  }
}
