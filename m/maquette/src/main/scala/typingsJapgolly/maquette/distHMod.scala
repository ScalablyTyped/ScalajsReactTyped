package typingsJapgolly.maquette

import typingsJapgolly.maquette.distInterfacesMod.VNode
import typingsJapgolly.maquette.distInterfacesMod.VNodeChild
import typingsJapgolly.maquette.distInterfacesMod.VNodeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHMod {
  
  @JSImport("maquette/dist/h", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def h(selector: String): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any]).asInstanceOf[VNode]
  inline def h(selector: String, children: js.Array[VNodeChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def h(selector: String, properties: Unit, children: js.Array[VNodeChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def h(selector: String, properties: VNodeProperties): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def h(selector: String, properties: VNodeProperties, children: js.Array[VNodeChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
}
