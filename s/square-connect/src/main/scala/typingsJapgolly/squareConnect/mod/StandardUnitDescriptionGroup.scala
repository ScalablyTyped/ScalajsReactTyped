package typingsJapgolly.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "StandardUnitDescriptionGroup")
@js.native
open class StandardUnitDescriptionGroup () extends StObject {
  
  /**
    * IETF language tag.
    */
  var language_code: js.UndefOr[String] = js.native
  
  /**
    * List of standard (non-custom) measurement units in this description group.
    */
  var standard_unit_descriptions: js.UndefOr[js.Array[StandardUnitDescription]] = js.native
}
