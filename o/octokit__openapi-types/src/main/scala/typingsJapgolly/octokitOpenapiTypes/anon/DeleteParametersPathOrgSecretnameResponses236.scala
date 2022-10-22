package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgSecretnameResponses236 extends StObject {
  
  /** Deletes an organization secret using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. */
  var delete: ParametersPathOrgSecretnameResponses236
  
  /**
    * Gets an organization secret without revealing its encrypted value.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathOrgSecretname
  
  /**
    * Creates or updates an organization secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `admin:org` scope to use this endpoint.
    *
    * #### Example encrypting a secret using Node.js
    *
    * Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.
    *
    * ```
    * // Written with ❤️ by PSJ and free to use under The Unlicense.
    * const sodium=require('libsodium-wrappers')
    * const secret = 'plain-text-secret' // replace with secret before running the script.
    * const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key.
    *
    * //Check if libsodium is ready and then proceed.
    *
    * sodium.ready.then( ()=>{
    *
    * // Convert Secret & Base64 key to Uint8Array.
    * let binkey= sodium.from_base64(key, sodium.base64_variants.ORIGINAL) //Equivalent of Buffer.from(key, 'base64')
    * let binsec= sodium.from_string(secret) // Equivalent of Buffer.from(secret)
    *
    * //Encrypt the secret using LibSodium
    * let encBytes= sodium.crypto_box_seal(binsec,binkey) // Similar to tweetsodium.seal(binsec,binkey)
    *
    * // Convert encrypted Uint8Array to Base64
    * let output=sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL) //Equivalent of Buffer.from(encBytes).toString('base64')
    *
    * console.log(output)
    * });
    * ```
    *
    * #### Example encrypting a secret using Python
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.
    *
    * ```
    * from base64 import b64encode
    * from nacl import encoding, public
    *
    * def encrypt(public_key: str, secret_value: str) -> str:
    *   """Encrypt a Unicode string using the public key."""
    *   public_key = public.PublicKey(public_key.encode("utf-8"), encoding.Base64Encoder())
    *   sealed_box = public.SealedBox(public_key)
    *   encrypted = sealed_box.encrypt(secret_value.encode("utf-8"))
    *   return b64encode(encrypted).decode("utf-8")
    * ```
    *
    * #### Example encrypting a secret using C#
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    * ```
    * var secretValue = System.Text.Encoding.UTF8.GetBytes("mySecret");
    * var publicKey = Convert.FromBase64String("2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=");
    *
    * var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);
    *
    * Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox));
    * ```
    *
    * #### Example encrypting a secret using Ruby
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    *
    * ```ruby
    * require "rbnacl"
    * require "base64"
    *
    * key = Base64.decode64("+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=")
    * public_key = RbNaCl::PublicKey.new(key)
    *
    * box = RbNaCl::Boxes::Sealed.from_public_key(public_key)
    * encrypted_secret = box.encrypt("my_secret")
    *
    * # Print the base64 encoded secret
    * puts Base64.strict_encode64(encrypted_secret)
    * ```
    */
  var put: Responses201Content308
}
object DeleteParametersPathOrgSecretnameResponses236 {
  
  inline def apply(
    delete: ParametersPathOrgSecretnameResponses236,
    get: ParametersPathOrgSecretname,
    put: Responses201Content308
  ): DeleteParametersPathOrgSecretnameResponses236 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgSecretnameResponses236]
  }
  
  extension [Self <: DeleteParametersPathOrgSecretnameResponses236](x: Self) {
    
    inline def setDelete(value: ParametersPathOrgSecretnameResponses236): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOrgSecretname): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses201Content308): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
