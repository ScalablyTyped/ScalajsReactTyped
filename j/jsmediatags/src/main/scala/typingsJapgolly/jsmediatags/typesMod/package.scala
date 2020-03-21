package typingsJapgolly.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Byte = scala.Double
  type ByteArray = js.Array[typingsJapgolly.jsmediatags.typesMod.Byte]
  type DataType = js.Array[scala.Double] | typingsJapgolly.jsmediatags.typesMod.TypedArray | java.lang.String
  type FrameReaderSignature = js.Function5[
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* data */ typingsJapgolly.jsmediatags.mediaFileReaderMod.default, 
    /* flags */ js.UndefOr[js.Any], 
    /* id3header */ js.UndefOr[typingsJapgolly.jsmediatags.typesMod.TagHeader], 
    js.Any
  ]
  type TagFrames = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.jsmediatags.typesMod.TagFrame]
  type Tags = typingsJapgolly.jsmediatags.typesMod.ShortcutTags with typingsJapgolly.jsmediatags.typesMod.TagFrames
  type TypedArray = scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
}
