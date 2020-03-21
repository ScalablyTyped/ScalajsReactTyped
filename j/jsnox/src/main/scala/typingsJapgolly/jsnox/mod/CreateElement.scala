package typingsJapgolly.jsnox.mod

import japgolly.scalajs.react.raw.React.DomElement
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateElement extends js.Object {
  /**
    * Renders a React component, with optional props and children
    * @param component A plain React component (created from React.createClass()) or
    * component factory (created from React.createFactory())
    * @param props Props object to pass to the component
    * @param children A single React node (string or ReactElement) or array of nodes.
    * Note that unlike with React itself, multiple children must be placed into an array.
    */
  def apply[P](component: ComponentClass[P, ComponentState]): Element = js.native
  /**
    * Renders a React component, with children but no props
    * @param component A plain React component (created from React.createClass()) or
    * component factory (created from React.createFactory())
    * @param children A single React node (string or ReactElement) or array of nodes.
    * Note that unlike with React itself, multiple children must be placed into an array.
    */
  def apply[P](component: ComponentClass[P, ComponentState], children: ReactNode): Element = js.native
  def apply[P](component: ComponentClass[P, ComponentState], props: P): Element = js.native
  def apply[P](component: ComponentClass[P, ComponentState], props: P, children: Node): Element = js.native
  /**
    * Renders an HTML element from the given spec string, with optional props
    * and children
    * @param specString A string that defines a component in a way that resembles
    * CSS selectors. Eg. "input:email#foo.bar.baz[name=email][required]"
    * @param props Object of html attribute key-value pairs
    * @param children A single React node (string or ReactElement) or array of nodes.
    * Note that unlike with React itself, multiple children must be placed into an array.
    */
  def apply[P](specString: String): DomElement = js.native
  /**
    * Renders an HTML element from the given spec string, with children but without
    * extra props.
    * @param specString A string that defines a component in a way that resembles
    * CSS selectors. Eg. "input:email#foo.bar.baz[name=email][required]"
    * @param children A single React node (string or ReactElement) or array of nodes.
    * Note that unlike with React itself, multiple children must be placed into an array.
    */
  def apply[P](specString: String, children: ReactNode): DomElement = js.native
  def apply[P](specString: String, props: HTMLAttributes[js.Object]): DomElement = js.native
  def apply[P](specString: String, props: HTMLAttributes[js.Object], children: Node): DomElement = js.native
}

