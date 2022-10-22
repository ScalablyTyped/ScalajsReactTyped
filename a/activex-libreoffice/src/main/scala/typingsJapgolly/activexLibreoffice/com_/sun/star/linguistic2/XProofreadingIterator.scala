package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XFlatParagraph
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XFlatParagraphIteratorProvider
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * API for the proofreading iterator that mediates between the document and the proofreader.
  * @since OOo 3.0.1
  */
trait XProofreadingIterator
  extends StObject
     with XInterface {
  
  /**
    * start proofreading from a given position
    * @param xDocument the document.
    * @param xFlatParagraph the single flat paragraph to be checked.
    * @param aText the text of the paragraph to be checked.
    * @param aLocale currently unused parameter.
    * @param nStartOfSentencePosition the start position of the current sentence.
    * @param nSuggestedBehindEndOfSentencePosition currently unused parameter.
    * @param nErrorPositionInParagraph the given index.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def checkSentenceAtPosition(
    xDocument: XInterface,
    xFlatParagraph: XFlatParagraph,
    aText: String,
    aLocale: Locale,
    nStartOfSentencePosition: Double,
    nSuggestedBehindEndOfSentencePosition: Double,
    nErrorPositionInParagraph: Double
  ): ProofreadingResult
  
  /**
    * checks if the given document is currently being checked
    * @param xDocument the document.
    * @returns if the document is currently being checked.
    */
  def isProofreading(xDocument: XInterface): Boolean
  
  /** clears the list of ignored rules for each proofreader */
  def resetIgnoreRules(): Unit
  
  /**
    * start proofreading and automatically process the whole text
    * @param xDocument the text document.
    * @param xIteratorProvider the flat paragraph iterator provider.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def startProofreading(xDocument: XInterface, xIteratorProvider: XFlatParagraphIteratorProvider): Unit
}
object XProofreadingIterator {
  
  inline def apply(
    acquire: Callback,
    checkSentenceAtPosition: (XInterface, XFlatParagraph, String, Locale, Double, Double, Double) => ProofreadingResult,
    isProofreading: XInterface => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    resetIgnoreRules: Callback,
    startProofreading: (XInterface, XFlatParagraphIteratorProvider) => Callback
  ): XProofreadingIterator = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, checkSentenceAtPosition = js.Any.fromFunction7(checkSentenceAtPosition), isProofreading = js.Any.fromFunction1(isProofreading), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, resetIgnoreRules = resetIgnoreRules.toJsFn, startProofreading = js.Any.fromFunction2((t0: XInterface, t1: XFlatParagraphIteratorProvider) => (startProofreading(t0, t1)).runNow()))
    __obj.asInstanceOf[XProofreadingIterator]
  }
  
  extension [Self <: XProofreadingIterator](x: Self) {
    
    inline def setCheckSentenceAtPosition(value: (XInterface, XFlatParagraph, String, Locale, Double, Double, Double) => ProofreadingResult): Self = StObject.set(x, "checkSentenceAtPosition", js.Any.fromFunction7(value))
    
    inline def setIsProofreading(value: XInterface => Boolean): Self = StObject.set(x, "isProofreading", js.Any.fromFunction1(value))
    
    inline def setResetIgnoreRules(value: Callback): Self = StObject.set(x, "resetIgnoreRules", value.toJsFn)
    
    inline def setStartProofreading(value: (XInterface, XFlatParagraphIteratorProvider) => Callback): Self = StObject.set(x, "startProofreading", js.Any.fromFunction2((t0: XInterface, t1: XFlatParagraphIteratorProvider) => (value(t0, t1)).runNow()))
  }
}
