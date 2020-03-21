package typingsJapgolly.pacote.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PacoteOptions extends js.Object {
  /** Alias for `enjoy-by` */
  var before: js.UndefOr[js.Date | String | Double] = js.undefined
  /** Alias for `tag` */
  var defaultTag: js.UndefOr[String] = js.undefined
  /**
    * Expects a function that takes a single argument, `dir`, and returns a
    * `ReadableStream` that outputs packaged tarball data. Used when creating
    * tarballs for package specs that are not already packaged, such as git and
    * directory dependencies. The default `opts.dirPacker` does not execute
    * `prepare` scripts, even though npm itself does.
    */
  var dirPacker: js.UndefOr[js.Function1[/* dir */ String, Readable]] = js.undefined
  /**
    * If passed in, will be used while resolving to filter the versions for
    * **registry dependencies** such that versions published **after**
    * `opts.enjoy-by` are not considered -- as if they'd never been published.
    */
  var `enjoy-by`: js.UndefOr[js.Date | String | Double] = js.undefined
  /** Alias for `enjoy-by` */
  var enjoyBy: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * If `true`, the full packument will be fetched when doing metadata
    * requests. By default, pacote only fetches the summarized packuments, also
    * called "corgis".
    */
  var `full-metadata`: js.UndefOr[Boolean] = js.undefined
  /**
    * If false, deprecated versions will be skipped when selecting from
    * registry range specifiers. If true, deprecations do not affect version
    * selection.
    */
  var `include-deprecated`: js.UndefOr[Boolean] = js.undefined
  /** Alias for 'include-deprecated' */
  var includeDeprecated: js.UndefOr[Boolean] = js.undefined
  /**
    * When fetching tarballs, this option can be passed in to skip registry
    * metadata lookups when downloading tarballs. If the string is a `file:`
    * URL, pacote will try to read the referenced local file before attempting
    * to do any further lookups. This option does not bypass integrity checks
    * when `opts.integrity` is passed in.
    */
  var resolved: js.UndefOr[String] = js.undefined
  /**
    * Package version resolution tag. When processing registry spec ranges,
    * this option is used to determine what dist-tag to treat as "latest". For
    * more details about how `pacote` selects versions and how `tag` is
    * involved, see [the documentation for `npm-pick-manifest`](https://npm.im/npm-pick-manifest).
    */
  var tag: js.UndefOr[String] = js.undefined
  /**
    * Passed as an argument to [`npm-package-arg`](https://npm.im/npm-package-arg)
    * when resolving `spec` arguments. Used to determine what path to resolve
    * local path specs relatively from.
    */
  var where: js.UndefOr[String] = js.undefined
}

object PacoteOptions {
  @scala.inline
  def apply(
    before: js.Date | String | Double = null,
    defaultTag: String = null,
    dirPacker: /* dir */ String => CallbackTo[Readable] = null,
    `enjoy-by`: js.Date | String | Double = null,
    enjoyBy: js.Date | String | Double = null,
    `full-metadata`: js.UndefOr[Boolean] = js.undefined,
    `include-deprecated`: js.UndefOr[Boolean] = js.undefined,
    includeDeprecated: js.UndefOr[Boolean] = js.undefined,
    resolved: String = null,
    tag: String = null,
    where: String = null
  ): PacoteOptions = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (defaultTag != null) __obj.updateDynamic("defaultTag")(defaultTag.asInstanceOf[js.Any])
    if (dirPacker != null) __obj.updateDynamic("dirPacker")(js.Any.fromFunction1((t0: /* dir */ java.lang.String) => dirPacker(t0).runNow()))
    if (`enjoy-by` != null) __obj.updateDynamic("enjoy-by")(`enjoy-by`.asInstanceOf[js.Any])
    if (enjoyBy != null) __obj.updateDynamic("enjoyBy")(enjoyBy.asInstanceOf[js.Any])
    if (!js.isUndefined(`full-metadata`)) __obj.updateDynamic("full-metadata")(`full-metadata`.asInstanceOf[js.Any])
    if (!js.isUndefined(`include-deprecated`)) __obj.updateDynamic("include-deprecated")(`include-deprecated`.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDeprecated)) __obj.updateDynamic("includeDeprecated")(includeDeprecated.asInstanceOf[js.Any])
    if (resolved != null) __obj.updateDynamic("resolved")(resolved.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[PacoteOptions]
  }
}

