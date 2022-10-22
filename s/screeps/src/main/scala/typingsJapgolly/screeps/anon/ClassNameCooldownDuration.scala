package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameCooldownDuration extends StObject {
  
  var className: operator
  
  var cooldown: typingsJapgolly.screeps.screepsInts.`5`
  
  var duration: js.Tuple5[
    typingsJapgolly.screeps.screepsInts.`1`, 
    typingsJapgolly.screeps.screepsInts.`2`, 
    typingsJapgolly.screeps.screepsInts.`3`, 
    typingsJapgolly.screeps.screepsInts.`4`, 
    typingsJapgolly.screeps.screepsInts.`5`
  ]
  
  var level: js.Tuple5[
    typingsJapgolly.screeps.screepsInts.`0`, 
    typingsJapgolly.screeps.screepsInts.`2`, 
    typingsJapgolly.screeps.screepsInts.`7`, 
    typingsJapgolly.screeps.screepsInts.`14`, 
    typingsJapgolly.screeps.screepsInts.`22`
  ]
  
  var ops: typingsJapgolly.screeps.screepsInts.`5`
  
  var range: typingsJapgolly.screeps.screepsInts.`3`
}
object ClassNameCooldownDuration {
  
  inline def apply(
    duration: js.Tuple5[
      typingsJapgolly.screeps.screepsInts.`1`, 
      typingsJapgolly.screeps.screepsInts.`2`, 
      typingsJapgolly.screeps.screepsInts.`3`, 
      typingsJapgolly.screeps.screepsInts.`4`, 
      typingsJapgolly.screeps.screepsInts.`5`
    ],
    level: js.Tuple5[
      typingsJapgolly.screeps.screepsInts.`0`, 
      typingsJapgolly.screeps.screepsInts.`2`, 
      typingsJapgolly.screeps.screepsInts.`7`, 
      typingsJapgolly.screeps.screepsInts.`14`, 
      typingsJapgolly.screeps.screepsInts.`22`
    ]
  ): ClassNameCooldownDuration = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 5, duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 5, range = 3)
    __obj.asInstanceOf[ClassNameCooldownDuration]
  }
  
  extension [Self <: ClassNameCooldownDuration](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: typingsJapgolly.screeps.screepsInts.`5`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(
      value: js.Tuple5[
          typingsJapgolly.screeps.screepsInts.`1`, 
          typingsJapgolly.screeps.screepsInts.`2`, 
          typingsJapgolly.screeps.screepsInts.`3`, 
          typingsJapgolly.screeps.screepsInts.`4`, 
          typingsJapgolly.screeps.screepsInts.`5`
        ]
    ): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typingsJapgolly.screeps.screepsInts.`0`, 
          typingsJapgolly.screeps.screepsInts.`2`, 
          typingsJapgolly.screeps.screepsInts.`7`, 
          typingsJapgolly.screeps.screepsInts.`14`, 
          typingsJapgolly.screeps.screepsInts.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOps(value: typingsJapgolly.screeps.screepsInts.`5`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typingsJapgolly.screeps.screepsInts.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
