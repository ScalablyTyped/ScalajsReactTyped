package typingsJapgolly.n3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorCallback = js.Function2[/* err */ js.Error, /* result */ js.Any, scala.Unit]
  type Logger = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  type OTerm = typingsJapgolly.rdfJs.mod.Term | java.lang.String | scala.Null
  type ParseCallback[Q /* <: typingsJapgolly.n3.mod.BaseQuad */] = js.Function3[
    /* error */ js.Error, 
    /* quad */ Q, 
    /* prefixes */ typingsJapgolly.n3.mod.Prefixes[typingsJapgolly.rdfJs.mod.NamedNode], 
    scala.Unit
  ]
  type PrefixedToIri = js.Function1[/* suffix */ java.lang.String, typingsJapgolly.n3.mod.NamedNode]
  type Prefixes[I] = org.scalablytyped.runtime.StringDictionary[I]
  type QuadCallback[Q /* <: typingsJapgolly.n3.mod.BaseQuad */] = js.Function1[/* result */ Q, scala.Unit]
  type QuadPredicate[Q /* <: typingsJapgolly.n3.mod.BaseQuad */] = js.Function1[/* result */ Q, scala.Boolean]
}
