package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Hash` class is a utility for creating hash digests of data. It can be
  * used in one of two ways:
  *
  * * As a `stream` that is both readable and writable, where data is written
  * to produce a computed hash digest on the readable side, or
  * * Using the `hash.update()` and `hash.digest()` methods to produce the
  * computed hash.
  *
  * The {@link createHash} method is used to create `Hash` instances. `Hash`objects are not to be created directly using the `new` keyword.
  *
  * Example: Using `Hash` objects as streams:
  *
  * ```js
  * const {
  *   createHash
  * } = await import('crypto');
  *
  * const hash = createHash('sha256');
  *
  * hash.on('readable', () => {
  *   // Only one element is going to be produced by the
  *   // hash stream.
  *   const data = hash.read();
  *   if (data) {
  *     console.log(data.toString('hex'));
  *     // Prints:
  *     //   6a2da20943931e9834fc12cfe5bb47bbd9ae43489a30726962b576f4e3993e50
  *   }
  * });
  *
  * hash.write('some data to hash');
  * hash.end();
  * ```
  *
  * Example: Using `Hash` and piped streams:
  *
  * ```js
  * import { createReadStream } from 'fs';
  * import { stdout } from 'process';
  * const { createHash } = await import('crypto');
  *
  * const hash = createHash('sha256');
  *
  * const input = createReadStream('test.js');
  * input.pipe(hash).setEncoding('hex').pipe(stdout);
  * ```
  *
  * Example: Using the `hash.update()` and `hash.digest()` methods:
  *
  * ```js
  * const {
  *   createHash
  * } = await import('crypto');
  *
  * const hash = createHash('sha256');
  *
  * hash.update('some data to hash');
  * console.log(hash.digest('hex'));
  * // Prints:
  * //   6a2da20943931e9834fc12cfe5bb47bbd9ae43489a30726962b576f4e3993e50
  * ```
  * @since v0.1.92
  */
@JSImport("crypto", "Hash")
@js.native
/* private */ open class Hash () extends StObject {
  
  /**
    * Creates a new `Hash` object that contains a deep copy of the internal state
    * of the current `Hash` object.
    *
    * The optional `options` argument controls stream behavior. For XOF hash
    * functions such as `'shake256'`, the `outputLength` option can be used to
    * specify the desired output length in bytes.
    *
    * An error is thrown when an attempt is made to copy the `Hash` object after
    * its `hash.digest()` method has been called.
    *
    * ```js
    * // Calculate a rolling hash.
    * const {
    *   createHash
    * } = await import('crypto');
    *
    * const hash = createHash('sha256');
    *
    * hash.update('one');
    * console.log(hash.copy().digest('hex'));
    *
    * hash.update('two');
    * console.log(hash.copy().digest('hex'));
    *
    * hash.update('three');
    * console.log(hash.copy().digest('hex'));
    *
    * // Etc.
    * ```
    * @since v13.1.0
    * @param options `stream.transform` options
    */
  def copy(): Hash = js.native
  def copy(options: TransformOptions): Hash = js.native
  
  /**
    * Calculates the digest of all of the data passed to be hashed (using the `hash.update()` method).
    * If `encoding` is provided a string will be returned; otherwise
    * a `Buffer` is returned.
    *
    * The `Hash` object can not be used again after `hash.digest()` method has been
    * called. Multiple calls will cause an error to be thrown.
    * @since v0.1.92
    * @param encoding The `encoding` of the return value.
    */
  def digest(): Buffer = js.native
  def digest(encoding: BinaryToTextEncoding): String = js.native
  
  def update(data: String, inputEncoding: Encoding): Hash = js.native
  /**
    * Updates the hash content with the given `data`, the encoding of which
    * is given in `inputEncoding`.
    * If `encoding` is not provided, and the `data` is a string, an
    * encoding of `'utf8'` is enforced. If `data` is a `Buffer`, `TypedArray`, or`DataView`, then `inputEncoding` is ignored.
    *
    * This can be called many times with new data as it is streamed.
    * @since v0.1.92
    * @param inputEncoding The `encoding` of the `data` string.
    */
  def update(data: BinaryLike): Hash = js.native
}
