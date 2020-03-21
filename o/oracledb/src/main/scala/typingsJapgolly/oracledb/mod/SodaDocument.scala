package typingsJapgolly.oracledb.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SodaDocuments represents the document for SODA read and write operations.
  */
trait SodaDocument extends js.Object {
  /** Creation time of the document as a string in the UTC time zone using an ISO8601 format. */
  val createdOn: js.UndefOr[String] = js.undefined
  /** Unique key value for this document. */
  val key: js.UndefOr[String] = js.undefined
  /** Last modified time of the document as a string in the UTC time zone using an ISO8601 format. */
  val lastModified: String
  /**
    * An arbitrary string value designating the content media type. The recommendation when creating documents is to use a MIME type for the media type.
    * By default, collections store only JSON document content and this property will be ‘application/json’. This property will be null if the media type
    * is unknown, which will only be in the rare case when a collection was created to store mixed or non-JSON content on top of a pre-existing database table,
    * and that table has NULLs in its mediaType column.
    * 
    * @default 'application/json'
    */
  val mediaType: js.UndefOr[String] = js.undefined
  /** Version of the document. */
  val version: String
  /**
    * A synchronous method that returns the document content as an object.
    *
    * An exception will occur if the document content is not JSON and cannot be converted to an object.
    *
    * @since 3.0
    */
  def getContent(): Record[String, _]
  /**
    * A synchronous method that returns the document content as a Buffer.
    *
    * If the documents were originally created with sodaDatabase.createDocument(), then documents are returned as they were created.
    *
    * For documents fetched from the database where the collection storage is BLOB (which is the default), and whose mediaType is ‘application/json’,
    * then the buffer returned is identical to that which was stored. If the storage is not BLOB, it is UTF-8 encoded.
    *
    * @since 3.0
    */
  def getContentAsBuffer(): Buffer
  /**
    * A synchronous method that returns JSON document content as a String.
    *
    * An exception will occur if the document content cannot be converted to a string.
    *
    * If the document encoding is not known, UTF8 will be used.
    *
    * @since 3.0
    */
  def getContentAsString(): String
}

object SodaDocument {
  @scala.inline
  def apply(
    getContent: CallbackTo[Record[String, js.Any]],
    getContentAsBuffer: CallbackTo[Buffer],
    getContentAsString: CallbackTo[String],
    lastModified: String,
    version: String,
    createdOn: String = null,
    key: String = null,
    mediaType: String = null
  ): SodaDocument = {
    val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.updateDynamic("getContentAsBuffer")(getContentAsBuffer.toJsFn)
    __obj.updateDynamic("getContentAsString")(getContentAsString.toJsFn)
    if (createdOn != null) __obj.updateDynamic("createdOn")(createdOn.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SodaDocument]
  }
}

