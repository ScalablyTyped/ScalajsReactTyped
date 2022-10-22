package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.mod.IChild
import typingsJapgolly.yandexMaps.mod.IControlParent
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IOptionManager
import typingsJapgolly.yandexMaps.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.SearchControl")
@js.native
open class SearchControl ()
  extends StObject
     with IChild[IControlParent] {
  def this(parameters: ISearchControlParameters) = this()
  
  def clear(): Unit = js.native
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  def getMap(): Map_ = js.native
  
  def getRequestString(): String = js.native
  
  def getResponseMetaData(): js.Object = js.native
  
  def getResult(index: Double): js.Promise[js.Object] = js.native
  
  def getResultsArray(): js.Array[js.Object] = js.native
  
  def getResultsCount(): Double = js.native
  
  def getSelectedIndex(): Double = js.native
  
  def hideResult(): Unit = js.native
  
  var options: IOptionManager = js.native
  
  def search(request: String): js.Promise[Unit] = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  def showResult(index: Double): this.type = js.native
  
  var state: typingsJapgolly.yandexMaps.mod.data.Manager = js.native
}
