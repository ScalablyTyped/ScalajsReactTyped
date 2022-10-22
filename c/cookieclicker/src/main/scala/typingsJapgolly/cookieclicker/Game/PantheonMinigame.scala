package typingsJapgolly.cookieclicker.Game

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.cookieclicker.cookieclickerBooleans.`false`
import typingsJapgolly.cookieclicker.cookieclickerInts.`-1`
import typingsJapgolly.cookieclicker.cookieclickerInts.`0`
import typingsJapgolly.cookieclicker.cookieclickerInts.`1`
import typingsJapgolly.cookieclicker.cookieclickerInts.`2`
import typingsJapgolly.cookieclicker.cookieclickerStrings.Pantheon
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PantheonMinigame
  extends StObject
     with Minigame {
  
  def dragGod(what: PantheonSpirit): Unit
  
  /**
    * The currently dragged spirit
    */
  var dragging: PantheonSpirit | `false`
  
  @JSName("draw")
  def draw_MPantheonMinigame(): Unit
  
  def dropGod(): Unit
  
  /**
    * Generates the tooltip function for a spirit
    */
  def godTooltip(id: Double): js.Function0[String]
  
  var gods: Record[String, PantheonSpirit]
  
  var godsById: js.Array[PantheonSpirit]
  
  def hoverSlot(what: `-1` | `0` | `1` | `2`): Unit
  
  /**
    * The amount of frames between the last swap
    */
  var lastSwapT: Double
  
  @JSName("logic")
  def logic_MPantheonMinigame(): Unit
  
  var lumpRefill: HTMLDivElement
  
  @JSName("name")
  var name_PantheonMinigame: Pantheon
  
  /**
    * Generates the lump refill tooltip
    */
  def refillTooltip(): String
  
  /**
    * A tuple of the current slots, -1 for nothing
    */
  var slot: js.Tuple3[Double, Double, Double]
  
  /**
    * Slots a spirit in
    * @returns If the operation was successful
    */
  def slotGod(god: PantheonSpirit, slot: `-1` | `0` | `1` | `2`): Boolean
  
  /**
    * The currently hovered slot
    */
  var slotHovered: `-1` | `0` | `1` | `2`
  
  /**
    * Names of the slot gems
    */
  var slotNames: js.Array[String]
  
  /**
    * Generates the tooltip function for a slot
    */
  def slotTooltip(id: Double): js.Function0[String]
  
  /**
    * The last time a spirit was slotted
    */
  var swapT: Double
  
  /**
    * The amount of swaps left
    */
  var swaps: Double
  
  var swapsL: HTMLDivElement
  
  /**
    * Uses up an amount of swaps
    * @param n The amount of swaps to use
    */
  def useSwap(n: Double): Unit
}
object PantheonMinigame {
  
  inline def apply(
    dragGod: PantheonSpirit => Callback,
    dragging: PantheonSpirit | `false`,
    draw: Callback,
    dropGod: Callback,
    godTooltip: Double => js.Function0[String],
    gods: Record[String, PantheonSpirit],
    godsById: js.Array[PantheonSpirit],
    hoverSlot: `-1` | `0` | `1` | `2` => Callback,
    init: HTMLDivElement => Callback,
    lastSwapT: Double,
    launch: Callback,
    load: String => Callback,
    logic: Callback,
    lumpRefill: HTMLDivElement,
    parent: GameObject,
    refillTooltip: CallbackTo[String],
    save: CallbackTo[String],
    slot: js.Tuple3[Double, Double, Double],
    slotGod: (PantheonSpirit, `-1` | `0` | `1` | `2`) => Boolean,
    slotHovered: `-1` | `0` | `1` | `2`,
    slotNames: js.Array[String],
    slotTooltip: Double => js.Function0[String],
    swapT: Double,
    swaps: Double,
    swapsL: HTMLDivElement,
    useSwap: Double => Callback
  ): PantheonMinigame = {
    val __obj = js.Dynamic.literal(dragGod = js.Any.fromFunction1((t0: PantheonSpirit) => dragGod(t0).runNow()), dragging = dragging.asInstanceOf[js.Any], draw = draw.toJsFn, dropGod = dropGod.toJsFn, godTooltip = js.Any.fromFunction1(godTooltip), gods = gods.asInstanceOf[js.Any], godsById = godsById.asInstanceOf[js.Any], hoverSlot = js.Any.fromFunction1((t0: `-1` | `0` | `1` | `2`) => hoverSlot(t0).runNow()), init = js.Any.fromFunction1((t0: HTMLDivElement) => init(t0).runNow()), lastSwapT = lastSwapT.asInstanceOf[js.Any], launch = launch.toJsFn, load = js.Any.fromFunction1((t0: String) => load(t0).runNow()), logic = logic.toJsFn, lumpRefill = lumpRefill.asInstanceOf[js.Any], name = "Pantheon", parent = parent.asInstanceOf[js.Any], refillTooltip = refillTooltip.toJsFn, save = save.toJsFn, slot = slot.asInstanceOf[js.Any], slotGod = js.Any.fromFunction2(slotGod), slotHovered = slotHovered.asInstanceOf[js.Any], slotNames = slotNames.asInstanceOf[js.Any], slotTooltip = js.Any.fromFunction1(slotTooltip), swapT = swapT.asInstanceOf[js.Any], swaps = swaps.asInstanceOf[js.Any], swapsL = swapsL.asInstanceOf[js.Any], useSwap = js.Any.fromFunction1((t0: Double) => useSwap(t0).runNow()))
    __obj.asInstanceOf[PantheonMinigame]
  }
  
  extension [Self <: PantheonMinigame](x: Self) {
    
    inline def setDragGod(value: PantheonSpirit => Callback): Self = StObject.set(x, "dragGod", js.Any.fromFunction1((t0: PantheonSpirit) => value(t0).runNow()))
    
    inline def setDragging(value: PantheonSpirit | `false`): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setDraw(value: Callback): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setDropGod(value: Callback): Self = StObject.set(x, "dropGod", value.toJsFn)
    
    inline def setGodTooltip(value: Double => js.Function0[String]): Self = StObject.set(x, "godTooltip", js.Any.fromFunction1(value))
    
    inline def setGods(value: Record[String, PantheonSpirit]): Self = StObject.set(x, "gods", value.asInstanceOf[js.Any])
    
    inline def setGodsById(value: js.Array[PantheonSpirit]): Self = StObject.set(x, "godsById", value.asInstanceOf[js.Any])
    
    inline def setGodsByIdVarargs(value: PantheonSpirit*): Self = StObject.set(x, "godsById", js.Array(value*))
    
    inline def setHoverSlot(value: `-1` | `0` | `1` | `2` => Callback): Self = StObject.set(x, "hoverSlot", js.Any.fromFunction1((t0: `-1` | `0` | `1` | `2`) => value(t0).runNow()))
    
    inline def setLastSwapT(value: Double): Self = StObject.set(x, "lastSwapT", value.asInstanceOf[js.Any])
    
    inline def setLogic(value: Callback): Self = StObject.set(x, "logic", value.toJsFn)
    
    inline def setLumpRefill(value: HTMLDivElement): Self = StObject.set(x, "lumpRefill", value.asInstanceOf[js.Any])
    
    inline def setName(value: Pantheon): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRefillTooltip(value: CallbackTo[String]): Self = StObject.set(x, "refillTooltip", value.toJsFn)
    
    inline def setSlot(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotGod(value: (PantheonSpirit, `-1` | `0` | `1` | `2`) => Boolean): Self = StObject.set(x, "slotGod", js.Any.fromFunction2(value))
    
    inline def setSlotHovered(value: `-1` | `0` | `1` | `2`): Self = StObject.set(x, "slotHovered", value.asInstanceOf[js.Any])
    
    inline def setSlotNames(value: js.Array[String]): Self = StObject.set(x, "slotNames", value.asInstanceOf[js.Any])
    
    inline def setSlotNamesVarargs(value: String*): Self = StObject.set(x, "slotNames", js.Array(value*))
    
    inline def setSlotTooltip(value: Double => js.Function0[String]): Self = StObject.set(x, "slotTooltip", js.Any.fromFunction1(value))
    
    inline def setSwapT(value: Double): Self = StObject.set(x, "swapT", value.asInstanceOf[js.Any])
    
    inline def setSwaps(value: Double): Self = StObject.set(x, "swaps", value.asInstanceOf[js.Any])
    
    inline def setSwapsL(value: HTMLDivElement): Self = StObject.set(x, "swapsL", value.asInstanceOf[js.Any])
    
    inline def setUseSwap(value: Double => Callback): Self = StObject.set(x, "useSwap", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
