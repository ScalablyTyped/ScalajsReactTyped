package typingsJapgolly.antlr4Autosuggest

import typingsJapgolly.antlr4Autosuggest.mod.CasePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object antlr4AutosuggestStrings {
  @js.native
  sealed trait BOTH extends CasePreference
  
  @js.native
  sealed trait LOWER extends CasePreference
  
  @js.native
  sealed trait UPPER extends CasePreference
  
  @scala.inline
  def BOTH: BOTH = "BOTH".asInstanceOf[BOTH]
  @scala.inline
  def LOWER: LOWER = "LOWER".asInstanceOf[LOWER]
  @scala.inline
  def UPPER: UPPER = "UPPER".asInstanceOf[UPPER]
}

