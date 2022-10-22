package typingsJapgolly.mongodb.mod

import typingsJapgolly.mongodb.mongodbStrings.DEFAULT
import typingsJapgolly.mongodb.mongodbStrings.GSSAPI
import typingsJapgolly.mongodb.mongodbStrings.PLAIN
import typingsJapgolly.mongodb.mongodbStrings.`MONGODB-AWS`
import typingsJapgolly.mongodb.mongodbStrings.`MONGODB-CR`
import typingsJapgolly.mongodb.mongodbStrings.`MONGODB-X509`
import typingsJapgolly.mongodb.mongodbStrings.`SCRAM-SHA-1`
import typingsJapgolly.mongodb.mongodbStrings.`SCRAM-SHA-256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbStrings.`MONGODB-X509`
  - typingsJapgolly.mongodb.mongodbStrings.`MONGODB-AWS`
  - typingsJapgolly.mongodb.mongodbStrings.DEFAULT
  - typingsJapgolly.mongodb.mongodbStrings.PLAIN
  - typingsJapgolly.mongodb.mongodbStrings.`SCRAM-SHA-1`
  - typingsJapgolly.mongodb.mongodbStrings.GSSAPI
  - typingsJapgolly.mongodb.mongodbStrings.`MONGODB-CR`
  - typingsJapgolly.mongodb.mongodbStrings.`SCRAM-SHA-256`
*/
trait AuthMechanism extends StObject
/* Inlined std.Readonly<{ readonly MONGODB_AWS :'MONGODB-AWS',  readonly MONGODB_CR :'MONGODB-CR',  readonly MONGODB_DEFAULT :'DEFAULT',  readonly MONGODB_GSSAPI :'GSSAPI',  readonly MONGODB_PLAIN :'PLAIN',  readonly MONGODB_SCRAM_SHA1 :'SCRAM-SHA-1',  readonly MONGODB_SCRAM_SHA256 :'SCRAM-SHA-256',  readonly MONGODB_X509 :'MONGODB-X509'}> */
object AuthMechanism {
  
  @JSImport("mongodb", "AuthMechanism.MONGODB_AWS")
  @js.native
  val MONGODB_AWS: `MONGODB-AWS` = js.native
  
  @JSImport("mongodb", "AuthMechanism.MONGODB_CR")
  @js.native
  val MONGODB_CR: `MONGODB-CR` = js.native
  
  @JSImport("mongodb", "AuthMechanism.MONGODB_DEFAULT")
  @js.native
  val MONGODB_DEFAULT: DEFAULT = js.native
  
  @JSImport("mongodb", "AuthMechanism.MONGODB_GSSAPI")
  @js.native
  val MONGODB_GSSAPI: GSSAPI = js.native
  
  @JSImport("mongodb", "AuthMechanism.MONGODB_PLAIN")
  @js.native
  val MONGODB_PLAIN: PLAIN = js.native
  
  @JSImport("mongodb", "AuthMechanism.MONGODB_SCRAM_SHA1")
  @js.native
  val MONGODB_SCRAM_SHA1: `SCRAM-SHA-1` = js.native
  
  @JSImport("mongodb", "AuthMechanism.MONGODB_SCRAM_SHA256")
  @js.native
  val MONGODB_SCRAM_SHA256: `SCRAM-SHA-256` = js.native
  
  @JSImport("mongodb", "AuthMechanism.MONGODB_X509")
  @js.native
  val MONGODB_X509: `MONGODB-X509` = js.native
}
