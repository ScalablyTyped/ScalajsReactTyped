package typingsJapgolly.remarkParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("remark-parse/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  inline def default(options: Unit): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(options: typingsJapgolly.mdastUtilFromMarkdown.libMod.Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Options = typingsJapgolly.mdastUtilFromMarkdown.mod.Options
  
  type Root = typingsJapgolly.mdast.mod.Root
}
