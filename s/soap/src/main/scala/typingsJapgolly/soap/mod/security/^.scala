package typingsJapgolly.soap.mod.security

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.node.Buffer
import typingsJapgolly.soap.wssecurityMod.IWSSecurityOptions
import typingsJapgolly.soap.wssecuritycertMod.IWSSecurityCertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "security")
@js.native
object ^ extends js.Object {
  var BasicAuthSecurity: Instantiable3[
    /* username */ String, 
    /* password */ String, 
    js.UndefOr[/* defaults */ js.Any], 
    typingsJapgolly.soap.securityMod.BasicAuthSecurity
  ] = js.native
  var BearerSecurity: Instantiable2[
    /* token */ String, 
    js.UndefOr[/* defaults */ js.Any], 
    typingsJapgolly.soap.securityMod.BearerSecurity
  ] = js.native
  var ClientSSLSecurity: Instantiable3[
    /* key */ String | Buffer, 
    /* cert */ String | Buffer, 
    js.UndefOr[/* defaults */ js.Any], 
    typingsJapgolly.soap.securityMod.ClientSSLSecurity
  ] = js.native
  var ClientSSLSecurityPFX: Instantiable2[
    /* pfx */ String | Buffer, 
    js.UndefOr[/* defaults */ js.Any], 
    typingsJapgolly.soap.securityMod.ClientSSLSecurityPFX
  ] = js.native
  var NTLMSecurity: Instantiable1[/* defaults */ js.Any, typingsJapgolly.soap.securityMod.NTLMSecurity] = js.native
  var WSSecurity: Instantiable3[
    /* username */ String, 
    /* password */ String, 
    js.UndefOr[String | IWSSecurityOptions], 
    typingsJapgolly.soap.securityMod.WSSecurity
  ] = js.native
  var WSSecurityCert: Instantiable4[
    /* privatePEM */ js.Any, 
    /* publicP12PEM */ js.Any, 
    /* password */ js.Any, 
    js.UndefOr[/* options */ IWSSecurityCertOptions], 
    typingsJapgolly.soap.securityMod.WSSecurityCert
  ] = js.native
}

