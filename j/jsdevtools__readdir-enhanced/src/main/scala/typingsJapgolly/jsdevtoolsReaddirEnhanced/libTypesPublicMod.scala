package typingsJapgolly.jsdevtoolsReaddirEnhanced

import typingsJapgolly.jsdevtoolsReaddirEnhanced.anon.PartialFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesPublicMod {
  
  type Callback[T] = js.Function2[/* err */ js.Error | Null, /* result */ T, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.error
    - typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.file
    - typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.directory
    - typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.symlink
  */
  trait EventName extends StObject
  object EventName {
    
    inline def directory: typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.directory = "directory".asInstanceOf[typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.directory]
    
    inline def error: typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.error = "error".asInstanceOf[typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.error]
    
    inline def file: typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.file = "file".asInstanceOf[typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.file]
    
    inline def symlink: typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.symlink = "symlink".asInstanceOf[typingsJapgolly.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.symlink]
  }
  
  trait FileSystem extends StObject {
    
    /**
      * Returns filesystem information about a symlink.
      */
    def lstat(path: String, callback: Callback[typingsJapgolly.node.fsMod.Stats]): Unit
    
    /**
      * Returns the names of files in a directory.
      */
    def readdir(path: String, callback: Callback[js.Array[String]]): Unit
    
    /**
      * Returns filesystem information about a directory entry.
      */
    def stat(path: String, callback: Callback[typingsJapgolly.node.fsMod.Stats]): Unit
  }
  object FileSystem {
    
    inline def apply(
      lstat: (String, Callback[typingsJapgolly.node.fsMod.Stats]) => japgolly.scalajs.react.Callback,
      readdir: (String, Callback[js.Array[String]]) => japgolly.scalajs.react.Callback,
      stat: (String, Callback[typingsJapgolly.node.fsMod.Stats]) => japgolly.scalajs.react.Callback
    ): FileSystem = {
      val __obj = js.Dynamic.literal(lstat = js.Any.fromFunction2((t0: String, t1: Callback[typingsJapgolly.node.fsMod.Stats]) => (lstat(t0, t1)).runNow()), readdir = js.Any.fromFunction2((t0: String, t1: Callback[js.Array[String]]) => (readdir(t0, t1)).runNow()), stat = js.Any.fromFunction2((t0: String, t1: Callback[typingsJapgolly.node.fsMod.Stats]) => (stat(t0, t1)).runNow()))
      __obj.asInstanceOf[FileSystem]
    }
    
    extension [Self <: FileSystem](x: Self) {
      
      inline def setLstat(value: (String, Callback[typingsJapgolly.node.fsMod.Stats]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "lstat", js.Any.fromFunction2((t0: String, t1: Callback[typingsJapgolly.node.fsMod.Stats]) => (value(t0, t1)).runNow()))
      
      inline def setReaddir(value: (String, Callback[js.Array[String]]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "readdir", js.Any.fromFunction2((t0: String, t1: Callback[js.Array[String]]) => (value(t0, t1)).runNow()))
      
      inline def setStat(value: (String, Callback[typingsJapgolly.node.fsMod.Stats]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "stat", js.Any.fromFunction2((t0: String, t1: Callback[typingsJapgolly.node.fsMod.Stats]) => (value(t0, t1)).runNow()))
    }
  }
  
  type FilterFunction = js.Function1[/* stat */ Stats, Any]
  
  trait Options extends StObject {
    
    /**
      * The baase path to prefix results with.
      *
      * Defaults to an empty string, which means results will be relative to the directory path.
      */
    var basePath: js.UndefOr[String] = js.undefined
    
    /**
      * The depth to crawl. Can be `true` to crawl indefinitely, a number to crawl only to that
      * depth, or a filter (see the `filter` option) to crawl only directories that match the filter.
      *
      * Defaults to zero, which will not crawl subdirectories.
      */
    var deep: js.UndefOr[Boolean | Double | String | js.RegExp | FilterFunction] = js.undefined
    
    /**
      * Filter critiera. Can be a glob pattern, a regular expression, or a filter function.
      *
      * Defaults to returning all files.
      */
    var filter: js.UndefOr[Boolean | String | js.RegExp | FilterFunction] = js.undefined
    
    /**
      * Custom implementations of filesystem methods.
      *
      * Defaults to the Node "fs" module.
      */
    var fs: js.UndefOr[PartialFileSystem] = js.undefined
    
    /**
      * The path separator to use.
      *
      * Defaults to "\" on Windows and "/" on other platforms.
      */
    var sep: js.UndefOr[String] = js.undefined
    
    /**
      * Return `Stats` objects instead of just path strings.
      *
      * Defaults to `false`.
      */
    var stats: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for the `stats` option. This property is supported for compatibility with the Node.js
      * built-in `fs.readdir()` function.
      */
    var withFileTypes: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setDeep(value: Boolean | Double | String | js.RegExp | FilterFunction): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepFunction1(value: /* stat */ Stats => Any): Self = StObject.set(x, "deep", js.Any.fromFunction1(value))
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setFilter(value: Boolean | String | js.RegExp | FilterFunction): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* stat */ Stats => Any): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFs(value: PartialFileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      inline def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  @js.native
  trait Stats
    extends typingsJapgolly.node.fsMod.Stats {
    
    /**
      * The depth of this entry, relative to the original directory.
      */
    var depth: Double = js.native
    
    /**
      * The relative path of the file.
      *
      * NOTE: The value is affected by the `basePath` and `sep` options.
      */
    var path: String = js.native
  }
}
