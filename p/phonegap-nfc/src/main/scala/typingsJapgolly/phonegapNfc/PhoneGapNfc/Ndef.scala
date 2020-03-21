package typingsJapgolly.phonegapNfc.PhoneGapNfc

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Ndef object.
  */
trait Ndef extends js.Object {
   // "Sp"
  var RTD_ALTERNATIVE_CARRIER: js.Array[Double]
   // "ac"
  var RTD_HANDOVER_CARRIER: js.Array[Double]
   // "Hc"
  var RTD_HANDOVER_REQUEST: js.Array[Double]
   // "Hr"
  var RTD_HANDOVER_SELECT: js.Array[Double]
   // "U"
  var RTD_SMART_POSTER: js.Array[Double]
  var RTD_TEXT: js.Array[Double]
   // "T"
  var RTD_URI: js.Array[Double]
  var TNF_ABSOLUTE_URI: Double
  var TNF_EMPTY: Double
  var TNF_EXTERNAL_TYPE: Double
  var TNF_MIME_MEDIA: Double
  var TNF_RESERVED: Double
  var TNF_UNCHANGED: Double
  var TNF_UNKNOWN: Double
  var TNF_WELL_KNOWN: Double
  var textHelper: TextHelper
   // "Hs"
  var uriHelper: UriHelper
  /**
    * Helper that creates a NdefRecord containing an absolute URI.
    *
    * An Absolute URI record means the URI describes the payload of the record.
    *
    * For example a SOAP message could use "http://schemas.xmlsoap.org/soap/envelope/"
    * as the type and XML content for the payload.
    *
    * Absolute URI can also be used to write LaunchApp records for Windows.
    *
    * See 2.4.2 Payload Type of the NDEF Specification
    * http://www.nfc-forum.org/specs/spec_list#ndefts
    *
    * Note that by default, Android will open the URI defined in the type
    * field of an Absolute URI record (TNF=3) and ignore the payload.
    * BlackBerry and Windows do not open the browser for TNF=3.
    *
    * To write a URI as the payload use ndef.uriRecord(uri)
    *
    * @param uri String
    * @param payload byte[] or String
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def absoluteUriRecord(uri: String, payload: js.Array[Double], id: js.Array[Double]): NdefRecord
  /**
    * Helper that creates an Android Application Record (AAR).
    * http://developer.android.com/guide/topics/connectivity/nfc/nfc.html#aar
    * @param packageName android package name
    *
    */
  def androidApplicationRecord(packageName: String): NdefRecord
  /**
    * Decodes an array bytes into an NDEF Message
    *
    * @param bytes Array<number> read from a NFC tag
    *
    * @return array of NdefRecord
    *
    * @see NFC Data Exchange Format (NDEF) http://www.nfc-forum.org/specs/spec_list/
    */
  def decodeMessage(bytes: js.Array[Double]): js.Array[NdefRecord]
  /**
    * Decode the bit flags from a TNF Byte.
    *
    * @return object with decoded data
    *
    *  See NFC Data Exchange Format (NDEF) Specification Section 3.2 RecordLayout
    */
  def decodeTnf(tnf_byte: Double): js.Any
  /**
    * Helper that creates an empty NdefRecord.
    *
    */
  def emptyRecord(): NdefRecord
  /**
    * Encodes an NDEF Message into bytes that can be written to a NFC tag.
    *
    * @param ndefRecords an Array of NdefRecord
    *
    * @return Array<number>
    *
    * @see NFC Data Exchange Format (NDEF) http://www.nfc-forum.org/specs/spec_list/
    */
  def encodeMessage(ndefRecords: js.Array[NdefRecord]): js.Array[Double]
  /**
    * Encode NDEF bit flags into a TNF Byte.
    *
    * @return tnf byte
    *
    *  See NFC Data Exchange Format (NDEF) Specification Section 3.2 RecordLayout
    */
  def encodeTnf(mb: Double, me: Double, cf: Double, sr: Double, il: Double, tnf: Double): Double
  /**
    * Helper that creates a NdefRecordcontaining an mimeMediaRecord.
    *
    * @param mimeType String
    * @param payload byte[]
    * @param id byte[] (optional)
    */
  def mimeMediaRecord(mimeType: String, payload: js.Array[Double], id: js.Array[Double]): NdefRecord
  /**
    * Creates a JSON representation of a NdefRecord.
    *
    * @param tnf 3-bit TNF (Type Name Format) - use one of the TNF_* constants
    * @param type array, containing zero to 255 bytes, must not be null
    * @param id byte array, containing zero to 255 bytes, must not be null
    * @param payload byte array, containing zero to (2 ** 32 - 1) bytes, must not be null
    *
    * @return NdefRecord
    *
    * @see Ndef.textRecord, Ndef.uriRecord and Ndef.mimeMediaRecord for examples
    */
  def record(tnf: Double, `type`: js.Array[Double], id: js.Array[Double], payload: js.Array[Double]): NdefRecord
  /**
    * Helper that creates an NDEF record containing an Smart Poster.
    *
    * @param ndefRecords array of NdefRecord
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def smartPoster(ndefRecords: js.Array[NdefRecord], id: js.Array[Double]): NdefRecord
  /**
    * Helper that creates an NdefRecord containing plain text.
    *
    * @param text String of text to encode
    * @paramlanguageCode ISO/IANA language code. Examples: “fi”, “en-US”, “fr- CA”, “jp”. (optional)
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def textRecord(text: String, languageCode: String, id: js.Array[Double]): NdefRecord
  /**
    * Convert TNF to String for user friendly display
    *
    *@param tnf tnf byte
    */
  def tnfToString(tnf: Double): String
  /**
    * Helper that creates a NdefRecord containing a URI.
    *
    * @param uri String
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def uriRecord(uri: String, id: js.Array[Double]): NdefRecord
}

object Ndef {
  @scala.inline
  def apply(
    RTD_ALTERNATIVE_CARRIER: js.Array[Double],
    RTD_HANDOVER_CARRIER: js.Array[Double],
    RTD_HANDOVER_REQUEST: js.Array[Double],
    RTD_HANDOVER_SELECT: js.Array[Double],
    RTD_SMART_POSTER: js.Array[Double],
    RTD_TEXT: js.Array[Double],
    RTD_URI: js.Array[Double],
    TNF_ABSOLUTE_URI: Double,
    TNF_EMPTY: Double,
    TNF_EXTERNAL_TYPE: Double,
    TNF_MIME_MEDIA: Double,
    TNF_RESERVED: Double,
    TNF_UNCHANGED: Double,
    TNF_UNKNOWN: Double,
    TNF_WELL_KNOWN: Double,
    absoluteUriRecord: (String, js.Array[Double], js.Array[Double]) => CallbackTo[NdefRecord],
    androidApplicationRecord: String => CallbackTo[NdefRecord],
    decodeMessage: js.Array[Double] => CallbackTo[js.Array[NdefRecord]],
    decodeTnf: Double => CallbackTo[js.Any],
    emptyRecord: CallbackTo[NdefRecord],
    encodeMessage: js.Array[NdefRecord] => CallbackTo[js.Array[Double]],
    encodeTnf: (Double, Double, Double, Double, Double, Double) => CallbackTo[Double],
    mimeMediaRecord: (String, js.Array[Double], js.Array[Double]) => CallbackTo[NdefRecord],
    record: (Double, js.Array[Double], js.Array[Double], js.Array[Double]) => CallbackTo[NdefRecord],
    smartPoster: (js.Array[NdefRecord], js.Array[Double]) => CallbackTo[NdefRecord],
    textHelper: TextHelper,
    textRecord: (String, String, js.Array[Double]) => CallbackTo[NdefRecord],
    tnfToString: Double => CallbackTo[String],
    uriHelper: UriHelper,
    uriRecord: (String, js.Array[Double]) => CallbackTo[NdefRecord]
  ): Ndef = {
    val __obj = js.Dynamic.literal(RTD_ALTERNATIVE_CARRIER = RTD_ALTERNATIVE_CARRIER.asInstanceOf[js.Any], RTD_HANDOVER_CARRIER = RTD_HANDOVER_CARRIER.asInstanceOf[js.Any], RTD_HANDOVER_REQUEST = RTD_HANDOVER_REQUEST.asInstanceOf[js.Any], RTD_HANDOVER_SELECT = RTD_HANDOVER_SELECT.asInstanceOf[js.Any], RTD_SMART_POSTER = RTD_SMART_POSTER.asInstanceOf[js.Any], RTD_TEXT = RTD_TEXT.asInstanceOf[js.Any], RTD_URI = RTD_URI.asInstanceOf[js.Any], TNF_ABSOLUTE_URI = TNF_ABSOLUTE_URI.asInstanceOf[js.Any], TNF_EMPTY = TNF_EMPTY.asInstanceOf[js.Any], TNF_EXTERNAL_TYPE = TNF_EXTERNAL_TYPE.asInstanceOf[js.Any], TNF_MIME_MEDIA = TNF_MIME_MEDIA.asInstanceOf[js.Any], TNF_RESERVED = TNF_RESERVED.asInstanceOf[js.Any], TNF_UNCHANGED = TNF_UNCHANGED.asInstanceOf[js.Any], TNF_UNKNOWN = TNF_UNKNOWN.asInstanceOf[js.Any], TNF_WELL_KNOWN = TNF_WELL_KNOWN.asInstanceOf[js.Any], textHelper = textHelper.asInstanceOf[js.Any], uriHelper = uriHelper.asInstanceOf[js.Any])
    __obj.updateDynamic("absoluteUriRecord")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Array[scala.Double], t2: js.Array[scala.Double]) => absoluteUriRecord(t0, t1, t2).runNow()))
    __obj.updateDynamic("androidApplicationRecord")(js.Any.fromFunction1((t0: java.lang.String) => androidApplicationRecord(t0).runNow()))
    __obj.updateDynamic("decodeMessage")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => decodeMessage(t0).runNow()))
    __obj.updateDynamic("decodeTnf")(js.Any.fromFunction1((t0: scala.Double) => decodeTnf(t0).runNow()))
    __obj.updateDynamic("emptyRecord")(emptyRecord.toJsFn)
    __obj.updateDynamic("encodeMessage")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.phonegapNfc.PhoneGapNfc.NdefRecord]) => encodeMessage(t0).runNow()))
    __obj.updateDynamic("encodeTnf")(js.Any.fromFunction6((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double) => encodeTnf(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("mimeMediaRecord")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Array[scala.Double], t2: js.Array[scala.Double]) => mimeMediaRecord(t0, t1, t2).runNow()))
    __obj.updateDynamic("record")(js.Any.fromFunction4((t0: scala.Double, t1: js.Array[scala.Double], t2: js.Array[scala.Double], t3: js.Array[scala.Double]) => record(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("smartPoster")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.phonegapNfc.PhoneGapNfc.NdefRecord], t1: js.Array[scala.Double]) => smartPoster(t0, t1).runNow()))
    __obj.updateDynamic("textRecord")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Array[scala.Double]) => textRecord(t0, t1, t2).runNow()))
    __obj.updateDynamic("tnfToString")(js.Any.fromFunction1((t0: scala.Double) => tnfToString(t0).runNow()))
    __obj.updateDynamic("uriRecord")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[scala.Double]) => uriRecord(t0, t1).runNow()))
    __obj.asInstanceOf[Ndef]
  }
}

