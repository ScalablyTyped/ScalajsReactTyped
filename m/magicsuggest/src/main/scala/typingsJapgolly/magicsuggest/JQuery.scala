package typingsJapgolly.magicsuggest

import typingsJapgolly.magicsuggest.MagicSuggest.Configuration
import typingsJapgolly.magicsuggest.MagicSuggest.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Initialize MagicSuggest on this selector
    */
  def magicSuggest(): Instance = js.native
  def magicSuggest(configurationObject: Configuration): Instance = js.native
}
