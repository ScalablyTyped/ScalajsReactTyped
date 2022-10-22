package typingsJapgolly.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BNODE = String

type BOOL = Boolean

type DECIMAL = Double

type DOUBLE = Double

type INTEGER = Double

type IRI = String

type IRIREF = String

type LANGTAG = String

type STRING = String

type numericLiteral = INTEGER | DECIMAL | DOUBLE

type objectValue = IRIREF | ObjectLiteral

type shapeDeclLabel = IRIREF | BNODE

type shapeDeclRef = shapeDeclLabel

type shapeExprOrRef = shapeExpr | shapeDeclRef

type tripleExprLabel = IRIREF | BNODE

type tripleExprOrRef = tripleExpr | tripleExprRef

type tripleExprRef = tripleExprLabel

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.shexj.mod.objectValue
  - typingsJapgolly.shexj.mod.IriStem
  - typingsJapgolly.shexj.mod.IriStemRange
  - typingsJapgolly.shexj.mod.LiteralStem
  - typingsJapgolly.shexj.mod.LiteralStemRange
  - typingsJapgolly.shexj.mod.Language
  - typingsJapgolly.shexj.mod.LanguageStem
  - typingsJapgolly.shexj.mod.LanguageStemRange
*/
type valueSetValue = _valueSetValue | objectValue
