package typingsJapgolly.pulumiPulumi.mod

import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "mergeOptions")
@js.native
object mergeOptions extends js.Object {
  def apply(): CustomResourceOptions = js.native
  def apply(opts1: js.UndefOr[scala.Nothing], opts2: ComponentResourceOptions): ComponentResourceOptions = js.native
  def apply(opts1: js.UndefOr[scala.Nothing], opts2: CustomResourceOptions): CustomResourceOptions = js.native
  def apply(opts1: js.UndefOr[scala.Nothing], opts2: ResourceOptions): ResourceOptions = js.native
  def apply(opts1: ComponentResourceOptions): ComponentResourceOptions = js.native
  def apply(opts1: ComponentResourceOptions, opts2: ComponentResourceOptions): ComponentResourceOptions = js.native
  def apply(opts1: CustomResourceOptions): CustomResourceOptions = js.native
  def apply(opts1: CustomResourceOptions, opts2: CustomResourceOptions): CustomResourceOptions = js.native
  def apply(opts1: ResourceOptions): ResourceOptions = js.native
  def apply(opts1: ResourceOptions, opts2: ResourceOptions): ResourceOptions = js.native
}

