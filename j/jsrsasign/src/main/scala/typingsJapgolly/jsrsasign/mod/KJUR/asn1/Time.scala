package typingsJapgolly.jsrsasign.mod.KJUR.asn1

import typingsJapgolly.jsrsasign.StringParamtypegen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Time ASN.1 structure class
  * @param params associative array of parameters (ex. {'str': '130508235959Z'})
  * @example
  * var t1 = new KJUR.asn1.x509.Time{'str': '130508235959Z'} // UTCTime by default
  * var t2 = new KJUR.asn1.x509.Time{'type': 'gen',  'str': '20130508235959Z'} // GeneralizedTime
  */
@JSImport("jsrsasign", "KJUR.asn1.Time")
@js.native
class Time ()
  extends typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.Time {
  def this(params: StringParamtypegen) = this()
}

