package typingsJapgolly.gulpTemplate

import typingsJapgolly.lodash.mod.TemplateOptions
import typingsJapgolly.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: Any, options: TemplateOptions): Transform = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  @JSImport("gulp-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def precompile(options: TemplateOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("precompile")(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
}
