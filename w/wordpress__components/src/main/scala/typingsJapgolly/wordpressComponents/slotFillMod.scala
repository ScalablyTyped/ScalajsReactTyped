package typingsJapgolly.wordpressComponents

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ReactPortal
import typingsJapgolly.wordpressComponents.anon.Fill
import typingsJapgolly.wordpressComponents.anon.`1`
import typingsJapgolly.wordpressComponents.slotFillContextMod.SlotFillContext
import typingsJapgolly.wordpressComponents.slotFillFillMod.Fill.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotFillMod {
  
  @JSImport("@wordpress/components/slot-fill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/components/slot-fill", "Consumer")
  @js.native
  val Consumer: typingsJapgolly.react.mod.Consumer[SlotFillContext] = js.native
  
  inline def Fill(props: Props): ReactPortal = ^.asInstanceOf[js.Dynamic].applyDynamic("Fill")(props.asInstanceOf[js.Any]).asInstanceOf[ReactPortal]
  
  @JSImport("@wordpress/components/slot-fill", "Provider")
  @js.native
  val Provider: ComponentType[`1`] = js.native
  
  @JSImport("@wordpress/components/slot-fill", "Slot")
  @js.native
  val Slot: ComponentType[typingsJapgolly.wordpressComponents.slotFillSlotMod.Slot.Props] = js.native
  
  inline def createSlotFill(name: String): Fill = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlotFill")(name.asInstanceOf[js.Any]).asInstanceOf[Fill]
}
