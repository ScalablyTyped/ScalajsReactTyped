package typingsJapgolly.readableStream

import typingsJapgolly.readableStream.mod.DuplexOptions
import typingsJapgolly.readableStream.mod.ReadableOptions
import typingsJapgolly.readableStream.mod.TransformOptions
import typingsJapgolly.readableStream.mod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Readable {
    
    @JSGlobal("_Readable")
    @js.native
    open class ^ ()
      extends typingsJapgolly.readableStream.mod.^ {
      def this(options: ReadableOptions) = this()
    }
    
    @JSGlobal("_Readable.Duplex")
    @js.native
    // end-Readable
    open class Duplex ()
      extends typingsJapgolly.readableStream.mod.Duplex {
      def this(options: DuplexOptions) = this()
    }
    object Duplex {
      
      @JSGlobal("_Readable.Duplex")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * This is a dummy function required to retain type compatibility to node.
        * @deprecated DO NOT USE
        */
      /* static member */
      inline def from(source: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
    
    // ==== _stream_passthrough ====
    @JSGlobal("_Readable.PassThrough")
    @js.native
    open class PassThrough ()
      extends typingsJapgolly.readableStream.mod.PassThrough {
      def this(options: TransformOptions) = this()
    }
    
    @JSGlobal("_Readable.Readable")
    @js.native
    open class Readable ()
      extends typingsJapgolly.readableStream.mod.Readable {
      def this(options: ReadableOptions) = this()
    }
    
    @JSGlobal("_Readable.Stream")
    @js.native
    open class Stream ()
      extends typingsJapgolly.readableStream.mod.Stream {
      def this(options: ReadableOptions) = this()
    }
    
    @JSGlobal("_Readable.Transform")
    @js.native
    open class Transform ()
      extends typingsJapgolly.readableStream.mod.Transform {
      def this(options: TransformOptions) = this()
    }
    
    @JSGlobal("_Readable.Writable")
    @js.native
    open class Writable ()
      extends typingsJapgolly.readableStream.mod.Writable {
      def this(opts: WritableOptions) = this()
    }
    
    @JSGlobal("_Readable._Writable")
    @js.native
    open class _Writable ()
      extends typingsJapgolly.readableStream.mod._Writable {
      def this(opts: WritableOptions) = this()
    }
  }
}
