package typingsJapgolly.x509Js.mod

import typingsJapgolly.x509Js.AnonCommonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  var altNames: js.Array[String]
  var issuer: AnonCommonName
  var notAfter: String
  var notBefore: String
  var ocspList: js.Array[String]
  var publicExponent: String
  var publicModulus: String
  var serial: String
  var subject: AnonCommonName
}

object Certificate {
  @scala.inline
  def apply(
    altNames: js.Array[String],
    issuer: AnonCommonName,
    notAfter: String,
    notBefore: String,
    ocspList: js.Array[String],
    publicExponent: String,
    publicModulus: String,
    serial: String,
    subject: AnonCommonName
  ): Certificate = {
    val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any], ocspList = ocspList.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], publicModulus = publicModulus.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Certificate]
  }
}

