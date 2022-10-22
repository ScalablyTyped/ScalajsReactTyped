package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.screepsInts.`40`
import typingsJapgolly.screeps.screepsInts.`50`
import typingsJapgolly.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsRange extends StObject {
  
  var className: operator
  
  var cooldown: typingsJapgolly.screeps.screepsInts.`8`
  
  var duration: typingsJapgolly.screeps.screepsInts.`10`
  
  var level: js.Tuple5[
    typingsJapgolly.screeps.screepsInts.`20`, 
    typingsJapgolly.screeps.screepsInts.`21`, 
    typingsJapgolly.screeps.screepsInts.`22`, 
    typingsJapgolly.screeps.screepsInts.`23`, 
    typingsJapgolly.screeps.screepsInts.`24`
  ]
  
  var ops: js.Tuple5[
    `50`, 
    `40`, 
    typingsJapgolly.screeps.screepsInts.`30`, 
    typingsJapgolly.screeps.screepsInts.`20`, 
    typingsJapgolly.screeps.screepsInts.`10`
  ]
  
  var range: `50`
}
object OpsRange {
  
  inline def apply(
    level: js.Tuple5[
      typingsJapgolly.screeps.screepsInts.`20`, 
      typingsJapgolly.screeps.screepsInts.`21`, 
      typingsJapgolly.screeps.screepsInts.`22`, 
      typingsJapgolly.screeps.screepsInts.`23`, 
      typingsJapgolly.screeps.screepsInts.`24`
    ],
    ops: js.Tuple5[
      `50`, 
      `40`, 
      typingsJapgolly.screeps.screepsInts.`30`, 
      typingsJapgolly.screeps.screepsInts.`20`, 
      typingsJapgolly.screeps.screepsInts.`10`
    ]
  ): OpsRange = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 8, duration = 10, level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = 50)
    __obj.asInstanceOf[OpsRange]
  }
  
  extension [Self <: OpsRange](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: typingsJapgolly.screeps.screepsInts.`8`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: typingsJapgolly.screeps.screepsInts.`10`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typingsJapgolly.screeps.screepsInts.`20`, 
          typingsJapgolly.screeps.screepsInts.`21`, 
          typingsJapgolly.screeps.screepsInts.`22`, 
          typingsJapgolly.screeps.screepsInts.`23`, 
          typingsJapgolly.screeps.screepsInts.`24`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOps(
      value: js.Tuple5[
          `50`, 
          `40`, 
          typingsJapgolly.screeps.screepsInts.`30`, 
          typingsJapgolly.screeps.screepsInts.`20`, 
          typingsJapgolly.screeps.screepsInts.`10`
        ]
    ): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setRange(value: `50`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
