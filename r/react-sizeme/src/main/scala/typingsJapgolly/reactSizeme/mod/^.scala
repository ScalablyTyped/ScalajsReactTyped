package typingsJapgolly.reactSizeme.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactSizeme.reactSizemeStrings.size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sizeme", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var noPlaceholders: Boolean = js.native
  def apply(): js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) with WithSizeProps]
  ] = js.native
  def apply(options: SizeMeOptions): js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) with WithSizeProps]
  ] = js.native
}

