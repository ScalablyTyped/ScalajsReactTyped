package typingsJapgolly.webpackManifestPlugin.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A path prefix for all keys. Useful for including your output path in the manifest.
    */
  var basePath: js.UndefOr[String] = js.undefined
  /**
    * The manifest filename in your output directory.
    * Default: manifest.json
    */
  var fileName: js.UndefOr[String] = js.undefined
  /**
    * Filter out files.
    */
  var filter: js.UndefOr[js.Function1[/* file */ FileDescriptor, Boolean]] = js.undefined
  /**
    * Create the manifest. It can return anything as long as it's serialisable by JSON.stringify.
    */
  var generate: js.UndefOr[
    js.Function3[
      /* seed */ js.Object, 
      /* files */ js.Array[FileDescriptor], 
      /* entrypoints */ StringDictionary[js.Array[String]], 
      js.Object
    ]
  ] = js.undefined
  /**
    * Modify files details before the manifest is created.
    */
  var map: js.UndefOr[js.Function1[/* file */ FileDescriptor, FileDescriptor]] = js.undefined
  /**
    * A path prefix that will be added to values of the manifest.
    * Default: output.publicPath
    */
  var publicPath: js.UndefOr[String] = js.undefined
  /**
    * A cache of key/value pairs to used to seed the manifest. This may include a set of custom key/value pairs to include in your manifest,
    * or may be used to combine manifests across compilations in multi-compiler mode.
    * To combine manifests, pass a shared seed object to each compiler's ManifestPlugin instance.
    * Default: {}
    */
  var seed: js.UndefOr[js.Object] = js.undefined
  /**
    * Output manifest file in different format then json (i.e. yaml).
    */
  var serialize: js.UndefOr[js.Function1[/* manifest */ js.Object, String]] = js.undefined
  /**
    * Sort files before they are passed to generate.
    */
  var sort: js.UndefOr[js.Function2[/* a */ FileDescriptor, /* b */ FileDescriptor, Double]] = js.undefined
  /**
    * If set to true will emit to build folder and memory in combination with webpack-dev-server
    * Default: false
    */
  var writeToFileEmit: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basePath: String = null,
    fileName: String = null,
    filter: /* file */ FileDescriptor => CallbackTo[Boolean] = null,
    generate: (/* seed */ js.Object, /* files */ js.Array[FileDescriptor], /* entrypoints */ StringDictionary[js.Array[String]]) => CallbackTo[js.Object] = null,
    map: /* file */ FileDescriptor => CallbackTo[FileDescriptor] = null,
    publicPath: String = null,
    seed: js.Object = null,
    serialize: /* manifest */ js.Object => CallbackTo[String] = null,
    sort: (/* a */ FileDescriptor, /* b */ FileDescriptor) => CallbackTo[Double] = null,
    writeToFileEmit: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.webpackManifestPlugin.mod.FileDescriptor) => filter(t0).runNow()))
    if (generate != null) __obj.updateDynamic("generate")(js.Any.fromFunction3((t0: /* seed */ js.Object, t1: /* files */ js.Array[typingsJapgolly.webpackManifestPlugin.mod.FileDescriptor], t2: /* entrypoints */ org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]) => generate(t0, t1, t2).runNow()))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.webpackManifestPlugin.mod.FileDescriptor) => map(t0).runNow()))
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: /* manifest */ js.Object) => serialize(t0).runNow()))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* a */ typingsJapgolly.webpackManifestPlugin.mod.FileDescriptor, t1: /* b */ typingsJapgolly.webpackManifestPlugin.mod.FileDescriptor) => sort(t0, t1).runNow()))
    if (!js.isUndefined(writeToFileEmit)) __obj.updateDynamic("writeToFileEmit")(writeToFileEmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

