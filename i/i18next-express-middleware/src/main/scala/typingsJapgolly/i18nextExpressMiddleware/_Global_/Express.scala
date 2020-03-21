package typingsJapgolly.i18nextExpressMiddleware._Global_

import typingsJapgolly.i18next.mod.TFunction
import typingsJapgolly.i18next.mod.TFunctionKeys
import typingsJapgolly.i18next.mod.TFunctionResult
import typingsJapgolly.i18next.mod.TOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Express")
@js.native
object Express extends js.Object {
  @js.native
  trait Request extends js.Object {
    var i18n: typingsJapgolly.i18next.mod.i18n = js.native
    var language: String = js.native
    var languages: js.Array[String] = js.native
    @JSName("t")
    var t_Original: TFunction = js.native
    // basic usage
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap]): TResult = js.native
  }
  
}

