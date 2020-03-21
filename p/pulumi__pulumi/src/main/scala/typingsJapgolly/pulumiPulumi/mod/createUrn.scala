package typingsJapgolly.pulumiPulumi.mod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.URN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "createUrn")
@js.native
object createUrn extends js.Object {
  def apply(name: Input[String], `type`: Input[String]): typingsJapgolly.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN]): typingsJapgolly.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN], project: String): typingsJapgolly.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(name: Input[String], `type`: Input[String], parent: Input[URN], project: String, stack: String): typingsJapgolly.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typingsJapgolly.pulumiPulumi.resourceMod.Resource
  ): typingsJapgolly.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typingsJapgolly.pulumiPulumi.resourceMod.Resource,
    project: String
  ): typingsJapgolly.pulumiPulumi.outputMod.Output_[String] = js.native
  def apply(
    name: Input[String],
    `type`: Input[String],
    parent: typingsJapgolly.pulumiPulumi.resourceMod.Resource,
    project: String,
    stack: String
  ): typingsJapgolly.pulumiPulumi.outputMod.Output_[String] = js.native
}

