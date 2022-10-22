package typingsJapgolly.mathjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.decimalJs.mod.Decimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// eslint-disable-next-line @typescript-eslint/no-empty-interface
type BigNumber = Decimal

// eslint-disable-next-line @typescript-eslint/no-explicit-any
type FactoryFunction[T] = js.Function1[/* scope */ Any, T]

type ImportObject = // eslint-disable-next-line @typescript-eslint/no-explicit-any
StringDictionary[Any]

type MathArray = js.Array[js.Array[MathNumericType] | MathNumericType]

type MathCollection = MathArray | Matrix

type MathExpression = String | js.Array[String] | MathCollection

/**
  * @deprecated since version 11.3. Prefer `MathNode` instead
  */
type MathNodeCommon = MathNode

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsJapgolly.mathjs.mod.BigNumber
  - typingsJapgolly.mathjs.mod.Fraction
  - typingsJapgolly.mathjs.mod.Complex
*/
type MathNumericType = _MathNumericType | Double | BigNumber

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mathjs.mod.MathNumericType
  - typingsJapgolly.mathjs.mod.Unit
  - typingsJapgolly.mathjs.mod.MathCollection
*/
type MathType = _MathType | MathCollection | Double | BigNumber

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mathjs.anon.Assuming
  - typingsJapgolly.mathjs.anon.ImposeContext
  - java.lang.String
  - js.Function1[
/ * node * / typingsJapgolly.mathjs.mod.MathNode, 
typingsJapgolly.mathjs.mod.MathNode]
*/
type SimplifyRule = _SimplifyRule | (js.Function1[/* node */ MathNode, MathNode]) | String
