package typingsJapgolly.travisFold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("travis-fold", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def end(group: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("end")(group.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isTravis(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTravis")().asInstanceOf[Boolean]
  
  inline def pushEnd(ret: js.Array[String], group: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushEnd")(ret.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pushStart(ret: js.Array[String], group: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushStart")(ret.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def start(group: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(group.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wrap(group: String, content: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(group.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[String]
}
