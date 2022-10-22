package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTrendIndicatorTrendIndicatorMod {
  
  /** TrendIndicator */
  @JSImport("wix-style-react/dist/types/TrendIndicator/TrendIndicator", JSImport.Default)
  @js.native
  open class default protected () extends TrendIndicator {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/TrendIndicator/TrendIndicator", "default.defaultProps.inverted_1")
      @js.native
      val inverted1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/TrendIndicator/TrendIndicator", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/TrendIndicator/TrendIndicator", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TrendIndicator/TrendIndicator", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TrendIndicator/TrendIndicator", "default.propTypes.inverted")
      @js.native
      val inverted: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/TrendIndicator/TrendIndicator", "default.propTypes.locale")
      @js.native
      val locale: Requireable[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 54, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.th, typingsJapgolly.wixStyleReact.wixStyleReactStrings.tr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.id */ Any
          ] = js.native
      
      @JSImport("wix-style-react/dist/types/TrendIndicator/TrendIndicator", "default.propTypes.value")
      @js.native
      val value: Validator[Double] = js.native
    }
  }
  
  /** TrendIndicator */
  @js.native
  trait TrendIndicator extends PureComponent[Any, Any, Any]
}
