package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.mod.IControlParent
import typingsJapgolly.yandexMaps.mod.ICustomizable
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IOptionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.IChild because var conflicts: events. Inlined getParent, setParent, setParent
- typingsJapgolly.yandexMaps.mod.ISelectableControl because var conflicts: events. Inlined deselect, disable, enable, isEnabled, isSelected, select */ @JSImport("yandex-maps", "control.Button")
@js.native
open class Button ()
  extends StObject
     with ICustomizable {
  def this(parameters: String) = this()
  def this(parameters: IButtonParameters) = this()
  
  var data: typingsJapgolly.yandexMaps.mod.data.Manager = js.native
  
  def deselect(): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  def getParent(): Null | IControlParent = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isSelected(): Boolean = js.native
  
  /* CompleteClass */
  var options: IOptionManager = js.native
  
  def select(): Unit = js.native
  
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
  def setParent(parent: IControlParent): this.type = js.native
  
  var state: typingsJapgolly.yandexMaps.mod.data.Manager = js.native
}
