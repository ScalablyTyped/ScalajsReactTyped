package typingsJapgolly.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atAngularCompiler.Anon_KeyQuoted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltinConverterFactory extends js.Object {
  def createLiteralArrayConverter(argCount: Double): BuiltinConverter
  def createLiteralMapConverter(keys: js.Array[Anon_KeyQuoted]): BuiltinConverter
  def createPipeConverter(name: String, argCount: Double): BuiltinConverter
}

object BuiltinConverterFactory {
  @scala.inline
  def apply(
    createLiteralArrayConverter: Double => CallbackTo[BuiltinConverter],
    createLiteralMapConverter: js.Array[Anon_KeyQuoted] => CallbackTo[BuiltinConverter],
    createPipeConverter: (String, Double) => CallbackTo[BuiltinConverter]
  ): BuiltinConverterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createLiteralArrayConverter")(js.Any.fromFunction1((t0: scala.Double) => createLiteralArrayConverter(t0).runNow()))
    __obj.updateDynamic("createLiteralMapConverter")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.atAngularCompiler.Anon_KeyQuoted]) => createLiteralMapConverter(t0).runNow()))
    __obj.updateDynamic("createPipeConverter")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => createPipeConverter(t0, t1).runNow()))
    __obj.asInstanceOf[BuiltinConverterFactory]
  }
}

