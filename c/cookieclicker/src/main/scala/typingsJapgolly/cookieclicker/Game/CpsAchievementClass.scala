package typingsJapgolly.cookieclicker.Game

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpsAchievementClass
  extends StObject
     with Achievement {
  
  /**
    * The amount of raw CpS required to get this achievement
    */
  var treshold: Double
}
object CpsAchievementClass {
  
  inline def apply(
    baseDesc: String,
    click: Callback,
    ddesc: String,
    desc: String,
    disabled: PseudoBoolean,
    dname: String,
    getType: CallbackTo[typingsJapgolly.cookieclicker.cookieclickerStrings.Achievement],
    icon: Icon,
    id: Double,
    name: String,
    order: Double,
    pool: AchievementPool,
    toggle: Callback,
    treshold: Double,
    vanilla: PseudoBoolean,
    won: PseudoBoolean
  ): CpsAchievementClass = {
    val __obj = js.Dynamic.literal(baseDesc = baseDesc.asInstanceOf[js.Any], click = click.toJsFn, ddesc = ddesc.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dname = dname.asInstanceOf[js.Any], getType = getType.toJsFn, icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], toggle = toggle.toJsFn, treshold = treshold.asInstanceOf[js.Any], vanilla = vanilla.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("achievement")
    __obj.asInstanceOf[CpsAchievementClass]
  }
  
  extension [Self <: CpsAchievementClass](x: Self) {
    
    inline def setTreshold(value: Double): Self = StObject.set(x, "treshold", value.asInstanceOf[js.Any])
  }
}
