package typingsJapgolly.nodemailer.dkimMod

import typingsJapgolly.nodemailer.AnonKey
import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleKeyOptions
  extends OptionalOptions
     with Options {
  /** is the domain name to use in the signature */
  var domainName: String
  /** is the DKIM key selector */
  var keySelector: String
  /** is the private key for the selector in PEM format */
  var privateKey: String | AnonKey
}

object SingleKeyOptions {
  @scala.inline
  def apply(
    domainName: String,
    keySelector: String,
    privateKey: String | AnonKey,
    cacheDir: String | `false` = null,
    cacheTreshold: Int | Double = null,
    hashAlgo: String = null,
    headerFieldNames: String = null,
    skipFields: String = null
  ): SingleKeyOptions = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir.asInstanceOf[js.Any])
    if (cacheTreshold != null) __obj.updateDynamic("cacheTreshold")(cacheTreshold.asInstanceOf[js.Any])
    if (hashAlgo != null) __obj.updateDynamic("hashAlgo")(hashAlgo.asInstanceOf[js.Any])
    if (headerFieldNames != null) __obj.updateDynamic("headerFieldNames")(headerFieldNames.asInstanceOf[js.Any])
    if (skipFields != null) __obj.updateDynamic("skipFields")(skipFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleKeyOptions]
  }
}

