package typingsJapgolly.standardVersion

import org.scalajs.dom.URL
import typingsJapgolly.conventionalChangelogConfigSpec.versions2Dot1Dot0SchemaDotjsonMod.Config
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.standardVersion.mod.Options.Scripts
import typingsJapgolly.standardVersion.mod.Options.Skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("standard-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with Config {
    
    /**
      * @default
      * [
      *   'package-lock.json',
      *   'npm-shrinkwrap.json',
      *   'composer.lock'
      * ]
      */
    var bumpFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Use a custom header when generating and updating changelog.
      *
      * @deprecated
      * This option will be removed in the next major version, please use `header`.
      */
    var changelogHeader: js.UndefOr[String] = js.undefined
    
    /**
      * Commit all staged changes, not just files affected by standard-version.
      *
      * @default
      * false
      */
    var commitAll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * See the commands that running standard-version would run.
      *
      * @default
      * false
      */
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is this the first release?
      *
      * @default
      * false
      */
    var firstRelease: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fallback to git tags for version, if no meta-information file is found (e.g.,
      * package.json).
      *
      * @default
      * true
      */
    var gitTagFallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Read the CHANGELOG from this file.
      *
      * @default
      * 'CHANGELOG.md'
      */
    var infile: js.UndefOr[String | Buffer | URL | Double] = js.undefined
    
    /**
      * Commit message, replaces %s with new version.
      *
      * @deprecated
      * This option will be removed in the next major version, please use
      * `releaseCommitMessageFormat`.
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * Bypass pre-commit or commit-msg git hooks during the commit phase.
      *
      * @default
      * false
      */
    var noVerify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default
      * [
      *   'package.json',
      *   'bower.json',
      *   'manifest.json',
      *   'composer.json'
      * ]
      */
    var packageFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Only populate commits made under this path.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Make a pre-release with optional option value to specify a tag id.
      */
    var prerelease: js.UndefOr[String] = js.undefined
    
    /**
      * Commit message guideline preset.
      *
      * @default
      * require.resolve('conventional-changelog-conventionalcommits')
      */
    var preset: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the release type manually (like npm version <major|minor|patch>).
      */
    var releaseAs: js.UndefOr[String] = js.undefined
    
    /**
      * Provide scripts to execute for lifecycle events (prebump, precommit, etc.,).
      *
      * @default
      * {}
      */
    var scripts: js.UndefOr[Scripts] = js.undefined
    
    /**
      * Should the git commit and tag be signed?
      *
      * @default
      * false
      */
    var sign: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Don't print logs and errors.
      *
      * @default
      * false
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Map of steps in the release process that should be skipped.
      *
      * @default
      * {}
      */
    var skip: js.UndefOr[Skip] = js.undefined
    
    /**
      * Set a custom prefix for the git tag to be created.
      *
      * @default
      * 'v'
      */
    var tagPrefix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBumpFiles(value: js.Array[String]): Self = StObject.set(x, "bumpFiles", value.asInstanceOf[js.Any])
      
      inline def setBumpFilesUndefined: Self = StObject.set(x, "bumpFiles", js.undefined)
      
      inline def setBumpFilesVarargs(value: String*): Self = StObject.set(x, "bumpFiles", js.Array(value*))
      
      inline def setChangelogHeader(value: String): Self = StObject.set(x, "changelogHeader", value.asInstanceOf[js.Any])
      
      inline def setChangelogHeaderUndefined: Self = StObject.set(x, "changelogHeader", js.undefined)
      
      inline def setCommitAll(value: Boolean): Self = StObject.set(x, "commitAll", value.asInstanceOf[js.Any])
      
      inline def setCommitAllUndefined: Self = StObject.set(x, "commitAll", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setFirstRelease(value: Boolean): Self = StObject.set(x, "firstRelease", value.asInstanceOf[js.Any])
      
      inline def setFirstReleaseUndefined: Self = StObject.set(x, "firstRelease", js.undefined)
      
      inline def setGitTagFallback(value: Boolean): Self = StObject.set(x, "gitTagFallback", value.asInstanceOf[js.Any])
      
      inline def setGitTagFallbackUndefined: Self = StObject.set(x, "gitTagFallback", js.undefined)
      
      inline def setInfile(value: String | Buffer | URL | Double): Self = StObject.set(x, "infile", value.asInstanceOf[js.Any])
      
      inline def setInfileUndefined: Self = StObject.set(x, "infile", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setNoVerify(value: Boolean): Self = StObject.set(x, "noVerify", value.asInstanceOf[js.Any])
      
      inline def setNoVerifyUndefined: Self = StObject.set(x, "noVerify", js.undefined)
      
      inline def setPackageFiles(value: js.Array[String]): Self = StObject.set(x, "packageFiles", value.asInstanceOf[js.Any])
      
      inline def setPackageFilesUndefined: Self = StObject.set(x, "packageFiles", js.undefined)
      
      inline def setPackageFilesVarargs(value: String*): Self = StObject.set(x, "packageFiles", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
      
      inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setReleaseAs(value: String): Self = StObject.set(x, "releaseAs", value.asInstanceOf[js.Any])
      
      inline def setReleaseAsUndefined: Self = StObject.set(x, "releaseAs", js.undefined)
      
      inline def setScripts(value: Scripts): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setSign(value: Boolean): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
      
      inline def setSignUndefined: Self = StObject.set(x, "sign", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSkip(value: Skip): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTagPrefix(value: String): Self = StObject.set(x, "tagPrefix", value.asInstanceOf[js.Any])
      
      inline def setTagPrefixUndefined: Self = StObject.set(x, "tagPrefix", js.undefined)
    }
    
    trait Scripts extends StObject {
      
      /**
        * Executed after the version is bumped.
        */
      var postbump: js.UndefOr[String] = js.undefined
      
      /**
        * Executes after the CHANGELOG is generated.
        */
      var postchangelog: js.UndefOr[String] = js.undefined
      
      /**
        * Called after the commit step.
        */
      var postcommit: js.UndefOr[String] = js.undefined
      
      /**
        * Called after the tagging step.
        */
      var posttag: js.UndefOr[String] = js.undefined
      
      /**
        * Executed before the version is bumped. If the `prebump` script returns a
        * version #, it will be used rather than the version calculated by
        * `standard-version`.
        */
      var prebump: js.UndefOr[String] = js.undefined
      
      /**
        * Executes before the CHANGELOG is generated.
        */
      var prechangelog: js.UndefOr[String] = js.undefined
      
      /**
        * Called before the commit step.
        */
      var precommit: js.UndefOr[String] = js.undefined
      
      /**
        * Executed before anything happens. If the `prerelease` script returns a
        * non-zero exit code, versioning will be aborted, but it has no other effect on
        * the process.
        */
      var prerelease: js.UndefOr[String] = js.undefined
      
      /**
        * Called before the tagging step.
        */
      var pretag: js.UndefOr[String] = js.undefined
    }
    object Scripts {
      
      inline def apply(): Scripts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Scripts]
      }
      
      extension [Self <: Scripts](x: Self) {
        
        inline def setPostbump(value: String): Self = StObject.set(x, "postbump", value.asInstanceOf[js.Any])
        
        inline def setPostbumpUndefined: Self = StObject.set(x, "postbump", js.undefined)
        
        inline def setPostchangelog(value: String): Self = StObject.set(x, "postchangelog", value.asInstanceOf[js.Any])
        
        inline def setPostchangelogUndefined: Self = StObject.set(x, "postchangelog", js.undefined)
        
        inline def setPostcommit(value: String): Self = StObject.set(x, "postcommit", value.asInstanceOf[js.Any])
        
        inline def setPostcommitUndefined: Self = StObject.set(x, "postcommit", js.undefined)
        
        inline def setPosttag(value: String): Self = StObject.set(x, "posttag", value.asInstanceOf[js.Any])
        
        inline def setPosttagUndefined: Self = StObject.set(x, "posttag", js.undefined)
        
        inline def setPrebump(value: String): Self = StObject.set(x, "prebump", value.asInstanceOf[js.Any])
        
        inline def setPrebumpUndefined: Self = StObject.set(x, "prebump", js.undefined)
        
        inline def setPrechangelog(value: String): Self = StObject.set(x, "prechangelog", value.asInstanceOf[js.Any])
        
        inline def setPrechangelogUndefined: Self = StObject.set(x, "prechangelog", js.undefined)
        
        inline def setPrecommit(value: String): Self = StObject.set(x, "precommit", value.asInstanceOf[js.Any])
        
        inline def setPrecommitUndefined: Self = StObject.set(x, "precommit", js.undefined)
        
        inline def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
        
        inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
        
        inline def setPretag(value: String): Self = StObject.set(x, "pretag", value.asInstanceOf[js.Any])
        
        inline def setPretagUndefined: Self = StObject.set(x, "pretag", js.undefined)
      }
    }
    
    /* Inlined std.Partial<std.Record<'bump' | 'changelog' | 'commit' | 'tag', boolean>> */
    trait Skip extends StObject {
      
      var bump: js.UndefOr[Boolean] = js.undefined
      
      var changelog: js.UndefOr[Boolean] = js.undefined
      
      var commit: js.UndefOr[Boolean] = js.undefined
      
      var tag: js.UndefOr[Boolean] = js.undefined
    }
    object Skip {
      
      inline def apply(): Skip = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Skip]
      }
      
      extension [Self <: Skip](x: Self) {
        
        inline def setBump(value: Boolean): Self = StObject.set(x, "bump", value.asInstanceOf[js.Any])
        
        inline def setBumpUndefined: Self = StObject.set(x, "bump", js.undefined)
        
        inline def setChangelog(value: Boolean): Self = StObject.set(x, "changelog", value.asInstanceOf[js.Any])
        
        inline def setChangelogUndefined: Self = StObject.set(x, "changelog", js.undefined)
        
        inline def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
        
        inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
        
        inline def setTag(value: Boolean): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
  }
}
