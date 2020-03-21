package typingsJapgolly.petitDom.mod

import typingsJapgolly.petitDom.mod.PetitDom.Component
import typingsJapgolly.petitDom.mod.PetitDom.ComponentClass
import typingsJapgolly.petitDom.mod.PetitDom.ComponentClassNode
import typingsJapgolly.petitDom.mod.PetitDom.ComponentNode
import typingsJapgolly.petitDom.mod.PetitDom.ComponentProps
import typingsJapgolly.petitDom.mod.PetitDom.Content
import typingsJapgolly.petitDom.mod.PetitDom.ElementNode
import typingsJapgolly.petitDom.mod.PetitDom.FunctionComponent
import typingsJapgolly.petitDom.mod.PetitDom.FunctionComponentNode
import typingsJapgolly.petitDom.mod.PetitDom.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h extends js.Object {
  def apply[P /* <: ComponentProps */](`type`: Component[P]): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P]): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P], children: Content*): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P], props: P, children: Content*): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: Component[P], children: Content*): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: Component[P], props: P, children: Content*): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P]): FunctionComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P], children: Content*): FunctionComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P], props: P, children: Content*): FunctionComponentNode[P] = js.native
  def apply[T /* <: String */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.ElementTagNameMap[T] */ js.Any */](`type`: T): ElementNode[T, E] = js.native
  def apply[T /* <: String */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.ElementTagNameMap[T] */ js.Any */](`type`: T, children: Content*): ElementNode[T, E] = js.native
  def apply[T /* <: String */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.ElementTagNameMap[T] */ js.Any */](`type`: T, props: Props[E], children: Content*): ElementNode[T, E] = js.native
}

