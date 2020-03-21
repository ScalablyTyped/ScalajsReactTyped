package typingsJapgolly.ajv.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ajv.AnonCopy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilationContext extends js.Object {
  var async: Boolean
  var baseId: String
  var compositeRule: Boolean
  var dataLevel: Double
  var dataPathArr: js.Array[String]
  var formats: StringDictionary[js.UndefOr[FormatDefinition]]
  var level: Double
  var opts: Options
  var schema: js.Any
  var schemaPath: String
  var self: Ajv
  var util: AnonCopy
  def validate(schema: js.Object): Boolean
}

object CompilationContext {
  @scala.inline
  def apply(
    async: Boolean,
    baseId: String,
    compositeRule: Boolean,
    dataLevel: Double,
    dataPathArr: js.Array[String],
    formats: StringDictionary[js.UndefOr[FormatDefinition]],
    level: Double,
    opts: Options,
    schema: js.Any,
    schemaPath: String,
    self: Ajv,
    util: AnonCopy,
    validate: js.Object => CallbackTo[Boolean]
  ): CompilationContext = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], baseId = baseId.asInstanceOf[js.Any], compositeRule = compositeRule.asInstanceOf[js.Any], dataLevel = dataLevel.asInstanceOf[js.Any], dataPathArr = dataPathArr.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: js.Object) => validate(t0).runNow()))
    __obj.asInstanceOf[CompilationContext]
  }
}

