package typingsJapgolly.pulumiAws.databaseMod

import typingsJapgolly.pulumiAws.inputMod.athena.DatabaseEncryptionConfiguration
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseArgs extends js.Object {
  /**
    * Name of s3 bucket to save the results of the query execution.
    */
  val bucket: Input[String] = js.native
  /**
    * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryptionConfiguration` block is documented below.
    */
  val encryptionConfiguration: js.UndefOr[Input[DatabaseEncryptionConfiguration]] = js.native
  /**
    * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Name of the database to create.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object DatabaseArgs {
  @scala.inline
  def apply(
    bucket: Input[String],
    encryptionConfiguration: Input[DatabaseEncryptionConfiguration] = null,
    forceDestroy: Input[Boolean] = null,
    name: Input[String] = null
  ): DatabaseArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseArgs]
  }
}

