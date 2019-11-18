package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze */ @js.native
trait IOptionManager extends IChild[IOptionManager] {
  def freeze(): IFreezable = js.native
  def get(key: String, defaultValue: js.Object): js.Object = js.native
  def getAll(): js.Object = js.native
  def getName(): String = js.native
  def getNative(key: String): js.Object = js.native
  def isFrozen(): Boolean = js.native
  def resolve(key: String): js.Object = js.native
  def resolve(key: String, name: String): js.Object = js.native
  def setName(name: String): Unit = js.native
  def unfreeze(): IFreezable = js.native
}

