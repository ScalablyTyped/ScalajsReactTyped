package typingsJapgolly.ngtoolsWebpack

import typingsJapgolly.ngtoolsWebpack.anon.IsDirectory
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.typescript.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIvySystemMod {
  
  @JSImport("@ngtools/webpack/src/ivy/system", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWebpackSystem(input: InputFileSystemSync, currentDirectory: String): System = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebpackSystem")(input.asInstanceOf[js.Any], currentDirectory.asInstanceOf[js.Any])).asInstanceOf[System]
  
  /* Inlined webpack.webpack.Compiler['inputFileSystem'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readlink
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.realpath
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.join
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.dirname
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readFile
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.purge
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.lstat
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.stat
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readJson
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readdir
    - typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.relative
  */
  trait InputFileSystem extends StObject
  object InputFileSystem {
    
    inline def dirname: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.dirname = "dirname".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.dirname]
    
    inline def join: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.join = "join".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.join]
    
    inline def lstat: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.lstat = "lstat".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.lstat]
    
    inline def purge: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.purge = "purge".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.purge]
    
    inline def readFile: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readFile = "readFile".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readFile]
    
    inline def readJson: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readJson = "readJson".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readJson]
    
    inline def readdir: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readdir = "readdir".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readdir]
    
    inline def readlink: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readlink = "readlink".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.readlink]
    
    inline def realpath: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.realpath = "realpath".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.realpath]
    
    inline def relative: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.relative = "relative".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.relative]
    
    inline def stat: typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.stat = "stat".asInstanceOf[typingsJapgolly.ngtoolsWebpack.ngtoolsWebpackStrings.stat]
  }
  
  @js.native
  trait InputFileSystemSync
    extends StObject
       with InputFileSystem {
    
    def readFileSync(path: String): Buffer = js.native
    
    def statSync(path: String): IsDirectory = js.native
  }
}
