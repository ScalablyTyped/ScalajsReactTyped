package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.screepsDoubles.`1.1`
import typingsJapgolly.screeps.screepsDoubles.`1.2`
import typingsJapgolly.screeps.screepsDoubles.`1.3`
import typingsJapgolly.screeps.screepsDoubles.`1.4`
import typingsJapgolly.screeps.screepsDoubles.`1.5`
import typingsJapgolly.screeps.screepsInts.`100`
import typingsJapgolly.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  var className: operator
  
  var cooldown: typingsJapgolly.screeps.screepsInts.`10`
  
  var duration: `100`
  
  var effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`]
  
  var level: js.Tuple5[
    typingsJapgolly.screeps.screepsInts.`0`, 
    typingsJapgolly.screeps.screepsInts.`2`, 
    typingsJapgolly.screeps.screepsInts.`7`, 
    typingsJapgolly.screeps.screepsInts.`14`, 
    typingsJapgolly.screeps.screepsInts.`22`
  ]
  
  var ops: typingsJapgolly.screeps.screepsInts.`10`
  
  var range: typingsJapgolly.screeps.screepsInts.`3`
}
object Level {
  
  inline def apply(
    effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`],
    level: js.Tuple5[
      typingsJapgolly.screeps.screepsInts.`0`, 
      typingsJapgolly.screeps.screepsInts.`2`, 
      typingsJapgolly.screeps.screepsInts.`7`, 
      typingsJapgolly.screeps.screepsInts.`14`, 
      typingsJapgolly.screeps.screepsInts.`22`
    ]
  ): Level = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 10, duration = 100, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 10, range = 3)
    __obj.asInstanceOf[Level]
  }
  
  extension [Self <: Level](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: typingsJapgolly.screeps.screepsInts.`10`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: `100`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typingsJapgolly.screeps.screepsInts.`0`, 
          typingsJapgolly.screeps.screepsInts.`2`, 
          typingsJapgolly.screeps.screepsInts.`7`, 
          typingsJapgolly.screeps.screepsInts.`14`, 
          typingsJapgolly.screeps.screepsInts.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOps(value: typingsJapgolly.screeps.screepsInts.`10`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typingsJapgolly.screeps.screepsInts.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
