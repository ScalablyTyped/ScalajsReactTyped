package typingsJapgolly.dymoLabelFramework.dymo.label.framework

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * ILabelSetRecord instance holds data of one LabelSet record. ILabelSetRecord provides
	 * methods for adding data to the record. To create ILabelSetRecord instance,
	 * use dymo.label.framework.LabelSetBuilder.prototype.addRecord method.
	 */
trait ILabelSetRecord extends js.Object {
  /**
  		 * Adds image data to the record.
  		 *
    	 * @param objectName The name of the object that the markup is set for.
    	 * @param base64Image The string containing the base64-encoded PNG image stream.
  		 *
  		 * @returns self
  		 */
  def setBase64Image(objectName: String, base64Image: String): ILabelSetRecord
  /** Adds data to the record specified as plain text.
  		 *
    * @param objectName The name of the object that the markup is set for.
    * @param text The object text to set.
  		 *
  		 * @returns self
  		 */
  def setText(objectName: String, text: String): ILabelSetRecord
  /**
  		 * Adds data to the record specified as text markup.
  		 *
  		 * @param objectName The name of the object that the markup is set for.
    	 * @param textMarkup The markup string. See [TextMarkup.xsd]{@link http://labelwriter.com/software/dls/sdk/TextMarkup.xsd}.
  		 *
  		 * @returns self
  		 */
  def setTextMarkup(objectName: String, textMarkup: String): ILabelSetRecord
}

object ILabelSetRecord {
  @scala.inline
  def apply(
    setBase64Image: (String, String) => CallbackTo[ILabelSetRecord],
    setText: (String, String) => CallbackTo[ILabelSetRecord],
    setTextMarkup: (String, String) => CallbackTo[ILabelSetRecord]
  ): ILabelSetRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setBase64Image")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setBase64Image(t0, t1).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setText(t0, t1).runNow()))
    __obj.updateDynamic("setTextMarkup")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setTextMarkup(t0, t1).runNow()))
    __obj.asInstanceOf[ILabelSetRecord]
  }
}

