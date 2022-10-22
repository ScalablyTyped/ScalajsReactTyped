package typingsJapgolly.rcDialog

import org.scalajs.dom.Element
import typingsJapgolly.rcDialog.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("rc-dialog/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMotionName(prefixCls: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMotionName")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getMotionName(prefixCls: String, transitionName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotionName")(prefixCls.asInstanceOf[js.Any], transitionName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getMotionName(prefixCls: String, transitionName: String, animationName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotionName")(prefixCls.asInstanceOf[js.Any], transitionName.asInstanceOf[js.Any], animationName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getMotionName(prefixCls: String, transitionName: Unit, animationName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotionName")(prefixCls.asInstanceOf[js.Any], transitionName.asInstanceOf[js.Any], animationName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def offset(el: Element): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(el.asInstanceOf[js.Any]).asInstanceOf[Left]
}
