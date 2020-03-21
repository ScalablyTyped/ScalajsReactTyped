package typingsJapgolly.clownface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddCallback[D /* <: typingsJapgolly.rdfJs.mod.DatasetCore[typingsJapgolly.rdfJs.mod.Quad, typingsJapgolly.rdfJs.mod.Quad] */, X /* <: typingsJapgolly.rdfJs.mod.Term */] = js.Function1[/* added */ typingsJapgolly.clownface.mod.SingleContextClownface[D, X], scala.Unit]
  type ClownfaceInitWithNodes[D /* <: typingsJapgolly.rdfJs.mod.DatasetCore[typingsJapgolly.rdfJs.mod.Quad, typingsJapgolly.rdfJs.mod.Quad] */, T /* <: typingsJapgolly.rdfJs.mod.Term */] = ((typingsJapgolly.clownface.mod.ClownfaceInit[D, typingsJapgolly.rdfJs.mod.Term]) with typingsJapgolly.clownface.mod.WithTerms[T]) | ((typingsJapgolly.clownface.mod.ClownfaceInit[D, typingsJapgolly.rdfJs.mod.Term]) with typingsJapgolly.clownface.mod.WithValues)
  type ClownfaceInitWithSingleNode[D /* <: typingsJapgolly.rdfJs.mod.DatasetCore[typingsJapgolly.rdfJs.mod.Quad, typingsJapgolly.rdfJs.mod.Quad] */, T /* <: typingsJapgolly.rdfJs.mod.Term */] = ((typingsJapgolly.clownface.mod.ClownfaceInit[D, typingsJapgolly.rdfJs.mod.Term]) with typingsJapgolly.clownface.mod.WithSingleTerm[T]) | ((typingsJapgolly.clownface.mod.ClownfaceInit[D, typingsJapgolly.rdfJs.mod.Term]) with typingsJapgolly.clownface.mod.WithSingleValue)
  type SingleOrArray[T] = T | js.Array[T]
  type SingleOrArrayOfTerms = typingsJapgolly.clownface.mod.SingleOrArray[typingsJapgolly.clownface.mod.TermOrClownface]
  type SingleOrArrayOfTermsOrLiterals = typingsJapgolly.clownface.mod.SingleOrArray[typingsJapgolly.clownface.mod.TermOrLiteral]
  type SingleOrOneElementArray[T] = T | js.Array[T]
  type TermOrClownface = (typingsJapgolly.clownface.mod.Clownface[
    typingsJapgolly.rdfJs.mod.DatasetCore[typingsJapgolly.rdfJs.mod.Quad, typingsJapgolly.rdfJs.mod.Quad], 
    typingsJapgolly.rdfJs.mod.Term
  ]) | typingsJapgolly.rdfJs.mod.Term
  type TermOrLiteral = typingsJapgolly.clownface.mod.TermOrClownface | java.lang.String | scala.Double | scala.Boolean
}
