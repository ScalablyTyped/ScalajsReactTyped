package typingsJapgolly.lost

import typingsJapgolly.postcss.libNodeMod.ChildNode
import typingsJapgolly.postcss.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNewBlockMod {
  
  inline def apply(decl: Container[ChildNode], selector: String, props: js.Array[String], values: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].apply(decl.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], props.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("lost/lib/new-block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
