package typingsJapgolly.sindresorhusFnv1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  /**
  	[FNV-1a](https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function) non-cryptographic hash function.
  	@returns The hash as a positive integer.
  	@example
  	```
  	import fnv1a = require('@sindresorhus/fnv1a');
  	fnv1a('🦄🌈');
  	//=> 582881315
  	```
  	*/
  def apply(string: String): Double = js.native
}

