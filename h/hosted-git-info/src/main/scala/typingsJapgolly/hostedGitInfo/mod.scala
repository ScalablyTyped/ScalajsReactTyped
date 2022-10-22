package typingsJapgolly.hostedGitInfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hosted-git-info", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GitHost {
    def this(`type`: Hosts, user: String, auth: String, project: String) = this()
    def this(`type`: Hosts, user: String, auth: Unit, project: String) = this()
    def this(`type`: Hosts, user: String, auth: String, project: String, committish: String) = this()
    def this(`type`: Hosts, user: String, auth: Unit, project: String, committish: String) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: String,
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: Unit,
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: String,
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: Unit,
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: String,
      defaultRepresentation: Unit,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: String,
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: Unit,
      defaultRepresentation: Unit,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: Unit,
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: String,
      defaultRepresentation: Unit,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: String,
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: Unit,
      defaultRepresentation: Unit,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: Unit,
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
  }
  @JSImport("hosted-git-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromUrl(gitUrl: String): js.UndefOr[GitHost] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(gitUrl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[GitHost]]
  inline def fromUrl(gitUrl: String, opts: Options): js.UndefOr[GitHost] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(gitUrl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[GitHost]]
  
  trait FillOptions
    extends StObject
       with Options {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var committish: js.UndefOr[String] = js.undefined
    
    var fragment: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var treepath: js.UndefOr[String] = js.undefined
  }
  object FillOptions {
    
    inline def apply(): FillOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillOptions]
    }
    
    extension [Self <: FillOptions](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCommittish(value: String): Self = StObject.set(x, "committish", value.asInstanceOf[js.Any])
      
      inline def setCommittishUndefined: Self = StObject.set(x, "committish", js.undefined)
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTreepath(value: String): Self = StObject.set(x, "treepath", value.asInstanceOf[js.Any])
      
      inline def setTreepathUndefined: Self = StObject.set(x, "treepath", js.undefined)
    }
  }
  
  @js.native
  trait GitHost extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var auth: js.UndefOr[String] = js.native
    
    def browse(): String = js.native
    def browse(opts: FillOptions): String = js.native
    def browse(path: String): String = js.native
    def browse(path: String, fragment: String): String = js.native
    def browse(path: String, fragment: String, opts: FillOptions): String = js.native
    def browse(path: String, opts: FillOptions): String = js.native
    
    var browsefiletemplate: String = js.native
    
    var browsetemplate: String = js.native
    
    def bugs(): String = js.native
    def bugs(opts: FillOptions): String = js.native
    
    var bugstemplate: String = js.native
    
    var committish: js.UndefOr[String] = js.native
    
    def docs(): String = js.native
    def docs(opts: FillOptions): String = js.native
    
    var docstemplate: String = js.native
    
    var domain: String = js.native
    
    def file(path: String): String = js.native
    def file(path: String, opts: FillOptions): String = js.native
    
    var filetemplate: String = js.native
    
    def getDefaultRepresentation(): js.UndefOr[Representation] = js.native
    
    def git(): String = js.native
    def git(opts: FillOptions): String = js.native
    
    var gittemplate: js.UndefOr[String] = js.native
    
    def hash(): String = js.native
    
    def hashformat(fragment: String): String = js.native
    
    def https(): String = js.native
    def https(opts: FillOptions): String = js.native
    
    var httpstemplate: String = js.native
    
    var opts: Options = js.native
    
    def path(): String = js.native
    def path(opts: FillOptions): String = js.native
    
    var pathmatch: js.RegExp = js.native
    
    var pathtemplate: String = js.native
    
    var project: String = js.native
    
    var protocols: js.Array[String] = js.native
    
    var protocols_re: js.RegExp = js.native
    
    def shortcut(): String = js.native
    def shortcut(opts: FillOptions): String = js.native
    
    var shortcuttemplate: String = js.native
    
    def ssh(): String = js.native
    def ssh(opts: FillOptions): String = js.native
    
    // Templates
    var sshtemplate: String = js.native
    
    def sshurl(): String = js.native
    def sshurl(opts: FillOptions): String = js.native
    
    var sshurltemplate: String = js.native
    
    def tarball(): String = js.native
    def tarball(opts: FillOptions): String = js.native
    
    var tarballtemplate: String = js.native
    
    def toString(opts: FillOptions): String = js.native
    
    var treepath: js.UndefOr[String] = js.native
    
    var `type`: Hosts = js.native
    
    var user: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.github
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.bitbucket
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.gitlab
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.gist
  */
  trait Hosts extends StObject
  object Hosts {
    
    inline def bitbucket: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.bitbucket = "bitbucket".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.bitbucket]
    
    inline def gist: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.gist = "gist".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.gist]
    
    inline def github: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.github = "github".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.github]
    
    inline def gitlab: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.gitlab = "gitlab".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.gitlab]
  }
  
  trait Options extends StObject {
    
    var noCommittish: js.UndefOr[Boolean] = js.undefined
    
    var noGitPlus: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNoCommittish(value: Boolean): Self = StObject.set(x, "noCommittish", value.asInstanceOf[js.Any])
      
      inline def setNoCommittishUndefined: Self = StObject.set(x, "noCommittish", js.undefined)
      
      inline def setNoGitPlus(value: Boolean): Self = StObject.set(x, "noGitPlus", value.asInstanceOf[js.Any])
      
      inline def setNoGitPlusUndefined: Self = StObject.set(x, "noGitPlus", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.hash
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.ssh
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.sshurl
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.browse
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.docs
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.bugs
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.https
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.git
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.shortcut
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.path
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.tarball
    - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.file
  */
  trait Representation extends StObject
  object Representation {
    
    inline def browse: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.browse = "browse".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.browse]
    
    inline def bugs: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.bugs = "bugs".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.bugs]
    
    inline def docs: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.docs = "docs".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.docs]
    
    inline def file: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.file = "file".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.file]
    
    inline def git: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.git = "git".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.git]
    
    inline def hash: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.hash = "hash".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.hash]
    
    inline def https: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.https = "https".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.https]
    
    inline def path: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.path = "path".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.path]
    
    inline def shortcut: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.shortcut = "shortcut".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.shortcut]
    
    inline def ssh: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.ssh = "ssh".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.ssh]
    
    inline def sshurl: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.sshurl = "sshurl".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.sshurl]
    
    inline def tarball: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.tarball = "tarball".asInstanceOf[typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.tarball]
  }
}
