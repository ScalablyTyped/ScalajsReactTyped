package typingsJapgolly.ahooks

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDomTargetMod {
  
  @JSImport("ahooks/lib/utils/domTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTargetElement[T /* <: TargetType */](target: BasicTarget[T]): TargetValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetElement")(target.asInstanceOf[js.Any]).asInstanceOf[TargetValue[T]]
  inline def getTargetElement[T /* <: TargetType */](target: BasicTarget[T], defaultElement: T): TargetValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTargetElement")(target.asInstanceOf[js.Any], defaultElement.asInstanceOf[js.Any])).asInstanceOf[TargetValue[T]]
  
  type BasicTarget[T /* <: TargetType */] = js.Function0[TargetValue[T]] | TargetValue[T] | MutableRefObject[TargetValue[T]]
  
  type TargetType = HTMLElement | Element | Window | Document
  
  type TargetValue[T] = js.UndefOr[T | Null]
}
