package typingsJapgolly.jscodeshift.jsxelementMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jscodeshift.collectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalMethods extends js.Object {
  /**
    * Returns all children that are JSXElements.
    * This method only applies to JSXElement typed collections.
    */
  def childElements(): Collection[JSXElement]
  /**
    * Returns all child nodes, including literals and expressions.
    * This method only applies to JSXElement typed collections.
    */
  def childNodes(): Collection[JSXElementChild]
}

object TraversalMethods {
  @scala.inline
  def apply(
    childElements: CallbackTo[Collection[JSXElement]],
    childNodes: CallbackTo[Collection[JSXElementChild]]
  ): TraversalMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childElements")(childElements.toJsFn)
    __obj.updateDynamic("childNodes")(childNodes.toJsFn)
    __obj.asInstanceOf[TraversalMethods]
  }
}

