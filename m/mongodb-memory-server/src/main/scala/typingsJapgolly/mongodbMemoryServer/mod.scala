package typingsJapgolly.mongodbMemoryServer

import typingsJapgolly.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryCache
import typingsJapgolly.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typingsJapgolly.mongodbMemoryServerCore.mongoInstanceMod.MongodOps
import typingsJapgolly.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSetOptsT
import typingsJapgolly.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServerOptsT
import typingsJapgolly.mongodbMemoryServerCore.typesMod.DebugFn
import typingsJapgolly.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-memory-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MongoBinary ()
    extends typingsJapgolly.mongodbMemoryServerCore.mod.MongoBinary
  
  @js.native
  class MongoInstance protected ()
    extends typingsJapgolly.mongodbMemoryServerCore.mod.MongoInstance {
    def this(opts: MongodOps) = this()
  }
  
  @js.native
  class MongoMemoryReplSet ()
    extends typingsJapgolly.mongodbMemoryServerCore.mod.MongoMemoryReplSet {
    def this(opts: MongoMemoryReplSetOptsT) = this()
  }
  
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    *
    * Note: because of JavaScript limitations, autoStart cannot be awaited here, use ".create" for async/await ability
    * @param opts Mongo-Memory-Sever Options
    */
  class MongoMemoryServer ()
    extends typingsJapgolly.mongodbMemoryServerCore.mod.MongoMemoryServer {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  
  /* static members */
  @js.native
  object MongoBinary extends js.Object {
    var cache: MongoBinaryCache = js.native
    @JSName("debug")
    var debug_Original: DebugFn = js.native
    def debug(args: js.Any*): js.Any = js.native
    def getCachePath(version: String): js.Promise[String] = js.native
    def getDownloadPath(options: js.Any): js.Promise[String] = js.native
    def getPath(): js.Promise[String] = js.native
    def getPath(opts: MongoBinaryOpts): js.Promise[String] = js.native
    def getSystemPath(systemBinary: String): js.Promise[String] = js.native
    def hasValidBinPath(files: js.Array[String]): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MongoInstance extends js.Object {
    var childProcessList: js.Array[ChildProcess] = js.native
    /**
      * Create an new instance an call method "run"
      * @param opts Options passed to the new instance
      */
    def run(opts: MongodOps): js.Promise[typingsJapgolly.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance] = js.native
  }
  
  /* static members */
  @js.native
  object MongoMemoryServer extends js.Object {
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    def create(): js.Promise[typingsJapgolly.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
    def create(opts: MongoMemoryServerOptsT): js.Promise[typingsJapgolly.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
  }
  
}

