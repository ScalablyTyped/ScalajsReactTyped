package typingsJapgolly.breeze.breeze

import typingsJapgolly.breeze.anon.EntityErrors
import typingsJapgolly.breeze.breeze.core.EnumSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ExecuteQueryErrorCallback = js.Function1[/* error */ typingsJapgolly.breeze.anon.EntityManager, Unit]

type ExecuteQuerySuccessCallback = js.Function1[/* data */ QueryResult, Unit]

type MergeStrategySymbol = EnumSymbol

type SaveChangesErrorCallback = js.Function1[/* error */ EntityErrors, Unit]

type SaveChangesSuccessCallback = js.Function1[/* saveResult */ SaveResult, Unit]

type ValidatorFunction = js.Function2[/* value */ Any, /* context */ ValidatorFunctionContext, Unit]
