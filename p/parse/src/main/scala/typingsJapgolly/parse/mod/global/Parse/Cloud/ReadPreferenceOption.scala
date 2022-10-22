package typingsJapgolly.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadPreferenceOption extends StObject
// Read preference describes how MongoDB driver route read operations to the members of a replica set.
@JSGlobal("Parse.Cloud.ReadPreferenceOption")
@js.native
object ReadPreferenceOption extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReadPreferenceOption & String] = js.native
  
  @js.native
  sealed trait Nearest
    extends StObject
       with ReadPreferenceOption
  /* "NEAREST" */ val Nearest: typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Nearest & String = js.native
  
  @js.native
  sealed trait Primary
    extends StObject
       with ReadPreferenceOption
  /* "PRIMARY" */ val Primary: typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Primary & String = js.native
  
  @js.native
  sealed trait PrimaryPreferred
    extends StObject
       with ReadPreferenceOption
  /* "PRIMARY_PREFERRED" */ val PrimaryPreferred: typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption.PrimaryPreferred & String = js.native
  
  @js.native
  sealed trait Secondary
    extends StObject
       with ReadPreferenceOption
  /* "SECONDARY" */ val Secondary: typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Secondary & String = js.native
  
  @js.native
  sealed trait SecondaryPreferred
    extends StObject
       with ReadPreferenceOption
  /* "SECONDARY_PREFERRED" */ val SecondaryPreferred: typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption.SecondaryPreferred & String = js.native
}
