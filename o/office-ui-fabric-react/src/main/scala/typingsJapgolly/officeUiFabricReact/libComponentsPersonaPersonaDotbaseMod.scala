package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPersonaPersonaDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Persona/Persona.base", "PersonaBase")
  @js.native
  open class PersonaBase protected ()
    extends Component[IPersonaProps, js.Object, Any] {
    def this(props: IPersonaProps) = this()
    
    /**
      * Deprecation helper for getting text.
      */
    /* private */ var _getText: Any = js.native
    
    /* private */ var _onRenderPersonaCoin: Any = js.native
    
    /**
      * using closure to wrap the default render behavior
      * to make it independent of the type of text passed
      * @param text - text to render
      */
    /* private */ var _onRenderText: Any = js.native
    
    /**
      * Renders various types of Text (primaryText, secondaryText, etc)
      * based on the classNames passed
      * @param classNames - element className
      * @param renderFunction - render function
      * @param defaultRenderFunction - default render function
      */
    /* private */ var _renderElement: Any = js.native
  }
  /* static members */
  object PersonaBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Persona/Persona.base", "PersonaBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Persona/Persona.base", "PersonaBase.defaultProps")
    @js.native
    def defaultProps: IPersonaProps = js.native
    inline def defaultProps_=(x: IPersonaProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
