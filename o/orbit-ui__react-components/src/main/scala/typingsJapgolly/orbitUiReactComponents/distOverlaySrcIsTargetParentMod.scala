package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcIsTargetParentMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/isTargetParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTargetParent(target: EventTarget, parentRef: RefHandle[HTMLElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTargetParent")(target.asInstanceOf[js.Any], parentRef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
