package typingsJapgolly.grpcGrpcJs

import typingsJapgolly.grpcGrpcJs.buildSrcEventsMod.EmitterAugmentation1
import typingsJapgolly.grpcGrpcJs.grpcGrpcJsStrings.data
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcObjectStreamMod {
  
  @js.native
  trait IntermediateObjectReadable[T] extends Readable
  
  @js.native
  trait IntermediateObjectWritable[T] extends Writable {
    
    def _write(chunk: Any & T, encoding: String, callback: js.Function): Unit = js.native
    
    def end(chunk: Any & T, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: Any & T, encoding: Any): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: Any & T, encoding: Any, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    def end(chunk: Any & T, encoding: Unit, cb: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    
    def setDefaultEncoding(encoding: String): this.type = js.native
    
    def write(chunk: Any & T, encoding: Any): Boolean = js.native
    def write(chunk: Any & T, encoding: Any, cb: WriteCallback): Boolean = js.native
    def write(chunk: Any & T, encoding: Unit, cb: WriteCallback): Boolean = js.native
  }
  
  @js.native
  trait ObjectReadable[T]
    extends IntermediateObjectReadable[T]
       with EmitterAugmentation1[data, T]
  
  @js.native
  trait ObjectWritable[T] extends IntermediateObjectWritable[T] {
    
    def write(chunk: T, cb: js.Function): Boolean = js.native
    def write(chunk: T, encoding: Any, cb: js.Function): Boolean = js.native
    def write(chunk: T, encoding: Unit, cb: js.Function): Boolean = js.native
  }
  
  type WriteCallback = js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
}
