package typingsJapgolly.devextremeRuntime

import typingsJapgolly.angularCore.mod.ElementRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAngularIsSlotEmptyMod {
  
  @JSImport("@devextreme/runtime/esm/angular/is-slot-empty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSlotEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlotEmpty")().asInstanceOf[Boolean]
  inline def isSlotEmpty(slot: ElementRef[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlotEmpty")(slot.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
