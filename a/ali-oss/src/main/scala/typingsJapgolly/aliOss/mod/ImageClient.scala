package typingsJapgolly.aliOss.mod

import typingsJapgolly.aliOss.AnonContent
import typingsJapgolly.aliOss.AnonData
import typingsJapgolly.aliOss.AnonDataRes
import typingsJapgolly.aliOss.AnonExpires
import typingsJapgolly.aliOss.AnonRes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ali-oss", "ImageClient")
@js.native
class ImageClient protected () extends js.Object {
  def this(options: ImageClientOptions) = this()
  /**
    * todo
    */
  def deleteStyle(styleName: String): js.Promise[NormalSuccessResponse] = js.native
  def deleteStyle(styleName: String, options: RequestOptions): js.Promise[NormalSuccessResponse] = js.native
  /**
    * Get an image from the image channel.
    */
  def get(name: String): js.Promise[AnonContent] = js.native
  def get(name: String, file: js.Any): js.Promise[AnonContent] = js.native
  def get(name: String, file: js.Any, options: ImageGetOptions): js.Promise[AnonContent] = js.native
  /**
    * Get a image exif info by image object name from the image channel.
    */
  def getExif(name: String): js.Promise[AnonData] = js.native
  def getExif(name: String, options: RequestOptions): js.Promise[AnonData] = js.native
  /**
    * Get a image info and exif info by image object name from the image channel.
    */
  def getInfo(name: String): js.Promise[AnonData] = js.native
  def getInfo(name: String, options: RequestOptions): js.Promise[AnonData] = js.native
  /**
    * Get an image read stream.
    */
  def getStream(name: String): js.Promise[AnonRes] = js.native
  def getStream(name: String, options: ImageGetOptions): js.Promise[AnonRes] = js.native
  /**
    * Get a style by name from the image channel.
    */
  def getStyle(name: String): js.Promise[AnonDataRes] = js.native
  def getStyle(name: String, options: RequestOptions): js.Promise[AnonDataRes] = js.native
  /**
    * Get all styles from the image channel.
    */
  def listStyle(): js.Promise[js.Array[StyleData]] = js.native
  def listStyle(options: RequestOptions): js.Promise[js.Array[StyleData]] = js.native
  /**
    * todo
    */
  def putStyle(name: String, style: String): js.Promise[AnonData] = js.native
  def putStyle(name: String, style: String, options: RequestOptions): js.Promise[AnonData] = js.native
  /**
    * Create a signature url for directly download.
    */
  def signatureUrl(name: String): String = js.native
  def signatureUrl(name: String, options: AnonExpires): String = js.native
}

