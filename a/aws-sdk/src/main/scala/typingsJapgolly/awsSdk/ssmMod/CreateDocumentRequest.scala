package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDocumentRequest extends js.Object {
  /**
    * A list of key and value pairs that describe attachments to a version of a document.
    */
  var Attachments: js.UndefOr[AttachmentsSourceList] = js.native
  /**
    * A valid JSON or YAML string.
    */
  var Content: DocumentContent = js.native
  /**
    * Specify the document format for the request. The document format can be JSON, YAML, or TEXT. JSON is the default format.
    */
  var DocumentFormat: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.DocumentFormat] = js.native
  /**
    * The type of document to create.
    */
  var DocumentType: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.DocumentType] = js.native
  /**
    * A name for the Systems Manager document.  Do not use the following to begin the names of documents you create. They are reserved by AWS for use as document prefixes:    aws     amazon     amzn    
    */
  var Name: DocumentName = js.native
  /**
    * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.native
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of targets or the environment where it will run. In this case, you could specify the following key name/value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     To add tags to an existing SSM document, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Specify a target type to define the kinds of resources the document can run on. For example, to run a document on EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/' the document can run on all types of resources. If you don't specify a value, the document can't run on any resources. For a list of valid resource types, see AWS Resource Types Reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.TargetType] = js.native
  /**
    * An optional field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}

object CreateDocumentRequest {
  @scala.inline
  def apply(
    Content: DocumentContent,
    Name: DocumentName,
    Attachments: AttachmentsSourceList = null,
    DocumentFormat: DocumentFormat = null,
    DocumentType: DocumentType = null,
    Requires: DocumentRequiresList = null,
    Tags: TagList = null,
    TargetType: TargetType = null,
    VersionName: DocumentVersionName = null
  ): CreateDocumentRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments.asInstanceOf[js.Any])
    if (DocumentFormat != null) __obj.updateDynamic("DocumentFormat")(DocumentFormat.asInstanceOf[js.Any])
    if (DocumentType != null) __obj.updateDynamic("DocumentType")(DocumentType.asInstanceOf[js.Any])
    if (Requires != null) __obj.updateDynamic("Requires")(Requires.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType.asInstanceOf[js.Any])
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentRequest]
  }
}

