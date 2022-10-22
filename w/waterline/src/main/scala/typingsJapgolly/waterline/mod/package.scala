package typingsJapgolly.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Adapter = js.Object

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.waterline.mod.StringAttribute
  - typingsJapgolly.waterline.mod.EmailAttribute
  - typingsJapgolly.waterline.mod.IntegerAttribute
  - typingsJapgolly.waterline.mod.NumberAttribute
  - typingsJapgolly.waterline.mod.FloatAttribute
  - typingsJapgolly.waterline.mod.DateAttribute
  - typingsJapgolly.waterline.mod.TimeAttribute
  - typingsJapgolly.waterline.mod.DatetimeAttribute
  - typingsJapgolly.waterline.mod.BooleanAttribute
  - typingsJapgolly.waterline.mod.BinaryAttribute
  - typingsJapgolly.waterline.mod.ArrayAttribute
  - typingsJapgolly.waterline.mod.JsonAttribute
  - typingsJapgolly.waterline.mod.OneToOneAttribute
  - typingsJapgolly.waterline.mod.OneToManyAttribute
  - typingsJapgolly.waterline.mod.ManyToManyAttribute
  - typingsJapgolly.waterline.mod.FunctionAttribute
*/
type Attribute = _Attribute | String | FunctionAttribute

type AttributeValidation[T] = T | AttributeValidationSyncFn[T] | AttributeValidationAsyncFn[T]

type AttributeValidationAsyncFn[T] = js.Function1[/* cb */ js.Function1[/* value */ T, Any], Unit]

type AttributeValidationSyncFn[T] = js.Function0[T]

type Callback[T] = js.Function2[/* err */ Any, /* result */ T, Any]

type Collection = CollectionDefinition

type CollectionClass = js.Function0[Collection]

type DefaultsToFn[T] = js.Function0[T]

type FunctionAttribute = js.Function0[Any]
