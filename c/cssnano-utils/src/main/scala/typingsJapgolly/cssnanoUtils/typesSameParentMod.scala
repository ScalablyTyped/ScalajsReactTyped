package typingsJapgolly.cssnanoUtils

import typingsJapgolly.cssnanoUtils.anon.Parent
import typingsJapgolly.postcss.libNodeMod.AnyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSameParentMod {
  
  /** @typedef {import('postcss').AnyNode & {parent?: Child}} Child */
  /**
    * @param {Child} nodeA
    * @param {Child} nodeB
    * @return {boolean}
    */
  inline def apply(nodeA: Child, nodeB: Child): Boolean = (^.asInstanceOf[js.Dynamic].apply(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("cssnano-utils/types/sameParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Child = AnyNode & Parent
}
