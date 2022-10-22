package typingsJapgolly.rcEasyui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeHelper {
  
  @JSImport("rc-easyui", "treeHelper")
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjustCheck(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustCheck")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def calcNodeState(e: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("calcNodeState")(e.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("rc-easyui", "treeHelper.cascadeCheck")
  @js.native
  val cascadeCheck: Boolean = js.native
  
  inline def checkNode(e: Any, t: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNode")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findNode(e: Any, t: Any, n: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def forNodes(e: Any, t: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forNodes")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setCheckState(e: Any, t: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCheckState")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setChildCheckbox(e: Any, t: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setChildCheckbox")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setParentCheckbox(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setParentCheckbox")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def uncheckAllNodes(e: Any, t: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uncheckAllNodes")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def uncheckNode(e: Any, t: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uncheckNode")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
