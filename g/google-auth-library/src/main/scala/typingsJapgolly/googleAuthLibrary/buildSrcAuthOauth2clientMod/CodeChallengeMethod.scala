package typingsJapgolly.googleAuthLibrary.buildSrcAuthOauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CodeChallengeMethod extends StObject
@JSImport("google-auth-library/build/src/auth/oauth2client", "CodeChallengeMethod")
@js.native
object CodeChallengeMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CodeChallengeMethod & String] = js.native
  
  @js.native
  sealed trait Plain
    extends StObject
       with CodeChallengeMethod
  /* "plain" */ val Plain: typingsJapgolly.googleAuthLibrary.buildSrcAuthOauth2clientMod.CodeChallengeMethod.Plain & String = js.native
  
  @js.native
  sealed trait S256
    extends StObject
       with CodeChallengeMethod
  /* "S256" */ val S256: typingsJapgolly.googleAuthLibrary.buildSrcAuthOauth2clientMod.CodeChallengeMethod.S256 & String = js.native
}
