package typingsJapgolly.interactjsTypes

import org.scalajs.dom.Node
import typingsJapgolly.interactjsTypes.anon.HasGetRectoptionsPerActio
import typingsJapgolly.interactjsTypes.anon.X
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsGetOriginXYMod {
  
  @JSImport("@interactjs/utils/getOriginXY", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: HasGetRectoptionsPerActio, element: Node): X = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def default(target: HasGetRectoptionsPerActio, element: Node, actionName: ActionName): X = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], element.asInstanceOf[js.Any], actionName.asInstanceOf[js.Any])).asInstanceOf[X]
}
