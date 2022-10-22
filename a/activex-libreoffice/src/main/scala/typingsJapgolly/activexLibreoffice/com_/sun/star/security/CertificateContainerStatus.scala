package typingsJapgolly.activexLibreoffice.com_.sun.star.security

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constant definition of a certificate container status. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait CertificateContainerStatus extends StObject
object CertificateContainerStatus {
  
  /** The certificate was not found. */
  inline def NOCERT: `0` = 0.asInstanceOf[`0`]
  
  /** The certificate was found and is trusted. */
  inline def TRUSTED: `1` = 1.asInstanceOf[`1`]
  
  /** The certificate was found but is untrusted. */
  inline def UNTRUSTED: `2` = 2.asInstanceOf[`2`]
}
