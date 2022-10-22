package typingsJapgolly.meteor.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.mongodb.anon.PartialMongoCredentialsOp
import typingsJapgolly.mongodb.mod.MongoCredentials
import typingsJapgolly.mongodb.mod.MongoCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMongoCredentials
  extends StObject
     with Instantiable1[/* options */ MongoCredentialsOptions, MongoCredentials] {
  
  def merge(creds: Unit, options: PartialMongoCredentialsOp): MongoCredentials = js.native
  def merge(creds: MongoCredentials, options: PartialMongoCredentialsOp): MongoCredentials = js.native
}
