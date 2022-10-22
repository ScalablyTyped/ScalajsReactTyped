package typingsJapgolly.pulumiQuery

import typingsJapgolly.pulumiQuery.interfacesMod.AsyncQuerySource
import typingsJapgolly.pulumiQuery.interfacesMod.AsyncQueryable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pulumi/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty[TResult](): AsyncQueryable[TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[AsyncQueryable[TResult]]
  
  inline def from[TSource](source: AsyncQuerySource[TSource]): AsyncQueryable[TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncQueryable[TSource]]
  
  inline def range(start: Double): AsyncQueryable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[AsyncQueryable[Double]]
  inline def range(start: Double, stop: Double): AsyncQueryable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[AsyncQueryable[Double]]
  
  inline def repeat[TSource](t: TSource): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
