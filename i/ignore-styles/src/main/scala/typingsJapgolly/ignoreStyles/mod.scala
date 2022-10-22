package typingsJapgolly.ignoreStyles

import typingsJapgolly.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ignore-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  inline def default(extensions: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(extensions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(extensions: js.Array[String], handler: Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(extensions.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(extensions: Unit, handler: Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(extensions.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ignore-styles", "DEFAULT_EXTENSIONS")
  @js.native
  val DEFAULT_EXTENSIONS: js.Array[String] = js.native
  
  inline def noOp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noOp")().asInstanceOf[Unit]
  
  inline def restore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[Unit]
  
  type Handler = js.Function2[/* m */ NodeModule, /* filename */ String, Any]
}
