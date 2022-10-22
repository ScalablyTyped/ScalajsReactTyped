package typingsJapgolly.from2

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.from2.anon.objectModetrueundefinedRe
import typingsJapgolly.from2.from2Booleans.`false`
import typingsJapgolly.from2.from2Booleans.`true`
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: ObjectModeOptions, read: ReadObjectInput): ReadableStream = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def apply(opts: Options, read: ReadInput): ReadableStream = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def apply(read: ReadInput): ReadableStream = ^.asInstanceOf[js.Dynamic].apply(read.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  @JSImport("from2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ctor(): From2Ctor[ReadInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")().asInstanceOf[From2Ctor[ReadInput]]
  inline def ctor(opts: ObjectModeOptions): From2Ctor[ReadObjectInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any]).asInstanceOf[From2Ctor[ReadObjectInput]]
  inline def ctor(opts: Options): From2Ctor[ReadInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any]).asInstanceOf[From2Ctor[ReadInput]]
  
  inline def obj(opts: objectModetrueundefinedRe, read: ReadObjectInput): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def obj(read: ReadObjectInput): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(read.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  type Chunk = String | Buffer | js.typedarray.Uint8Array | Null
  
  type From2Ctor[R /* <: ReadInput | ReadObjectInput */] = Instantiable1[/* read */ R, ReadableStream]
  
  type NextCallback = js.Function2[/* err */ js.UndefOr[Any], /* chunk */ Chunk, Unit]
  
  type NextObjectCallback = js.Function2[/* err */ js.UndefOr[Any], /* chunk */ Any, Unit]
  
  trait ObjectModeOptions
    extends StObject
       with ReadableOptions {
    
    @JSName("objectMode")
    var objectMode_ObjectModeOptions: `true`
  }
  object ObjectModeOptions {
    
    inline def apply(): ObjectModeOptions = {
      val __obj = js.Dynamic.literal(objectMode = true)
      __obj.asInstanceOf[ObjectModeOptions]
    }
    
    extension [Self <: ObjectModeOptions](x: Self) {
      
      inline def setObjectMode(value: `true`): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with ReadableOptions {
    
    @JSName("objectMode")
    var objectMode_Options: js.UndefOr[`false`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setObjectMode(value: `false`): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  type ReadCallback[N /* <: NextCallback | NextObjectCallback */] = js.Function2[/* size */ Double, /* next */ N, Unit]
  
  type ReadInput = ReadCallback[NextCallback] | js.Array[Chunk]
  
  type ReadObjectInput = ReadCallback[NextObjectCallback] | js.Array[Any]
}
