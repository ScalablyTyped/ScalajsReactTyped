package typingsJapgolly.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dirs extends js.Object {
  var CacheDir: String
  var DCIMDir: String
  var DocumentDir: String
  var DownloadDir: String
  var MainBundleDir: String
  var MovieDir: String
  var MusicDir: String
  var PictureDir: String
  var SDCardDir: String
}

object Dirs {
  @scala.inline
  def apply(
    CacheDir: String,
    DCIMDir: String,
    DocumentDir: String,
    DownloadDir: String,
    MainBundleDir: String,
    MovieDir: String,
    MusicDir: String,
    PictureDir: String,
    SDCardDir: String
  ): Dirs = {
    val __obj = js.Dynamic.literal(CacheDir = CacheDir.asInstanceOf[js.Any], DCIMDir = DCIMDir.asInstanceOf[js.Any], DocumentDir = DocumentDir.asInstanceOf[js.Any], DownloadDir = DownloadDir.asInstanceOf[js.Any], MainBundleDir = MainBundleDir.asInstanceOf[js.Any], MovieDir = MovieDir.asInstanceOf[js.Any], MusicDir = MusicDir.asInstanceOf[js.Any], PictureDir = PictureDir.asInstanceOf[js.Any], SDCardDir = SDCardDir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Dirs]
  }
}

