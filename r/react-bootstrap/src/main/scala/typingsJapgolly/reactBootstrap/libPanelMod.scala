package typingsJapgolly.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.mod.SelectCallback
import typingsJapgolly.reactBootstrap.mod.TransitionCallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelMod {
  
  @JSImport("react-bootstrap/lib/Panel", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PanelProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/Panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Body")
  @js.native
  open class Body ()
    extends typingsJapgolly.reactBootstrap.libPanelBodyMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Body")
  @js.native
  def Body: Instantiable0[typingsJapgolly.reactBootstrap.libPanelBodyMod.^] = js.native
  inline def Body_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPanelBodyMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Collapse")
  @js.native
  open class Collapse ()
    extends typingsJapgolly.reactBootstrap.libPanelCollapseMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Collapse")
  @js.native
  def Collapse: Instantiable0[typingsJapgolly.reactBootstrap.libPanelCollapseMod.^] = js.native
  inline def Collapse_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPanelCollapseMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collapse")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Footer")
  @js.native
  open class Footer ()
    extends typingsJapgolly.reactBootstrap.libPanelFooterMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Footer")
  @js.native
  def Footer: Instantiable0[typingsJapgolly.reactBootstrap.libPanelFooterMod.^] = js.native
  inline def Footer_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPanelFooterMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Heading")
  @js.native
  open class Heading ()
    extends typingsJapgolly.reactBootstrap.libPanelHeadingMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Heading")
  @js.native
  def Heading: Instantiable0[typingsJapgolly.reactBootstrap.libPanelHeadingMod.^] = js.native
  inline def Heading_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPanelHeadingMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Heading")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Title")
  @js.native
  open class Title ()
    extends typingsJapgolly.reactBootstrap.libPanelTitleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Title")
  @js.native
  def Title: Instantiable0[typingsJapgolly.reactBootstrap.libPanelTitleMod.^] = js.native
  inline def Title_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPanelTitleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Panel", "Toggle")
  @js.native
  open class Toggle ()
    extends typingsJapgolly.reactBootstrap.libPanelToggleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Panel", "Toggle")
  @js.native
  def Toggle: Instantiable0[typingsJapgolly.reactBootstrap.libPanelToggleMod.^] = js.native
  inline def Toggle_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPanelToggleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(x.asInstanceOf[js.Any])
  
  type Panel = japgolly.scalajs.react.facade.React.Component[PanelProps & js.Object, js.Object]
  
  trait PanelProps
    extends StObject
       with TransitionCallbacks
       with HTMLProps[japgolly.scalajs.react.facade.React.Component[PanelProps & js.Object, js.Object]] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var defaultExpanded: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[Any] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    @JSName("onSelect")
    var onSelect_PanelProps: js.UndefOr[SelectCallback] = js.undefined
    
    var onToggle: js.UndefOr[SelectCallback] = js.undefined
  }
  object PanelProps {
    
    inline def apply(): PanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelProps]
    }
    
    extension [Self <: PanelProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setDefaultExpanded(value: Boolean): Self = StObject.set(x, "defaultExpanded", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedUndefined: Self = StObject.set(x, "defaultExpanded", js.undefined)
      
      inline def setEventKey(value: Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnToggle(value: SelectCallback): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    }
  }
}
