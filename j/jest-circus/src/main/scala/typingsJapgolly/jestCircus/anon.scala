package typingsJapgolly.jestCircus

import typingsJapgolly.jestTypes.mod.BlockFn
import typingsJapgolly.jestTypes.mod.BlockNameLike
import typingsJapgolly.jestTypes.mod.EachTestFn
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(blockName: BlockNameLike, blockFn: BlockFn): Unit = js.native
    
    def each(args: Any*): ReturnType[Any] = js.native
    @JSName("each")
    var each_Original: EachTestFn[Any] = js.native
  }
  
  @js.native
  trait Each extends StObject {
    
    def apply(blockName: BlockNameLike, blockFn: BlockFn): Unit = js.native
    
    def each(args: Any*): ReturnType[Any] = js.native
    @JSName("each")
    var each_Original: EachTestFn[Any] = js.native
    
    def only(blockName: BlockNameLike, blockFn: BlockFn): Unit = js.native
    @JSName("only")
    var only_Original: Call = js.native
    
    def skip(blockName: BlockNameLike, blockFn: BlockFn): Unit = js.native
    @JSName("skip")
    var skip_Original: Call = js.native
  }
}
