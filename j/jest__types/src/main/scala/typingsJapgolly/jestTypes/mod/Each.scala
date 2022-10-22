package typingsJapgolly.jestTypes.mod

import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Each[EachFn /* <: TestFn | BlockFn */] extends StObject {
  
  def apply[T](strings: TemplateStringsArray, expressions: (Any | T)*): js.Function3[
    /* name */ String | NameLike, 
    /* fn */ js.Function1[/* arg */ Record[String, T], ReturnType[EachFn]], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  def apply[T /* <: Record[String, Any] */](table: js.Array[T]): js.Function3[
    /* name */ String | NameLike, 
    /* fn */ js.Function1[/* arg */ T, ReturnType[EachFn]], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
}
