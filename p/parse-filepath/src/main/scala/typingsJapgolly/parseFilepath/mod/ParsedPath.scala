package typingsJapgolly.parseFilepath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedPath extends js.Object {
  /**
    * fully resolved, absolute filepath
    */
  var absolute: String
  /**
    * The file name including extension (if any) such as `'index.html'`
    */
  var base: String
  /**
    * alias for `base`
    */
  var basename: String
  /**
    * The full directory path such as `'/home/user/dir'` or `'c:\path\dir'`
    */
  var dir: String
  /**
    * alias for `dir`
    */
  var dirname: String
  /**
    * The file extension (if any) such as `'.html'`
    */
  var ext: String
  /**
    * alias for `ext`
    */
  var extname: String
  /**
    * `true` if the given path is absolute
    */
  var isAbsolute: Boolean
  /**
    * The file name without extension (if any) such as `'index'`
    */
  var name: String
  /**
    * the original filepath
    */
  var path: String
  /**
    * The root of the path such as `'/'` or `'c:\'`
    */
  var root: String
  /**
    * alias for `name`
    */
  var stem: String
}

object ParsedPath {
  @scala.inline
  def apply(
    absolute: String,
    base: String,
    basename: String,
    dir: String,
    dirname: String,
    ext: String,
    extname: String,
    isAbsolute: Boolean,
    name: String,
    path: String,
    root: String,
    stem: String
  ): ParsedPath = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], basename = basename.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], isAbsolute = isAbsolute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedPath]
  }
}

