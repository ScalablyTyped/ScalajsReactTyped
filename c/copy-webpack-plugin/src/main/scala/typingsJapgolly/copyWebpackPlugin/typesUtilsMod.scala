package typingsJapgolly.copyWebpackPlugin

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  @JSImport("copy-webpack-plugin/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFile(inputFileSystem: InputFileSystem, path: String): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(inputFileSystem.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  
  inline def stat(inputFileSystem: InputFileSystem, path: String): js.Promise[js.UndefOr[Stats]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(inputFileSystem.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Stats]]]
  
  inline def throttleAll[T](limit: Double, tasks: js.Array[Task[T]]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")(limit.asInstanceOf[js.Any], tasks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  /* Inlined webpack.webpack.Compilation['inputFileSystem'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readlink
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.realpath
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.join
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.dirname
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readFile
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.purge
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.lstat
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.stat
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readJson
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readdir
    - typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.relative
  */
  trait InputFileSystem extends StObject
  object InputFileSystem {
    
    inline def dirname: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.dirname = "dirname".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.dirname]
    
    inline def join: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.join = "join".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.join]
    
    inline def lstat: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.lstat = "lstat".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.lstat]
    
    inline def purge: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.purge = "purge".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.purge]
    
    inline def readFile: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readFile = "readFile".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readFile]
    
    inline def readJson: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readJson = "readJson".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readJson]
    
    inline def readdir: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readdir = "readdir".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readdir]
    
    inline def readlink: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readlink = "readlink".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.readlink]
    
    inline def realpath: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.realpath = "realpath".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.realpath]
    
    inline def relative: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.relative = "relative".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.relative]
    
    inline def stat: typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.stat = "stat".asInstanceOf[typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.stat]
  }
  
  type Stats = typingsJapgolly.node.fsMod.Stats
  
  type Task[T] = js.Function0[js.Promise[T]]
}
