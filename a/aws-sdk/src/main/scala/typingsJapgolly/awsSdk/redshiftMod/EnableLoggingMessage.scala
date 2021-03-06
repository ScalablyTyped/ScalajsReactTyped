package typingsJapgolly.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableLoggingMessage extends js.Object {
  /**
    * The name of an existing S3 bucket where the log files are to be stored. Constraints:   Must be in the same region as the cluster   The cluster must have read bucket and put object permissions  
    */
  var BucketName: String = js.native
  /**
    * The identifier of the cluster on which logging is to be started. Example: examplecluster 
    */
  var ClusterIdentifier: String = js.native
  /**
    * The prefix applied to the log file names. Constraints:   Cannot exceed 512 characters   Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters. The hexadecimal codes for invalid characters are:    x00 to x20   x22   x27   x5c   x7f or larger    
    */
  var S3KeyPrefix: js.UndefOr[String] = js.native
}

object EnableLoggingMessage {
  @scala.inline
  def apply(BucketName: String, ClusterIdentifier: String, S3KeyPrefix: String = null): EnableLoggingMessage = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableLoggingMessage]
  }
}

