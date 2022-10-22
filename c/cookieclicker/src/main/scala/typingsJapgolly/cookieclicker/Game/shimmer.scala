package typingsJapgolly.cookieclicker.Game

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.cookieclicker.cookieclickerInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait shimmer[N /* <: String */, C /* <: js.Object */] extends StObject {
  
  def die(): Unit
  
  var forceObj: PseudoNull | C
  
  var id: Double
  
  def init(): Unit
  
  var l: HTMLElement
  
  var noCount: Boolean
  
  def pop(event: MouseEvent): Unit
  
  var spawnLead: js.UndefOr[`1`] = js.undefined
  
  var `type`: N
  
  def update(): Unit
  
  var x: Double
  
  var y: Double
}
object shimmer {
  
  inline def apply[N /* <: String */, C /* <: js.Object */](
    die: Callback,
    forceObj: PseudoNull | C,
    id: Double,
    init: Callback,
    l: HTMLElement,
    noCount: Boolean,
    pop: MouseEvent => Callback,
    `type`: N,
    update: Callback,
    x: Double,
    y: Double
  ): shimmer[N, C] = {
    val __obj = js.Dynamic.literal(die = die.toJsFn, forceObj = forceObj.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], init = init.toJsFn, l = l.asInstanceOf[js.Any], noCount = noCount.asInstanceOf[js.Any], pop = js.Any.fromFunction1((t0: MouseEvent) => pop(t0).runNow()), update = update.toJsFn, x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[shimmer[N, C]]
  }
  
  extension [Self <: shimmer[?, ?], N /* <: String */, C /* <: js.Object */](x: Self & (shimmer[N, C])) {
    
    inline def setDie(value: Callback): Self = StObject.set(x, "die", value.toJsFn)
    
    inline def setForceObj(value: PseudoNull | C): Self = StObject.set(x, "forceObj", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setL(value: HTMLElement): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setNoCount(value: Boolean): Self = StObject.set(x, "noCount", value.asInstanceOf[js.Any])
    
    inline def setPop(value: MouseEvent => Callback): Self = StObject.set(x, "pop", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setSpawnLead(value: `1`): Self = StObject.set(x, "spawnLead", value.asInstanceOf[js.Any])
    
    inline def setSpawnLeadUndefined: Self = StObject.set(x, "spawnLead", js.undefined)
    
    inline def setType(value: N): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
