package typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamedResource extends js.Object {
  var candidates: IVectorView[ResourceCandidate] = js.native
  var uri: Uri = js.native
  def resolve(): ResourceCandidate = js.native
  def resolve(resourceContext: ResourceContext): ResourceCandidate = js.native
  def resolveAll(): IVectorView[ResourceCandidate] = js.native
  def resolveAll(resourceContext: ResourceContext): IVectorView[ResourceCandidate] = js.native
}

