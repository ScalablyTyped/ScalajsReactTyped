package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instances of the `Decipher` class are used to decrypt data. The class can be
  * used in one of two ways:
  *
  * * As a `stream` that is both readable and writable, where plain encrypted
  * data is written to produce unencrypted data on the readable side, or
  * * Using the `decipher.update()` and `decipher.final()` methods to
  * produce the unencrypted data.
  *
  * The {@link createDecipher} or {@link createDecipheriv} methods are
  * used to create `Decipher` instances. `Decipher` objects are not to be created
  * directly using the `new` keyword.
  *
  * Example: Using `Decipher` objects as streams:
  *
  * ```js
  * import { Buffer } from 'buffer';
  * const {
  *   scryptSync,
  *   createDecipheriv
  * } = await import('crypto');
  *
  * const algorithm = 'aes-192-cbc';
  * const password = 'Password used to generate key';
  * // Key length is dependent on the algorithm. In this case for aes192, it is
  * // 24 bytes (192 bits).
  * // Use the async `crypto.scrypt()` instead.
  * const key = scryptSync(password, 'salt', 24);
  * // The IV is usually passed along with the ciphertext.
  * const iv = Buffer.alloc(16, 0); // Initialization vector.
  *
  * const decipher = createDecipheriv(algorithm, key, iv);
  *
  * let decrypted = '';
  * decipher.on('readable', () => {
  *   while (null !== (chunk = decipher.read())) {
  *     decrypted += chunk.toString('utf8');
  *   }
  * });
  * decipher.on('end', () => {
  *   console.log(decrypted);
  *   // Prints: some clear text data
  * });
  *
  * // Encrypted with same algorithm, key and iv.
  * const encrypted =
  *   'e5f79c5915c02171eec6b212d5520d44480993d7d622a7c4c2da32f6efda0ffa';
  * decipher.write(encrypted, 'hex');
  * decipher.end();
  * ```
  *
  * Example: Using `Decipher` and piped streams:
  *
  * ```js
  * import {
  *   createReadStream,
  *   createWriteStream,
  * } from 'fs';
  * import { Buffer } from 'buffer';
  * const {
  *   scryptSync,
  *   createDecipheriv
  * } = await import('crypto');
  *
  * const algorithm = 'aes-192-cbc';
  * const password = 'Password used to generate key';
  * // Use the async `crypto.scrypt()` instead.
  * const key = scryptSync(password, 'salt', 24);
  * // The IV is usually passed along with the ciphertext.
  * const iv = Buffer.alloc(16, 0); // Initialization vector.
  *
  * const decipher = createDecipheriv(algorithm, key, iv);
  *
  * const input = createReadStream('test.enc');
  * const output = createWriteStream('test.js');
  *
  * input.pipe(decipher).pipe(output);
  * ```
  *
  * Example: Using the `decipher.update()` and `decipher.final()` methods:
  *
  * ```js
  * import { Buffer } from 'buffer';
  * const {
  *   scryptSync,
  *   createDecipheriv
  * } = await import('crypto');
  *
  * const algorithm = 'aes-192-cbc';
  * const password = 'Password used to generate key';
  * // Use the async `crypto.scrypt()` instead.
  * const key = scryptSync(password, 'salt', 24);
  * // The IV is usually passed along with the ciphertext.
  * const iv = Buffer.alloc(16, 0); // Initialization vector.
  *
  * const decipher = createDecipheriv(algorithm, key, iv);
  *
  * // Encrypted using same algorithm, key and iv.
  * const encrypted =
  *   'e5f79c5915c02171eec6b212d5520d44480993d7d622a7c4c2da32f6efda0ffa';
  * let decrypted = decipher.update(encrypted, 'hex', 'utf8');
  * decrypted += decipher.final('utf8');
  * console.log(decrypted);
  * // Prints: some clear text data
  * ```
  * @since v0.1.94
  */
@JSImport("crypto", "Decipher")
@js.native
/* private */ open class Decipher () extends StObject {
  
  /**
    * Once the `decipher.final()` method has been called, the `Decipher` object can
    * no longer be used to decrypt data. Attempts to call `decipher.final()` more
    * than once will result in an error being thrown.
    * @since v0.1.94
    * @param outputEncoding The `encoding` of the return value.
    * @return Any remaining deciphered contents. If `outputEncoding` is specified, a string is returned. If an `outputEncoding` is not provided, a {@link Buffer} is returned.
    */
  def `final`(): Buffer = js.native
  def `final`(outputEncoding: BufferEncoding): String = js.native
  
  /**
    * When data has been encrypted without standard block padding, calling`decipher.setAutoPadding(false)` will disable automatic padding to prevent `decipher.final()` from checking for and
    * removing padding.
    *
    * Turning auto padding off will only work if the input data's length is a
    * multiple of the ciphers block size.
    *
    * The `decipher.setAutoPadding()` method must be called before `decipher.final()`.
    * @since v0.7.1
    * @param [autoPadding=true]
    * @return for method chaining.
    */
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: Boolean): this.type = js.native
  
  def update(data: String, inputEncoding: Unit, outputEncoding: Encoding): String = js.native
  def update(data: String, inputEncoding: Encoding): Buffer = js.native
  def update(data: String, inputEncoding: Encoding, outputEncoding: Encoding): String = js.native
  /**
    * Updates the decipher with `data`. If the `inputEncoding` argument is given,
    * the `data`argument is a string using the specified encoding. If the `inputEncoding`argument is not given, `data` must be a `Buffer`. If `data` is a `Buffer` then `inputEncoding` is
    * ignored.
    *
    * The `outputEncoding` specifies the output format of the enciphered
    * data. If the `outputEncoding`is specified, a string using the specified encoding is returned. If no`outputEncoding` is provided, a `Buffer` is returned.
    *
    * The `decipher.update()` method can be called multiple times with new data until `decipher.final()` is called. Calling `decipher.update()` after `decipher.final()` will result in an error
    * being thrown.
    * @since v0.1.94
    * @param inputEncoding The `encoding` of the `data` string.
    * @param outputEncoding The `encoding` of the return value.
    */
  def update(data: ArrayBufferView): Buffer = js.native
  def update(data: ArrayBufferView, inputEncoding: Unit, outputEncoding: Encoding): String = js.native
}
