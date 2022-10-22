package typingsJapgolly.styledJsx

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styledJsx.anon.Children
import typingsJapgolly.styledJsx.anon.Nonce
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styled-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StyleRegistry(hasChildrenRegistry: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleRegistry")(hasChildrenRegistry.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createStyleRegistry(): StyledJsxStyleRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleRegistry")().asInstanceOf[StyledJsxStyleRegistry]
  
  inline def useStyleRegistry(): StyledJsxStyleRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleRegistry")().asInstanceOf[StyledJsxStyleRegistry]
  
  @js.native
  trait StyledJsxStyleRegistry extends StObject {
    
    def add(props: Any): Unit = js.native
    
    def flush(): Unit = js.native
    
    def remove(props: Any): Unit = js.native
    
    def styles(): js.Array[Element] = js.native
    def styles(options: Nonce): js.Array[Element] = js.native
  }
}
