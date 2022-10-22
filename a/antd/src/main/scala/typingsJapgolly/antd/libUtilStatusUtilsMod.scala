package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings._empty
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.validating
import typingsJapgolly.antd.antdStrings.warning
import typingsJapgolly.antd.libFormFormItemMod.ValidateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilStatusUtilsMod {
  
  @JSImport("antd/lib/_util/statusUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMergedStatus(): js.UndefOr[_empty | success | warning | error | validating] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")().asInstanceOf[js.UndefOr[_empty | success | warning | error | validating]]
  inline def getMergedStatus(contextStatus: Unit, customStatus: InputStatus): js.UndefOr[_empty | success | warning | error | validating] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")(contextStatus.asInstanceOf[js.Any], customStatus.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[_empty | success | warning | error | validating]]
  inline def getMergedStatus(contextStatus: ValidateStatus): js.UndefOr[_empty | success | warning | error | validating] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")(contextStatus.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[_empty | success | warning | error | validating]]
  inline def getMergedStatus(contextStatus: ValidateStatus, customStatus: InputStatus): js.UndefOr[_empty | success | warning | error | validating] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")(contextStatus.asInstanceOf[js.Any], customStatus.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[_empty | success | warning | error | validating]]
  
  inline def getStatusClassNames(prefixCls: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getStatusClassNames(prefixCls: String, status: Unit, hasFeedback: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any], status.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStatusClassNames(prefixCls: String, status: ValidateStatus): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStatusClassNames(prefixCls: String, status: ValidateStatus, hasFeedback: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any], status.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.warning
    - typingsJapgolly.antd.antdStrings.error
    - typingsJapgolly.antd.antdStrings._empty
  */
  trait InputStatus extends StObject
}
