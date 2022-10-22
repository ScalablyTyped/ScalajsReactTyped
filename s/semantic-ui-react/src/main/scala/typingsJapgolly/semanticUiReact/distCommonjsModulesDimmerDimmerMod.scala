package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.semanticUiReact.distCommonjsModulesDimmerDimmerDimmableMod.DimmerDimmableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesDimmerDimmerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/Dimmer", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[DimmerProps, js.Object, Any] {
    def this(props: DimmerProps) = this()
    def this(props: DimmerProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/Dimmer", JSImport.Default)
    @js.native
    val ^ : DimmerComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/Dimmer", "default.Dimmable")
    @js.native
    open class Dimmable protected ()
      extends Component[DimmerDimmableProps, js.Object, Any] {
      def this(props: DimmerDimmableProps) = this()
      def this(props: DimmerDimmableProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/Dimmer", "default.Inner")
    @js.native
    open class Inner ()
      extends typingsJapgolly.semanticUiReact.distCommonjsModulesDimmerDimmerInnerMod.default
    
    type _To = DimmerComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: DimmerComponent = ^
  }
  
  @js.native
  trait DimmerComponent
    extends StObject
       with ComponentClass[DimmerProps, js.Object] {
    
    var Dimmable: ComponentClassP[DimmerDimmableProps & js.Object] = js.native
    
    var Inner: Instantiable0[typingsJapgolly.semanticUiReact.distCommonjsModulesDimmerDimmerInnerMod.default] = js.native
  }
  
  trait DimmerProps
    extends StObject
       with StrictDimmerProps
       with /* key */ StringDictionary[Any]
  object DimmerProps {
    
    inline def apply(): DimmerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DimmerProps]
    }
  }
  
  trait StrictDimmerProps extends StObject {
    
    /** An active dimmer will dim its parent container. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** A dimmer can be formatted to be fixed to the page. */
    var page: js.UndefOr[Boolean] = js.undefined
  }
  object StrictDimmerProps {
    
    inline def apply(): StrictDimmerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDimmerProps]
    }
    
    extension [Self <: StrictDimmerProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setPage(value: Boolean): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    }
  }
}
