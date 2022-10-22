package typingsJapgolly.winrtUwp.Windows.Security.Credentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyCredentialCreationOption extends StObject
/** Represents the options for creating key credentials. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialCreationOption")
@js.native
object KeyCredentialCreationOption extends StObject {
  
  /** Fail if a key credential already exists. */
  @js.native
  sealed trait failIfExists
    extends StObject
       with KeyCredentialCreationOption
  
  /** Replace any existing key credentials. */
  @js.native
  sealed trait replaceExisting
    extends StObject
       with KeyCredentialCreationOption
}
