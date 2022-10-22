package typingsJapgolly.jestTypes.mod

import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBase extends StObject {
  
  def apply(blockName: BlockNameLike, blockFn: BlockFn): Unit = js.native
  
  def each[T](strings: TemplateStringsArray, expressions: (Any | T)*): js.Function3[
    /* name */ String | NameLike, 
    /* fn */ js.Function1[/* arg */ Record[String, T], ReturnType[BlockFn]], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  def each[T /* <: Record[String, Any] */](table: js.Array[T]): js.Function3[
    /* name */ String | NameLike, 
    /* fn */ js.Function1[/* arg */ T, ReturnType[BlockFn]], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  @JSName("each")
  var each_Original: Each[BlockFn] = js.native
}
