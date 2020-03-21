package typingsJapgolly.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftIntegration extends js.Object {
  // AWS access key credentials
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
  // Redshift Cluster host
  var host: String
  // Password associated with Redshift cluster
  var password: String
  // Redshift Cluster port
  var port: Double
  // unload S3 bucket path
  var s3_bucket_path: String
  // Username associated with Redshift cluster
  var username: String
}

object RedshiftIntegration {
  @scala.inline
  def apply(
    host: String,
    password: String,
    port: Double,
    s3_bucket_path: String,
    username: String,
    aws_access_key: AwsAccessKey = null
  ): RedshiftIntegration = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], s3_bucket_path = s3_bucket_path.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (aws_access_key != null) __obj.updateDynamic("aws_access_key")(aws_access_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftIntegration]
  }
}

