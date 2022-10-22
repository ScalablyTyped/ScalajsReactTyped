package typingsJapgolly.rcloneJs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.nodeColonchildProcessMod.ChildProcess
import typingsJapgolly.rcloneJs.anon.Promises
import typingsJapgolly.rcloneJs.anon.RecordCommandApiFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rclone.js", JSImport.Namespace)
  @js.native
  val ^ : ApiFn & RecordCommandApiFn & Promises = js.native
  
  type ApiFn = FnStringOrObjectArgs[ChildProcess]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcloneJs.rcloneJsStrings.about
    - typingsJapgolly.rcloneJs.rcloneJsStrings.authorize
    - typingsJapgolly.rcloneJs.rcloneJsStrings.backend
    - typingsJapgolly.rcloneJs.rcloneJsStrings.cat
    - typingsJapgolly.rcloneJs.rcloneJsStrings.check
    - typingsJapgolly.rcloneJs.rcloneJsStrings.checksum
    - typingsJapgolly.rcloneJs.rcloneJsStrings.cleanup
    - typingsJapgolly.rcloneJs.rcloneJsStrings.config
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config create`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config delete`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config disconnect`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config dump`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config edit`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config file`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config password`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config providers`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config reconnect`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config show`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config update`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`config userinfo`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.copy
    - typingsJapgolly.rcloneJs.rcloneJsStrings.copyto
    - typingsJapgolly.rcloneJs.rcloneJsStrings.copyurl
    - typingsJapgolly.rcloneJs.rcloneJsStrings.cryptcheck
    - typingsJapgolly.rcloneJs.rcloneJsStrings.cryptdecode
    - typingsJapgolly.rcloneJs.rcloneJsStrings.dedupe
    - typingsJapgolly.rcloneJs.rcloneJsStrings.delete
    - typingsJapgolly.rcloneJs.rcloneJsStrings.deletefile
    - typingsJapgolly.rcloneJs.rcloneJsStrings.genautocomplete
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`genautocomplete bash`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`genautocomplete fish`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`genautocomplete zsh`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.gendocs
    - typingsJapgolly.rcloneJs.rcloneJsStrings.hashsum
    - typingsJapgolly.rcloneJs.rcloneJsStrings.help
    - typingsJapgolly.rcloneJs.rcloneJsStrings.link
    - typingsJapgolly.rcloneJs.rcloneJsStrings.listremotes
    - typingsJapgolly.rcloneJs.rcloneJsStrings.ls
    - typingsJapgolly.rcloneJs.rcloneJsStrings.lsd
    - typingsJapgolly.rcloneJs.rcloneJsStrings.lsf
    - typingsJapgolly.rcloneJs.rcloneJsStrings.lsjson
    - typingsJapgolly.rcloneJs.rcloneJsStrings.lsl
    - typingsJapgolly.rcloneJs.rcloneJsStrings.md5sum
    - typingsJapgolly.rcloneJs.rcloneJsStrings.mkdir
    - typingsJapgolly.rcloneJs.rcloneJsStrings.mount
    - typingsJapgolly.rcloneJs.rcloneJsStrings.move
    - typingsJapgolly.rcloneJs.rcloneJsStrings.moveto
    - typingsJapgolly.rcloneJs.rcloneJsStrings.ncdu
    - typingsJapgolly.rcloneJs.rcloneJsStrings.obscure
    - typingsJapgolly.rcloneJs.rcloneJsStrings.purge
    - typingsJapgolly.rcloneJs.rcloneJsStrings.rc
    - typingsJapgolly.rcloneJs.rcloneJsStrings.rcat
    - typingsJapgolly.rcloneJs.rcloneJsStrings.rcd
    - typingsJapgolly.rcloneJs.rcloneJsStrings.rmdir
    - typingsJapgolly.rcloneJs.rcloneJsStrings.rmdirs
    - typingsJapgolly.rcloneJs.rcloneJsStrings.selfupdate
    - typingsJapgolly.rcloneJs.rcloneJsStrings.serve
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`serve dlna`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`serve ftp`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`serve http`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`serve restic`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`serve sftp`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.`serve webdav`
    - typingsJapgolly.rcloneJs.rcloneJsStrings.settier
    - typingsJapgolly.rcloneJs.rcloneJsStrings.sha1sum
    - typingsJapgolly.rcloneJs.rcloneJsStrings.size
    - typingsJapgolly.rcloneJs.rcloneJsStrings.sync
    - typingsJapgolly.rcloneJs.rcloneJsStrings.test
    - typingsJapgolly.rcloneJs.rcloneJsStrings.touch
    - typingsJapgolly.rcloneJs.rcloneJsStrings.tree
    - typingsJapgolly.rcloneJs.rcloneJsStrings.version
  */
  trait Command extends StObject
  object Command {
    
    inline def about: typingsJapgolly.rcloneJs.rcloneJsStrings.about = "about".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.about]
    
    inline def authorize: typingsJapgolly.rcloneJs.rcloneJsStrings.authorize = "authorize".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.authorize]
    
    inline def backend: typingsJapgolly.rcloneJs.rcloneJsStrings.backend = "backend".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.backend]
    
    inline def cat: typingsJapgolly.rcloneJs.rcloneJsStrings.cat = "cat".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.cat]
    
    inline def check: typingsJapgolly.rcloneJs.rcloneJsStrings.check = "check".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.check]
    
    inline def checksum: typingsJapgolly.rcloneJs.rcloneJsStrings.checksum = "checksum".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.checksum]
    
    inline def cleanup: typingsJapgolly.rcloneJs.rcloneJsStrings.cleanup = "cleanup".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.cleanup]
    
    inline def config: typingsJapgolly.rcloneJs.rcloneJsStrings.config = "config".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.config]
    
    inline def `config create`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config create` = ("config create").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config create`]
    
    inline def `config delete`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config delete` = ("config delete").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config delete`]
    
    inline def `config disconnect`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config disconnect` = ("config disconnect").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config disconnect`]
    
    inline def `config dump`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config dump` = ("config dump").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config dump`]
    
    inline def `config edit`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config edit` = ("config edit").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config edit`]
    
    inline def `config file`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config file` = ("config file").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config file`]
    
    inline def `config password`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config password` = ("config password").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config password`]
    
    inline def `config providers`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config providers` = ("config providers").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config providers`]
    
    inline def `config reconnect`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config reconnect` = ("config reconnect").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config reconnect`]
    
    inline def `config show`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config show` = ("config show").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config show`]
    
    inline def `config update`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config update` = ("config update").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config update`]
    
    inline def `config userinfo`: typingsJapgolly.rcloneJs.rcloneJsStrings.`config userinfo` = ("config userinfo").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`config userinfo`]
    
    inline def copy: typingsJapgolly.rcloneJs.rcloneJsStrings.copy = "copy".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.copy]
    
    inline def copyto: typingsJapgolly.rcloneJs.rcloneJsStrings.copyto = "copyto".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.copyto]
    
    inline def copyurl: typingsJapgolly.rcloneJs.rcloneJsStrings.copyurl = "copyurl".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.copyurl]
    
    inline def cryptcheck: typingsJapgolly.rcloneJs.rcloneJsStrings.cryptcheck = "cryptcheck".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.cryptcheck]
    
    inline def cryptdecode: typingsJapgolly.rcloneJs.rcloneJsStrings.cryptdecode = "cryptdecode".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.cryptdecode]
    
    inline def dedupe: typingsJapgolly.rcloneJs.rcloneJsStrings.dedupe = "dedupe".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.dedupe]
    
    inline def delete: typingsJapgolly.rcloneJs.rcloneJsStrings.delete = "delete".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.delete]
    
    inline def deletefile: typingsJapgolly.rcloneJs.rcloneJsStrings.deletefile = "deletefile".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.deletefile]
    
    inline def genautocomplete: typingsJapgolly.rcloneJs.rcloneJsStrings.genautocomplete = "genautocomplete".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.genautocomplete]
    
    inline def `genautocomplete bash`: typingsJapgolly.rcloneJs.rcloneJsStrings.`genautocomplete bash` = ("genautocomplete bash").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`genautocomplete bash`]
    
    inline def `genautocomplete fish`: typingsJapgolly.rcloneJs.rcloneJsStrings.`genautocomplete fish` = ("genautocomplete fish").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`genautocomplete fish`]
    
    inline def `genautocomplete zsh`: typingsJapgolly.rcloneJs.rcloneJsStrings.`genautocomplete zsh` = ("genautocomplete zsh").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`genautocomplete zsh`]
    
    inline def gendocs: typingsJapgolly.rcloneJs.rcloneJsStrings.gendocs = "gendocs".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.gendocs]
    
    inline def hashsum: typingsJapgolly.rcloneJs.rcloneJsStrings.hashsum = "hashsum".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.hashsum]
    
    inline def help: typingsJapgolly.rcloneJs.rcloneJsStrings.help = "help".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.help]
    
    inline def link: typingsJapgolly.rcloneJs.rcloneJsStrings.link = "link".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.link]
    
    inline def listremotes: typingsJapgolly.rcloneJs.rcloneJsStrings.listremotes = "listremotes".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.listremotes]
    
    inline def ls: typingsJapgolly.rcloneJs.rcloneJsStrings.ls = "ls".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.ls]
    
    inline def lsd: typingsJapgolly.rcloneJs.rcloneJsStrings.lsd = "lsd".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.lsd]
    
    inline def lsf: typingsJapgolly.rcloneJs.rcloneJsStrings.lsf = "lsf".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.lsf]
    
    inline def lsjson: typingsJapgolly.rcloneJs.rcloneJsStrings.lsjson = "lsjson".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.lsjson]
    
    inline def lsl: typingsJapgolly.rcloneJs.rcloneJsStrings.lsl = "lsl".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.lsl]
    
    inline def md5sum: typingsJapgolly.rcloneJs.rcloneJsStrings.md5sum = "md5sum".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.md5sum]
    
    inline def mkdir: typingsJapgolly.rcloneJs.rcloneJsStrings.mkdir = "mkdir".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.mkdir]
    
    inline def mount: typingsJapgolly.rcloneJs.rcloneJsStrings.mount = "mount".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.mount]
    
    inline def move: typingsJapgolly.rcloneJs.rcloneJsStrings.move = "move".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.move]
    
    inline def moveto: typingsJapgolly.rcloneJs.rcloneJsStrings.moveto = "moveto".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.moveto]
    
    inline def ncdu: typingsJapgolly.rcloneJs.rcloneJsStrings.ncdu = "ncdu".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.ncdu]
    
    inline def obscure: typingsJapgolly.rcloneJs.rcloneJsStrings.obscure = "obscure".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.obscure]
    
    inline def purge: typingsJapgolly.rcloneJs.rcloneJsStrings.purge = "purge".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.purge]
    
    inline def rc: typingsJapgolly.rcloneJs.rcloneJsStrings.rc = "rc".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.rc]
    
    inline def rcat: typingsJapgolly.rcloneJs.rcloneJsStrings.rcat = "rcat".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.rcat]
    
    inline def rcd: typingsJapgolly.rcloneJs.rcloneJsStrings.rcd = "rcd".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.rcd]
    
    inline def rmdir: typingsJapgolly.rcloneJs.rcloneJsStrings.rmdir = "rmdir".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.rmdir]
    
    inline def rmdirs: typingsJapgolly.rcloneJs.rcloneJsStrings.rmdirs = "rmdirs".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.rmdirs]
    
    inline def selfupdate: typingsJapgolly.rcloneJs.rcloneJsStrings.selfupdate = "selfupdate".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.selfupdate]
    
    inline def serve: typingsJapgolly.rcloneJs.rcloneJsStrings.serve = "serve".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.serve]
    
    inline def `serve dlna`: typingsJapgolly.rcloneJs.rcloneJsStrings.`serve dlna` = ("serve dlna").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`serve dlna`]
    
    inline def `serve ftp`: typingsJapgolly.rcloneJs.rcloneJsStrings.`serve ftp` = ("serve ftp").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`serve ftp`]
    
    inline def `serve http`: typingsJapgolly.rcloneJs.rcloneJsStrings.`serve http` = ("serve http").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`serve http`]
    
    inline def `serve restic`: typingsJapgolly.rcloneJs.rcloneJsStrings.`serve restic` = ("serve restic").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`serve restic`]
    
    inline def `serve sftp`: typingsJapgolly.rcloneJs.rcloneJsStrings.`serve sftp` = ("serve sftp").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`serve sftp`]
    
    inline def `serve webdav`: typingsJapgolly.rcloneJs.rcloneJsStrings.`serve webdav` = ("serve webdav").asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.`serve webdav`]
    
    inline def settier: typingsJapgolly.rcloneJs.rcloneJsStrings.settier = "settier".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.settier]
    
    inline def sha1sum: typingsJapgolly.rcloneJs.rcloneJsStrings.sha1sum = "sha1sum".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.sha1sum]
    
    inline def size: typingsJapgolly.rcloneJs.rcloneJsStrings.size = "size".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.size]
    
    inline def sync: typingsJapgolly.rcloneJs.rcloneJsStrings.sync = "sync".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.sync]
    
    inline def test: typingsJapgolly.rcloneJs.rcloneJsStrings.test = "test".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.test]
    
    inline def touch: typingsJapgolly.rcloneJs.rcloneJsStrings.touch = "touch".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.touch]
    
    inline def tree: typingsJapgolly.rcloneJs.rcloneJsStrings.tree = "tree".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.tree]
    
    inline def version: typingsJapgolly.rcloneJs.rcloneJsStrings.version = "version".asInstanceOf[typingsJapgolly.rcloneJs.rcloneJsStrings.version]
  }
  
  @js.native
  trait FnStringOrObjectArgs[R] extends StObject {
    
    def apply(args: (String | js.Object)*): R = js.native
  }
  
  type PromisesFn = FnStringOrObjectArgs[js.Promise[Buffer]]
  
  type _To = ApiFn & RecordCommandApiFn & Promises
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ApiFn & RecordCommandApiFn & Promises = ^
}
