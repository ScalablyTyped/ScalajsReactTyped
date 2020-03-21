package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
import typingsJapgolly.angularCompiler.coreMod.ViewEncapsulation
import typingsJapgolly.angularCompiler.mlParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimations extends js.Object {
  var animations: js.Array[_]
  var encapsulation: ViewEncapsulation | Null
  var externalStylesheets: js.Array[CompileStylesheetMetadata]
  var htmlAst: ParseTreeResult | Null
  var interpolation: (js.Tuple2[String, String]) | Null
  var isInline: Boolean
  var ngContentSelectors: js.Array[String]
  var preserveWhitespaces: Boolean
  var styleUrls: js.Array[String]
  var styles: js.Array[String]
  var template: String | Null
  var templateUrl: String | Null
}

object AnonAnimations {
  @scala.inline
  def apply(
    animations: js.Array[_],
    externalStylesheets: js.Array[CompileStylesheetMetadata],
    isInline: Boolean,
    ngContentSelectors: js.Array[String],
    preserveWhitespaces: Boolean,
    styleUrls: js.Array[String],
    styles: js.Array[String],
    encapsulation: ViewEncapsulation = null,
    htmlAst: ParseTreeResult = null,
    interpolation: js.Tuple2[String, String] = null,
    template: String = null,
    templateUrl: String = null
  ): AnonAnimations = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], externalStylesheets = externalStylesheets.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    if (encapsulation != null) __obj.updateDynamic("encapsulation")(encapsulation.asInstanceOf[js.Any])
    if (htmlAst != null) __obj.updateDynamic("htmlAst")(htmlAst.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimations]
  }
}

