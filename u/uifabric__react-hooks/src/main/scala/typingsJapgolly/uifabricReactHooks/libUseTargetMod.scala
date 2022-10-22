package typingsJapgolly.uifabricReactHooks

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Window
import typingsJapgolly.uifabricUtilities.libPointMod.Point
import typingsJapgolly.uifabricUtilities.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseTargetMod {
  
  @JSImport("@uifabric/react-hooks/lib/useTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTarget[TElement /* <: HTMLElement */](): js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")().asInstanceOf[js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Unit, hostElement: RefHandle[TElement | Null]): js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Target): js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Target, hostElement: RefHandle[TElement | Null]): js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  
  type Target = Element | String | MouseEvent | Point | Rectangle | Null | RefHandle[Element]
}
