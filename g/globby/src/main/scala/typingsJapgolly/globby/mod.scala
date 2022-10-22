package typingsJapgolly.globby

import typingsJapgolly.fastGlob.anon.PartialFileSystemAdapter
import typingsJapgolly.fastGlob.mod.Entry
import typingsJapgolly.fastGlob.outTypesMod.Pattern
import typingsJapgolly.globby.anon.Extensions
import typingsJapgolly.globby.anon.OptionsobjectModetrue
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.nodeColonurlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("globby", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateGlobTasks(patterns: String): js.Promise[js.Array[GlobTask]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasks")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GlobTask]]]
  inline def generateGlobTasks(patterns: String, options: Options): js.Promise[js.Array[GlobTask]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasks")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[GlobTask]]]
  inline def generateGlobTasks(patterns: js.Array[String]): js.Promise[js.Array[GlobTask]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasks")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GlobTask]]]
  inline def generateGlobTasks(patterns: js.Array[String], options: Options): js.Promise[js.Array[GlobTask]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasks")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[GlobTask]]]
  
  inline def generateGlobTasksSync(patterns: String): js.Array[GlobTask] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasksSync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[GlobTask]]
  inline def generateGlobTasksSync(patterns: String, options: Options): js.Array[GlobTask] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasksSync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[GlobTask]]
  inline def generateGlobTasksSync(patterns: js.Array[String]): js.Array[GlobTask] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasksSync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[GlobTask]]
  inline def generateGlobTasksSync(patterns: js.Array[String], options: Options): js.Array[GlobTask] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateGlobTasksSync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[GlobTask]]
  
  inline def globby(patterns: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("globby")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def globby(patterns: String, options: OptionsobjectModetrue): js.Promise[js.Array[GlobEntry]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globby")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[GlobEntry]]]
  inline def globby(patterns: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globby")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def globby(patterns: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("globby")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def globby(patterns: js.Array[String], options: OptionsobjectModetrue): js.Promise[js.Array[GlobEntry]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globby")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[GlobEntry]]]
  inline def globby(patterns: js.Array[String], options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("globby")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def globbyStream(patterns: String): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("globbyStream")(patterns.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def globbyStream(patterns: String, options: Options): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("globbyStream")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def globbyStream(patterns: js.Array[String]): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("globbyStream")(patterns.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def globbyStream(patterns: js.Array[String], options: Options): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("globbyStream")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def globbySync(patterns: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("globbySync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def globbySync(patterns: String, options: OptionsobjectModetrue): js.Array[GlobEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("globbySync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[GlobEntry]]
  inline def globbySync(patterns: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globbySync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def globbySync(patterns: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("globbySync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def globbySync(patterns: js.Array[String], options: OptionsobjectModetrue): js.Array[GlobEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("globbySync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[GlobEntry]]
  inline def globbySync(patterns: js.Array[String], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globbySync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def isDynamicPattern(patterns: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(patterns.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDynamicPattern(patterns: String, options: typingsJapgolly.globby.anon.FastGlobOptionsWithoutCwd): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isDynamicPattern(patterns: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(patterns.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDynamicPattern(patterns: js.Array[String], options: typingsJapgolly.globby.anon.FastGlobOptionsWithoutCwd): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isGitIgnored(): js.Promise[GlobbyFilterFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("isGitIgnored")().asInstanceOf[js.Promise[GlobbyFilterFunction]]
  inline def isGitIgnored(options: GitignoreOptions): js.Promise[GlobbyFilterFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("isGitIgnored")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GlobbyFilterFunction]]
  
  inline def isGitIgnoredSync(): GlobbyFilterFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("isGitIgnoredSync")().asInstanceOf[GlobbyFilterFunction]
  inline def isGitIgnoredSync(options: GitignoreOptions): GlobbyFilterFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("isGitIgnoredSync")(options.asInstanceOf[js.Any]).asInstanceOf[GlobbyFilterFunction]
  
  type ExpandDirectoriesOption = Boolean | js.Array[String] | Extensions
  
  /* Inlined std.Omit<fast-glob.fast-glob.Options, 'cwd'> */
  trait FastGlobOptionsWithoutCwd extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    var baseNameMatch: js.UndefOr[Boolean] = js.undefined
    
    var braceExpansion: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitiveMatch: js.UndefOr[Boolean] = js.undefined
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var deep: js.UndefOr[Double] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var extglob: js.UndefOr[Boolean] = js.undefined
    
    var followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
    
    var globstar: js.UndefOr[Boolean] = js.undefined
    
    var ignore: js.UndefOr[js.Array[Pattern]] = js.undefined
    
    var markDirectories: js.UndefOr[Boolean] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var onlyDirectories: js.UndefOr[Boolean] = js.undefined
    
    var onlyFiles: js.UndefOr[Boolean] = js.undefined
    
    var stats: js.UndefOr[Boolean] = js.undefined
    
    var suppressErrors: js.UndefOr[Boolean] = js.undefined
    
    var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
    
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object FastGlobOptionsWithoutCwd {
    
    inline def apply(): FastGlobOptionsWithoutCwd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastGlobOptionsWithoutCwd]
    }
    
    extension [Self <: FastGlobOptionsWithoutCwd](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setBaseNameMatch(value: Boolean): Self = StObject.set(x, "baseNameMatch", value.asInstanceOf[js.Any])
      
      inline def setBaseNameMatchUndefined: Self = StObject.set(x, "baseNameMatch", js.undefined)
      
      inline def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      inline def setBraceExpansionUndefined: Self = StObject.set(x, "braceExpansion", js.undefined)
      
      inline def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveMatchUndefined: Self = StObject.set(x, "caseSensitiveMatch", js.undefined)
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setDeep(value: Double): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      inline def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
      
      inline def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymbolicLinksUndefined: Self = StObject.set(x, "followSymbolicLinks", js.undefined)
      
      inline def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      inline def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      inline def setIgnore(value: js.Array[Pattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: Pattern*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMarkDirectories(value: Boolean): Self = StObject.set(x, "markDirectories", value.asInstanceOf[js.Any])
      
      inline def setMarkDirectoriesUndefined: Self = StObject.set(x, "markDirectories", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setOnlyDirectories(value: Boolean): Self = StObject.set(x, "onlyDirectories", value.asInstanceOf[js.Any])
      
      inline def setOnlyDirectoriesUndefined: Self = StObject.set(x, "onlyDirectories", js.undefined)
      
      inline def setOnlyFiles(value: Boolean): Self = StObject.set(x, "onlyFiles", value.asInstanceOf[js.Any])
      
      inline def setOnlyFilesUndefined: Self = StObject.set(x, "onlyFiles", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      inline def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorOnBrokenSymbolicLinkUndefined: Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", js.undefined)
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  trait GitignoreOptions extends StObject {
    
    val cwd: js.UndefOr[URL | String] = js.undefined
  }
  object GitignoreOptions {
    
    inline def apply(): GitignoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitignoreOptions]
    }
    
    extension [Self <: GitignoreOptions](x: Self) {
      
      inline def setCwd(value: URL | String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
  
  type GlobEntry = Entry
  
  trait GlobTask extends StObject {
    
    val options: Options
    
    val patterns: js.Array[String]
  }
  object GlobTask {
    
    inline def apply(options: Options, patterns: js.Array[String]): GlobTask = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobTask]
    }
    
    extension [Self <: GlobTask](x: Self) {
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
  
  type GlobbyFilterFunction = js.Function1[/* path */ URL | String, Boolean]
  
  trait Options
    extends StObject
       with FastGlobOptionsWithoutCwd {
    
    /**
    	The current working directory in which to search.
    	@default process.cwd()
    	*/
    val cwd: js.UndefOr[URL | String] = js.undefined
    
    /**
    	If set to `true`, `globby` will automatically glob directories for you. If you define an `Array` it will only glob files that matches the patterns inside the `Array`. You can also define an `Object` with `files` and `extensions` like in the example below.
    	Note that if you set this option to `false`, you won't get back matched directories unless you set `onlyFiles: false`.
    	@default true
    	@example
    	```
    	import {globby} from 'globby';
    	const paths = await globby('images', {
    		expandDirectories: {
    			files: ['cat', 'unicorn', '*.jpg'],
    			extensions: ['png']
    		}
    	});
    	console.log(paths);
    	//=> ['cat.png', 'unicorn.png', 'cow.jpg', 'rainbow.jpg']
    	```
    	*/
    val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.undefined
    
    /**
    	Respect ignore patterns in `.gitignore` files that apply to the globbed files.
    	@default false
    	*/
    val gitignore: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Glob patterns to look for ignore files, which are then used to ignore globbed files.
    	This is a more generic form of the `gitignore` option, allowing you to find ignore files with a [compatible syntax](http://git-scm.com/docs/gitignore). For instance, this works with Babel's `.babelignore`, Prettier's `.prettierignore`, or ESLint's `.eslintignore` files.
    	@default undefined
    	*/
    val ignoreFiles: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: URL | String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setExpandDirectories(value: ExpandDirectoriesOption): Self = StObject.set(x, "expandDirectories", value.asInstanceOf[js.Any])
      
      inline def setExpandDirectoriesUndefined: Self = StObject.set(x, "expandDirectories", js.undefined)
      
      inline def setExpandDirectoriesVarargs(value: String*): Self = StObject.set(x, "expandDirectories", js.Array(value*))
      
      inline def setGitignore(value: Boolean): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      inline def setGitignoreUndefined: Self = StObject.set(x, "gitignore", js.undefined)
      
      inline def setIgnoreFiles(value: String | js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFilesUndefined: Self = StObject.set(x, "ignoreFiles", js.undefined)
      
      inline def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value*))
    }
  }
}
