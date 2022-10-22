package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.Rows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLayoutCellMod {
  
  object default {
    
    inline def apply(hasSpanRowsChildrenVerticalClassNameDataHook: Rows): Element = ^.asInstanceOf[js.Dynamic].apply(hasSpanRowsChildrenVerticalClassNameDataHook.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Layout/Cell", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Layout/Cell", "default.defaultProps.rows_1")
      @js.native
      val rows1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Cell", "default.defaultProps.span_1")
      @js.native
      val span1: Double = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Layout/Cell", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Layout/Cell", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Cell", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Cell", "default.propTypes.rows")
      @js.native
      val rows: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Cell", "default.propTypes.span")
      @js.native
      val span: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Cell", "default.propTypes.vertical")
      @js.native
      val vertical: Requireable[Boolean] = js.native
    }
  }
}
