package typingsJapgolly.googlepay.google.payments.api

import typingsJapgolly.googlepay.googlepayStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported colors for the Google Pay button.
  *
  * Options:
  *
  * - `default`:
  *   A Google-selected default value. Currently black but it may change
  *   over time.
  *
  * - `black`:
  *   A black button suitable for use on white or light backgrounds.
  *
  * - `white`:
  *   A white button suitable for use on colorful backgrounds.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.default_
  - typingsJapgolly.googlepay.googlepayStrings.black
  - typingsJapgolly.googlepay.googlepayStrings.white
*/
trait ButtonColor extends StObject
object ButtonColor {
  
  inline def default: default_ = "default".asInstanceOf[default_]
  
  inline def black: typingsJapgolly.googlepay.googlepayStrings.black = "black".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.black]
  
  inline def white: typingsJapgolly.googlepay.googlepayStrings.white = "white".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.white]
}
