package typingsJapgolly.parse.nodeMod

import typingsJapgolly.parse.AnonBase64
import typingsJapgolly.parse.AnonSize
import typingsJapgolly.parse.AnonUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Parse.File is a local representation of a file that is saved to the Parse
  * cloud.
  * @param name The file's name. This will be prefixed by a unique
  *     value once the file has finished saving. The file name must begin with
  *     an alphanumeric character, and consist of alphanumeric characters,
  *     periods, spaces, underscores, or dashes.
  * @param data The data for the file, as either:
  *     1. an Array of byte value Numbers, or
  *     2. an Object like { base64: "..." } with a base64-encoded String.
  *     3. a File object selected with a file upload control. (3) only works
  *        in Firefox 3.6+, Safari 6.0.2+, Chrome 7+, and IE 10+.
  *        For example:<pre>
  * var fileUploadControl = $("#profilePhotoFileUpload")[0];
  * if (fileUploadControl.files.length > 0) {
  *   var file = fileUploadControl.files[0];
  *   var name = "photo.jpg";
  *   var parseFile = new Parse.File(name, file);
  *   parseFile.save().then(function() {
  *     // The file has been saved to Parse.
  *   }, function(error) {
  *     // The file either could not be read, or could not be saved to Parse.
  *   });
  * }</pre>
  * @param type Optional Content-Type header to use for the file. If
  *     this is omitted, the content type will be inferred from the name's
  *     extension.
  */
@JSImport("parse/node", "File")
@js.native
class File protected ()
  extends typingsJapgolly.parse.mod.File {
  def this(name: String, data: js.Array[Double]) = this()
  def this(name: String, data: AnonBase64) = this()
  def this(name: String, data: AnonSize) = this()
  def this(name: String, data: AnonUri) = this()
  def this(name: String, data: js.Array[Double], `type`: String) = this()
  def this(name: String, data: AnonBase64, `type`: String) = this()
  def this(name: String, data: AnonSize, `type`: String) = this()
  def this(name: String, data: AnonUri, `type`: String) = this()
}

