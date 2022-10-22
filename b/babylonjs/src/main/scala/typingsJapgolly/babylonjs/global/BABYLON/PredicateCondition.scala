package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PredicateCondition")
@js.native
open class PredicateCondition protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PredicateCondition {
  /**
    * Creates a new PredicateCondition
    * @param actionManager manager for the action the condition applies to
    * @param predicate defines the predicate function used to validate the condition
    */
  def this(
    actionManager: typingsJapgolly.babylonjs.BABYLON.ActionManager,
    /** defines the predicate function used to validate the condition */
  predicate: js.Function0[Boolean]
  ) = this()
  
  /**
    * Internal only - manager for action
    * @internal
    */
  /* CompleteClass */
  var _actionManager: typingsJapgolly.babylonjs.BABYLON.ActionManager = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  var _currentResult: Boolean = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  var _evaluationId: Double = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def _getEffectiveTarget(target: Any, propertyPath: String): Any = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def _getProperty(propertyPath: String): String = js.native
  
  /**
    * @internal
    */
  /* protected */ /* CompleteClass */
  override def _serialize(serializedCondition: Any): Any = js.native
  
  /**
    * Check if the current condition is valid
    * @returns a boolean
    */
  /* CompleteClass */
  override def isValid(): Boolean = js.native
  
  /** defines the predicate function used to validate the condition */
  /* CompleteClass */
  override def predicate(): Boolean = js.native
  
  /**
    * Serialize placeholder for child classes
    * @returns the serialized object
    */
  /* CompleteClass */
  override def serialize(): Any = js.native
}
