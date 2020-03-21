package typingsJapgolly.kindOf

import typingsJapgolly.kindOf.kindOfStrings.arguments
import typingsJapgolly.kindOf.kindOfStrings.array
import typingsJapgolly.kindOf.kindOfStrings.arrayiterator
import typingsJapgolly.kindOf.kindOfStrings.boolean
import typingsJapgolly.kindOf.kindOfStrings.buffer
import typingsJapgolly.kindOf.kindOfStrings.date
import typingsJapgolly.kindOf.kindOfStrings.error
import typingsJapgolly.kindOf.kindOfStrings.float32array
import typingsJapgolly.kindOf.kindOfStrings.float64array
import typingsJapgolly.kindOf.kindOfStrings.function
import typingsJapgolly.kindOf.kindOfStrings.generator
import typingsJapgolly.kindOf.kindOfStrings.generatorfunction
import typingsJapgolly.kindOf.kindOfStrings.int16array
import typingsJapgolly.kindOf.kindOfStrings.int32array
import typingsJapgolly.kindOf.kindOfStrings.int8array
import typingsJapgolly.kindOf.kindOfStrings.map
import typingsJapgolly.kindOf.kindOfStrings.mapiterator
import typingsJapgolly.kindOf.kindOfStrings.number
import typingsJapgolly.kindOf.kindOfStrings.promise
import typingsJapgolly.kindOf.kindOfStrings.regexp
import typingsJapgolly.kindOf.kindOfStrings.set
import typingsJapgolly.kindOf.kindOfStrings.setiterator
import typingsJapgolly.kindOf.kindOfStrings.string
import typingsJapgolly.kindOf.kindOfStrings.stringiterator
import typingsJapgolly.kindOf.kindOfStrings.symbol
import typingsJapgolly.kindOf.kindOfStrings.uint16array
import typingsJapgolly.kindOf.kindOfStrings.uint32array
import typingsJapgolly.kindOf.kindOfStrings.uint8array
import typingsJapgolly.kindOf.kindOfStrings.uint8clampedarray
import typingsJapgolly.kindOf.kindOfStrings.undefined
import typingsJapgolly.kindOf.kindOfStrings.weakmap
import typingsJapgolly.kindOf.kindOfStrings.weakset
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Date
import typingsJapgolly.std.Error
import typingsJapgolly.std.Float32Array
import typingsJapgolly.std.Float64Array
import typingsJapgolly.std.Int16Array
import typingsJapgolly.std.Int32Array
import typingsJapgolly.std.Int8Array
import typingsJapgolly.std.Iterator
import typingsJapgolly.std.Map
import typingsJapgolly.std.RegExp
import typingsJapgolly.std.Set
import typingsJapgolly.std.Uint16Array
import typingsJapgolly.std.Uint32Array
import typingsJapgolly.std.Uint8Array
import typingsJapgolly.std.Uint8ClampedArray
import typingsJapgolly.std.WeakMap
import typingsJapgolly.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kind-of", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): undefined = js.native
  def apply(thing: String): string = js.native
  def apply(thing: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof arguments */ js.Any): arguments = js.native
  def apply(thing: js.Array[_]): array = js.native
  def apply(thing: js.Function1[/* repeated */ js.Any, _]): function | generatorfunction = js.native
  def apply(thing: js.Promise[_]): promise = js.native
  def apply(thing: js.Symbol): symbol = js.native
  def apply(thing: Boolean): boolean = js.native
  def apply(thing: Double): number = js.native
  def apply(thing: Buffer): buffer = js.native
  def apply(thing: Date): date = js.native
  def apply(thing: Error): error = js.native
  def apply(thing: Float32Array): float32array = js.native
  def apply(thing: Float64Array): float64array = js.native
  def apply(thing: Int16Array): int16array = js.native
  def apply(thing: Int32Array): int32array = js.native
  def apply(thing: Int8Array): int8array = js.native
  def apply(thing: Iterator[_, _, js.UndefOr[scala.Nothing]]): generator | stringiterator | arrayiterator | mapiterator | setiterator = js.native
  def apply(thing: Map[_, _]): map = js.native
  def apply(thing: RegExp): regexp = js.native
  def apply(thing: Set[_]): set = js.native
  def apply(thing: Uint16Array): uint16array = js.native
  def apply(thing: Uint32Array): uint32array = js.native
  def apply(thing: Uint8Array): uint8array = js.native
  def apply(thing: Uint8ClampedArray): uint8clampedarray = js.native
  def apply(thing: WeakMap[_, _]): weakmap = js.native
  def apply(thing: WeakSet[_]): weakset = js.native
}

