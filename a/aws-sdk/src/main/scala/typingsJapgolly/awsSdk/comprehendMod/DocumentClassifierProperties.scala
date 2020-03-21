package typingsJapgolly.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentClassifierProperties extends js.Object {
  /**
    * Information about the document classifier, including the number of documents used for training the classifier, the number of documents used for test the classifier, and an accuracy rating.
    */
  var ClassifierMetadata: js.UndefOr[typingsJapgolly.awsSdk.comprehendMod.ClassifierMetadata] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier.
    */
  var DocumentClassifierArn: js.UndefOr[typingsJapgolly.awsSdk.comprehendMod.DocumentClassifierArn] = js.native
  /**
    * The time that training the document classifier completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The input data configuration that you supplied when you created the document classifier for training.
    */
  var InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig] = js.native
  /**
    * The language code for the language of the documents that the classifier was trained on.
    */
  var LanguageCode: js.UndefOr[typingsJapgolly.awsSdk.comprehendMod.LanguageCode] = js.native
  /**
    * Additional information about the status of the classifier.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  /**
    * Indicates the mode in which the specific classifier was trained. This also indicates the format of input documents and the format of the confusion matrix. Each classifier can only be trained in one mode and this cannot be changed once the classifier is trained.
    */
  var Mode: js.UndefOr[DocumentClassifierMode] = js.native
  /**
    *  Provides output results configuration parameters for custom classifier jobs.
    */
  var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig] = js.native
  /**
    * The status of the document classifier. If the status is TRAINED the classifier is ready to use. If the status is FAILED you can see additional information about why the classifier wasn't trained in the Message field.
    */
  var Status: js.UndefOr[ModelStatus] = js.native
  /**
    * The time that the document classifier was submitted for training.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.native
  /**
    * The time that training of the document classifier was completed. Indicates the time when the training completes on documentation classifiers. You are billed for the time interval between this time and the value of TrainingStartTime.
    */
  var TrainingEndTime: js.UndefOr[js.Date] = js.native
  /**
    * Indicates the time when the training starts on documentation classifiers. You are billed for the time interval between this time and the value of TrainingEndTime. 
    */
  var TrainingStartTime: js.UndefOr[js.Date] = js.native
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your custom classifier. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typingsJapgolly.awsSdk.comprehendMod.VpcConfig] = js.native
}

object DocumentClassifierProperties {
  @scala.inline
  def apply(
    ClassifierMetadata: ClassifierMetadata = null,
    DataAccessRoleArn: IamRoleArn = null,
    DocumentClassifierArn: DocumentClassifierArn = null,
    EndTime: js.Date = null,
    InputDataConfig: DocumentClassifierInputDataConfig = null,
    LanguageCode: LanguageCode = null,
    Message: AnyLengthString = null,
    Mode: DocumentClassifierMode = null,
    OutputDataConfig: DocumentClassifierOutputDataConfig = null,
    Status: ModelStatus = null,
    SubmitTime: js.Date = null,
    TrainingEndTime: js.Date = null,
    TrainingStartTime: js.Date = null,
    VolumeKmsKeyId: KmsKeyId = null,
    VpcConfig: VpcConfig = null
  ): DocumentClassifierProperties = {
    val __obj = js.Dynamic.literal()
    if (ClassifierMetadata != null) __obj.updateDynamic("ClassifierMetadata")(ClassifierMetadata.asInstanceOf[js.Any])
    if (DataAccessRoleArn != null) __obj.updateDynamic("DataAccessRoleArn")(DataAccessRoleArn.asInstanceOf[js.Any])
    if (DocumentClassifierArn != null) __obj.updateDynamic("DocumentClassifierArn")(DocumentClassifierArn.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (OutputDataConfig != null) __obj.updateDynamic("OutputDataConfig")(OutputDataConfig.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime.asInstanceOf[js.Any])
    if (TrainingEndTime != null) __obj.updateDynamic("TrainingEndTime")(TrainingEndTime.asInstanceOf[js.Any])
    if (TrainingStartTime != null) __obj.updateDynamic("TrainingStartTime")(TrainingStartTime.asInstanceOf[js.Any])
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentClassifierProperties]
  }
}

