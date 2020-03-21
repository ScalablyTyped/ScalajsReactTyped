package typingsJapgolly.pulumiAws.lbListenerMod

import typingsJapgolly.pulumiAws.outputMod.lb.ListenerDefaultAction
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lb/listener", "Listener")
@js.native
class Listener protected () extends CustomResource {
  /**
    * Create a Listener resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ListenerArgs) = this()
  def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the listener (matches `id`)
    */
  val arn: Output_[String] = js.native
  /**
    * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the [`aws.lb.ListenerCertificate` resource](https://www.terraform.io/docs/providers/aws/r/lb_listener_certificate.html).
    */
  val certificateArn: Output_[js.UndefOr[String]] = js.native
  /**
    * An Action block. Action blocks are documented below.
    */
  val defaultActions: Output_[js.Array[ListenerDefaultAction]] = js.native
  /**
    * The ARN of the load balancer.
    */
  val loadBalancerArn: Output_[String] = js.native
  /**
    * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
    */
  val port: Output_[Double] = js.native
  /**
    * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
    */
  val protocol: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
    */
  val sslPolicy: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/lb/listener", "Listener")
@js.native
object Listener extends js.Object {
  /**
    * Get an existing Listener resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Listener = js.native
  def get(name: String, id: Input[ID], state: ListenerState): Listener = js.native
  def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): Listener = js.native
  /**
    * Returns true if the given object is an instance of Listener.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listener.Listener */ Boolean = js.native
}

