package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains spell checking related settings.
  */
@JSGlobal("SpellingInfo")
@js.native
open class SpellingInfo ()
  extends StObject
     with typingsJapgolly.devexpressWeb.SpellingInfo {
  
  /**
    * Provides access to an array containing misspelled intervals.
    */
  /* CompleteClass */
  override val misspelledIntervals: js.Array[typingsJapgolly.devexpressWeb.MisspelledInterval] = js.native
  
  /**
    * Gets a value specifying the spell checking state.
    */
  /* CompleteClass */
  override val spellCheckerState: typingsJapgolly.devexpressWeb.SpellCheckerState = js.native
}
