package typingsJapgolly.googleCloudStorage.buildSrcNodejsCommonUtilMod

import typingsJapgolly.googleAuthLibrary.buildSrcAuthAuthclientMod.AuthClient
import typingsJapgolly.googleAuthLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typingsJapgolly.googleAuthLibrary.mod.GoogleAuth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeAuthenticatedRequest extends StObject {
  
  def apply(reqOpts: DecorateRequestOptions): Unit | Abortable = js.native
  def apply(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit | Abortable = js.native
  def apply(reqOpts: DecorateRequestOptions, options: MakeAuthenticatedRequestOptions): Unit | Abortable = js.native
  
  var authClient: GoogleAuth[AuthClient] = js.native
  
  def getCredentials(
    callback: js.Function2[
      /* err */ js.UndefOr[js.Error | Null], 
      /* credentials */ js.UndefOr[CredentialBody], 
      Unit
    ]
  ): Unit = js.native
}
