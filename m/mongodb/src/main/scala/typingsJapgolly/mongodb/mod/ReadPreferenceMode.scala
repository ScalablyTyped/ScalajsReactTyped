package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbStrings.nearest
  - typingsJapgolly.mongodb.mongodbStrings.primary
  - typingsJapgolly.mongodb.mongodbStrings.primaryPreferred
  - typingsJapgolly.mongodb.mongodbStrings.secondary
  - typingsJapgolly.mongodb.mongodbStrings.secondaryPreferred
*/
trait ReadPreferenceMode
  extends StObject
     with ReadPreferenceLike
/* Inlined std.Readonly<{ readonly primary :'primary',  readonly primaryPreferred :'primaryPreferred',  readonly secondary :'secondary',  readonly secondaryPreferred :'secondaryPreferred',  readonly nearest :'nearest'}> */
object ReadPreferenceMode {
  
  @JSImport("mongodb", "ReadPreferenceMode.nearest")
  @js.native
  val nearest: typingsJapgolly.mongodb.mongodbStrings.nearest = js.native
  
  @JSImport("mongodb", "ReadPreferenceMode.primary")
  @js.native
  val primary: typingsJapgolly.mongodb.mongodbStrings.primary = js.native
  
  @JSImport("mongodb", "ReadPreferenceMode.primaryPreferred")
  @js.native
  val primaryPreferred: typingsJapgolly.mongodb.mongodbStrings.primaryPreferred = js.native
  
  @JSImport("mongodb", "ReadPreferenceMode.secondary")
  @js.native
  val secondary: typingsJapgolly.mongodb.mongodbStrings.secondary = js.native
  
  @JSImport("mongodb", "ReadPreferenceMode.secondaryPreferred")
  @js.native
  val secondaryPreferred: typingsJapgolly.mongodb.mongodbStrings.secondaryPreferred = js.native
}
