package typingsJapgolly.samlp

import typingsJapgolly.samlp.mod.DigestAlgorithmType
import typingsJapgolly.samlp.mod.SignatureAlgorithmType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object samlpStrings {
  
  @js.native
  sealed trait `rsa-sha1`
    extends StObject
       with SignatureAlgorithmType
  inline def `rsa-sha1`: `rsa-sha1` = "rsa-sha1".asInstanceOf[`rsa-sha1`]
  
  @js.native
  sealed trait `rsa-sha256`
    extends StObject
       with SignatureAlgorithmType
  inline def `rsa-sha256`: `rsa-sha256` = "rsa-sha256".asInstanceOf[`rsa-sha256`]
  
  @js.native
  sealed trait sha1
    extends StObject
       with DigestAlgorithmType
  inline def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha256
    extends StObject
       with DigestAlgorithmType
  inline def sha256: sha256 = "sha256".asInstanceOf[sha256]
}
