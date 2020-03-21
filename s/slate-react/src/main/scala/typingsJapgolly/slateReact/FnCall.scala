package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Annotation
import typingsJapgolly.slate.mod.AnnotationJSON
import typingsJapgolly.slate.mod.AnnotationProperties
import typingsJapgolly.slate.mod.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(annotation: Annotation): Controller = js.native
  def apply(annotation: AnnotationJSON): Controller = js.native
  def apply(annotation: AnnotationProperties): Controller = js.native
}

