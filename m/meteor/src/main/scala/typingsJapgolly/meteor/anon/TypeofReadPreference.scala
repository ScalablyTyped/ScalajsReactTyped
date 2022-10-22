package typingsJapgolly.meteor.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.meteor.meteorStrings.nearest
import typingsJapgolly.meteor.meteorStrings.primary
import typingsJapgolly.meteor.meteorStrings.primaryPreferred
import typingsJapgolly.meteor.meteorStrings.secondary
import typingsJapgolly.meteor.meteorStrings.secondaryPreferred
import typingsJapgolly.mongodb.mod.ReadPreference
import typingsJapgolly.mongodb.mod.ReadPreferenceFromOptions
import typingsJapgolly.mongodb.mod.ReadPreferenceLikeOptions
import typingsJapgolly.mongodb.mod.ReadPreferenceMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofReadPreference
  extends StObject
     with Instantiable1[/* mode */ ReadPreferenceMode, ReadPreference] {
  
  var NEAREST: nearest = js.native
  
  var PRIMARY: primary = js.native
  
  var PRIMARY_PREFERRED: primaryPreferred = js.native
  
  var SECONDARY: secondary = js.native
  
  var SECONDARY_PREFERRED: secondaryPreferred = js.native
  
  /**
    * Construct a ReadPreference given an options object.
    *
    * @param options - The options object from which to extract the read preference.
    */
  def fromOptions(): js.UndefOr[ReadPreference] = js.native
  def fromOptions(options: ReadPreferenceFromOptions): js.UndefOr[ReadPreference] = js.native
  
  def fromString(mode: String): ReadPreference = js.native
  
  /**
    * Validate if a mode is legal
    *
    * @param mode - The string representing the read preference mode.
    */
  def isValid(mode: String): Boolean = js.native
  
  var nearest: ReadPreference = js.native
  
  var primary: ReadPreference = js.native
  
  var primaryPreferred: ReadPreference = js.native
  
  var secondary: ReadPreference = js.native
  
  var secondaryPreferred: ReadPreference = js.native
  
  /**
    * Replaces options.readPreference with a ReadPreference instance
    */
  def translate(options: ReadPreferenceLikeOptions): ReadPreferenceLikeOptions = js.native
}
