package typingsJapgolly.wechatMiniprogram

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Required
import typingsJapgolly.wechatMiniprogram.anon.OptionalRecordcompletesuc
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.complete
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.fail
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyArray = js.Array[Any]

type AnyObject = StringDictionary[Any]

type IAPIFunction[T, P /* <: IAPIParam[T] */] = js.Function1[/* param */ js.UndefOr[P], js.Promise[T]]

type ICloudServices = StringDictionary[ICloudService]

type OQ[T /* <: OptionalRecordcompletesuc */] = (RQ[T] & (Required[Pick[T, success]])) | (RQ[T] & (Required[Pick[T, fail]])) | (RQ[T] & (Required[Pick[T, complete]])) | (RQ[T] & (Required[Pick[T, success | fail]])) | (RQ[T] & (Required[Pick[T, success | complete]])) | (RQ[T] & (Required[Pick[T, fail | complete]])) | (RQ[T] & (Required[Pick[T, fail | complete | success]]))

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ K in keyof T ]:? T[K]}
  }}}
  */
type Optional[T] = T

type RQ[T /* <: OptionalRecordcompletesuc */] = Pick[T, Exclude[/* keyof T */ String, complete | success | fail]]
