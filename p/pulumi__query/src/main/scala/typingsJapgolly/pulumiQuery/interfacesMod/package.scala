package typingsJapgolly.pulumiQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type AsyncQuerySource[TSource] = js.Iterable[TSource] | typingsJapgolly.pulumiQuery.interfacesMod.AsyncIterable[TSource] | (js.Promise[
    typingsJapgolly.pulumiQuery.interfacesMod.AsyncIterable[TSource] | js.Iterable[TSource]
  ])
  type Evaluator[TSource, TResult] = js.Function1[
    /* source */ typingsJapgolly.pulumiQuery.interfacesMod.AsyncIterableIterator[TSource], 
    js.Promise[TResult]
  ]
  type Operator[TSource, TResult] = js.Function1[
    /* source */ typingsJapgolly.pulumiQuery.interfacesMod.AsyncIterableIterator[TSource], 
    typingsJapgolly.pulumiQuery.interfacesMod.AsyncIterableIterator[TResult]
  ]
  type OrderKey = java.lang.String | scala.Double
}
