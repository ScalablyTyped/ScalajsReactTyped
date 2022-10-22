package typingsJapgolly.parameter.mod

import typingsJapgolly.parameter.anon.Type
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def CONVERT_MAP: Record[String, js.UndefOr[ParameterConvertType]] = ^.asInstanceOf[js.Dynamic].selectDynamic("CONVERT_MAP").asInstanceOf[Record[String, js.UndefOr[ParameterConvertType]]]
inline def CONVERT_MAP_=(x: Record[String, js.UndefOr[ParameterConvertType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONVERT_MAP")(x.asInstanceOf[js.Any])

inline def TYPE_MAP: Record[String, js.UndefOr[ParameterCheckFunction[String]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_MAP").asInstanceOf[Record[String, js.UndefOr[ParameterCheckFunction[String]]]]

inline def addRule[T /* <: String */](`type`: T, check: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: js.RegExp, convertType: ParameterConvertType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: js.RegExp, `override`: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: js.RegExp, `override`: Boolean, convertType: ParameterConvertType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: js.RegExp, `override`: Unit, convertType: ParameterConvertType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]
/* static member */
inline def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * Add custom rules
  * @param type
  * @param check
  * @param override Override exist rules. Default: `true`
  * @param convertType Make parameter convert the input param to the specific type
  */
/* static member */
inline def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T], convertType: ParameterConvertType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T], `override`: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](
  `type`: T,
  check: ParameterCheckFunction[T],
  `override`: Boolean,
  convertType: ParameterConvertType
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T], `override`: Unit, convertType: ParameterConvertType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]

type ParameterCheckFunction[T /* <: String */] = js.Function2[
/* rule */ ParameterRuleCustom & Type[T], 
/* value */ Any, 
String | js.Array[ValidateError] | Unit]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parameter.parameterStrings.int
  - typingsJapgolly.parameter.parameterStrings.number
  - typingsJapgolly.parameter.parameterStrings.string
  - typingsJapgolly.parameter.parameterStrings.bool
  - typingsJapgolly.parameter.parameterStrings.boolean
  - js.Function1[/ * value * / scala.Any, scala.Any]
*/
type ParameterConvertType = _ParameterConvertType | (js.Function1[/* value */ Any, Any])

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parameter.mod.ParameterRuleItem
  - typingsJapgolly.parameter.mod.ParameterRuleAbbr
  - scala.Unit
*/
type ParameterRule = js.UndefOr[_ParameterRule | ParameterRuleBoolean | js.Array[Any] | js.RegExp]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parameter.parameterStrings.int
  - typingsJapgolly.parameter.parameterStrings.intQuestionmark
  - typingsJapgolly.parameter.parameterStrings.integer
  - typingsJapgolly.parameter.parameterStrings.integerQuestionmark
  - typingsJapgolly.parameter.parameterStrings.number
  - typingsJapgolly.parameter.parameterStrings.numberQuestionmark
  - typingsJapgolly.parameter.parameterStrings.date
  - typingsJapgolly.parameter.parameterStrings.dateQuestionmark
  - typingsJapgolly.parameter.parameterStrings.dateTime
  - typingsJapgolly.parameter.parameterStrings.dateTimeQuestionmark
  - typingsJapgolly.parameter.parameterStrings.datetime_
  - typingsJapgolly.parameter.parameterStrings.datetimeQuestionmark
  - typingsJapgolly.parameter.parameterStrings.id
  - typingsJapgolly.parameter.parameterStrings.idQuestionmark
  - typingsJapgolly.parameter.parameterStrings.boolean
  - typingsJapgolly.parameter.parameterStrings.booleanQuestionmark
  - typingsJapgolly.parameter.parameterStrings.bool
  - typingsJapgolly.parameter.parameterStrings.boolQuestionmark
  - typingsJapgolly.parameter.parameterStrings.string
  - typingsJapgolly.parameter.parameterStrings.stringQuestionmark
  - typingsJapgolly.parameter.parameterStrings.email
  - typingsJapgolly.parameter.parameterStrings.emailQuestionmark
  - typingsJapgolly.parameter.parameterStrings.password
  - typingsJapgolly.parameter.parameterStrings.passwordQuestionmark
  - typingsJapgolly.parameter.parameterStrings.`object`
  - typingsJapgolly.parameter.parameterStrings.objectQuestionmark
  - typingsJapgolly.parameter.parameterStrings.array
  - typingsJapgolly.parameter.parameterStrings.arrayQuestionmark
  - js.Array[scala.Any]
  - js.RegExp
*/
type ParameterRuleAbbr = _ParameterRuleAbbr | js.Array[Any] | js.RegExp

type ParameterRuleBoolean = ParameterRuleBase

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parameter.mod.ParameterRuleCustom
  - typingsJapgolly.parameter.mod.ParameterRuleNumber
  - typingsJapgolly.parameter.mod.ParameterRuleString
  - typingsJapgolly.parameter.mod.ParameterRuleID
  - typingsJapgolly.parameter.mod.ParameterRuleDateTime
  - typingsJapgolly.parameter.mod.ParameterRuleEmail
  - typingsJapgolly.parameter.mod.ParameterRuleUrl
  - typingsJapgolly.parameter.mod.ParameterRuleBoolean
  - typingsJapgolly.parameter.mod.ParameterRulePassword
  - typingsJapgolly.parameter.mod.ParameterRuleEnum
  - typingsJapgolly.parameter.mod.ParameterRuleObject
  - typingsJapgolly.parameter.mod.ParameterRuleArray
*/
type ParameterRuleItem = _ParameterRuleItem | ParameterRuleBoolean
