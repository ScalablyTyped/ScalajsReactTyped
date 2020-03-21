package typingsJapgolly.migrateMongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MigrationFunction = (js.Function2[
    /* db */ typingsJapgolly.mongodb.mod.Db, 
    (/* next */ typingsJapgolly.mongodb.mod.MongoCallback[typingsJapgolly.mongodb.mod.UpdateWriteOpResult]) | (/* client */ typingsJapgolly.mongodb.mod.MongoClient), 
    js.Promise[scala.Unit] | scala.Unit
  ]) | (js.Function3[
    /* db */ typingsJapgolly.mongodb.mod.Db, 
    /* client */ typingsJapgolly.mongodb.mod.MongoClient, 
    /* next */ typingsJapgolly.mongodb.mod.MongoCallback[typingsJapgolly.mongodb.mod.UpdateWriteOpResult], 
    scala.Unit
  ])
}
