package typingsJapgolly.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionConfiguration extends js.Object {
  /**
    * The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
    */
  var DatabaseHost: typingsJapgolly.awsSdk.kendraMod.DatabaseHost = js.native
  /**
    * The name of the database containing the document data.
    */
  var DatabaseName: typingsJapgolly.awsSdk.kendraMod.DatabaseName = js.native
  /**
    * The port that the database uses for connections.
    */
  var DatabasePort: typingsJapgolly.awsSdk.kendraMod.DatabasePort = js.native
  /**
    * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a user/password pair. For more information, see Using a Database Data Source. For more information about AWS Secrets Manager, see  What Is AWS Secrets Manager  in the AWS Secrets Manager user guide.
    */
  var SecretArn: typingsJapgolly.awsSdk.kendraMod.SecretArn = js.native
  /**
    * The name of the table that contains the document data.
    */
  var TableName: typingsJapgolly.awsSdk.kendraMod.TableName = js.native
}

object ConnectionConfiguration {
  @scala.inline
  def apply(
    DatabaseHost: DatabaseHost,
    DatabaseName: DatabaseName,
    DatabasePort: DatabasePort,
    SecretArn: SecretArn,
    TableName: TableName
  ): ConnectionConfiguration = {
    val __obj = js.Dynamic.literal(DatabaseHost = DatabaseHost.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], DatabasePort = DatabasePort.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionConfiguration]
  }
}

