package typingsJapgolly.jsonwebtoken

import typingsJapgolly.jsonwebtoken.jsonwebtokenBooleans.`false`
import typingsJapgolly.jsonwebtoken.jsonwebtokenBooleans.`true`
import typingsJapgolly.jsonwebtoken.mod.Algorithm
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined jsonwebtoken.jsonwebtoken.DecodeOptions & {  complete :true} */
  trait DecodeOptionscompletetrue extends StObject {
    
    var complete: js.UndefOr[Boolean] & `true`
    
    var json: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptionscompletetrue {
    
    inline def apply(complete: js.UndefOr[Boolean] & `true`): DecodeOptionscompletetrue = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeOptionscompletetrue]
    }
    
    extension [Self <: DecodeOptionscompletetrue](x: Self) {
      
      inline def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  /* Inlined jsonwebtoken.jsonwebtoken.DecodeOptions & {  json :true} */
  trait DecodeOptionsjsontrue extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] & `true`
  }
  object DecodeOptionsjsontrue {
    
    inline def apply(json: js.UndefOr[Boolean] & `true`): DecodeOptionsjsontrue = {
      val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeOptionsjsontrue]
    }
    
    extension [Self <: DecodeOptionsjsontrue](x: Self) {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setJson(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String | Buffer
    
    var passphrase: String
  }
  object Key {
    
    inline def apply(key: String | Buffer, passphrase: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined jsonwebtoken.jsonwebtoken.VerifyOptions & {  complete :false | undefined} */
  trait VerifyOptionscompletefals extends StObject {
    
    var algorithms: js.UndefOr[js.Array[Algorithm]] = js.undefined
    
    var audience: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var clockTimestamp: js.UndefOr[Double] = js.undefined
    
    var clockTolerance: js.UndefOr[Double] = js.undefined
    
    /** return an object with the decoded `{ payload, header, signature }` instead of only the usual content of the payload. */
    var complete: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var jwtid: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[String | Double] = js.undefined
    
    /**
      * If you want to check `nonce` claim, provide a string value here.
      * It is used on Open ID for the ID Tokens. ([Open ID implementation notes](https://openid.net/specs/openid-connect-core-1_0.html#NonceNotes))
      */
    var nonce: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object VerifyOptionscompletefals {
    
    inline def apply(complete: js.UndefOr[Boolean] & js.UndefOr[`false`]): VerifyOptionscompletefals = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletefals]
    }
    
    extension [Self <: VerifyOptionscompletefals](x: Self) {
      
      inline def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAudience(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      inline def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      inline def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value*))
      
      inline def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      inline def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      inline def setMaxAge(value: String | Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  /* Inlined jsonwebtoken.jsonwebtoken.VerifyOptions & {  complete :true} */
  trait VerifyOptionscompletetrue extends StObject {
    
    var algorithms: js.UndefOr[js.Array[Algorithm]] = js.undefined
    
    var audience: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var clockTimestamp: js.UndefOr[Double] = js.undefined
    
    var clockTolerance: js.UndefOr[Double] = js.undefined
    
    /** return an object with the decoded `{ payload, header, signature }` instead of only the usual content of the payload. */
    var complete: js.UndefOr[Boolean] & `true`
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var jwtid: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[String | Double] = js.undefined
    
    /**
      * If you want to check `nonce` claim, provide a string value here.
      * It is used on Open ID for the ID Tokens. ([Open ID implementation notes](https://openid.net/specs/openid-connect-core-1_0.html#NonceNotes))
      */
    var nonce: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object VerifyOptionscompletetrue {
    
    inline def apply(complete: js.UndefOr[Boolean] & `true`): VerifyOptionscompletetrue = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrue]
    }
    
    extension [Self <: VerifyOptionscompletetrue](x: Self) {
      
      inline def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAudience(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      inline def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      inline def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value*))
      
      inline def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      inline def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      inline def setMaxAge(value: String | Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
