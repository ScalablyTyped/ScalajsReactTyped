package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.sheet.FormulaToken
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface specific to spreadsheet data provider backend. */
trait XSheetDataProvider
  extends StObject
     with XInterface {
  
  def createDataSequenceByFormulaTokens(aTokens: SeqEquiv[FormulaToken]): XDataSequence
  
  def createDataSequenceByFormulaTokensPossible(aTokens: SeqEquiv[FormulaToken]): Boolean
}
object XSheetDataProvider {
  
  inline def apply(
    acquire: Callback,
    createDataSequenceByFormulaTokens: SeqEquiv[FormulaToken] => XDataSequence,
    createDataSequenceByFormulaTokensPossible: SeqEquiv[FormulaToken] => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XSheetDataProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createDataSequenceByFormulaTokens = js.Any.fromFunction1(createDataSequenceByFormulaTokens), createDataSequenceByFormulaTokensPossible = js.Any.fromFunction1(createDataSequenceByFormulaTokensPossible), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSheetDataProvider]
  }
  
  extension [Self <: XSheetDataProvider](x: Self) {
    
    inline def setCreateDataSequenceByFormulaTokens(value: SeqEquiv[FormulaToken] => XDataSequence): Self = StObject.set(x, "createDataSequenceByFormulaTokens", js.Any.fromFunction1(value))
    
    inline def setCreateDataSequenceByFormulaTokensPossible(value: SeqEquiv[FormulaToken] => Boolean): Self = StObject.set(x, "createDataSequenceByFormulaTokensPossible", js.Any.fromFunction1(value))
  }
}
