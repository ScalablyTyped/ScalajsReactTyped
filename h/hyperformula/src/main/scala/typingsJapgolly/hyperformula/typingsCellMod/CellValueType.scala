package typingsJapgolly.hyperformula.typingsCellMod

import typingsJapgolly.hyperformula.typingsCellMod.CellValueJustNumber.NUMBER
import typingsJapgolly.hyperformula.typingsCellMod.CellValueNoNumber.BOOLEAN
import typingsJapgolly.hyperformula.typingsCellMod.CellValueNoNumber.EMPTY
import typingsJapgolly.hyperformula.typingsCellMod.CellValueNoNumber.ERROR
import typingsJapgolly.hyperformula.typingsCellMod.CellValueNoNumber.STRING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hyperformula.typingsCellMod.CellValueNoNumber
  - typingsJapgolly.hyperformula.typingsCellMod.CellValueJustNumber
*/
trait CellValueType extends StObject
object CellValueType {
  
  @JSImport("hyperformula/typings/Cell", "CellValueType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/Cell", "CellValueType.BOOLEAN")
  @js.native
  def BOOLEAN: typingsJapgolly.hyperformula.typingsCellMod.CellValueNoNumber.BOOLEAN = js.native
  inline def BOOLEAN_=(x: BOOLEAN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula/typings/Cell", "CellValueType.EMPTY")
  @js.native
  def EMPTY: typingsJapgolly.hyperformula.typingsCellMod.CellValueNoNumber.EMPTY = js.native
  inline def EMPTY_=(x: EMPTY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula/typings/Cell", "CellValueType.ERROR")
  @js.native
  def ERROR: typingsJapgolly.hyperformula.typingsCellMod.CellValueNoNumber.ERROR = js.native
  inline def ERROR_=(x: ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula/typings/Cell", "CellValueType.NUMBER")
  @js.native
  def NUMBER: typingsJapgolly.hyperformula.typingsCellMod.CellValueJustNumber.NUMBER = js.native
  inline def NUMBER_=(x: NUMBER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula/typings/Cell", "CellValueType.STRING")
  @js.native
  def STRING: typingsJapgolly.hyperformula.typingsCellMod.CellValueNoNumber.STRING = js.native
  inline def STRING_=(x: STRING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
}
