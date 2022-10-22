package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.screepsDoubles.`0.5`
import typingsJapgolly.screeps.screepsDoubles.`0.6`
import typingsJapgolly.screeps.screepsDoubles.`0.7`
import typingsJapgolly.screeps.screepsDoubles.`0.8`
import typingsJapgolly.screeps.screepsDoubles.`0.9`
import typingsJapgolly.screeps.screepsInts.`1000`
import typingsJapgolly.screeps.screepsInts.`100`
import typingsJapgolly.screeps.screepsInts.`500`
import typingsJapgolly.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationEffect extends StObject {
  
  var className: operator
  
  var cooldown: `500`
  
  var duration: `1000`
  
  var effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`]
  
  var level: js.Tuple5[
    typingsJapgolly.screeps.screepsInts.`0`, 
    typingsJapgolly.screeps.screepsInts.`2`, 
    typingsJapgolly.screeps.screepsInts.`7`, 
    typingsJapgolly.screeps.screepsInts.`14`, 
    typingsJapgolly.screeps.screepsInts.`22`
  ]
  
  var ops: `100`
  
  var range: typingsJapgolly.screeps.screepsInts.`3`
}
object DurationEffect {
  
  inline def apply(
    effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`],
    level: js.Tuple5[
      typingsJapgolly.screeps.screepsInts.`0`, 
      typingsJapgolly.screeps.screepsInts.`2`, 
      typingsJapgolly.screeps.screepsInts.`7`, 
      typingsJapgolly.screeps.screepsInts.`14`, 
      typingsJapgolly.screeps.screepsInts.`22`
    ]
  ): DurationEffect = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 500, duration = 1000, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 100, range = 3)
    __obj.asInstanceOf[DurationEffect]
  }
  
  extension [Self <: DurationEffect](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: `500`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: `1000`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typingsJapgolly.screeps.screepsInts.`0`, 
          typingsJapgolly.screeps.screepsInts.`2`, 
          typingsJapgolly.screeps.screepsInts.`7`, 
          typingsJapgolly.screeps.screepsInts.`14`, 
          typingsJapgolly.screeps.screepsInts.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOps(value: `100`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typingsJapgolly.screeps.screepsInts.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
