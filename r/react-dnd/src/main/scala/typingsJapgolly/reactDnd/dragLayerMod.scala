package typingsJapgolly.reactDnd

import typingsJapgolly.reactDnd.interfacesMod.DndComponentEnhancer
import typingsJapgolly.reactDnd.interfacesMod.DragLayerCollector
import typingsJapgolly.reactDnd.optionsMod.DndOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/DragLayer", JSImport.Namespace)
@js.native
object dragLayerMod extends js.Object {
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps]): DndComponentEnhancer[CollectedProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps], options: DndOptions[RequiredProps]): DndComponentEnhancer[CollectedProps] = js.native
}

