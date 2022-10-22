package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.screepsInts.`100`
import typingsJapgolly.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelPeriod extends StObject {
  
  var className: operator
  
  var cooldown: `100`
  
  var duration: `100`
  
  var effect: js.Tuple5[
    typingsJapgolly.screeps.screepsInts.`2`, 
    typingsJapgolly.screeps.screepsInts.`4`, 
    typingsJapgolly.screeps.screepsInts.`6`, 
    typingsJapgolly.screeps.screepsInts.`8`, 
    typingsJapgolly.screeps.screepsInts.`10`
  ]
  
  var level: js.Tuple5[
    typingsJapgolly.screeps.screepsInts.`10`, 
    typingsJapgolly.screeps.screepsInts.`11`, 
    typingsJapgolly.screeps.screepsInts.`12`, 
    typingsJapgolly.screeps.screepsInts.`14`, 
    typingsJapgolly.screeps.screepsInts.`22`
  ]
  
  var period: typingsJapgolly.screeps.screepsInts.`10`
  
  var range: typingsJapgolly.screeps.screepsInts.`3`
}
object LevelPeriod {
  
  inline def apply(
    effect: js.Tuple5[
      typingsJapgolly.screeps.screepsInts.`2`, 
      typingsJapgolly.screeps.screepsInts.`4`, 
      typingsJapgolly.screeps.screepsInts.`6`, 
      typingsJapgolly.screeps.screepsInts.`8`, 
      typingsJapgolly.screeps.screepsInts.`10`
    ],
    level: js.Tuple5[
      typingsJapgolly.screeps.screepsInts.`10`, 
      typingsJapgolly.screeps.screepsInts.`11`, 
      typingsJapgolly.screeps.screepsInts.`12`, 
      typingsJapgolly.screeps.screepsInts.`14`, 
      typingsJapgolly.screeps.screepsInts.`22`
    ]
  ): LevelPeriod = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 100, duration = 100, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], period = 10, range = 3)
    __obj.asInstanceOf[LevelPeriod]
  }
  
  extension [Self <: LevelPeriod](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: `100`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: `100`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffect(
      value: js.Tuple5[
          typingsJapgolly.screeps.screepsInts.`2`, 
          typingsJapgolly.screeps.screepsInts.`4`, 
          typingsJapgolly.screeps.screepsInts.`6`, 
          typingsJapgolly.screeps.screepsInts.`8`, 
          typingsJapgolly.screeps.screepsInts.`10`
        ]
    ): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typingsJapgolly.screeps.screepsInts.`10`, 
          typingsJapgolly.screeps.screepsInts.`11`, 
          typingsJapgolly.screeps.screepsInts.`12`, 
          typingsJapgolly.screeps.screepsInts.`14`, 
          typingsJapgolly.screeps.screepsInts.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: typingsJapgolly.screeps.screepsInts.`10`): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typingsJapgolly.screeps.screepsInts.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
