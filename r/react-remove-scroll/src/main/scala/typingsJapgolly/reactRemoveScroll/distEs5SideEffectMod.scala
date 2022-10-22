package typingsJapgolly.reactRemoveScroll

import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.WheelEvent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactRemoveScroll.distEs5TypesMod.IRemoveScrollEffectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5SideEffectMod {
  
  @JSImport("react-remove-scroll/dist/es5/SideEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RemoveScrollSideCar(props: IRemoveScrollEffectProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RemoveScrollSideCar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getDeltaXY(event: WheelEvent): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeltaXY")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getTouchXY(event: ReactTouchEventFrom[org.scalajs.dom.Element]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTouchXY")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def getTouchXY(event: WheelEvent): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTouchXY")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
