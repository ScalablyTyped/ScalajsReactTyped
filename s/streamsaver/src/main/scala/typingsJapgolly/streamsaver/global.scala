package typingsJapgolly.streamsaver

import org.scalajs.dom.ReadableStream
import typingsJapgolly.std.QueuingStrategy
import typingsJapgolly.std.Transformer
import typingsJapgolly.std.UnderlyingSink
import typingsJapgolly.streamsaver.mod.CreateWriteStreamOptions
import typingsJapgolly.streamsaver.mod.Version_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object streamSaver {
    
    @JSGlobal("streamSaver")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("streamSaver.TransformStream")
    @js.native
    open class TransformStream[I, O] protected ()
      extends StObject
         with typingsJapgolly.std.TransformStream[I, O] {
      def this(
        transformer: Transformer[I, O],
        writableStrategy: QueuingStrategy[I],
        readableStrategy: QueuingStrategy[O]
      ) = this()
      
      /* standard dom */
      /* CompleteClass */
      override val readable: ReadableStream[O] = js.native
      
      /* standard dom */
      /* CompleteClass */
      override val writable: typingsJapgolly.std.WritableStream[I] = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("streamSaver.WritableStream")
    @js.native
    open class WritableStream[W] ()
      extends StObject
         with typingsJapgolly.std.WritableStream[W] {
      def this(underlyingSink: UnderlyingSink[W]) = this()
      def this(underlyingSink: Unit, strategy: QueuingStrategy[W]) = this()
      def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
    }
    
    inline def createWriteStream(filename: String): typingsJapgolly.std.WritableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(filename.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.std.WritableStream[Any]]
    inline def createWriteStream(filename: String, options: CreateWriteStreamOptions[Any, Any]): typingsJapgolly.std.WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.std.WritableStream[Any]]
    
    @JSGlobal("streamSaver.mitm")
    @js.native
    def mitm: String = js.native
    inline def mitm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mitm")(x.asInstanceOf[js.Any])
    
    @JSGlobal("streamSaver.supported")
    @js.native
    def supported: Boolean = js.native
    inline def supported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
    
    @JSGlobal("streamSaver.version")
    @js.native
    val version: Version_ = js.native
  }
}
