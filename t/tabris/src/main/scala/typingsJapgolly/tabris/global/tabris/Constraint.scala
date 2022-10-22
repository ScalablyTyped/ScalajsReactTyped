package typingsJapgolly.tabris.global.tabris

import typingsJapgolly.tabris.mod.ConstraintValue
import typingsJapgolly.tabris.mod.Offset
import typingsJapgolly.tabris.mod.SiblingReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Constraint")
@js.native
open class Constraint protected ()
  extends typingsJapgolly.tabris.mod.Constraint {
  /**
    * Represents a constraint on the layout of a widget that the parent uses to determine the position of
    * one of its edges. See also ${doc:ConstraintValue}
    */
  def this(reference: typingsJapgolly.tabris.mod.Percent, offset: Offset) = this()
  def this(reference: SiblingReference, offset: Offset) = this()
}
/* static members */
object Constraint {
  
  @JSGlobal("tabris.Constraint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of Constraint using [any valid constraint
    * expression](${doc:ConstraintValueUrl}). For any other value, including `null` and `'auto'`, the
    * method throws.
    * @param constraintValue The value to create an Constraint instance from.
    */
  inline def from(constraintValue: ConstraintValue): typingsJapgolly.tabris.mod.Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(constraintValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tabris.mod.Constraint]
  
  /**
    * A ${doc:SiblingReference} indicating the next widget in the list of children attached to the same
    * parent. Used by the [`reference`](#reference) property. Also available as `LayoutData.next`.
    */
  @JSGlobal("tabris.Constraint.next")
  @js.native
  val next: js.Symbol = js.native
  
  /**
    * A ${doc:SiblingReference} indicating the previous widget in the list of children attached to the same
    * parent. Used by the [`reference`](#reference) property. Also available as `LayoutData.prev`.
    */
  @JSGlobal("tabris.Constraint.prev")
  @js.native
  val prev: js.Symbol = js.native
}
