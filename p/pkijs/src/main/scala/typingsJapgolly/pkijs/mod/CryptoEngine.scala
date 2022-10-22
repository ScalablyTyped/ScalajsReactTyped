package typingsJapgolly.pkijs.mod

import org.scalajs.dom.Algorithm
import org.scalajs.dom.CryptoKey
import org.scalajs.dom.JsonWebKey
import org.scalajs.dom.KeyFormat
import org.scalajs.dom.KeyUsage
import typingsJapgolly.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Default cryptographic engine for Web Cryptography API
  */
@JSImport("pkijs", "CryptoEngine")
@js.native
open class CryptoEngine protected () extends AbstractCryptoEngine {
  /**
    * Constructor for CryptoEngine class
    * @param parameters
    */
  def this(parameters: CryptoEngineParameters) = this()
  
  /**
    * Convert WebCrypto keys between different export formats
    * @param  inputFormat
    * @param  outputFormat
    * @param  keyData
    * @param  algorithm
    * @param  extractable
    * @param  keyUsages
    */
  def convert(
    inputFormat: KeyFormat,
    outputFormat: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[js.typedarray.ArrayBuffer | JsonWebKey] = js.native
  def convert(
    inputFormat: KeyFormat,
    outputFormat: KeyFormat,
    keyData: JsonWebKey,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[js.typedarray.ArrayBuffer | JsonWebKey] = js.native
  
  def exportKey(format: String, key: CryptoKey): js.Promise[js.typedarray.ArrayBuffer | JsonWebKey] = js.native
  
  def fillPublicKeyParameters(publicKeyInfo: PublicKeyInfo, signatureAlgorithm: AlgorithmIdentifier): CryptoEnginePublicKeyParams = js.native
  
  def importKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.AlgorithmIdentifier */ Any,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: KeyFormat,
    keyData: BufferSource,
    algorithm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.AlgorithmIdentifier */ Any,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
}
