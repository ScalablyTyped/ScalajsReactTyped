package typingsJapgolly.pulumiQuery

import typingsJapgolly.pulumiQuery.interfacesMod.AsyncQuerySource
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesMod {
  
  @JSImport("@pulumi/query/sources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def from[TSource](source: AsyncQuerySource[TSource]): AsyncIterable[TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[TSource]]
  
  inline def range(start: Double): AsyncIterable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[Double]]
  inline def range(start: Double, end: Double): AsyncIterable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[Double]]
}
