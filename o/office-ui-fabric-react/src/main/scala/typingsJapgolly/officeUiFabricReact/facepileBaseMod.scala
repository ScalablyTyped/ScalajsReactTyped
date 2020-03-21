package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepileProps
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings._empty
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.base", JSImport.Namespace)
@js.native
object facepileBaseMod extends js.Object {
  @js.native
  class FacepileBase protected ()
    extends BaseComponent[IFacepileProps, js.Object] {
    def this(props: IFacepileProps) = this()
    var _ariaDescriptionId: js.Any = js.native
    var _classNames: js.Any = js.native
    var _getAddNewElement: js.Any = js.native
    var _getDescriptiveOverflowElement: js.Any = js.native
    var _getElementProps: js.Any = js.native
    var _getElementWithOnClickEvent: js.Any = js.native
    var _getElementWithoutOnClickEvent: js.Any = js.native
    var _getIconElement: js.Any = js.native
    var _getOverflowElement: js.Any = js.native
    var _getPersonaCoinControl: js.Any = js.native
    var _getPersonaControl: js.Any = js.native
    var _onPersonaClick: js.Any = js.native
    var _onPersonaMouseMove: js.Any = js.native
    var _onPersonaMouseOut: js.Any = js.native
    var _onRenderVisiblePersonas: js.Any = js.native
    var _renderInitials: js.Any = js.native
    var _renderInitialsNotPictured: js.Any = js.native
    /* protected */ def onRenderAriaDescription(): js.UndefOr[_empty | Element] = js.native
  }
  
  /* static members */
  @js.native
  object FacepileBase extends js.Object {
    var defaultProps: IFacepileProps = js.native
  }
  
}

