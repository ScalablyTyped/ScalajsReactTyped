package typingsJapgolly.webappsecCredentialManagement

import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLFormElement
import typingsJapgolly.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#typedefdef-credentialbodytype}
  */
type CredentialBodyType = FormData | URLSearchParams

/**
  * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-federatedcredentialinit}
  */
type FederatedCredentialInit = FederatedCredentialData

/**
  * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#typedefdef-passwordcredentialinit}
  */
type PasswordCredentialInit = PasswordCredentialData | HTMLFormElement
