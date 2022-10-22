package typingsJapgolly.babelPluginCodegen

import typingsJapgolly.babelCore.mod.PluginObj
import typingsJapgolly.babelPluginCodegen.anon.Opts
import typingsJapgolly.babelPluginCodegen.anon.TypeofbabelCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babel-plugin-codegen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(babel: TypeofbabelCore): PluginObj[VisitorState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(babel.asInstanceOf[js.Any]).asInstanceOf[PluginObj[VisitorState]]
  
  trait VisitorState extends StObject {
    
    var file: Opts
  }
  object VisitorState {
    
    inline def apply(file: Opts): VisitorState = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisitorState]
    }
    
    extension [Self <: VisitorState](x: Self) {
      
      inline def setFile(value: Opts): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
