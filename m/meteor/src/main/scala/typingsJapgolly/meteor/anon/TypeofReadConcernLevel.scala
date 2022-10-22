package typingsJapgolly.meteor.anon

import typingsJapgolly.meteor.meteorStrings.available
import typingsJapgolly.meteor.meteorStrings.linearizable
import typingsJapgolly.meteor.meteorStrings.local
import typingsJapgolly.meteor.meteorStrings.majority
import typingsJapgolly.meteor.meteorStrings.snapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReadConcernLevel extends StObject {
  
  val available: typingsJapgolly.meteor.meteorStrings.available
  
  val linearizable: typingsJapgolly.meteor.meteorStrings.linearizable
  
  val local: typingsJapgolly.meteor.meteorStrings.local
  
  val majority: typingsJapgolly.meteor.meteorStrings.majority
  
  val snapshot: typingsJapgolly.meteor.meteorStrings.snapshot
}
object TypeofReadConcernLevel {
  
  inline def apply(): TypeofReadConcernLevel = {
    val __obj = js.Dynamic.literal(available = "available", linearizable = "linearizable", local = "local", majority = "majority", snapshot = "snapshot")
    __obj.asInstanceOf[TypeofReadConcernLevel]
  }
  
  extension [Self <: TypeofReadConcernLevel](x: Self) {
    
    inline def setAvailable(value: available): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setLinearizable(value: linearizable): Self = StObject.set(x, "linearizable", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: local): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setMajority(value: majority): Self = StObject.set(x, "majority", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
