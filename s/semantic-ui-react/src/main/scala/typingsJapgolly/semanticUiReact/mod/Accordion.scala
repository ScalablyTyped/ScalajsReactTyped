package typingsJapgolly.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionAccordionMod.AccordionAccordionProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionMod.AccordionComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionMod.AccordionProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionPanelMod.default
import typingsJapgolly.semanticUiReact.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Accordion")
@js.native
open class Accordion protected ()
  extends Component[AccordionProps, js.Object, Any] {
  def this(props: AccordionProps) = this()
  def this(props: AccordionProps, context: Any) = this()
}
object Accordion extends Shortcut {
  
  @JSImport("semantic-ui-react", "Accordion")
  @js.native
  val ^ : AccordionComponent = js.native
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Accordion.Accordion")
  @js.native
  open class Accordion protected ()
    extends Component[AccordionAccordionProps, js.Object, Any] {
    def this(props: AccordionAccordionProps) = this()
    def this(props: AccordionAccordionProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Accordion.Panel")
  @js.native
  open class Panel () extends default
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Accordion.Title")
  @js.native
  open class Title protected ()
    extends Component[AccordionTitleProps, js.Object, Any] {
    def this(props: AccordionTitleProps) = this()
    def this(props: AccordionTitleProps, context: Any) = this()
  }
  
  type _To = AccordionComponent
  
  /* This means you don't have to write `^`, but can instead just say `Accordion.foo` */
  override def _to: AccordionComponent = ^
}
