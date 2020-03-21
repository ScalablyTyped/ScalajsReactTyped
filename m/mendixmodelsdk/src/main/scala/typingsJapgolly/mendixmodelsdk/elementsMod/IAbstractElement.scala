package typingsJapgolly.mendixmodelsdk.elementsMod

import typingsJapgolly.mendixmodelsdk.structuresMod.IStructure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractElement extends IStructure {
  def asLoaded(): IAbstractElement = js.native
  def load(): js.Promise[IAbstractElement] = js.native
  def load(callback: js.Function1[/* element */ this.type, Unit]): Unit = js.native
  def load(callback: js.Function1[/* element */ this.type, Unit], forceRefresh: Boolean): Unit = js.native
  def load(forceRefresh: Boolean): js.Promise[IAbstractElement] = js.native
}

