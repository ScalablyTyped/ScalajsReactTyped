package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object highland {
  // TODO export the top-level functions
  // TODO figure out curry arguments
  // TODO use externalised Readable/Writable (not node's)
  // Returns the type of a flattened stream.
  // Uses trick described in https://github.com/microsoft/TypeScript/pull/33050#issuecomment-552218239
  // with string keys to support TS 2.8
  type Flattened[R] = /* import warning: importer.ImportType#apply Failed type conversion: highland.AnonArray<R>[R extends std.Array<any> ? 'array' : R extends highland.Highland.Stream<any> ? 'stream' : 'value'] */ js.Any
}
