package typingsJapgolly.mongoose.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.bson.mod.ObjectId
import typingsJapgolly.mongodb.mod.MongoCallback
import typingsJapgolly.mongodb.mod.MongoClient
import typingsJapgolly.mongodb.mod.MongoClientOptions
import typingsJapgolly.mongoose.TypeofBinary
import typingsJapgolly.mongoose.TypeofDecimal128Instantiable
import typingsJapgolly.mongoose.TypeofLogger
import typingsJapgolly.mongoose.TypeofLong
import typingsJapgolly.mongoose.TypeofMongoClient
import typingsJapgolly.mongoose.TypeofMongoError
import typingsJapgolly.mongoose.TypeofObjectID_
import typingsJapgolly.mongoose.TypeofObjectIdInstantiable
import typingsJapgolly.mongoose.TypeofReadPreference
import typingsJapgolly.mongoose.TypeofTimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "mongo")
@js.native
object mongo extends js.Object {
  @js.native
  class AggregationCursor[T] ()
    extends typingsJapgolly.mongodb.mod.AggregationCursor[T]
  
  @js.native
  class ChangeStream protected ()
    extends typingsJapgolly.mongodb.mod.ChangeStream {
    def this(changeDomain: typingsJapgolly.mongodb.mod.Db, pipeline: js.Array[js.Object]) = this()
  }
  
  @js.native
  class Code protected ()
    extends typingsJapgolly.mongodb.mod.Code {
    def this(code: String) = this()
  }
  
  @js.native
  class CommandCursor ()
    extends typingsJapgolly.mongodb.mod.CommandCursor
  
  @js.native
  class Cursor[T] ()
    extends typingsJapgolly.mongodb.mod.Cursor[T]
  
  @js.native
  class DBRef protected ()
    extends typingsJapgolly.mongodb.mod.DBRef {
    /**
      * @param namespace The collection name.
      * @param oid The reference ObjectId.
      * @param db Optional db name, if omitted the reference is local to the current db
      */
    def this(namespace: String, oid: ObjectId) = this()
  }
  
  @js.native
  class Db protected ()
    extends typingsJapgolly.mongodb.mod.Db {
    def this(databaseName: String, serverConfig: typingsJapgolly.mongodb.mod.Server) = this()
  }
  
  @js.native
  class Double protected ()
    extends typingsJapgolly.mongodb.mod.Double {
    /**
      * @param value The number we want to represent as a double.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class GridFSBucket protected ()
    extends typingsJapgolly.mongodb.mod.GridFSBucket {
    def this(db: typingsJapgolly.mongodb.mod.Db) = this()
  }
  
  @js.native
  class GridFSBucketReadStream protected ()
    extends typingsJapgolly.mongodb.mod.GridFSBucketReadStream {
    def this(
      chunks: typingsJapgolly.mongodb.mod.Collection[_],
      files: typingsJapgolly.mongodb.mod.Collection[_],
      readPreference: js.Object,
      filter: js.Object
    ) = this()
  }
  
  @js.native
  class GridFSBucketWriteStream protected ()
    extends typingsJapgolly.mongodb.mod.GridFSBucketWriteStream {
    def this(bucket: typingsJapgolly.mongodb.mod.GridFSBucket, filename: String) = this()
  }
  
  @js.native
  class Int32 protected ()
    extends typingsJapgolly.mongodb.mod.Int32 {
    /**
      * @param value The number we want to represent as an int32.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class MaxKey ()
    extends typingsJapgolly.mongodb.mod.MaxKey
  
  @js.native
  class MinKey ()
    extends typingsJapgolly.mongodb.mod.MinKey
  
  @js.native
  class MongoNetworkError protected ()
    extends typingsJapgolly.mongodb.mod.MongoNetworkError {
    def this(message: String) = this()
  }
  
  @js.native
  class MongoParseError protected ()
    extends typingsJapgolly.mongodb.mod.MongoParseError {
    def this(message: String) = this()
  }
  
  @js.native
  class Mongos protected ()
    extends typingsJapgolly.mongodb.mod.Mongos {
    def this(servers: js.Array[typingsJapgolly.mongodb.mod.Server]) = this()
  }
  
  @js.native
  class ReplSet protected ()
    extends typingsJapgolly.mongodb.mod.ReplSet {
    def this(servers: js.Array[typingsJapgolly.mongodb.mod.Server]) = this()
  }
  
  @js.native
  class ResumeToken ()
    extends typingsJapgolly.mongodb.mod.ResumeToken
  
  @js.native
  class Server protected ()
    extends typingsJapgolly.mongodb.mod.Server {
    def this(host: String, port: scala.Double) = this()
  }
  
  var Binary: TypeofBinary = js.native
  var Decimal128: TypeofDecimal128Instantiable = js.native
  var Logger: TypeofLogger = js.native
  var Long: TypeofLong = js.native
  var MongoClient: TypeofMongoClient = js.native
  var MongoError: TypeofMongoError = js.native
  var ObjectID: TypeofObjectID_ = js.native
  var ObjectId: TypeofObjectIdInstantiable = js.native
  var ReadPreference: TypeofReadPreference = js.native
  var Timestamp: TypeofTimestamp = js.native
  def connect(uri: String): js.Promise[MongoClient] = js.native
  def connect(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def connect(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def connect(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
  @js.native
  object AggregationCursor
    extends TopLevel[Instantiable0[typingsJapgolly.mongodb.mod.AggregationCursor[js.Object]]]
  
  @js.native
  object ChangeStream
    extends TopLevel[
          Instantiable2[
            /* changeDomain */ typingsJapgolly.mongodb.mod.Db, 
            /* pipeline */ js.Array[js.Object], 
            typingsJapgolly.mongodb.mod.ChangeStream
          ]
        ]
  
  @js.native
  object Code
    extends TopLevel[Instantiable1[/* code */ String, typingsJapgolly.mongodb.mod.Code]]
  
  @js.native
  object CommandCursor
    extends TopLevel[Instantiable0[typingsJapgolly.mongodb.mod.CommandCursor]]
  
  @js.native
  object Cursor
    extends TopLevel[Instantiable0[typingsJapgolly.mongodb.mod.Cursor[js.Object]]]
  
  @js.native
  object DBRef
    extends TopLevel[
          Instantiable2[/* namespace */ String, /* oid */ ObjectId, typingsJapgolly.mongodb.mod.DBRef]
        ]
  
  @js.native
  object Db
    extends TopLevel[
          Instantiable2[
            /* databaseName */ String, 
            /* serverConfig */ typingsJapgolly.mongodb.mod.Server, 
            typingsJapgolly.mongodb.mod.Db
          ]
        ]
  
  @js.native
  object Double
    extends TopLevel[Instantiable1[/* value */ scala.Double, typingsJapgolly.mongodb.mod.Double]]
  
  @js.native
  object GridFSBucket
    extends TopLevel[
          Instantiable1[/* db */ typingsJapgolly.mongodb.mod.Db, typingsJapgolly.mongodb.mod.GridFSBucket]
        ]
  
  @js.native
  object GridFSBucketReadStream
    extends TopLevel[
          Instantiable4[
            /* chunks */ typingsJapgolly.mongodb.mod.Collection[js.Any], 
            /* files */ typingsJapgolly.mongodb.mod.Collection[js.Any], 
            /* readPreference */ js.Object, 
            /* filter */ js.Object, 
            typingsJapgolly.mongodb.mod.GridFSBucketReadStream
          ]
        ]
  
  @js.native
  object GridFSBucketWriteStream
    extends TopLevel[
          Instantiable2[
            /* bucket */ typingsJapgolly.mongodb.mod.GridFSBucket, 
            /* filename */ String, 
            typingsJapgolly.mongodb.mod.GridFSBucketWriteStream
          ]
        ]
  
  @js.native
  object Int32
    extends TopLevel[Instantiable1[/* value */ scala.Double, typingsJapgolly.mongodb.mod.Int32]]
  
  @js.native
  object MaxKey
    extends TopLevel[Instantiable0[typingsJapgolly.mongodb.mod.MaxKey]]
  
  @js.native
  object MinKey
    extends TopLevel[Instantiable0[typingsJapgolly.mongodb.mod.MinKey]]
  
  @js.native
  object MongoNetworkError
    extends TopLevel[
          Instantiable1[/* message */ String, typingsJapgolly.mongodb.mod.MongoNetworkError]
        ]
  
  @js.native
  object MongoParseError
    extends TopLevel[Instantiable1[/* message */ String, typingsJapgolly.mongodb.mod.MongoParseError]]
  
  @js.native
  object Mongos
    extends TopLevel[
          Instantiable1[
            /* servers */ js.Array[typingsJapgolly.mongodb.mod.Server], 
            typingsJapgolly.mongodb.mod.Mongos
          ]
        ]
  
  @js.native
  object ReplSet
    extends TopLevel[
          Instantiable1[
            /* servers */ js.Array[typingsJapgolly.mongodb.mod.Server], 
            typingsJapgolly.mongodb.mod.ReplSet
          ]
        ]
  
  @js.native
  object ResumeToken
    extends TopLevel[Instantiable0[typingsJapgolly.mongodb.mod.ResumeToken]]
  
  @js.native
  object Server
    extends TopLevel[
          Instantiable2[/* host */ String, /* port */ scala.Double, typingsJapgolly.mongodb.mod.Server]
        ]
  
}

