package typingsJapgolly.fluentuiMergeStyles

import typingsJapgolly.fluentuiMergeStyles.anon.Css
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServerMod {
  
  @JSImport("@fluentui/merge-styles/lib/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderStatic(onRender: js.Function0[String]): Css = ^.asInstanceOf[js.Dynamic].applyDynamic("renderStatic")(onRender.asInstanceOf[js.Any]).asInstanceOf[Css]
  inline def renderStatic(onRender: js.Function0[String], namespace: String): Css = (^.asInstanceOf[js.Dynamic].applyDynamic("renderStatic")(onRender.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Css]
}
