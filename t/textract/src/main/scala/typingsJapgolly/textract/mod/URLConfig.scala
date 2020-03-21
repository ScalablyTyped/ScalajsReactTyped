package typingsJapgolly.textract.mod

import typingsJapgolly.node.childProcessMod.ExecException
import typingsJapgolly.textract.AnonCmd
import typingsJapgolly.textract.AnonCrop
import typingsJapgolly.textract.AnonLang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLConfig extends Config {
  /**
    * Used with fromUrl, if set, rather than using the content-type from the URL request, will use the provided typeOverride.
    */
  var typeOverride: js.UndefOr[String] = js.undefined
}

object URLConfig {
  @scala.inline
  def apply(
    doc: extractorExecOpts = null,
    dxf: extractorExecOpts = null,
    exec: ExecException = null,
    images: extractorExecOpts = null,
    includeAltText: js.UndefOr[Boolean] = js.undefined,
    pdftotextOptions: AnonCrop = null,
    preserveLineBreaks: js.UndefOr[Boolean] = js.undefined,
    preserveOnlyMultipleLineBreaks: js.UndefOr[Boolean] = js.undefined,
    rtf: extractorExecOpts = null,
    tesseract: AnonLang | AnonCmd = null,
    typeOverride: String = null
  ): URLConfig = {
    val __obj = js.Dynamic.literal()
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    if (dxf != null) __obj.updateDynamic("dxf")(dxf.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAltText)) __obj.updateDynamic("includeAltText")(includeAltText.asInstanceOf[js.Any])
    if (pdftotextOptions != null) __obj.updateDynamic("pdftotextOptions")(pdftotextOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveLineBreaks)) __obj.updateDynamic("preserveLineBreaks")(preserveLineBreaks.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveOnlyMultipleLineBreaks)) __obj.updateDynamic("preserveOnlyMultipleLineBreaks")(preserveOnlyMultipleLineBreaks.asInstanceOf[js.Any])
    if (rtf != null) __obj.updateDynamic("rtf")(rtf.asInstanceOf[js.Any])
    if (tesseract != null) __obj.updateDynamic("tesseract")(tesseract.asInstanceOf[js.Any])
    if (typeOverride != null) __obj.updateDynamic("typeOverride")(typeOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLConfig]
  }
}

