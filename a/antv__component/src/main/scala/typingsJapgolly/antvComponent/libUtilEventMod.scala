package typingsJapgolly.antvComponent

import typingsJapgolly.antvComponent.libTypesMod.LooseObject
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilEventMod {
  
  @JSImport("@antv/component/lib/util/event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def propagationDelegate(group: IGroup, eventName: String, eventObject: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propagationDelegate")(group.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
