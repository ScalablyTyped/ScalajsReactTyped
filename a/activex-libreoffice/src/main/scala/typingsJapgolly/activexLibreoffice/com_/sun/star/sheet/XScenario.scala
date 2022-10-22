package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a scenario sheet.
  * @see com.sun.star.sheet.Spreadsheet
  */
trait XScenario
  extends StObject
     with XInterface {
  
  /** returns `TRUE` if the current object is a scenario. */
  val IsScenario: Boolean
  
  /** returns the comment for the scenario. */
  var ScenarioComment: String
  
  /** adds more ranges to the scenario. */
  def addRanges(aRanges: SeqEquiv[CellRangeAddress]): Unit
  
  /**
    * applies the scenario.
    *
    * The contents of the scenario ranges are copied into the first non-scenario sheet which is in front of the sheet containing the scenario by itself.
    */
  @JSName("apply")
  def apply(): Unit
  
  /** returns `TRUE` if the current object is a scenario. */
  def getIsScenario(): Boolean
  
  /** returns the comment for the scenario. */
  def getScenarioComment(): String
  
  /** sets a new comment for the scenario. */
  def setScenarioComment(aScenarioComment: String): Unit
}
object XScenario {
  
  inline def apply(
    IsScenario: Boolean,
    ScenarioComment: String,
    acquire: Callback,
    addRanges: SeqEquiv[CellRangeAddress] => Callback,
    apply: Callback,
    getIsScenario: CallbackTo[Boolean],
    getScenarioComment: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setScenarioComment: String => Callback
  ): XScenario = {
    val __obj = js.Dynamic.literal(IsScenario = IsScenario.asInstanceOf[js.Any], ScenarioComment = ScenarioComment.asInstanceOf[js.Any], acquire = acquire.toJsFn, addRanges = js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => addRanges(t0).runNow()), apply = apply.toJsFn, getIsScenario = getIsScenario.toJsFn, getScenarioComment = getScenarioComment.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setScenarioComment = js.Any.fromFunction1((t0: String) => setScenarioComment(t0).runNow()))
    __obj.asInstanceOf[XScenario]
  }
  
  extension [Self <: XScenario](x: Self) {
    
    inline def setAddRanges(value: SeqEquiv[CellRangeAddress] => Callback): Self = StObject.set(x, "addRanges", js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => value(t0).runNow()))
    
    inline def setApply(value: Callback): Self = StObject.set(x, "apply", value.toJsFn)
    
    inline def setGetIsScenario(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsScenario", value.toJsFn)
    
    inline def setGetScenarioComment(value: CallbackTo[String]): Self = StObject.set(x, "getScenarioComment", value.toJsFn)
    
    inline def setIsScenario(value: Boolean): Self = StObject.set(x, "IsScenario", value.asInstanceOf[js.Any])
    
    inline def setScenarioComment(value: String): Self = StObject.set(x, "ScenarioComment", value.asInstanceOf[js.Any])
    
    inline def setSetScenarioComment(value: String => Callback): Self = StObject.set(x, "setScenarioComment", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
