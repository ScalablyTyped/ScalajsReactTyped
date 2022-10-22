package typingsJapgolly.interactjsTypes

import typingsJapgolly.interactjsTypes.coreTypesMod.ActionProps
import typingsJapgolly.interactjsTypes.interactjsTypesInts.`-1`
import typingsJapgolly.interactjsTypes.interactjsTypesInts.`1`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drop
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.gesture
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMiscMod {
  
  @JSImport("@interactjs/utils/misc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyAction_drag(dest: ActionProps[Any], src: ActionProps[drag]): ActionProps[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAction")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[ActionProps[Any]]
  
  inline def copyAction_drop(dest: ActionProps[Any], src: ActionProps[drop]): ActionProps[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAction")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[ActionProps[Any]]
  
  inline def copyAction_gesture(dest: ActionProps[Any], src: ActionProps[gesture]): ActionProps[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAction")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[ActionProps[Any]]
  
  inline def copyAction_resize(dest: ActionProps[Any], src: ActionProps[resize]): ActionProps[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAction")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[ActionProps[Any]]
  
  inline def sign(n: Double): `1` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[`1` | `-1`]
  
  inline def warnOnce[T](method: js.Function1[/* repeated */ Any, Any], message: String): js.ThisFunction0[/* this */ T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("warnOnce")(method.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ T, Any]]
}
