package typingsJapgolly.reactToastify

import typingsJapgolly.reactToastify.distTypesMod.Id
import typingsJapgolly.reactToastify.reactToastifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsPropValidatorMod {
  
  @JSImport("react-toastify/dist/utils/propValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canBeRendered[T](content: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canBeRendered")(content.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getAutoCloseDelay(): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")().asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay(toastAutoClose: Double): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay(toastAutoClose: Double, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay(toastAutoClose: Unit, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  
  inline def getAutoCloseDelay_false(toastAutoClose: Double, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay_false(toastAutoClose: Unit, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay_false(toastAutoClose: `false`): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  
  inline def isBool(v: Any): /* is std.Boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBool")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Boolean */ Boolean]
  
  inline def isFn(v: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFn")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isNum(v: Any): /* is std.Number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNum")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Number */ Boolean]
  
  inline def isStr(v: Any): /* is std.String */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStr")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.String */ Boolean]
  
  inline def isToastIdValid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToastIdValid")().asInstanceOf[Boolean]
  inline def isToastIdValid(toastId: Id): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToastIdValid")(toastId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseClassName(v: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseClassName")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
}
