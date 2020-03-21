package typingsJapgolly.glob.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.glob.AnonIsDirectory
import typingsJapgolly.glob.globBooleans.`false`
import typingsJapgolly.glob.globStrings.DIR
import typingsJapgolly.glob.globStrings.FILE
import typingsJapgolly.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobBase extends js.Object {
  var aborted: Boolean
  var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]]
  var found: js.Array[String]
  var minimatch: IMinimatch
  var options: IOptions
  var realpathCache: StringDictionary[String]
  var statCache: StringDictionary[js.UndefOr[`false` | AnonIsDirectory]]
  var symlinks: StringDictionary[js.UndefOr[Boolean]]
}

object IGlobBase {
  @scala.inline
  def apply(
    aborted: Boolean,
    cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]],
    found: js.Array[String],
    minimatch: IMinimatch,
    options: IOptions,
    realpathCache: StringDictionary[String],
    statCache: StringDictionary[js.UndefOr[`false` | AnonIsDirectory]],
    symlinks: StringDictionary[js.UndefOr[Boolean]]
  ): IGlobBase = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], minimatch = minimatch.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], realpathCache = realpathCache.asInstanceOf[js.Any], statCache = statCache.asInstanceOf[js.Any], symlinks = symlinks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGlobBase]
  }
}

