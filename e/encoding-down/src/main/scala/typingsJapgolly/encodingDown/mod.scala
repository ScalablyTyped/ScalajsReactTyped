package typingsJapgolly.encodingDown

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.abstractLeveldown.mod.AbstractBatch
import typingsJapgolly.abstractLeveldown.mod.AbstractChainedBatch
import typingsJapgolly.abstractLeveldown.mod.AbstractGetOptions
import typingsJapgolly.abstractLeveldown.mod.AbstractIterator
import typingsJapgolly.abstractLeveldown.mod.AbstractIteratorOptions
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import typingsJapgolly.abstractLeveldown.mod.AbstractOptions
import typingsJapgolly.abstractLeveldown.mod.ErrorCallback
import typingsJapgolly.abstractLeveldown.mod.ErrorValueCallback
import typingsJapgolly.encodingDown.mod.EncodingDown.BatchOptions
import typingsJapgolly.encodingDown.mod.EncodingDown.ChainedBatch
import typingsJapgolly.encodingDown.mod.EncodingDown.Constructor
import typingsJapgolly.encodingDown.mod.EncodingDown.DelOptions
import typingsJapgolly.encodingDown.mod.EncodingDown.GetOptions
import typingsJapgolly.encodingDown.mod.EncodingDown.IteratorOptions
import typingsJapgolly.encodingDown.mod.EncodingDown.PutOptions
import typingsJapgolly.levelCodec.mod.CodecOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("encoding-down", JSImport.Default)
    @js.native
    open class ^[K, V] protected ()
      extends StObject
         with EncodingDown[K, V] {
      // tslint:disable-next-line:no-unnecessary-generics
      def this(db: AbstractLevelDOWN[Any, Any]) = this()
      def this(db: AbstractLevelDOWN[Any, Any], options: CodecOptions) = this()
    }
    
    @JSImport("encoding-down", JSImport.Default)
    @js.native
    val ^ : js.Object & Constructor = js.native
    
    type _To = js.Object & Constructor
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: js.Object & Constructor = ^
  }
  
  @js.native
  trait EncodingDown[K, V]
    extends StObject
       with AbstractLevelDOWN[K, V] {
    
    def batch(array: js.Array[AbstractBatch[Any, Any]], options: BatchOptions, cb: ErrorCallback): ChainedBatch[Any, Any] = js.native
    
    def del(key: K, options: DelOptions, cb: ErrorCallback): Unit = js.native
    
    def get(key: K, options: GetOptions, cb: ErrorValueCallback[V]): Unit = js.native
    
    def iterator(options: IteratorOptions): AbstractIterator[Any, Any] = js.native
    
    def put(key: K, value: V, options: PutOptions, cb: ErrorCallback): Unit = js.native
  }
  object EncodingDown {
    
    trait BatchOptions
      extends StObject
         with AbstractOptions
         with CodecOptions
    object BatchOptions {
      
      inline def apply(): BatchOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchOptions]
      }
    }
    
    @js.native
    trait ChainedBatch[K, V]
      extends StObject
         with AbstractChainedBatch[K, V] {
      
      def write(cb: Any): Any = js.native
      def write(options: CodecOptions & AbstractOptions, cb: Any): Any = js.native
    }
    
    @js.native
    trait Constructor
      extends StObject
         with // tslint:disable-next-line:no-unnecessary-generics
    Instantiable1[/* db */ AbstractLevelDOWN[Any, Any], EncodingDown[js.Object, js.Object]]
         with Instantiable2[
              /* db */ AbstractLevelDOWN[Any, Any], 
              /* options */ CodecOptions, 
              EncodingDown[js.Object, js.Object]
            ] {
      
      // tslint:disable-next-line:no-unnecessary-generics
      def apply[K, V](db: AbstractLevelDOWN[Any, Any]): EncodingDown[K, V] = js.native
      def apply[K, V](db: AbstractLevelDOWN[Any, Any], options: CodecOptions): EncodingDown[K, V] = js.native
    }
    
    trait DelOptions
      extends StObject
         with AbstractOptions
         with CodecOptions
    object DelOptions {
      
      inline def apply(): DelOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DelOptions]
      }
    }
    
    trait GetOptions
      extends StObject
         with AbstractGetOptions
         with CodecOptions
    object GetOptions {
      
      inline def apply(): GetOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetOptions]
      }
    }
    
    trait IteratorOptions
      extends StObject
         with AbstractIteratorOptions[Any]
         with CodecOptions
    object IteratorOptions {
      
      inline def apply(): IteratorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IteratorOptions]
      }
    }
    
    trait PutOptions
      extends StObject
         with AbstractOptions
         with CodecOptions
    object PutOptions {
      
      inline def apply(): PutOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PutOptions]
      }
    }
  }
}
