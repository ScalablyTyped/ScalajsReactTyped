package typingsJapgolly.n3.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.n3.mod.^
import typingsJapgolly.std.Lowercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def termFromId(
  id: String,
  factory: typingsJapgolly.rdfjsTypes.dataModelMod.DataFactory[
  typingsJapgolly.rdfjsTypes.dataModelMod.Quad, 
  typingsJapgolly.rdfjsTypes.dataModelMod.Quad
]
): Term = (^.asInstanceOf[js.Dynamic].applyDynamic("termFromId")(id.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Term]

inline def termToId(term: Term): String = ^.asInstanceOf[js.Dynamic].applyDynamic("termToId")(term.asInstanceOf[js.Any]).asInstanceOf[String]

type BaseFormatVariant = BaseFormat | Lowercase[BaseFormat]

type ErrorCallback = js.Function2[/* err */ js.Error, /* result */ Any, Unit]

type MimeFormat = MimeSubtype | (/* template literal string: ${MimeType}/${MimeSubtype} */ String)

type MimeSubtype = BaseFormatVariant | (/* template literal string: ${BaseFormatVariant}${Star} */ String)

type OTerm = typingsJapgolly.rdfjsTypes.dataModelMod.Term | String | Null

type ParseCallback[Q /* <: BaseQuad */] = js.Function3[
/* error */ js.Error, 
/* quad */ Q, 
/* prefixes */ Prefixes[typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode[String]], 
Unit]

type PrefixCallback = js.Function2[
/* prefix */ String, 
/* prefixNode */ typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode[String], 
Unit]

type PrefixedToIri = js.Function1[/* suffix */ String, NamedNode[String]]

type Prefixes[I] = StringDictionary[I]

type QuadCallback[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, Unit]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.n3.mod.DefaultGraph
  - typingsJapgolly.n3.mod.NamedNode[java.lang.String]
  - typingsJapgolly.n3.mod.BlankNode
  - typingsJapgolly.n3.mod.Variable
*/
type QuadGraph = _QuadGraph | NamedNode[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.n3.mod.NamedNode[java.lang.String]
  - typingsJapgolly.n3.mod.Literal
  - typingsJapgolly.n3.mod.BlankNode
  - typingsJapgolly.n3.mod.Variable
*/
type QuadObject = _QuadObject | NamedNode[String]

type QuadPredicate[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, Boolean]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.n3.mod.NamedNode[java.lang.String]
  - typingsJapgolly.n3.mod.BlankNode
  - typingsJapgolly.n3.mod.Variable
*/
type QuadSubject = _QuadSubject | NamedNode[String]

type Quad_Predicate = NamedNode[String] | Variable

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.n3.mod.NamedNode[java.lang.String]
  - typingsJapgolly.n3.mod.BlankNode
  - typingsJapgolly.n3.mod.Literal
  - typingsJapgolly.n3.mod.Variable
  - typingsJapgolly.n3.mod.DefaultGraph
*/
type Term = _Term | NamedNode[String]

type TokenCallback = js.Function2[/* error */ js.Error, /* token */ Token, Unit]
