package typingsJapgolly.mongodbMemoryServer

import typingsJapgolly.mongodbMemoryServerCore.anon.PartialMongoMemoryReplSet
import typingsJapgolly.mongodbMemoryServerCore.anon.PartialMongodOpts
import typingsJapgolly.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServerOpts
import typingsJapgolly.mongodbMemoryServerCore.libUtilMongoBinaryMod.MongoBinaryOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongodb-memory-server", JSImport.Default)
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    * @param opts Mongo-Memory-Sever Options
    */
  open class default ()
    extends typingsJapgolly.mongodbMemoryServerCore.mod.default {
    def this(opts: MongoMemoryServerOpts) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mongodb-memory-server", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    inline def create(): js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer
      ]]
    inline def create(opts: MongoMemoryServerOpts): js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer
      ]]
  }
  
  @JSImport("mongodb-memory-server", "MongoBinary")
  @js.native
  open class MongoBinary ()
    extends typingsJapgolly.mongodbMemoryServerCore.mod.MongoBinary
  /* static members */
  object MongoBinary {
    
    @JSImport("mongodb-memory-server", "MongoBinary")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Probe download path and download the binary
      * @param options Options Configuring which binary to download and to which path
      * @returns The BinaryPath the binary has been downloaded to
      */
    inline def download(options: RequiredMongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe all supported paths for an binary and return the binary path
      * @param opts Options configuring which binary to search for
      * @throws {Error} if no valid BinaryPath has been found
      * @returns The first found BinaryPath
      */
    inline def getPath(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[js.Promise[String]]
    inline def getPath(opts: MongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("mongodb-memory-server", "MongoInstance")
  @js.native
  open class MongoInstance protected ()
    extends typingsJapgolly.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstance {
    def this(opts: PartialMongodOpts) = this()
  }
  /* static members */
  object MongoInstance {
    
    @JSImport("mongodb-memory-server", "MongoInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an new instance an call method "start"
      * @param opts Options passed to the new instance
      */
    inline def create(opts: PartialMongodOpts): js.Promise[typingsJapgolly.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstance]]
  }
  
  @JSImport("mongodb-memory-server", "MongoMemoryReplSet")
  @js.native
  open class MongoMemoryReplSet ()
    extends typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSet {
    def this(opts: PartialMongoMemoryReplSet) = this()
  }
  /* static members */
  object MongoMemoryReplSet {
    
    @JSImport("mongodb-memory-server", "MongoMemoryReplSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an instance of "MongoMemoryReplSet" and call start
      * @param opts Options for the ReplSet
      */
    inline def create(): js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSet
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSet
      ]]
    inline def create(opts: PartialMongoMemoryReplSet): js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSet
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSet
      ]]
  }
  
  @JSImport("mongodb-memory-server", "MongoMemoryServer")
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    * @param opts Mongo-Memory-Sever Options
    */
  open class MongoMemoryServer ()
    extends typingsJapgolly.mongodbMemoryServerCore.mod.MongoMemoryServer {
    def this(opts: MongoMemoryServerOpts) = this()
  }
  /* static members */
  object MongoMemoryServer {
    
    @JSImport("mongodb-memory-server", "MongoMemoryServer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    inline def create(): js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer
      ]]
    inline def create(opts: MongoMemoryServerOpts): js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        typingsJapgolly.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer
      ]]
  }
}
