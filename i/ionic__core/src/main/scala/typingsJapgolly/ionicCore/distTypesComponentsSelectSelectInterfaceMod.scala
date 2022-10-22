package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSelectElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSelectSelectInterfaceMod {
  
  trait SelectChangeEventDetail[T] extends StObject {
    
    var value: T
  }
  object SelectChangeEventDetail {
    
    inline def apply[T](value: T): SelectChangeEventDetail[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChangeEventDetail[T]]
    }
    
    extension [Self <: SelectChangeEventDetail[?], T](x: Self & SelectChangeEventDetail[T]) {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectCompareFn = js.Function2[/* currentValue */ Any, /* compareValue */ Any, Boolean]
  
  @js.native
  trait SelectCustomEvent[T]
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_SelectCustomEvent: SelectChangeEventDetail[T] = js.native
    
    @JSName("target")
    var target_SelectCustomEvent: HTMLIonSelectElement = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.`action-sheet`
    - typingsJapgolly.ionicCore.ionicCoreStrings.popover
    - typingsJapgolly.ionicCore.ionicCoreStrings.alert
  */
  trait SelectInterface extends StObject
  object SelectInterface {
    
    inline def `action-sheet`: typingsJapgolly.ionicCore.ionicCoreStrings.`action-sheet` = "action-sheet".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`action-sheet`]
    
    inline def alert: typingsJapgolly.ionicCore.ionicCoreStrings.alert = "alert".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.alert]
    
    inline def popover: typingsJapgolly.ionicCore.ionicCoreStrings.popover = "popover".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.popover]
  }
}
