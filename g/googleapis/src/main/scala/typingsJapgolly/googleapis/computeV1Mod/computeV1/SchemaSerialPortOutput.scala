package typingsJapgolly.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance&#39;s serial console output.
  */
@js.native
trait SchemaSerialPortOutput extends js.Object {
  /**
    * [Output Only] The contents of the console output.
    */
  var contents: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#serialPortOutput for
    * serial port output.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] The position of the next byte of content from the serial
    * console output. Use this value in the next request as the start
    * parameter.
    */
  var next: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The starting byte position of the output that was returned. This should
    * match the start parameter sent with the request. If the serial console
    * output exceeds the size of the buffer, older output will be overwritten
    * by newer content and the start values will be mismatched.
    */
  var start: js.UndefOr[String] = js.native
}

object SchemaSerialPortOutput {
  @scala.inline
  def apply(
    contents: String = null,
    kind: String = null,
    next: String = null,
    selfLink: String = null,
    start: String = null
  ): SchemaSerialPortOutput = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSerialPortOutput]
  }
}

