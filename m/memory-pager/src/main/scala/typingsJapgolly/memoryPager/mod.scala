package typingsJapgolly.memoryPager

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.memoryPager.memoryPagerBooleans.`false`
import typingsJapgolly.memoryPager.memoryPagerBooleans.`true`
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("memory-pager", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Pager = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("memory-pager", JSImport.Namespace)
  @js.native
  /**
    * Create a new pager.
    * @param pageSize defaults to 1024.
    */
  open class Class ()
    extends StObject
       with PagerInstance {
    def this(pageSize: Double) = this()
  }
  
  trait Page extends StObject {
    
    var buffer: Buffer
    
    var offset: Double
  }
  object Page {
    
    inline def apply(buffer: Buffer, offset: Double): Page = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    extension [Self <: Page](x: Self) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pager
    extends StObject
       with /**
    * Create a new pager.
    * @param pageSize defaults to 1024.
    */
  Instantiable0[PagerInstance]
       with Instantiable1[/* pageSize */ Double, PagerInstance] {
    
    /**
      * Create a new pager.
      * @param pageSize defaults to 1024.
      */
    def apply(): PagerInstance = js.native
    def apply(pageSize: Double): PagerInstance = js.native
  }
  
  @js.native
  trait PagerInstance extends StObject {
    
    /**
      * Get a page. The page will be allocated at first access.
      * @param pageNumber
      * @param noAllocate will make the method return `undefined` if no page has been allocated already
      */
    def get(pageNumber: Double): Page = js.native
    @JSName("get")
    def get_false(pageNumber: Double, noAllocate: `false`): Page = js.native
    @JSName("get")
    def get_true(pageNumber: Double, noAllocate: `true`): js.UndefOr[Page] = js.native
    
    /**
      * Get the last page that was updated.
      */
    def lastUpdate(): Page | Null = js.native
    
    /**
      * Explicitly set the buffer for a page.
      */
    def set(pageNumber: Double, buffer: Buffer): Unit = js.native
    
    /**
      * Concat all pages allocated pages into a single buffer.
      */
    def toBuffer(): Buffer = js.native
    
    /**
      * Mark a page as updated.
      */
    def updated(page: Page): Unit = js.native
  }
  
  type _To = js.Object & Pager
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Pager = ^
}
