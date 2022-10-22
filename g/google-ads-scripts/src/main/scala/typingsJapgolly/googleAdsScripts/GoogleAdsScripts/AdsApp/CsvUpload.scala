package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bulk Upload which can be incrementally built up in CSV format and uploaded to the Bulk Uploads service. */
trait CsvUpload extends StObject {
  
  /**
    * Appends a row to the Bulk Upload.
    *
    * The row object is a key-value map. For each key-value pair:
    *
    * If the key exists in the provided column headers, its value will fill into the cell corresponding to the matching column;
    * If it doesn't exist, the key-value pair is ignored.
    *
    *      // The resulting CSV bulk upload of the following code would be:
    *      // +-------------+-------------+----------------+
    *      // |   Campaign  | Campaign ID | Campaign state |
    *      // +-------------+-------------+----------------+
    *      // | Campaign #2 |  2001684997 |     enabled    |
    *      // +-------------+-------------+----------------+
    *      var bulkUpload = AdsApp.bulkUploads().newCsvUpload([
    *          "Campaign",
    *          "Campaign ID",
    *          "Campaign state"]);
    *      bulkUpload.append({
    *          "Campaign":"Campaign #2",
    *          "Campaign ID":"2001684997",
    *          "Campaign state":"enabled"});
    */
  def append(row: Record[String, String | Double]): this.type
  
  /**
    * Uploads the file and applies the changes.
    *
    * **When previewing a script, apply() previews the Bulk Upload instead of applying it.**
    */
  @JSName("apply")
  def apply(): Unit
  
  /** Specifies that this upload is used for Campaign Management entity changes. */
  def forCampaignManagement(): this.type
  
  /** Specifies that this upload is used for reporting offline conversions. */
  def forOfflineConversions(): this.type
  
  /** Uploads the file and previews the changes. */
  def preview(): Unit
  
  /** Sets the file name of the uploaded file. */
  def setFileName(fileName: String): this.type
}
object CsvUpload {
  
  inline def apply(
    append: Record[String, String | Double] => CsvUpload,
    apply: Callback,
    forCampaignManagement: CallbackTo[CsvUpload],
    forOfflineConversions: CallbackTo[CsvUpload],
    preview: Callback,
    setFileName: String => CsvUpload
  ): CsvUpload = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), apply = apply.toJsFn, forCampaignManagement = forCampaignManagement.toJsFn, forOfflineConversions = forOfflineConversions.toJsFn, preview = preview.toJsFn, setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[CsvUpload]
  }
  
  extension [Self <: CsvUpload](x: Self) {
    
    inline def setAppend(value: Record[String, String | Double] => CsvUpload): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setApply(value: Callback): Self = StObject.set(x, "apply", value.toJsFn)
    
    inline def setForCampaignManagement(value: CallbackTo[CsvUpload]): Self = StObject.set(x, "forCampaignManagement", value.toJsFn)
    
    inline def setForOfflineConversions(value: CallbackTo[CsvUpload]): Self = StObject.set(x, "forOfflineConversions", value.toJsFn)
    
    inline def setPreview(value: Callback): Self = StObject.set(x, "preview", value.toJsFn)
    
    inline def setSetFileName(value: String => CsvUpload): Self = StObject.set(x, "setFileName", js.Any.fromFunction1(value))
  }
}
