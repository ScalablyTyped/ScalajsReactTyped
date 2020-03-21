package typingsJapgolly.moduleDeps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.browserResolve.mod.SyncOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * module-deps constructor options
  */
trait Options
  extends /* prop */ StringDictionary[js.Any] {
  // un-documented options used by module-deps
  var basedir: js.UndefOr[String] = js.undefined
  /**
    * An object mapping filenames to file objects to skip costly io
    */
  var cache: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * A custom dependency detection function. opts.detect(source) should return an array of dependency module names. By default detective is used
    */
  var detect: js.UndefOr[js.Function1[/* source */ String, js.Array[String]]] = js.undefined
  var expose: js.UndefOr[StringDictionary[String]] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An object mapping filenames to raw source to avoid reading from disk.
    */
  var fileCache: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * A function (id) to skip resolution of some module id strings. If defined,
    * opts.filter(id) should return truthy for all the ids to include and falsey for all the ids to skip.
    */
  var filter: js.UndefOr[js.Function1[/* id */ String, Boolean]] = js.undefined
  var globalTransform: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Ignore files that failed to resolve
    */
  var ignoreMissing: js.UndefOr[Boolean] = js.undefined
  var modules: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * An array of absolute paths to not parse for dependencies.
    * Use this for large dependencies like jquery or threejs which take forever to parse.
    */
  var noParse: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * An object mapping filenames to their parent package.json contents
    * for browser fields, main entries, and transforms
    */
  var packageCache: js.UndefOr[StringDictionary[js.Any]] = js.undefined
   // tslint:disable-line:void-return
  /**
    * Transform the parsed package.json contents before using the values.
    * opts.packageFilter(pkg, dir) should return the new pkg object to use.
    */
  var packageFilter: js.UndefOr[js.Function2[/* pkg */ PackageObject, /* dir */ String, PackageObject]] = js.undefined
  /**
    * Array of global paths to search. Defaults to splitting on ':' in process.env.NODE_PATH
    */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A complex cache handler that allows async and persistent caching of data.
    */
  var persistentCache: js.UndefOr[
    js.Function5[
      /* file */ String, 
      /* id */ String, 
      /* pkg */ PackageObject, 
      /* fallback */ js.Function2[/* dataAsString */ String, /* cb */ CacheCallback, Unit], 
      /* cb */ CacheCallback, 
      Unit
    ]
  ] = js.undefined
  /**
    * A function (id, file, pkg) that gets called after id has been resolved.
    * Return false to skip this file
    */
  var postFilter: js.UndefOr[
    js.Function3[/* id */ String, /* file */ String, /* pkg */ PackageObject, Unit | Boolean]
  ] = js.undefined
  /**
    * Custom resolve function using the opts.resolve(id, parent, cb) signature that browser-resolve has
    */
  var resolve: js.UndefOr[
    js.Function3[
      /* id */ String, 
      /* opts */ SyncOpts, 
      /* cb */ js.Function4[
        /* err */ js.UndefOr[js.Error | Null], 
        /* file */ js.UndefOr[String], 
        /* pkg */ js.UndefOr[PackageObject], 
        /* fakePath */ js.UndefOr[js.Any], 
        Unit
      ], 
      Unit
    ]
  ] = js.undefined
  /**
    * A string or array of string transforms
    */
  var transform: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * An array path of strings showing where to look in the package.json
    * for source transformations. If falsy, don't look at the package.json at all
    */
  var transformKey: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
    basedir: String = null,
    cache: StringDictionary[js.Any] = null,
    detect: /* source */ String => CallbackTo[js.Array[String]] = null,
    expose: StringDictionary[String] = null,
    extensions: js.Array[String] = null,
    fileCache: StringDictionary[String] = null,
    filter: /* id */ String => CallbackTo[Boolean] = null,
    globalTransform: js.Array[_] = null,
    ignoreMissing: js.UndefOr[Boolean] = js.undefined,
    modules: StringDictionary[js.Any] = null,
    noParse: Boolean | js.Array[String] = null,
    packageCache: StringDictionary[js.Any] = null,
    packageFilter: (/* pkg */ PackageObject, /* dir */ String) => CallbackTo[PackageObject] = null,
    paths: js.Array[String] = null,
    persistentCache: (/* file */ String, /* id */ String, /* pkg */ PackageObject, /* fallback */ js.Function2[/* dataAsString */ String, /* cb */ CacheCallback, Unit], /* cb */ CacheCallback) => Callback = null,
    postFilter: (/* id */ String, /* file */ String, /* pkg */ PackageObject) => CallbackTo[Unit | Boolean] = null,
    resolve: (/* id */ String, /* opts */ SyncOpts, /* cb */ js.Function4[
      /* err */ js.UndefOr[js.Error | Null], 
      /* file */ js.UndefOr[String], 
      /* pkg */ js.UndefOr[PackageObject], 
      /* fakePath */ js.UndefOr[js.Any], 
      Unit
    ]) => Callback = null,
    transform: String | js.Array[String] = null,
    transformKey: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (detect != null) __obj.updateDynamic("detect")(js.Any.fromFunction1((t0: /* source */ java.lang.String) => detect(t0).runNow()))
    if (expose != null) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fileCache != null) __obj.updateDynamic("fileCache")(fileCache.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* id */ java.lang.String) => filter(t0).runNow()))
    if (globalTransform != null) __obj.updateDynamic("globalTransform")(globalTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreMissing)) __obj.updateDynamic("ignoreMissing")(ignoreMissing.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (noParse != null) __obj.updateDynamic("noParse")(noParse.asInstanceOf[js.Any])
    if (packageCache != null) __obj.updateDynamic("packageCache")(packageCache.asInstanceOf[js.Any])
    if (packageFilter != null) __obj.updateDynamic("packageFilter")(js.Any.fromFunction2((t0: /* pkg */ typingsJapgolly.moduleDeps.mod.PackageObject, t1: /* dir */ java.lang.String) => packageFilter(t0, t1).runNow()))
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (persistentCache != null) __obj.updateDynamic("persistentCache")(js.Any.fromFunction5((t0: /* file */ java.lang.String, t1: /* id */ java.lang.String, t2: /* pkg */ typingsJapgolly.moduleDeps.mod.PackageObject, t3: /* fallback */ js.Function2[
  /* dataAsString */ java.lang.String, 
  /* cb */ typingsJapgolly.moduleDeps.mod.CacheCallback, 
  scala.Unit], t4: /* cb */ typingsJapgolly.moduleDeps.mod.CacheCallback) => persistentCache(t0, t1, t2, t3, t4).runNow()))
    if (postFilter != null) __obj.updateDynamic("postFilter")(js.Any.fromFunction3((t0: /* id */ java.lang.String, t1: /* file */ java.lang.String, t2: /* pkg */ typingsJapgolly.moduleDeps.mod.PackageObject) => postFilter(t0, t1, t2).runNow()))
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction3((t0: /* id */ java.lang.String, t1: /* opts */ typingsJapgolly.browserResolve.mod.SyncOpts, t2: /* cb */ js.Function4[
  /* err */ js.UndefOr[js.Error | scala.Null], 
  /* file */ js.UndefOr[java.lang.String], 
  /* pkg */ js.UndefOr[typingsJapgolly.moduleDeps.mod.PackageObject], 
  /* fakePath */ js.UndefOr[js.Any], 
  scala.Unit]) => resolve(t0, t1, t2).runNow()))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (transformKey != null) __obj.updateDynamic("transformKey")(transformKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

