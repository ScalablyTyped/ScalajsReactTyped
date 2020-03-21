package typingsJapgolly.storybookAddonStoryshots

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonStoryshots.storybookAddonStoryshotsBooleans.`false`
import typingsJapgolly.storybookAddonStoryshots.storybookAddonStoryshotsStrings.DIR
import typingsJapgolly.storybookAddonStoryshots.storybookAddonStoryshotsStrings.FILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbsolute extends js.Object {
  var absolute: Boolean
  var cache: js.UndefOr[StringDictionary[Boolean | js.Array[String] | DIR | FILE]] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var dot: js.UndefOr[Boolean] = js.undefined
  var flipNegate: js.UndefOr[Boolean] = js.undefined
  var follow: js.UndefOr[Boolean] = js.undefined
  var ignore: js.Array[String]
  var mark: js.UndefOr[Boolean] = js.undefined
  var matchBase: js.UndefOr[js.Any] = js.undefined
  var nobrace: js.UndefOr[Boolean] = js.undefined
  var nocase: js.UndefOr[Boolean] = js.undefined
  var nocomment: js.UndefOr[Boolean] = js.undefined
  var nodir: js.UndefOr[Boolean] = js.undefined
  var noext: js.UndefOr[Boolean] = js.undefined
  var noglobstar: js.UndefOr[Boolean] = js.undefined
  var nomount: js.UndefOr[Boolean] = js.undefined
  var nonegate: js.UndefOr[Boolean] = js.undefined
  var nonull: js.UndefOr[Boolean] = js.undefined
  var nosort: js.UndefOr[Boolean] = js.undefined
  var nounique: js.UndefOr[Boolean] = js.undefined
  var realpath: js.UndefOr[Boolean] = js.undefined
  var realpathCache: js.UndefOr[StringDictionary[String]] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var stat: js.UndefOr[Boolean] = js.undefined
  var statCache: js.UndefOr[StringDictionary[`false` | AnonIsDirectory]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var symlinks: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
}

object AnonAbsolute {
  @scala.inline
  def apply(
    absolute: Boolean,
    ignore: js.Array[String],
    cache: StringDictionary[Boolean | js.Array[String] | DIR | FILE] = null,
    cwd: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    flipNegate: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    mark: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.Any = null,
    nobrace: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    nocomment: js.UndefOr[Boolean] = js.undefined,
    nodir: js.UndefOr[Boolean] = js.undefined,
    noext: js.UndefOr[Boolean] = js.undefined,
    noglobstar: js.UndefOr[Boolean] = js.undefined,
    nomount: js.UndefOr[Boolean] = js.undefined,
    nonegate: js.UndefOr[Boolean] = js.undefined,
    nonull: js.UndefOr[Boolean] = js.undefined,
    nosort: js.UndefOr[Boolean] = js.undefined,
    nounique: js.UndefOr[Boolean] = js.undefined,
    realpath: js.UndefOr[Boolean] = js.undefined,
    realpathCache: StringDictionary[String] = null,
    root: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stat: js.UndefOr[Boolean] = js.undefined,
    statCache: StringDictionary[`false` | AnonIsDirectory] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    symlinks: StringDictionary[Boolean] = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): AnonAbsolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (matchBase != null) __obj.updateDynamic("matchBase")(matchBase.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.asInstanceOf[js.Any])
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment.asInstanceOf[js.Any])
    if (!js.isUndefined(nodir)) __obj.updateDynamic("nodir")(nodir.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.asInstanceOf[js.Any])
    if (!js.isUndefined(nomount)) __obj.updateDynamic("nomount")(nomount.asInstanceOf[js.Any])
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate.asInstanceOf[js.Any])
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull.asInstanceOf[js.Any])
    if (!js.isUndefined(nosort)) __obj.updateDynamic("nosort")(nosort.asInstanceOf[js.Any])
    if (!js.isUndefined(nounique)) __obj.updateDynamic("nounique")(nounique.asInstanceOf[js.Any])
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath.asInstanceOf[js.Any])
    if (realpathCache != null) __obj.updateDynamic("realpathCache")(realpathCache.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(stat)) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    if (statCache != null) __obj.updateDynamic("statCache")(statCache.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbsolute]
  }
}

