package typingsJapgolly.jsonLogicJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsonLogicJs.jsonLogicJsInts.`80`
import typingsJapgolly.jsonLogicJs.mod.^
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addOperation(name: String, code: js.Function1[/* repeated */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_operation")(name.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def apply(logic: RulesLogic[AdditionalOperation]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(logic.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def apply(logic: RulesLogic[AdditionalOperation], data: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(logic.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getOperator(logic: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_operator")(logic.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getValues(logic: Record[String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_values")(logic.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def isLogic(logic: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_logic")(logic.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def rmOperation(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rm_operation")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ruleLike(rule: Any, pattern: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rule_like")(rule.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def truthy(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("truthy")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def usesData(logic: Record[String, Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uses_data")(logic.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

/* Inlined std.Partial<std.Record<json-logic-js.json-logic-js.ReservedOperations, never>> & {[k: string] : any} */
type AdditionalOperation = StringDictionary[Any]

/**
  * Used for the "if" operation, which takes an array of odd length
  * and a minimum of three (3) elements.
  */
type AnyArrayOfOddLengthMin3 = /* import warning: importer.ImportType#apply c repeated non-array type: []['length'] extends json-logic-js.json-logic-js.MAXIMUM_ALLOWED_BOUNDARY ? [] : [any, any] extends [] ? [] : [] extends [] ? json-logic-js.json-logic-js.Mapped<[any, any], [any, any], [...[], 1]> : json-logic-js.json-logic-js.Mapped<[any, any], [] | [...[], ...[any, any]], [...[], 1]> */ js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: []['length'] extends json-logic-js.json-logic-js.MAXIMUM_ALLOWED_BOUNDARY ? [] : [any, any] extends [] ? [] : [] extends [] ? json-logic-js.json-logic-js.Mapped<[any, any], [any, any], [...[], 1]> : json-logic-js.json-logic-js.Mapped<[any, any], [] | [...[], ...[any, any]], [...[], 1]> */ js.Any]

/**
  * This is a utility type used below for the "if" operation.
  * Original: https://stackoverflow.com/a/68373774/765987
  */
type MAXIMUM_ALLOWED_BOUNDARY = `80`

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - java.lang.String
  - scala.Double
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicVar[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicMissing[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicMissingSome[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicIf
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicEqual
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicStrictEqual
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicNotEqual
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicStrictNotEqual
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicNegation
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicDoubleNegation
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicOr[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicAnd[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicGreaterThan[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicGreaterThanOrEqual[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicLessThan[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicLessThanOrEqual[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicMax[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicMin[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicSum[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicDifference[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicProduct[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicQuotient[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicRemainder[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicMap[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicFilter[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicReduce[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicAll[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicNone[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicSome[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicMerge[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicInArray[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicInString[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicCat[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicSubstr[AddOps]
  - typingsJapgolly.jsonLogicJs.mod.JsonLogicLog[AddOps]
  - AddOps
*/
type RulesLogic[AddOps /* <: AdditionalOperation */] = _RulesLogic[AddOps] | Boolean | String | Double | AddOps
