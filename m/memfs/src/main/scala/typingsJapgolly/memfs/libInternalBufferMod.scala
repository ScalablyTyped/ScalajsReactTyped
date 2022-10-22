package typingsJapgolly.memfs

import typingsJapgolly.memfs.anon.ToPrimitive
import typingsJapgolly.memfs.anon.ValueOf
import typingsJapgolly.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInternalBufferMod {
  
  @JSImport("memfs/lib/internal/buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("memfs/lib/internal/buffer", "Buffer")
  @js.native
  open class Buffer protected ()
    extends typingsJapgolly.buffer.mod.Buffer {
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      */
    def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: js.Array[Any]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: js.typedarray.Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      */
    def this(buffer: typingsJapgolly.buffer.mod.Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      */
    def this(str: String) = this()
    def this(str: String, encoding: String) = this()
  }
  /* static members */
  object Buffer {
    
    @JSImport("memfs/lib/internal/buffer", "Buffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
      *    If parameter is omitted, buffer will be filled with zeros.
      * @param encoding encoding used for call to buf.fill while initializing
      */
    inline def alloc(size: Double): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def alloc(size: Double, fill: String): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def alloc(size: Double, fill: String, encoding: String): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def alloc(size: Double, fill: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def alloc(size: Double, fill: Double, encoding: String): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def alloc(size: Double, fill: Unit, encoding: String): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def alloc(size: Double, fill: typingsJapgolly.buffer.mod.Buffer): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def alloc(size: Double, fill: typingsJapgolly.buffer.mod.Buffer, encoding: String): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    
    /**
      * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    inline def allocUnsafe(size: Double): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")(size.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    
    /**
      * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    inline def allocUnsafeSlow(size: Double): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafeSlow")(size.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    
    /**
      * Gives the actual byte length of a string. encoding defaults to 'utf8'.
      * This is not the same as String.prototype.length since that returns the number of characters in a string.
      *
      * @param string string to test.
      * @param encoding encoding used to evaluate (defaults to 'utf8')
      */
    inline def byteLength(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def byteLength(string: String, encoding: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * The same as buf1.compare(buf2).
      */
    inline def compare(buf1: js.typedarray.Uint8Array, buf2: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(buf1.asInstanceOf[js.Any], buf2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a buffer which is the result of concatenating all the buffers in the list together.
      *
      * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
      * If the list has exactly one item, then the first item of the list is returned.
      * If the list has more than one item, then a new Buffer is created.
      *
      * @param list An array of Buffer objects to concatenate
      * @param totalLength Total length of the buffers when concatenated.
      *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
      */
    inline def concat(list: js.Array[js.typedarray.Uint8Array]): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def concat(list: js.Array[js.typedarray.Uint8Array], totalLength: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any], totalLength.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    
    /**
      * When passed a reference to the .buffer property of a TypedArray instance,
      * the newly created Buffer will share the same allocated memory as the TypedArray.
      * The optional {byteOffset} and {length} arguments specify a memory range
      * within the {arrayBuffer} that will be shared by the Buffer.
      *
      * @param arrayBuffer The .buffer property of a TypedArray or a new ArrayBuffer()
      * @param byteOffset
      * @param length
      */
    inline def from(arrayBuffer: js.typedarray.ArrayBuffer): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double, length: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Unit, length: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    /**
      * Allocates a new Buffer using an {array} of octets.
      *
      * @param array
      */
    inline def from(array: js.Array[Any]): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def from(buffer: js.typedarray.Uint8Array): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    /**
      * Copies the passed {buffer} data onto a new Buffer instance.
      *
      * @param buffer
      */
    inline def from(buffer: typingsJapgolly.buffer.mod.Buffer): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    /**
      * Creates a new Buffer containing the given JavaScript string {str}.
      * If provided, the {encoding} parameter identifies the character encoding.
      * If not provided, {encoding} defaults to 'utf8'.
      *
      * @param str
      */
    inline def from(str: String): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    inline def from(str: String, encoding: String): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
    
    /**
      * Returns true if {obj} is a Buffer
      *
      * @param obj object to test.
      */
    inline def isBuffer(obj: Any): /* is buffer.buffer.Buffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is buffer.buffer.Buffer */ Boolean]
    
    /**
      * Returns true if {encoding} is a valid encoding argument.
      * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
      *
      * @param encoding string to test.
      */
    inline def isEncoding(encoding: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoding")(encoding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def bufferAllocUnsafe(size: Double): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferAllocUnsafe")(size.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  
  inline def bufferFrom(arrayBuffer: js.typedarray.ArrayBuffer): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double, length: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Unit, length: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(arrayBuffer: SharedArrayBuffer): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(arrayBuffer: SharedArrayBuffer, byteOffset: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(arrayBuffer: SharedArrayBuffer, byteOffset: Double, length: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(arrayBuffer: SharedArrayBuffer, byteOffset: Unit, length: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(data: js.Array[Any]): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(data: js.typedarray.Uint8Array): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(obj: ToPrimitive): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(obj: ToPrimitive, byteOffset: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(obj.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(obj: ToPrimitive, byteOffset: Double, length: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(obj.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(obj: ToPrimitive, byteOffset: Unit, length: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(obj.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(obj: ValueOf): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(obj: ValueOf, byteOffset: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(obj.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(obj: ValueOf, byteOffset: Double, length: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(obj.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(obj: ValueOf, byteOffset: Unit, length: Double): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(obj.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(str: String): typingsJapgolly.buffer.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
  inline def bufferFrom(str: String, encoding: String): typingsJapgolly.buffer.mod.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferFrom")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.buffer.mod.Buffer]
}
